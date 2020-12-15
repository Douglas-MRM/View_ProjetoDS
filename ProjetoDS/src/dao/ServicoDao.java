package dao;

import conexao.ConexaoMySql;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Servico;

/**
 *
 * @author Sara
 */
public class ServicoDao {

    public void insert(Servico ser) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO servico (nome_serv, tipo_serv, tempo_serv, valorMaoObra_serv, valorTotal_serv, descricao_serv) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ser.getName());
            stm.setString(2, ser.getType());
            stm.setString(3, ser.getTime());
            stm.setFloat(4, ser.getServiceprice());
            stm.setFloat(5, ser.getTotalprice());
            stm.setString(6, ser.getDescripcion());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro! " + e);
        }
    }

    public void update(Servico ser) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE servico SET nome_serv = ?, tipo_serv = ?, tempo_serv = ?, valorMaoObra_serv = ?, valorTotal_serv = ?, descricao_serv = ? WHERE id_serv = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ser.getName());
            stm.setString(2, ser.getType());
            stm.setString(3, ser.getTime());
            stm.setFloat(4, ser.getServiceprice());
            stm.setFloat(5, ser.getTotalprice());
            stm.setString(6, ser.getDescripcion());
            stm.setInt(7, ser.getId_servico());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização! " + e);
        }
    }

    public void delete(Servico ser) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM servico WHERE id_serv = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do serviço " + ser.getName() + "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, ser.getId_servico());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Servico> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM servico";
        List<Servico> servList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Servico ser = new Servico();
                ser.setId_servico(re.getInt("id_serv"));
                ser.setName(re.getString("nome_serv"));
                ser.setType(re.getString("tipo_serv"));
                ser.setTime(re.getString("tempo_serv"));
                ser.setServiceprice(re.getFloat("valorMaoObra_serv"));
                ser.setTotalprice(re.getFloat("valorTotal_serv"));
                ser.setDescripcion(re.getString("descricao_serv"));

                servList.add(ser);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return servList;
    }

    public List<Servico> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM servico WHERE nome_serv LIKE ?";
        List<Servico> servList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Servico ser = new Servico();
                ser.setId_servico(re.getInt("id_serv"));
                ser.setName(re.getString("nome_serv"));
                ser.setType(re.getString("tipo_serv"));
                ser.setTime(re.getString("tempo_serv"));
                ser.setServiceprice(re.getFloat("valorMaoObra_serv"));
                ser.setTotalprice(re.getFloat("valorTotal_serv"));
                ser.setDescripcion(re.getString("descricao_serv"));

                servList.add(ser);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return servList;
    }

}
