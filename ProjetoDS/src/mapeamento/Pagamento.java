package mapeamento;

/**
 *
 * @author Sara
 */
public class Pagamento {

    private int id_pagamento;
    private float paymentvalue;
    private String date;
    private int parcel;
    private String paymentforma;
    private Caixa caixa;
    private Compra compra;
    private Despesa despesa;

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public float getPaymentvalue() {
        return paymentvalue;
    }

    public void setPaymentvalue(float paymentvalue) {
        this.paymentvalue = paymentvalue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getParcel() {
        return parcel;
    }

    public void setParcel(int parcel) {
        this.parcel = parcel;
    }

    public String getPaymentforma() {
        return paymentforma;
    }

    public void setPaymentforma(String paymentforma) {
        this.paymentforma = paymentforma;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }

}
