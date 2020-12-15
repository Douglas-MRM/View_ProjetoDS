package testes;

import dao.AgendaDao;
import dao.ClienteDao;
import dao.FornecedorDao;
import dao.FuncionarioDao;
import dao.ProdutoDao;
import dao.ServicoDao;
import mapeamento.Agenda;
import mapeamento.Cliente;
import mapeamento.Fornecedor;
import mapeamento.Funcionario;
import mapeamento.Produto;
import mapeamento.Servico;

/**
 *
 * @author Sara
 */
public class TesteDao {

    public static void testeInserirCliente() {
        Cliente cli = new Cliente();
        cli.setName("Joana da Silva");
        cli.setCpf("111.049.096-6");
        cli.setEmail("joanasilva29@gmail.com");
        cli.setAdress("Av. da Boa Vista");
        cli.setRg("3423212");
        cli.setDateofbirth("29/04/1992");
        cli.setSexo("Feminino");
        ClienteDao clidao = new ClienteDao();
        clidao.insert(cli);
    }

    public static void testeInserirProduto() {
        Produto p = new Produto();
        Fornecedor f = new Fornecedor();
        p.setName("Joana da Silva");
        p.setBrand("aaaaa");
        p.setCategorie("bbbbb");
        p.setDescription("assasa");
        p.setPrice((float) 30.50);
        p.setSaleprice((float) 50.00);
        p.setForn(f);

        ProdutoDao pdao = new ProdutoDao();
        pdao.insert(p);
    }

    public static void testeInserirServ() {
        Servico s = new Servico();
        s.setName("Engraxar Corrente");
        s.setDescripcion("aaaaaaaaaaaa");
        s.setServiceprice((float) 10.00);
        s.setTime("10 dias");
        s.setTotalprice((float) 20.50);
        s.setType("a");

        ServicoDao sdao = new ServicoDao();
        sdao.insert(s);
    }

    public static void testeInserirForn() {
        Fornecedor f = new Fornecedor();
        f.setCompanyname("Souza");
        f.setAdress("Rua da Silva");
        f.setCep("1222122");
        f.setCity("Cidade da Souza");
        f.setCnpj("2382388233");
        f.setCountry("País da Souza");
        f.setDescription("Silva");
        f.setPhonenumber("3458-2939");
        f.setState("Joana da Souza");
        f.setTradename("Souza LTDA");

        FornecedorDao fdao = new FornecedorDao();
        fdao.insert(f);
    }

    public static void testeInserirFun() {
        Funcionario f = new Funcionario();
        f.setName("Julia da Silva");
        f.setAdress("Rua da Silva");
        f.setCpf("123123123-10");
        f.setDescription("Silva");
        f.setEmail("JuliadaSilva@gmail.com");
        f.setPhonenumber("3458-2939");
        f.setRg("212382");
        f.setRole("Vendedora");

        FuncionarioDao fdao = new FuncionarioDao();
        fdao.insert(f);
    }

    public static void testeAgendar() {
        Agenda a = new Agenda();
        a.setDate("teste");
        a.setTimetable("teste");

        Cliente c = new Cliente();
        c.setId_cliente(1);
        a.setCliente(c);

        Servico s = new Servico();
        s.setId_servico(1);
        a.setServico(s);

        AgendaDao adao = new AgendaDao();
        adao.insert(a);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //testeInserirCliente();
        //testeInserirProduto();
        //testeInserirServ();
        //testeInserirFun();
        //testeInserirForn();
        testeAgendar();
        
    }

}
