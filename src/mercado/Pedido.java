/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

import java.util.ArrayList;

/**
 *
 * @author HP CQ58
 */
public class Pedido {
    
        private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
    private String formaPagamento;
    private double valorPago;

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        for (ItemPedido item : itens) {
            valorTotal += item.getValorTotal();
        }
        return valorTotal;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorPago() {
        return valorPago;
    }

    public double getTroco() {
        return valorPago - getValorTotal();
    }

    
    
    
    
}
