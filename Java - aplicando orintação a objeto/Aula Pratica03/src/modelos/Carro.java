package modelos;

/*Crie uma classe modelos.Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para
definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma
subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar
informações.*/


public class Carro {
    private String nomeModelo;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public void exibeInformacaoCarro() {
        System.out.println("Nome do carro: " + nomeModelo);
    }

}

