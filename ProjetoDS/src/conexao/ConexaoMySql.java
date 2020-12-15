package conexao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class ConexaoMySql {
    private static final String url = "jdbc:mysql://localhost/bd_sisBike";
    private static final String user = "root";
    private static final String password = "root";                                     //
    //private static final String password = "S01l05s23l07";
    public static Connection getConexao (){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("jdbc:mysql.Driver");
            
            con = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!" + e.getMessage());
        }
        
        return con;
    }
}
