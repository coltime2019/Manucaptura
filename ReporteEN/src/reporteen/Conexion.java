package reporteen;

import java.sql.*;
//import javax.swing.JOptionPane;

public class Conexion {

    private Connection conexion;
    static String user = "root";
    static String password = "qblrENqllNIMvqHL";
    static String server;

    public Conexion(int dataBase) {
       
        server = "jdbc:mysql://192.168.4.173:33066/" + (dataBase==1?"coltime":"sgn");
        
    }

    public void establecerConexion() {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server, user, password);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrar(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.print("No es posible cerrar la Conexion");
            }
        }
    }

    public void destruir() {

        if (conexion != null) {

            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

}
