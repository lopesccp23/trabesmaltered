package main.java.com.sgc.modelos;

public class Esmalte {

    // Atributos
    private String nome;
    private String marca;
    private int anoLancamento;
    private double preco;

    // Construtor vazio
    public Esmalte() {
    }

    // Construtor com parâmetros
    public Esmalte(String nome, String marca, int anoLancamento, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
    }

    // Método específico
    public String verificarCategoria() {
        if (anoLancamento < 2020) {
            return "Esmalte considerado tradicional.";
        } else {
            return "Esmalte considerado lançamento recente.";
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // toString
    @Override
    public String toString() {
        return "Esmalte{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", preco=" + preco +
                '}';
    }
}