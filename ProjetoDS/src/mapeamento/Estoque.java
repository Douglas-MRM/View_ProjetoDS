package mapeamento;

/**
 *
 * @author Sara
 */
public class Estoque {

    private int id_estoque;
    private int qnt;
    private float price;
    private Produto prod;

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

}
