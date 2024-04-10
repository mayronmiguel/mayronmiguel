package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void exibeFime(){

        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(somaDasAvaliacoes);
        System.out.println(duracaoEmMinutos);
        System.out.println(incluidoNoPlano);
        System.out.println(totalDeAvaliacao);

    }

    public void avalia( double nota){

        somaDasAvaliacoes+= nota;
        totalDeAvaliacao ++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }

}
