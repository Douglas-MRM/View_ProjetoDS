package mapeamento;

/**
 *
 * @author Sara
 */
public class Despesa {

    private int id_despesa;
    private float costvalue;
    private String date;
    private String description;
    private String paymentform;

    public int getId_despesa() {
        return id_despesa;
    }

    public void setId_despesa(int id_despesa) {
        this.id_despesa = id_despesa;
    }

    public float getCostvalue() {
        return costvalue;
    }

    public void setCostvalue(float costvalue) {
        this.costvalue = costvalue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentform() {
        return paymentform;
    }

    public void setPaymentform(String paymentform) {
        this.paymentform = paymentform;
    }

}
