/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_java_atividade1;

/**
 *
 * @author CEDUP04
 */
public class Aula_JAVA_Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente roberto = new Cliente("roberto", "12345678912", "47 9999999");

        Produto produtoMiojo = new Produto("Miojo", 5, 12, 10);

        Produto produtoCarne = new Produto("Carne", 70, 12, 10);
        Produto[] produtos = new Produto[0];
        Produto[] compras = new Produto[2];
        compras[0] = produtoMiojo;
        compras[1] = produtoCarne;
        Pedido primeiro = new Pedido(1, roberto, compras);

        primeiro.adicionarProduto(produtoMiojo);
        primeiro.adicionarProduto(produtoCarne);
        System.out.println("este é o array novo");
        System.out.println("Este é o tamanho do array " + primeiro.getProdutos().length);
        System.out.println("Valor total é igual " + primeiro.pegarValorTotal());
    }

}
