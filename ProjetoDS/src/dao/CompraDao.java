package dao;

import java.util.*;
import java.sql.*;
import mapeamento.Compra;
import conexao.ConexaoMySql;
import javax.swing.JOptionPane;
import mapeamento.CompraProduto;
import mapeamento.Fornecedor;

public class CompraDao {

    public int insert(Compra comp) {
        Connection con = ConexaoMySql.getConexao();
        int chave = 0;
        String sql = "INSERT INTO Compra ( data_comp, formaPag_comp, precoVenda) VALUES (?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, comp.getData());
            stm.setString(2, comp.getForma());
            stm.setFloat(3, comp.getValorDeVenda());

            stm.executeUpdate();
            ResultSet r = stm.executeQuery("SELECT LAST_INSERT_ID() FROM Compra");
            if (r.next()) {
                chave = r.getInt(1);
            } else {
                System.out.println("Erro ao pegar a chave primária");
            }

            stm.close();
            con.close();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!" + e);
        }
        return chave;
    }

    public void update(Compra comp) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE Compra SET data_comp = ?, formaPag_comp = ?, precoVenda = ? WHERE id_comp = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, comp.getData());
            stm.setString(2, comp.getForma());
            stm.setFloat(3, comp.getValorDeVenda());
            stm.setInt(4, comp.getId_compra());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Compra comp) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM compra WHERE id_comp = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão da compra de ID " + comp.getId_compra() + "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, comp.getId_compra());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Compra> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM compra";
        List<Compra> compList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Compra comp = new Compra();
                comp.setId_compra(re.getInt("id_comp"));
                comp.setData(re.getString("data_comp"));
                comp.setForma(re.getString("formaPag_comp"));
                comp.setValorDeVenda(re.getFloat("precoVenda"));

                compList.add(comp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return compList;
    }

    public List<Compra> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM compra WHERE data_comp LIKE ?";
        List<Compra> compList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Compra comp = new Compra();
                comp.setId_compra(re.getInt("id_comp"));
                comp.setData(re.getString("data_comp"));
                comp.setForma(re.getString("formaPag_comp"));
                comp.setValorDeVenda(re.getFloat("precoVenda"));

                compList.add(comp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return compList;
    }

}
