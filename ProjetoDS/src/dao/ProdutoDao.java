package dao;

import conexao.ConexaoMySql;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Fornecedor;
import mapeamento.Produto;

/**
 *
 * @author Sara
 */
public class ProdutoDao {

    public void insert(Produto prod) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO produto (nome_prod, categoria_prod, marca_prod, precoVenda, fk_id_forn, descricao_prod, QntdEstoque_prod) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, prod.getName());
            stm.setString(2, prod.getCategorie());
            stm.setString(3, prod.getBrand());            
            stm.setFloat(4, prod.getSaleprice());
            stm.setInt(5, prod.getForn().getId_fornecedor());
            stm.setString(6, prod.getDescription());
            stm.setFloat(7, prod.getQntdEstoque());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!" + e);
        }
    }

    public void update(Produto prod) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE produto SET nome_prod = ?, categoria_prod = ?, marca_prod = ?, precoVenda = ?, fk_id_forn = ?, descricao_prod = ? WHERE id_prod = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, prod.getName());
            stm.setString(2, prod.getCategorie());
            stm.setString(3, prod.getBrand());
            //stm.setFloat(4, prod.getPrice());
            stm.setFloat(4, prod.getSaleprice());
            stm.setInt(5, prod.getForn().getId_fornecedor());
            stm.setString(6, prod.getDescription());
            stm.setInt(7, prod.getId_produto());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Produto prod) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM produto WHERE id_prod = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do produto " + prod.getName() + "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, prod.getId_produto());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Produto> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM produto INNER JOIN fornecedor ON fornecedor.id_forn = produto.fk_id_forn";
        List<Produto> prodList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Produto prod = new Produto();
                prod.setId_produto(re.getInt("produto.id_prod"));
                prod.setName(re.getString("produto.nome_prod"));
                prod.setCategorie(re.getString("produto.categoria_prod"));
                prod.setBrand(re.getString("produto.marca_prod"));
                //prod.setPrice(re.getFloat("produto.precoCusto"));
                prod.setSaleprice(re.getFloat("produto.precoVenda"));
                prod.setDescription(re.getString("produto.descricao_prod"));

                Fornecedor f = new Fornecedor();
                f.setId_fornecedor(re.getInt("fornecedor.id_forn"));
                f.setCompanyname(re.getString("fornecedor.nomeFantasia_forn"));
                prod.setForn(f);

                prodList.add(prod);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!" + e);
        }
        return prodList;
    }

    public List<Produto> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM produto INNER JOIN fornecedor ON fornecedor.id_forn = produto.fk_id_forn AND nome_prod LIKE ?";
        List<Produto> prodList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Produto prod = new Produto();
                prod.setId_produto(re.getInt("produto.id_prod"));
                prod.setName(re.getString("produto.nome_prod"));
                prod.setCategorie(re.getString("produto.categoria_prod"));
                prod.setBrand(re.getString("produto.marca_prod"));
                //prod.setPrice(re.getFloat("produto.precoCusto"));
                prod.setSaleprice(re.getFloat("produto.precoVenda"));
                prod.setDescription(re.getString("produto.descricao_prod"));

                Fornecedor f = new Fornecedor();
                f.setId_fornecedor(re.getInt("fornecedor.id_forn"));
                f.setCompanyname(re.getString("fornecedor.nomeFantasia_forn"));
                prod.setForn(f);

                prodList.add(prod);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!" + e);
        }
        return prodList;
    }
}
