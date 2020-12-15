package testes;

import conexao.ConexaoMySql;

/**
 *
 * @author Sara
 */
public class TesteConexao {

    public static void main(String[] args) {
        ConexaoMySql c = new ConexaoMySql();
        c.getConexao();
    }

}
