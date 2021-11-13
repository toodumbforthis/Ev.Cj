
package evidencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author Compu
 */

    public class crear_Usuario {

        URL url5 = new URL();

        String user;
        String password;
        private Connection conexion;
        private final Scanner scanner = new Scanner(System.in);


        public void DatosAdmin() {
            ResultSet dato = null;

            try {
                Class.forName("org.sqlite.JDBC");
                Connection conexion = DriverManager.getConnection(url5.url());


                PreparedStatement busqueda = conexion.prepareStatement("SELECT user, password FROM Usuarios WHERE id = 1 ");

                dato = busqueda.executeQuery();
                this.user = dato.getString("user");
                this.password = dato.getString("password");

                busqueda.close();
                conexion.close();

            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getMessage());
            }
        }

       
        public String getUser() {
            return this.user;
        }

        public String getPassword() {
            return this.password;
        }

    }

