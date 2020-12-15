package mapeamento;

/**
 *
 * @author Sara
 */
public class VendaProduto {

    private int id_vend_prod;
    private Venda ven;
    private Produto prod;
    private int qnt;
    private float valorVendProd;
    private int fk_id_vend;

    public int getId_vend_prod() {
        return id_vend_prod;
    }

    public void setId_vend_prod(int id_vend_prod) {
        this.id_vend_prod = id_vend_prod;
    }

    public Venda getVen() {
        return ven;
    }

    public void setVen(Venda ven) {
        this.ven = ven;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public float getValorVendProd() {
        return valorVendProd;
    }

    public void setValorVendProd(float valorVendProd) {
        this.valorVendProd = valorVendProd;
    }

    public int getFk_id_vend() {
        return fk_id_vend;
    }

    public void setFk_id_vend(int fk_id_vend) {
        this.fk_id_vend = fk_id_vend;
    }

}
