package modelos;

import modelos.Carro;

public class ModeloCarro extends Carro {
    int ano1;
    int ano2;
    int ano3;

    public void setAnos(int ano1, int ano2, int ano3) {
        this.ano1 = ano1;
        this.ano2 = ano2;
        this.ano3 = ano3;
    }

    public int getAnoMenorPreco() {
        double menorPreco = calcularMenorPreco();
        if (menorPreco == precoAno1) {
            return ano1;
        } else if (menorPreco == precoAno2) {
            return ano2;
        } else {
            return ano3;
        }
    }

    public int getAnoMaiorPreco() {
        double maiorPreco = calcularMaiorPreco();
        if (maiorPreco == precoAno1) {
            return ano1;
        } else if (maiorPreco == precoAno2) {
            return ano2;
        } else {
            return ano3;
        }
    }

    @Override
    public void exibeInformacaoCarro() {
        super.exibeInformacaoCarro();
        System.out.println("O o modelo do menor preço é o do ano " + getAnoMenorPreco() + " do preço R$" + calcularMenorPreco());
        System.out.println("O o modelo do maior preço é o do ano " + getAnoMaiorPreco() + " do preço R$" + calcularMaiorPreco());
    }
}