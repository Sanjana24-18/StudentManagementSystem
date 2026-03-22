mport java.sql.Connection;
import java.sql.DriverManager;

    public class DBConnection {

        public static Connection getConnection() {

            Connection con = null;

            try {
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3307/student_db",
                        "root",
                        "2409"
                );

            } catch (Exception e) {
                System.out.println(e);
            }

            return con;
        }
    }
