/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc01;
import java.sql.*;
/**
 *
 * @author DIEGO
 */
public class JDBC01 {

    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        try{
            connection = DBConnection.getConnection();
            if(connection!=null)
                System.out.println("Conexion exitosa"); 
            
            //consulta 1
            String insert= "INSERT INTO usuario VALUES(?,?,?)";
            PreparedStatement ps=connection.prepareStatement(insert);
            ps.setString(1,"Sparrow"); 
            ps.setString(2, "Johnny");
            ps.setString(3, "Depp");

            ps.executeUpdate();
            System.out.println("Se registró exitosamente el usuario Sparrow");
            
            //consulta 2
            String insert2 = "INSERT INTO pelicula VALUES (?, ?, ?, ?, ?)"; //titulo, resumen, anno, nombre_director
            PreparedStatement ps2 = connection.prepareStatement(insert2);
            ps2.setInt(1, 6);
            ps2.setString(2, "Guasón");
            ps2.setString(3, "Pelicula de suspenso basada en el personaje de DC Comics Joker que se remonta a los orígenes del personaje con profundo análisis social.");
            ps2.setString(4, "2019");
            ps2.setString(5, "Todd Phillips");
            ps2.executeUpdate();
            System.out.println("Se registró correctamente la pelicula Guasón");

            //consulta 3
            String insert3 = "INSERT INTO serie VALUES (?, ?, ?, ?)"; //titulo, numero_episodios, numero_temporadas
            PreparedStatement ps3 = connection.prepareStatement(insert3);
            ps3.setInt(1,9);
            ps3.setString(2, "DARK");
            ps3.setInt(3, 26);
            ps3.setInt(4, 3);
            ps3.executeUpdate();
            System.out.println("Se registró correctamente la serie DARK");
            
            //consulta 4
            
            
            //consulta 5
            Statement st5 = connection.createStatement();
            String consulta5 = "SELECT * FROM serie WHERE titulo_serie = 'DARK'";
            ResultSet rs5 = st5.executeQuery(consulta5);
            while(rs5.next()){
                System.out.println("Serie disponible: " + rs5.getString("titulo_serie") 
                + " " + "consta de " + rs5.getString("episodios_serie") + " " + "episodios en " + rs5.getString("temporadas_serie") + " " + "temporadas");
            }
            
            //6. Eliminar la pelicula Los Vengadores (Expiraron los derechos)
            String delete6 = "DELETE FROM pelicula WHERE titulo_pelicula = ?";
            PreparedStatement ps6 = connection.prepareStatement(delete6);
            ps6.setString(1, "Los Vengadores");
            ps6.executeUpdate();
            System.out.println("Se eliminó exitosamente la pelicula Los Vengadores");
            
            // 7. Editar el usuario Johnny Depp cambiar el nombre a Jack Sparrow
            String update7 = "UPDATE usuario SET nombre =? Y apellido =? WHERE id_username =?";
            PreparedStatement ps7 = connection.prepareStatement (update7);
            ps7.setString (1, "Jack");
            ps7.setString (2, "Gorrión");
            ps7.setString (3, "Gorrión");
            ps7.executeUpdate ();
            ps7.executeUpdate ();
            System.out.println ("Se actualizó correctamente el usuario Jack Sparrow");
            
        } catch(SQLException e){
            System.err.print(e);
        }finally{
            connection.close();
        }
    }
   
}
