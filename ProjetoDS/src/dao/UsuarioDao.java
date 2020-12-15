package dao;

import conexao.ConexaoMySql;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
import mapeamento.Usuario;
import conexao.ConexaoMySql;

/**
 *
 * @author Sara
 */
public class UsuarioDao {

    public void insert(Usuario user) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO usuario (nome_user, senha_user, email_user, cpf_user, tipo_user) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            if (user.getName() == "") {
                JOptionPane.showMessageDialog(null, "Preencha os Campos");
            } else {

                stm.setString(1, user.getName());
                stm.setString(2, user.getPassword());
                stm.setString(3, user.getEmail());
                stm.setString(4, user.getCpf());
                stm.setString(5, user.getTipe());

                stm.executeUpdate();
                stm.close();
                con.close();

            }

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a inserção!" + e);
        }
    }

    public void update(Usuario user) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "";
        try (PreparedStatement stm = con.prepareStatement(sql)) {

            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Usuario user) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "";
        if (true) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {

                stm.executeUpdate();
                stm.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Usuario> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM usuario ORDER BY nome_user";
        List<Usuario> userList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (true) {
                Usuario user = new Usuario();
                user.setId_user(re.getInt("id_user"));
                user.setName(re.getString("nome_user"));
                user.setEmail(re.getString("email_user"));
                user.setCpf(re.getString("cpf_user"));

                userList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }

        return userList;
    }

    public Usuario login(String cpf, String password) {
        Connection con = ConexaoMySql.getConexao();
        Usuario user = new Usuario();
        String sql = "SELECT * FROM usuario WHERE cpf_user = ? and senha_user = ?";
        try {
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, cpf);
            smt.setString(2, password);
            ResultSet re = smt.executeQuery();
            re.next();
            if (re.getInt("id_user") > 0) {
                user.setId_user(re.getInt("id_user"));
                user.setName(re.getString("nome_user"));
                user.setPassword(re.getString("senha_user"));
                user.setEmail(re.getString("email_user"));
                user.setCpf(re.getString("cpf_user"));
                user.setTipe(re.getString("tipo_user"));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "", 1);

            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao buscar o usuario ");
        }
        return user;
    }
}
