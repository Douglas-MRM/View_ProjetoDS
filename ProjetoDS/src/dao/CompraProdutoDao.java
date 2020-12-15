package dao;

import conexao.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Compra;
import mapeamento.CompraProduto;
import mapeamento.Produto;

/**
 *
 * @author Sara
 */
public class CompraProdutoDao {    
    
    public void insert(CompraProduto vp) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO Produto_Compra (fk_id_comp, fk_id_prod, quant_compProd, valor_compProd)"
                + "VALUES (?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, vp.getCompra().getId_compra());
            stm.setInt(2, vp.getProd().getId_produto());
            stm.setInt(3, vp.getQnt());
            stm.setFloat(4, vp.getValorCompraProd());

            stm.executeUpdate();
            stm.close();
            con.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
    }

    public List<CompraProduto> listAll(String nome) {
        Connection con = ConexaoMySql.getConexao();
        List<CompraProduto> listCP = new ArrayList<>();
        String sql = "Select * from Produto_Compra INNER JOIN produto ON produto.id_prod = produto_compra.fk_id_prod "
                + "INNER JOIN compra ON compra.id_comp = produto_compra.fk_id_comp WHERE fk_id_prod like ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + nome + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                CompraProduto cp = new CompraProduto();
                cp.setQnt(re.getInt("produto_compra.quant_compProd"));
                cp.setValorCompraProd(re.getFloat("produto_compra.valor_compProd"));

                Produto p = new Produto();
                p.setId_produto(re.getInt("produto.id_prod"));
                cp.setProd(p);

                Compra compra = new Compra();
                compra.setId_compra(re.getInt("compra.id_comp"));
                cp.setCompra(compra);
                //vp.setFk_id_vend(re.getInt("venda.id_vend"));

                listCP.add(cp);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
        return listCP;
    }

}
