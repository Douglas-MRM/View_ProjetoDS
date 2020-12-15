package mapeamento;

/**
 *
 * @author Sara
 */
public class VendaServico {

    private int id_vend_serv;
    private int qnt;
    private float valorVendServ;
    private Servico serv;
    private Venda vend;
    private int fk_id_vend;

    public int getId_vend_serv() {
        return id_vend_serv;
    }

    public void setId_vend_serv(int id_vend_serv) {
        this.id_vend_serv = id_vend_serv;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public Servico getServ() {
        return serv;
    }

    public void setServ(Servico serv) {
        this.serv = serv;
    }

    public Venda getVend() {
        return vend;
    }

    public void setVend(Venda vend) {
        this.vend = vend;
    }

    public float getValorVendServ() {
        return valorVendServ;
    }

    public void setValorVendServ(float valorVendServ) {
        this.valorVendServ = valorVendServ;
    }

    public int getFk_id_vend() {
        return fk_id_vend;
    }

    public void setFk_id_vend(int fk_id_vend) {
        this.fk_id_vend = fk_id_vend;
    }

}
