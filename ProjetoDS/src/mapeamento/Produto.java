package mapeamento;

/**
 *
 * @author Sara
 */
public class Produto {

    private int id_produto;
    private String name;
    private String categorie;
    private String brand;
    private float price;
    private float saleprice;
    private String description;
    private Fornecedor forn;
    private float qntdEstoque;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

//    public void setId_produto(Produto id_produto) {
//        this.id_produto = (Produto) id_produto;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(float saleprice) {
        this.saleprice = saleprice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Fornecedor getForn() {
        return forn;
    }

    public void setForn(Fornecedor forn) {
        this.forn = forn;
    }

    public float getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(float qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }

    @Override
    public String toString() {
        return getName(); //To change body of generated methods, choose Tools | Templates.
    }

    public int i() {
        return getId_produto();
    }
}
