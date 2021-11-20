/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;
import java.sql.*;

public class koneksi {

    private static Connection koneksi;
    public static Connection getKoneksi() throws SQLException{
        if(koneksi == null){
            try{
                koneksi=DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/sia",
                        "root","");
            }catch (SQLException aa){
                System.out.println("Koneksi gagal"+aa);
          }
        }
        return koneksi;
    }   
}
