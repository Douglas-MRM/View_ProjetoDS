package mapeamento;

/**
 *
 * @author Sara
 */
public class Caixa {

    private int id_caixa;
    private String date;
    private float inicial;
    private float totalrec;
    private float totalpayment;
    private float finalsa;

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getInicial() {
        return inicial;
    }

    public void setInicial(float inicial) {
        this.inicial = inicial;
    }

    public float getTotalrec() {
        return totalrec;
    }

    public void setTotalrec(float totalrec) {
        this.totalrec = totalrec;
    }

    public float getTotalpayment() {
        return totalpayment;
    }

    public void setTotalpayment(float totalpayment) {
        this.totalpayment = totalpayment;
    }

    public float getFinalsa() {
        return finalsa;
    }

    public void setFinalsa(float finalsa) {
        this.finalsa = finalsa;
    }

}
