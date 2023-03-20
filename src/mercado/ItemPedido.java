/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

/**
 *
 * @author HP CQ58
 */
public class ItemPedido {
    
      private Produtos produto;
    private int quant;

    public ItemPedido(Produtos produto, int quantidade) {
        this.produto = produto;
        this.quant = quantidade;
    }

    public Produtos getProduto() {
        return produto;
    }

    public int getQuant() {
        return quant;
    }

    public double getValorTotal() {
        return produto.getPreco() * quant;
    }
}
    
    
    
    
