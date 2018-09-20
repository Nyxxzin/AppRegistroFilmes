package br.com.opet.tds.appregistro;

/**
 * Created by Diego on 19/09/2018.
 */

public class Produto {
    private String nome;
    private String categoria;
    private Double quantidade;
    private Double valor;

    public Produto(){}

    public Produto(String nome, String categoria, Double quantidade, Double valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valor = valor;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
