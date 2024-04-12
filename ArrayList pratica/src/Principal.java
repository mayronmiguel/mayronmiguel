import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Mayron");
        pessoa1.setIdade(28);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Giovana");
        pessoa2.setIdade(26);

        Pessoa  pessoa3 = new Pessoa();
        pessoa3.setNome("Maria Aparecida");
        pessoa3.setIdade(57);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da Lista: "+ listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: "+ listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas.toString());





    }
}