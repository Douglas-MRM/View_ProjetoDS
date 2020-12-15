package mapeamento;

public class Compra {

    private int qntd;
    private String data;
    private String forma;
    private Fornecedor forn;
    private int id_compra;
    private String nome;
    private float valor;
    private float valorDeVenda;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public String getData() {
        return data;
    }

    public Fornecedor getForn() {
        return forn;
    }

    public void setForn(Fornecedor forn) {
        this.forn = forn;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public float getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(float valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

}
