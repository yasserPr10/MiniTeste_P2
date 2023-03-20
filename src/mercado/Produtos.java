/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

/**
 *
 * @author HP CQ58
 */
public class Produtos {
    
    
     private String nome;
    private double preco;
        private int quant;

    public Produtos(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quantidadeEstoque) {
        this.quant = quantidadeEstoque;
    }
    
    
    
    
}
