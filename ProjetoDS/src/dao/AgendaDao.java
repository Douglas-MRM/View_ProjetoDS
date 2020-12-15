package dao;

import conexao.ConexaoMySql;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import mapeamento.Agenda;
import mapeamento.Cliente;
import mapeamento.Servico;

/**
 *
 * @author Sara
 */
public class AgendaDao {

    public void insert(Agenda agen) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "INSERT INTO agenda (data_agen, horario_agen, fk_id_cli, fk_id_serv) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            //stm.setString(1, agen.getName());
            stm.setString(1, agen.getDate());
            //stm.setString(3, agen.getAdress());
            stm.setString(2, agen.getTimetable());
            stm.setInt(3, agen.getCliente().getId_cliente());
            stm.setInt(4, agen.getServico().getId_servico());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro!" + e);
        }
    }

    public void update(Agenda agen) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "UPDATE agenda SET data_agen = ?, horario_agen = ?, fk_id_cli = ?, fk_id_serv = ? WHERE id_agen = ?";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            //stm.setString(1, agen.getName());
            stm.setString(1, agen.getDate());
            //stm.setString(3, agen.getAdress());
            stm.setString(2, agen.getTimetable());
            stm.setInt(3, agen.getCliente().getId_cliente());
            stm.setInt(4, agen.getServico().getId_servico());
            stm.setInt(5, agen.getId_agenda());

            stm.executeUpdate();
            stm.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a atualização!" + e);
        }
    }

    public void delete(Agenda agen) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "DELETE FROM agenda WHERE id_agen = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do agendamento?", "Excluir", JOptionPane.YES_NO_OPTION);
        //int opcao = JOptionPane.showConfirmDialog(null, "Deseja concluir a exclusão do agendamento do" + agen.getCliente().getName()+ "?", "Excluir", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setInt(1, agen.getId_agenda());

                stm.executeUpdate();
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível fazer a deleção! " + e);
            }
        }
    }

    public List<Agenda> listAll() {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM agenda INNER JOIN cliente ON cliente.id_cli = agenda.fk_id_cli INNER JOIN servico ON servico.id_serv = agenda.fk_id_serv";
        List<Agenda> agenList = new ArrayList();

        try (PreparedStatement stm = con.prepareStatement(sql)) {
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Agenda agen = new Agenda();
                agen.setId_agenda(re.getInt("agenda.id_agen"));
                agen.setDate(re.getString("agenda.data_agen"));
                agen.setTimetable(re.getString("agenda.horario_agen"));

                Cliente c = new Cliente();
                c.setId_cliente(re.getInt("cliente.id_cli"));
                c.setName(re.getString("cliente.nome_cli"));
                agen.setCliente(c);

                Servico s = new Servico();
                s.setId_servico(re.getInt("servico.id_serv"));
                s.setName(re.getString("servico.nome_serv"));
                agen.setServico(s);

                agenList.add(agen);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return agenList;
    }

    public List<Agenda> listAll(String NomePesquisa) {
        Connection con = ConexaoMySql.getConexao();
        String sql = "SELECT * FROM agenda WHERE cliente.nome_cli LIKE ?";
        List<Agenda> agenList = new ArrayList();
        
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, "%" + NomePesquisa + "%");
            ResultSet re = stm.executeQuery();
            while (re.next()) {
                Agenda agen = new Agenda();
                agen.setId_agenda(re.getInt("agenda.id_agen"));                
                agen.setDate(re.getString("agenda.data_agen"));
                agen.setTimetable(re.getString("agenda.horario_agen"));

                Cliente c = new Cliente();
                c.setId_cliente(re.getInt("cliente.id_cli"));
                c.setName(re.getString("cliente.nome_cli"));
                agen.setCliente(c);

                Servico s = new Servico();
                s.setId_servico(re.getInt("servico.id_serv"));
                s.setName(re.getString("servico.nome_serv"));
                agen.setServico(s);

                agenList.add(agen);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os registros!");
        }
        return agenList;
    }
}
