package dao;

import conexao.ConexaoMySql;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Despesa;

/**
 *
 * @author Sara
 */
public class DespesaDao {

    public void insert(Despesa desp) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO despesa (valor_desp, data_desp, descricao_desp, formaPag_desp) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setFloat(1, desp.getCostvalue());
            stm.setString(2, desp.getDate());
            stm.setString(3, desp.getDescription());
            stm.setString(4, desp.getPaymentform());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o registro!" + e);
        }
    }

    public void update(Despesa desp) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE despesa SET valor_desp = ?, data_desp = ?, descricao_desp = ?, formaPag_desp = ? WHERE id_desp = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setFloat(1, desp.getCostvalue());
            stm.setString(2, desp.getDate());
            stm.setString(3, desp.getDescription());
            stm.setString(4, desp.getPaymentform());
            stm.setInt(5, desp.getId_despesa());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Despesa desp) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM caixa WHERE id_desp = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do registro de despesa do dia " + desp.getDate() + "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, desp.getId_despesa());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Despesa> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM despesa ORDER BY data_desp";
        List<Despesa> despList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Despesa desp = new Despesa();
                desp.setId_despesa(re.getInt("id_desp"));
                desp.setDate(re.getString("data_desp"));
                desp.setCostvalue(re.getFloat("valor_desp"));
                desp.setDescription(re.getString("descricao_desp"));
                desp.setPaymentform(re.getString("formaPag_desp"));

                despList.add(desp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return despList;
    }
}
