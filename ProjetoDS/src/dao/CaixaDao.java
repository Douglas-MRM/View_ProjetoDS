package dao;

import conexao.ConexaoMySql;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Caixa;

/**
 *
 * @author Sara
 */
public class CaixaDao {
    
    public void insert(Caixa caix){ 
       Connection con = ConexaoMySql.getConexao();
       String sql = "INSERT INTO caixa (data_caixa, saldoInicial_caixa, totalRec_caixa, totalPag_caixa, saldoFinal_caixa) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, caix.getDate());
            stm.setFloat(2, caix.getInicial());
            stm.setFloat(3, caix.getTotalrec());
            stm.setFloat(4, caix.getTotalpayment());
            stm.setFloat(5, caix.getFinalsa());
            
            stm.executeUpdate();
            stm.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o registro!" + e);
        }
    }
    
    public void update(Caixa caix){
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE caixa SET data_caixa = ?, saldoInicial_caixa = ?, totalRec_caixa = ?, totalPag_caixa = ?, saldoFinal_caixa = ? WHERE id_caixa = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, caix.getDate());
            stm.setFloat(2, caix.getInicial());
            stm.setFloat(3, caix.getTotalrec());
            stm.setFloat(4, caix.getTotalpayment());
            stm.setFloat(5, caix.getFinalsa());
            stm.setInt(6, caix.getId_caixa());
            
            stm.executeUpdate();
            stm.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }
    
    public void delete(Caixa caix){
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM caixa WHERE id_caixa = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do registro do dia " + caix.getDate()+ " do caixa?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)){
                stm.setInt(1, caix.getId_caixa());
            
                stm.executeUpdate();
                stm.close();
                con.close();
            
                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }  
    }
    
    public List<Caixa> listAll(){
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM caixa ORDER BY data_caixa";
        List<Caixa> caixList = new ArrayList();
        
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Caixa caix = new Caixa();
                caix.setId_caixa(re.getInt("id_caixa"));
                caix.setDate(re.getString("data_caixa"));
                caix.setInicial(re.getFloat("saldoInicial_caixa"));
                caix.setTotalrec(re.getFloat("totalRec_caixa"));
                caix.setTotalpayment(re.getFloat("totalPag_caixa"));
                caix.setFinalsa(re.getFloat("saldoFinal_caixa"));
                
                caixList.add(caix);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return caixList;
    }
}
