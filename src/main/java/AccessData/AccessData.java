package AccessData;

import java.sql.*;

public class AccessData {

    private static String URLconection = "jdbc:mysql://localhost:3306/proyecto01";

    private static String userDatabase = "root";

    private static String passwordDataBase = "Proyecto01";



    public static ResultSet getAllUsers(){
        try {
            Connection connection = DriverManager.getConnection(URLconection,userDatabase,passwordDataBase);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from users");

            return resultSet;

        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static void insertarUsuario(String username,String nombreyapellido, String password, String foto){
        try {
            Connection connection = DriverManager.getConnection(URLconection,userDatabase,passwordDataBase);

            PreparedStatement ps = connection.prepareStatement("INSERT INTO usuario ( Username,Nombreyapellido,Password,Foto) VALUES (?,?,?,?)");
            ps.setString(1,username);
            ps.setString(2,nombreyapellido);
            ps.setString(3,password);
            ps.setString(4,foto);

            ps.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void insertarProyecto(String direccion,String nombre, String categoria, String fechaCreacion, String repositorio){
        try {
            Connection connection = DriverManager.getConnection(URLconection,userDatabase,passwordDataBase);

            PreparedStatement ps = connection.prepareStatement("INSERT INTO usuario ( Direccion,Nombre,Categoria,Cecha_Creacion,Repositorio) VALUES (?,?,?,?,?)");
            ps.setString(1,direccion);
            ps.setString(2,nombre);
            ps.setString(3,categoria);
            ps.setString(4,fechaCreacion);
            ps.setString(5,repositorio);

            ps.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}