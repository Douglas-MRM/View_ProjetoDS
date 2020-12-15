/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Cliente;
import mapeamento.Venda;

public class VendaDao {

    public int insert(Venda ven) {
        Connection con = ConexaoMySql.getConexao();
        int chave = 0;
        String sql = "INSERT INTO venda (hora_vend, data_vend, valor_vend, formaPag_vend, fk_id_cli) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, ven.getHora());
            stm.setString(2, ven.getData());
            stm.setFloat(3, ven.getValor());
            stm.setString(4, ven.getForma());
            stm.setInt(5, ven.getCliente().getId_cliente());

            stm.executeUpdate();

            ResultSet r = stm.executeQuery("SELECT LAST_INSERT_ID() FROM venda");
            if (r.next()) {
                chave = r.getInt(1);
            } else {
                System.out.println("Erro ao pegar a chave primária");
            }

            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!" + e);
        }
        return chave;
    }

    public List<Venda> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM venda INNER JOIN cliente ON cliente.id_cli = venda.fk_id_cli";
        List<Venda> vendList = new ArrayList();
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {

                Venda vend = new Venda();

                vend.setId_venda(re.getInt("venda.id_vend"));
                vend.setHora(re.getString("venda.hora_vend"));
                vend.setData(re.getString("venda.data_vend"));
                vend.setValor(re.getFloat("venda.valor_vend"));
                vend.setForma(re.getString("venda.formaPag_vend"));

                Cliente c = new Cliente();
                c.setId_cliente(re.getInt("cliente.id_cli"));
                c.setName(re.getString("cliente.nome_cli"));
                vend.setCliente(c);

                vendList.add(vend);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return vendList;
    }

    public List<Venda> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM venda INNER JOIN cliente ON cliente.id_cli = venda.fk_id_cli AND venda.data_vend LIKE ?";
        List<Venda> vendList = new ArrayList();
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {

                Venda vend = new Venda();

                vend.setId_venda(re.getInt("venda.id_vend"));
                vend.setHora(re.getString("venda.hora_vend"));
                vend.setData(re.getString("venda.data_vend"));
                vend.setValor(re.getFloat("venda.valor_vend"));
                vend.setForma(re.getString("venda.formaPag_vend"));

                Cliente c = new Cliente();
                c.setId_cliente(re.getInt("cliente.id_cli"));
                c.setName(re.getString("cliente.nome_cli"));
                vend.setCliente(c);

                vendList.add(vend);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return vendList;
    }
}
