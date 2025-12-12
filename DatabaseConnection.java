package mysystem.database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:sqlite:atmnicarla.db";

    public static void initializeDatabase() {
        File dbFile = new File("atmnicarla.db");
        boolean isNewDb = !dbFile.exists();

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute("PRAGMA foreign_keys = ON");

            String createTableSQL = "CREATE TABLE IF NOT EXISTS Users ("+
                                    "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                                    "address TEXT,"+
                                    "full_name TEXT NOT NULL,"+
                                    "email TEXT NOT NULL,"+
                                    "age INTEGER NOT NULL,"+
                                    "pin TEXT NOT NULL,"+
                                    "phone_number TEXT NOT NULL UNIQUE,"+
                                    "balance DOUBLE DEFAULT 0.0)";
            try (PreparedStatement pstmt = conn.prepareStatement(createTableSQL)) {
                pstmt.executeUpdate();
            }

            String createTransactionsTable = "CREATE TABLE IF NOT EXISTS Transactions (" +
                                             "tid INTEGER PRIMARY KEY AUTOINCREMENT," +
                                             "phone_number TEXT," +
                                             "type TEXT," +
                                             "amount REAL," +
                                             "date TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +
                                             "FOREIGN KEY(phone_number) REFERENCES Users(phone_number))";
            stmt.execute(createTransactionsTable);

            if (isNewDb) {
                JOptionPane.showMessageDialog(null, "Database created successfully at: " + dbFile.getAbsolutePath());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database initialization error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(DB_URL);
            try (Statement stmt = conn.createStatement()) {
                stmt.execute("PRAGMA foreign_keys = ON");
            }
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
            throw e;
        }
    }

    public static boolean doesUsersTableExist(Connection conn) throws SQLException {
        try (ResultSet rs = conn.getMetaData().getTables(null, null, "Users", null)) {
            return rs.next();
        }
    }

    public static boolean deposit(String phoneNumber, double amount) {
        String updateBalanceSQL = "UPDATE Users SET balance = balance + ? WHERE phone_number = ?";
        String insertTransactionSQL = "INSERT INTO Transactions (phone_number, type, amount) VALUES (?, 'DEPOSIT', ?)";

        try (Connection conn = getConnection()) {
            conn.setAutoCommit(false);
            try {
                try (PreparedStatement pstmt = conn.prepareStatement(updateBalanceSQL)) {
                    pstmt.setDouble(1, amount);
                    pstmt.setString(2, phoneNumber);
                    pstmt.executeUpdate();
                }

                try (PreparedStatement pstmt = conn.prepareStatement(insertTransactionSQL)) {
                    pstmt.setString(1, phoneNumber);
                    pstmt.setDouble(2, amount);
                    pstmt.executeUpdate();
                }

                conn.commit();
                return true;
            } catch (SQLException e) {
                conn.rollback();
                throw e;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error processing deposit: " + e.getMessage());
            return false;
        }
    }

    public static boolean withdraw(String phoneNumber, double amount) {
        String checkBalanceSQL = "SELECT balance FROM Users WHERE phone_number = ?";
        String updateBalanceSQL = "UPDATE Users SET balance = balance - ? WHERE phone_number = ? AND balance >= ?";
        String insertTransactionSQL = "INSERT INTO Transactions (phone_number, type, amount) VALUES (?, 'WITHDRAWAL', ?)";

        try (Connection conn = getConnection()) {
            conn.setAutoCommit(false);
            try {
                double currentBalance;
                try (PreparedStatement pstmt = conn.prepareStatement(checkBalanceSQL)) {
                    pstmt.setString(1, phoneNumber);
                    ResultSet rs = pstmt.executeQuery();
                    if (!rs.next()) {
                        throw new SQLException("User not found");
                    }
                    currentBalance = rs.getDouble("balance");
                }

                if (currentBalance < amount) {
                    throw new SQLException("Insufficient balance");
                }

                try (PreparedStatement pstmt = conn.prepareStatement(updateBalanceSQL)) {
                    pstmt.setDouble(1, amount);
                    pstmt.setString(2, phoneNumber);
                    pstmt.setDouble(3, amount);
                    int updated = pstmt.executeUpdate();
                    if (updated == 0) {
                         throw new SQLException("Failed to update balance or insufficient balance");
                    }
                }

                try (PreparedStatement pstmt = conn.prepareStatement(insertTransactionSQL)) {
                    pstmt.setString(1, phoneNumber);
                    pstmt.setDouble(2, amount);
                    pstmt.executeUpdate();
                }

                conn.commit();
                return true;
            } catch (SQLException e) {
                conn.rollback();
                JOptionPane.showMessageDialog(null, "Withdrawal transaction failed: " + e.getMessage());
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database for withdrawal: " + e.getMessage());
            return false;
        }
    }

    public static double getBalance(String phoneNumber) {
        String sql = "SELECT balance FROM Users WHERE phone_number = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, phoneNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble("balance");
            } else {
                JOptionPane.showMessageDialog(null, "User not found for balance check.");
                return 0.0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error getting balance: " + e.getMessage());
            return 0.0;
        }
    }

    public static ResultSet getTransactionHistory(String phoneNumber) throws SQLException {
        String sql = "SELECT type, amount, date FROM Transactions WHERE phone_number = ? ORDER BY date DESC";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phoneNumber);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error getting transaction history: " + e.getMessage());
            throw e;
        }
    }
}