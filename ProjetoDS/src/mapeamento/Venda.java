package mapeamento;

public class Venda {

    private int id_venda;
    private String hora;
    private String data;
    private float valor;
    private String forma;

    private int fk_id_vend;
    private Cliente cliente;
    private Servico serv;
    private Produto fk_id_prod;

    public Servico getServ() {
        return serv;
    }

    public void setServ(Servico serv) {
        this.serv = serv;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getFk_id_vend() {
        return fk_id_vend;
    }

    public void setFk_id_vend(int fk_id_vend) {
        this.fk_id_vend = fk_id_vend;
    }

    public Produto getFk_id_prod() {
        return fk_id_prod;
    }

    public void setFk_id_prod(Produto fk_id_prod) {
        this.fk_id_prod = fk_id_prod;
    }

    public void getUltimoId() {

    }
}
