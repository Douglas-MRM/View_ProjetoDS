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
import mapeamento.Produto;
import mapeamento.Venda;
import mapeamento.VendaProduto;

/**
 *
 * @author Sara
 */
public class VendaProdutoDao {

    public List<VendaProduto> listAll(String nome) {
        Connection con = ConexaoMySql.getConexao();
        List<VendaProduto> listVP = new ArrayList<>();
        String sql = "Select * from Produto_Venda INNER JOIN produto ON produto.id_prod = produto_venda.fk_id_prod "
                + "INNER JOIN venda ON venda.id_vend = produto_venda.fk_id_vend WHERE fk_id_prod like ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + nome + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                VendaProduto vp = new VendaProduto();
                vp.setQnt(re.getInt("produto_venda.quant_vendProd"));
                vp.setValorVendProd(re.getFloat("produto_venda.valor_vendProd"));
                
                Produto p = new Produto();
                p.setId_produto(re.getInt("produto.id_prod"));
                vp.setProd(p);
                
                vp.setFk_id_vend(re.getInt("venda.id_vend"));
                
                listVP.add(vp);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
        return listVP;
    }

    public void insert(VendaProduto vp) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO Produto_Venda (fk_id_vend, fk_id_prod, quant_vendProd, valor_vendProd)"
                + "VALUES (?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {            
            stm.setInt(1, vp.getFk_id_vend());
            stm.setInt(2, vp.getProd().getId_produto());
            stm.setInt(3, vp.getQnt());
            stm.setFloat(4, vp.getValorVendProd());
            
            stm.executeUpdate();
            stm.close();
            con.close();
            //JOptionPane.showMessageDialog(null, "Adicionado ao Carrinho!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
    }
    
//    public void insertIDVenda(VendaProduto vp) {
//        Connection con = ConexaoMySql.getConexao();
//        String sql = "UPDATE Produto_Venda SET fk_id_vend = ? WHERE id_prod_vend = ?";
//        try (PreparedStatement stm = con.prepareStatement(sql)){
//            ResultSet r = stm.executeQuery("SELECT MAX(id_vend) FROM venda;");
//        } catch (Exception e) {
//        }
//    }
}
