package mapeamento;

/**
 *
 * @author Sara
 */
public class Servico {

    private int id_servico;
    private String name;
    private String type;
    private String time;
    private float serviceprice;
    private float totalprice;
    private String descripcion;

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(float serviceprice) {
        this.serviceprice = serviceprice;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return getName(); //To change body of generated methods, choose Tools | Templates.
    }

}
