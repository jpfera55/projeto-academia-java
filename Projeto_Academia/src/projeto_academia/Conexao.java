/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_academia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class Conexao {
    
    public static Connection ConexaoJDBC;
    public static void conectar(String user, String pass) throws ClassNotFoundException, SQLException{
        try{
        ConexaoJDBC = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root", "root");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    
    }public static void desconectar(){
    try{ConexaoJDBC.close();}
    catch(Exception ex){
    
    }
    }
}
