/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;
import java.sql.*;
import mapeamento.Cliente;
import conexao.ConexaoMySql;
import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class ClienteDao {

    public void insert(Cliente cli) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO cliente (nome_cli, data_nasc_cli, sexo_cli, cpf_cli, rg_cli, endereco_cli, email_cli) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, cli.getName());
            stm.setString(2, cli.getDateofbirth());
            stm.setString(3, cli.getSexo());
            stm.setString(4, cli.getCpf());
            stm.setString(5, cli.getRg());
            stm.setString(6, cli.getAdress());
            stm.setString(7, cli.getEmail());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!" + e);
        }
    }

    public void update(Cliente cli) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE cliente SET nome_cli = ?, data_nasc_cli = ?, sexo_cli = ?, cpf_cli = ?, rg_cli = ?, endereco_cli = ?, email_cli = ? WHERE id_cli = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, cli.getName());
            stm.setString(2, cli.getDateofbirth());
            stm.setString(3, cli.getSexo());
            stm.setString(4, cli.getCpf());
            stm.setString(5, cli.getRg());
            stm.setString(6, cli.getAdress());
            stm.setString(7, cli.getEmail());
            stm.setInt(8, cli.getId_cliente());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Cliente cli) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM cliente WHERE id_cli = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do cliente " + cli.getName() + "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, cli.getId_cliente());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Cliente> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM cliente";
        List<Cliente> cliList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {           
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Cliente cli = new Cliente();
                cli.setId_cliente(re.getInt("id_cli"));
                cli.setName(re.getString("nome_cli"));
                cli.setDateofbirth(re.getString("data_nasc_cli"));
                cli.setSexo(re.getString("sexo_cli"));
                cli.setCpf(re.getString("cpf_cli"));
                cli.setRg(re.getString("rg_cli"));
                cli.setAdress(re.getString("endereco_cli"));
                cli.setEmail(re.getString("email_cli"));

                cliList.add(cli);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return cliList;
    }

    public List<Cliente> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM cliente WHERE cliente.nome_cli LIKE ?";
        List<Cliente> cliList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Cliente cli = new Cliente();
                cli.setId_cliente(re.getInt("id_cli"));
                cli.setName(re.getString("nome_cli"));
                cli.setDateofbirth(re.getString("data_nasc_cli"));
                cli.setSexo(re.getString("sexo_cli"));
                cli.setCpf(re.getString("cpf_cli"));
                cli.setRg(re.getString("rg_cli"));
                cli.setAdress(re.getString("endereco_cli"));
                cli.setEmail(re.getString("email_cli"));

                cliList.add(cli);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return cliList;
    }

}
