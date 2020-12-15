package mapeamento;

/**
 *
 * @author Sara
 */
public class Recebimento {

    private int id_recebimento;
    private float value;
    private int parcel;
    private String paymentform;
    private String date;
    private Caixa caixa;
    private Venda venda;
    private Cliente cliente;

    public int getId_recebimento() {
        return id_recebimento;
    }

    public void setId_recebimento(int id_recebimento) {
        this.id_recebimento = id_recebimento;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getParcel() {
        return parcel;
    }

    public void setParcel(int parcel) {
        this.parcel = parcel;
    }

    public String getPaymentform() {
        return paymentform;
    }

    public void setPaymentform(String paymentform) {
        this.paymentform = paymentform;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
