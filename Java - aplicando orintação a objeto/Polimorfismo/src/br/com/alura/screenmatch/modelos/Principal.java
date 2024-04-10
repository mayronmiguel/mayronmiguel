package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderso Chefão");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(90);
        meuFilme.setIncluidoNoPlano(true);

        /*Consumindo método Exibe br.com.alura.screenmatch.modelos.Filme*/
        meuFilme.exibeFime();



        /*Carga das Avaliações*/
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Soma das Avaliações -> " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total de Avaliações -> " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Média das Avaliações -> " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFime();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpsodios(50);
        System.out.println("Duração para maratonar:" + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avata");
        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(90);
        outroFilme.setIncluidoNoPlano(true);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


    }
}