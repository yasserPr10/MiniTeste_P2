/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercado;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP CQ58
 */
public class Mercado {
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           ArrayList<Produtos> produtos = new ArrayList<Produtos>();
        produtos.add(new Produtos("Arroz", 112, 150));
        produtos.add(new Produtos("Ananas", 50, 100));
        produtos.add(new Produtos("Banana", 10, 20));
        produtos.add(new Produtos("Bacias", 13, 55));
        produtos.add(new Produtos("Lonas", 50, 100));
        produtos.add(new Produtos("Credito", 50, 100));
        produtos.add(new Produtos("Bolacha", 30, 1000));
        produtos.add(new Produtos("Laranja", 25, 1000));
  

        Scanner x = new Scanner(System.in);
        Pedido pedido = new Pedido();     
            
        
        System.out.println("Bem vindo SuperMercado");
        while(1==1){    
        
            System.out.println("Oque deseja");
            
            System.out.println("-----[1]Ver produtos---------");
            System.out.println("-----[2]Vender---------------");
            int opcao=x.nextInt();
            
            
            switch(opcao){
                case 1:
                      System.out.println("----Produtos disponíveis:---");
        for (Produtos produto : produtos) {
            System.out.println(produto.getNome() + " / " +"Preco " 
                    + produto.getPreco()
            + " / " + produto.getQuant() + " unidades em estoque");
        }
             
        break;
        
                case 2:
                    
                     boolean continuarPedido = true;
        while (continuarPedido) {
            System.out.print("Digite o nome do produto que deseja comprar: ");
            String nomeProduto = x.nextLine();

            Produtos produtoEscolhido = null;
            for (Produtos produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                    produtoEscolhido = produto;
                    break;
                }
            }

            if (produtoEscolhido == null) {
                System.out.println("Produto não encontrado.");
            } else {
                System.out.println("Digite a quantidade que deseja");
                int quant=x.nextInt();
                
                 for (Produtos produto : produtos) {
                if(produto.getQuant()<=quant){
                    
                    System.out.println("Nao temos essa quantidade");
                
                }
                    else{
                        System.out.println("Digite a forma de pagamento");
                        String pag=x.nextLine();
                        
                        switch(pag){
                            case "cartao":
                                System.out.println("Pago com cartao");
                               break;
                                
                            case "Dinheiro":
                                System.out.println("Pago com dinheiro");
                         break;
                            case "cheque":
                                System.out.println("Pago com cheque");
                              break;
                        }
                       
                       
                       if(pag.equalsIgnoreCase("dinheiro")||pag.equalsIgnoreCase("Cartao")||pag.equalsIgnoreCase("Cheque")){
                           System.out.println(" Produto comprado: " + nomeProduto + " Quantidade: "  + quant + " Forma de pagamento: "+pag);
                           
                           
                           
                        //JOptionPane.showMessageDialog(null, " Produto comprado "+nomeProduto+ " Quantidade " +quant+ " Forma de pagamento "+pag);
                           produto.setQuant(produto.getQuant()-quant);
                           break;
                           
                       }
                           else{
                              System.out.println("Forma de pagamento invalida");   
                              
                            
                                   }
                           
                       
                    }
                
                    
                }
                 }
       
        }
            
            
            
         
        }
        
        
    }
    
        }
    }
