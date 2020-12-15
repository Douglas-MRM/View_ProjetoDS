package dao;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Fornecedor;
import conexao.ConexaoMySql;

/**
 *
 * @author Sara
 */
public class FornecedorDao {

    public void insert(Fornecedor forn) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO fornecedor (nomeFantasia_forn, razaoSocial_forn, cnpj_forn, cep_forn, pais_forn, estado_forn, cidade_forn, telefone_forn, endereco_forn, descricao_forn) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, forn.getTradename());
            stm.setString(2, forn.getCompanyname());
            stm.setString(3, forn.getCnpj());
            stm.setString(4, forn.getCep());
            stm.setString(5, forn.getCountry());
            stm.setString(6, forn.getState());
            stm.setString(7, forn.getCity());
            stm.setString(8, forn.getPhonenumber());
            stm.setString(9, forn.getAdress());
            stm.setString(10, forn.getDescription());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a inserção!" + e);
        }
    }

    public void update(Fornecedor forn) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE fornecedor SET nomeFantasia_forn = ?, razaoSocial_forn = ?, cnpj_forn = ?, cep_forn = ?, pais_forn = ?, estado_forn = ?, cidade_forn = ?, telefone_forn = ?, endereco_forn = ?, descricao_forn = ? WHERE id_forn = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, forn.getTradename());
            stm.setString(2, forn.getCompanyname());
            stm.setString(3, forn.getCnpj());
            stm.setString(4, forn.getCep());
            stm.setString(5, forn.getCountry());
            stm.setString(6, forn.getState());
            stm.setString(7, forn.getCity());
            stm.setString(8, forn.getPhonenumber());
            stm.setString(9, forn.getAdress());
            stm.setString(10, forn.getDescription());
            stm.setInt(11, forn.getId_fornecedor());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Fornecedor forn) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM fornecedor WHERE id_forn = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do fornecedor " + forn.getCompanyname() + "?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, forn.getId_fornecedor());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Fornecedor> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM fornecedor";
        List<Fornecedor> fornList = new ArrayList();
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Fornecedor forn = new Fornecedor();
                forn.setId_fornecedor(re.getInt("id_forn"));
                forn.setTradename(re.getString("nomeFantasia_forn"));
                forn.setCompanyname(re.getString("razaoSocial_forn"));
                forn.setCnpj(re.getString("cnpj_forn"));
                forn.setCep(re.getString("cep_forn"));
                forn.setCountry(re.getString("pais_forn"));
                forn.setState(re.getString("estado_forn"));
                forn.setCity(re.getString("cidade_forn"));
                forn.setAdress(re.getString("endereco_forn"));
                forn.setPhonenumber(re.getString("telefone_forn"));
                forn.setDescription(re.getString("descricao_forn"));

                fornList.add(forn);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!" + e);
        }

        return fornList;
    }
    
    public List<Fornecedor> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM fornecedor WHERE nomeFantasia_forn LIKE ?";
        List<Fornecedor> fornList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Fornecedor forn = new Fornecedor();
                forn.setId_fornecedor(re.getInt("id_forn"));
                forn.setTradename(re.getString("nomeFantasia_forn"));
                forn.setCompanyname(re.getString("razaoSocial_forn"));
                forn.setCnpj(re.getString("cnpj_forn"));
                forn.setCep(re.getString("cep_forn"));
                forn.setCountry(re.getString("pais_forn"));
                forn.setState(re.getString("estado_forn"));
                forn.setCity(re.getString("cidade_forn"));
                forn.setAdress(re.getString("endereco_forn"));
                forn.setPhonenumber(re.getString("telefone_forn"));
                forn.setDescription(re.getString("descricao_forn"));

                fornList.add(forn);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!" + e);
        }

        return fornList;
    }

}
