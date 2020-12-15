/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conexao.ConexaoMySql;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Servico;
import mapeamento.Venda;
import mapeamento.VendaServico;
/**
 *
 * @author Sara
 */
public class VendaServicoDao {
    public List<VendaServico> listAll(String nome) {
        Connection con = ConexaoMySql.getConexao();
        List<VendaServico> listVS = new ArrayList<>();
        String sql = "Select * from Venda_Servico INNER JOIN servico ON servico.id_serv = venda_servico.fk_id_serv "
                + "INNER JOIN venda ON venda.id_vend = produto_venda.fk_id_vend WHERE fk_id_serv like ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + nome + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                VendaServico vs = new VendaServico();
                vs.setQnt(re.getInt("venda_servico.quant_vend_serv"));
                vs.setValorVendServ(re.getFloat("venda_servico.valor_vendServ"));
                
                Servico p = new Servico();
                p.setId_servico(re.getInt("servico.id_serv"));
                vs.setServ(p);
                
                Venda v = new Venda();
                vs.setFk_id_vend(re.getInt("venda.id_vend"));
                
                listVS.add(vs);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
        return listVS;
    }

    public void insert(VendaServico vs) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO Venda_Servico (fk_id_vend, fk_id_serv, quant_vend_serv, valor_vendServ)"
                + "VALUES (?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, vs.getFk_id_vend());
            stm.setInt(2, vs.getServ().getId_servico());
            stm.setInt(3, vs.getQnt());
            stm.setFloat(4, vs.getValorVendServ());
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
    }
}
