import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hello {
    public static void main(String[] args) {
        // Konfigurasi koneksi database
        String url = "jdbc:mariadb://localhost:3308/ekatalog"; // Sesuaikan dengan URL database Anda
        String user = "root"; // Sesuaikan dengan user database Anda
        String password = ""; // Sesuaikan dengan password database Anda

        while (true) {
            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                System.out.println("berhasil");
            } catch (SQLException e) {
                System.out.println("Gagal connect: " + e.getMessage());
            }

            try {
                Thread.sleep(300); // Jeda in ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Program dihentikan.");
                break;
            }
        }
    }
}
