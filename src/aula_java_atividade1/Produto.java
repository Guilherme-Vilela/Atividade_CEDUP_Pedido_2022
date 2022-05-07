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
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int codigo;

    Produto(String nome, double preco, int quantidadeEstoque, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.codigo = codigo;

    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque = quantidade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

}
