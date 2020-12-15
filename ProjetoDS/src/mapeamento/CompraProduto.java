/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento;

/**
 *
 * @author Sara
 */
public class CompraProduto {
    private int id_prod_comp;
    private Compra compra;
    private Produto prod;
    private int qnt;
    private float valorCompraProd;

    public int getId_prod_comp() {
        return id_prod_comp;
    }

    public void setId_prod_comp(int id_prod_comp) {
        this.id_prod_comp = id_prod_comp;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
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

    public float getValorCompraProd() {
        return valorCompraProd;
    }

    public void setValorCompraProd(float valorCompraProd) {
        this.valorCompraProd = valorCompraProd;
    }
    
    
}
