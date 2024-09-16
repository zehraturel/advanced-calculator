package Data;

import java.sql.*;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/heasapmakinesi";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "182727";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }


    // Sonuçları veritabanına ekleme
    public static void saveResult(String operationType, Double operand1, Double operand2, Double result) {
        String sql = "INSERT INTO sonuclar (islem_turu, sayi1, sayi2, sonuc) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, operationType);
            pstmt.setDouble(2, operand1);
            pstmt.setDouble(3, operand2);
            pstmt.setDouble(4, result);
            pstmt.executeUpdate();


        } catch (SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
    }


    public static void printResults() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM sonuclar ";
            int count=0;
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String operationType = rs.getString("islem_turu");
                    double operand1 = rs.getDouble("sayi1");
                    double operand2 = rs.getDouble("sayi2");
                    double result = rs.getDouble("sonuc");
                    Timestamp timestamp = rs.getTimestamp("zaman");
                    System.out.printf("ID: %d, İşlem Türü: %s, Sayi1: %.2f, Sayi2: %.2f, Sonuç: %.2f, Zaman: %s%n",
                            id, operationType, operand1, operand2, result, timestamp);
                    count++;
                    if(count >10){
                        DatabaseHelper deleteResultsCount= new DatabaseHelper();
                        deleteResultsCount.printResultsCount();
                        count = 0;
                    }

                }
            }
        } catch (SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
    }    public static void printResultsCount() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql  = "DELETE FROM sonuclar s WHERE s.id=(select MIN(s2.id) from sonuclar s2)";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        }
    }
}
