package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/bookstore";
    private static final String USER = "root";
    private static final String PASS = "";
	private static String nama;

    public static Connection connect() throws Exception {
        Class.forName(JDBC_DRIVER);
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void addPelanggan(String nama, String email, String telepon) throws Exception {
        String query = "INSERT INTO Pelanggan (nama, email, telepon) VALUES (?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, nama);
            stmt.setString(2, email);
            stmt.setString(3, telepon);
            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                }
            }
        }
    }


    public static void addBuku(String judul, String penulis, double harga, int stok) throws Exception {
        String query = "INSERT INTO Buku (judul, penulis, harga, stok) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, judul);
            stmt.setString(2, penulis);
            stmt.setDouble(3, harga);
            stmt.setInt(4, stok);
            stmt.executeUpdate();

            // Get generated buku_id
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                }
            }
        }
    }

    
    public static void addPenjualan(int jumlah, int total_harga, String tanggal) throws Exception {
        String query = "INSERT INTO Penjualan (jumlah, total_harga, tanggal) VALUES (?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, jumlah);
            stmt.setInt(2, total_harga);
            stmt.setString(3, tanggal);
            stmt.executeUpdate();

            // Get generated penjualan_id
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                }
            }
        }
    }



    // Read Methods
    public static List<String> getPelanggan() throws Exception {
        String query = "SELECT * FROM pelanggan";
        List<String> result = new ArrayList<>();
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                result.add(rs.getString("nama") + ", " + rs.getString("email") + ", " + rs.getString("telepon"));
            }
        }
        return result;
    }

    public static List<String> getBuku() throws Exception {
        String query = "SELECT * FROM Buku";
        List<String> result = new ArrayList<>();
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                result.add(rs.getString("judul") + ", " + rs.getString("penulis") + ", " + rs.getDouble("harga") + ", " + rs.getInt("stok"));
            }
        }
        return result;
    }

    public static List<String> getPenjualan() throws Exception {
        String query = "SELECT * FROM Penjualan";
        List<String> result = new ArrayList<>();
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                result.add(rs.getInt("jumlah") + ", " + rs.getInt("total_harga") + ", " + rs.getDate("tanggal"));
            }
        }
        return result;
    }

    // Update Methods
    public static void updatePelanggan(String nama, String email, String telepon) throws Exception {
        String query = "UPDATE Pelanggan SET nama = ?, email = ?, telepon = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.setString(2, email);
            stmt.setString(3, telepon);
            stmt.executeUpdate();
        }
    }

    public static void updateBuku(String judul, String penulis, double harga, int stok) throws Exception {
        String query = "UPDATE Buku SET judul = ?, penulis = ?, harga = ?, stok = ? WHERE buku_id = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, judul);
            stmt.setString(2, penulis);
            stmt.setDouble(3, harga);
            stmt.setInt(4, stok);
            stmt.executeUpdate();
        }
    }

    public static void updatePenjualan(String string, int jumlah, int total_harga, String tanggal, String string2, String string3) throws Exception {
        String query = "UPDATE Penjualan SET jumlah = ?, total_harga = ?, tanggal = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, jumlah);
            stmt.setInt(2, total_harga);
            stmt.setString(3, tanggal);
            stmt.executeUpdate();
        }
    }

    // Delete Methods
    public static void deletePelanggan(String nama) throws Exception {
        String query = "DELETE FROM Pelanggan WHERE nama = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.executeUpdate();
        }
    }

    public static void deleteBuku(String judul) throws Exception {
        String query = "DELETE FROM Buku WHERE judul = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, judul);
            stmt.executeUpdate();
        }
    }

    public static void deletePenjualan(String jumlah) throws Exception {
        String query = "DELETE FROM Penjualan WHERE jumlah = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, jumlah);
            stmt.executeUpdate();
        }
    }
}
