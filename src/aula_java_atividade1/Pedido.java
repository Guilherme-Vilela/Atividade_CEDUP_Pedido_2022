/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_java_atividade1;

import java.util.Arrays;

/**
 *
 * @author CEDUP04
 */
public class Pedido {

    private int codigo;
    private Cliente cliente;
    private Produto[] produtos = new Produto[0];

    Pedido(int codigo, Cliente cliente, Produto[] produtos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public double pegarValorTotal() {
        double valorTotal = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            valorTotal += this.produtos[i].getPreco();
        }
        return valorTotal;
    }

    public void adicionarProduto(Produto novoProduto) {
//      int tamanho_antigo = 0;
//        if((this.produtos != null)){
//            tamanho_antigo = this.produtos.length;
//        }
//        int tamanho_recebido = novo_produto.length;
//        Produto[] produtos_ = new Produto[tamanho_antigo+tamanho_recebido];
//        int i = 0;
//        while(i < tamanho_antigo+tamanho_recebido ){
//         if(i < tamanho_antigo){
//           produtos_[i] =  this.produtos[i];
//         }
//         if(i < tamanho_recebido){
//           produtos_[i] =  novo_produto[i];
//         }
//           i++;
//      }
//         this.produtos = produtos_;;
        this.produtos = Arrays.copyOf(this.produtos, this.produtos.length + 1);
        this.produtos[produtos.length - 1] = novoProduto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Produto[] getProdutos() {
        return this.produtos;
    }

}
