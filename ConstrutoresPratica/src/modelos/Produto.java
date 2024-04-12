package modelos;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return " (modelos.Produto: " + this.nome + " | Preço: " + this.preco + " | Quantidade: " + this.quantidade + ")";
    }
}

