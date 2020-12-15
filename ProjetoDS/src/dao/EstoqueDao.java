package dao;

import conexao.ConexaoMySql;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Estoque;
import mapeamento.Produto;

/**
 *
 * @author Sara
 */
public class EstoqueDao {

    public void insert(Estoque est) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO estoque (qnt_est, fk_id_prod) VALUES (?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, est.getQnt());
            stm.setInt(2, est.getProd().getId_produto());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!" + e);
        }
    }

    public void BaixaNoEstoque(Estoque est) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE estoque SET qnt_est = qnt_est - ? WHERE id_est = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, est.getQnt());
            stm.setInt(2, est.getId_estoque());

            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
    }

    public void AddNoEstoque(Estoque est) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE estoque SET qnt_est = qnt_est + ? WHERE id_est = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, est.getQnt());
            stm.setInt(2, est.getId_estoque());

            stm.executeUpdate();
            stm.close();
            con.close();
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
    }

    public List<Estoque> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM estoque INNER JOIN produto ON produto.id_prod = estoque.fk_id_prod";
        List<Estoque> estList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Estoque est = new Estoque();
                est.setId_estoque(re.getInt("estoque.id_est"));
                est.setQnt(re.getInt("estoque.qnt_est"));
                est.setPrice(re.getFloat("estoque.valorUni_est"));

                Produto p = new Produto();
                p.setId_produto(re.getInt("produto.id_prod"));
                p.setName(re.getString("produto.nome_prod"));
                p.setPrice(re.getFloat("produto.precoVenda"));
                est.setProd(p);

                estList.add(est);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return estList;
    }

    public List<Estoque> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM estoque INNER JOIN produto ON produto.id_prod = estoque.fk_id_prod LIKE ?";
        List<Estoque> estList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Estoque est = new Estoque();
                est.setId_estoque(re.getInt("estoque.id_est"));
                est.setQnt(re.getInt("estoque.qnt_est"));
                est.setPrice(re.getFloat("estoque.valorUni_est"));

                Produto p = new Produto();
                p.setId_produto(re.getInt("produto.id_prod"));
                p.setName(re.getString("produto.nome_prod"));
                p.setPrice(re.getFloat("produto.precoVenda"));
                est.setProd(p);

                estList.add(est);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return estList;
    }
}
