package dao;

import conexao.ConexaoMySql;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
import mapeamento.Funcionario;
import conexao.ConexaoMySql;

/**
 *
 * @author Sara
 */
public class FuncionarioDao {

    public void insert(Funcionario fun) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO funcionario (nome_fun, email_fun, cpf_fun, rg_fun, endereco_fun, cargo_fun, telefone_fun, descricao_fun) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, fun.getName());
            stm.setString(2, fun.getEmail());
            stm.setString(3, fun.getCpf());
            stm.setString(4, fun.getRg());
            stm.setString(5, fun.getAdress());
            stm.setString(6, fun.getRole());
            stm.setString(7, fun.getPhonenumber());
            stm.setString(8, fun.getDescription());

            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a inserção!" + e);
        }
    }

    public void update(Funcionario fun) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE funcionario SET nome_fun = ?, email_fun = ?, cpf_fun = ?, rg_fun = ?, endereco_fun = ?, cargo_fun = ?, telefone_fun = ?, descricao_fun = ? WHERE id_fun = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, fun.getName());
            stm.setString(2, fun.getEmail());
            stm.setString(3, fun.getCpf());
            stm.setString(4, fun.getRg());
            stm.setString(5, fun.getAdress());
            stm.setString(6, fun.getRole());
            stm.setString(7, fun.getPhonenumber());
            stm.setString(8, fun.getDescription());
            stm.setInt(9, fun.getId_funcionario());

            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Funcionario fun) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM funcionario WHERE id_fun = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do funcionário " + fun.getName() + "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, fun.getId_funcionario());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Funcionario> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM funcionario";
        List<Funcionario> funList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Funcionario fun = new Funcionario();
                fun.setId_funcionario(re.getInt("funcionario.id_fun"));
                fun.setName(re.getString("funcionario.nome_fun"));
                fun.setEmail(re.getString("funcionario.email_fun"));
                fun.setCpf(re.getString("funcionario.cpf_fun"));
                fun.setRg(re.getString("funcionario.rg_fun"));
                fun.setAdress(re.getString("funcionario.endereco_fun"));
                fun.setRole(re.getString("funcionario.cargo_fun"));
                fun.setPhonenumber(re.getString("funcionario.telefone_fun"));
                fun.setDescription(re.getString("funcionario.descricao_fun"));

                funList.add(fun);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!" + e);
        }

        return funList;
    }
    
    public List<Funcionario> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM funcionario WHERE nome_fun LIKE ?";
        List<Funcionario> funList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Funcionario fun = new Funcionario();
                fun.setId_funcionario(re.getInt("funcionario.id_fun"));
                fun.setName(re.getString("funcionario.nome_fun"));
                fun.setEmail(re.getString("funcionario.email_fun"));
                fun.setCpf(re.getString("funcionario.cpf_fun"));
                fun.setRg(re.getString("funcionario.rg_fun"));
                fun.setAdress(re.getString("funcionario.endereco_fun"));
                fun.setRole(re.getString("funcionario.cargo_fun"));
                fun.setPhonenumber(re.getString("funcionario.telefone_fun"));
                fun.setDescription(re.getString("funcionario.descricao_fun"));

                funList.add(fun);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!" + e);
        }

        return funList;
    }
    
}
