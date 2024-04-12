package modelos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("produto1",5.00, 2);
        Produto produto2 = new Produto("produto2",10.00,5);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos.toString());

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Produto Perecível 1", 10.00, 6, "12/04/2024");
        System.out.println(produtoPerecivel1);


    }
}