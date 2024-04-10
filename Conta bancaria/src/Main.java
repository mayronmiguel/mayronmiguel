import java.util.Scanner;

/* *************************************
** Desafio controlar conta bancária **

Proposta:
*Dados iniciais do cliente*
Nome= ""
Tipo de conta= Corrente
Saldo inicial = R$ 2500,00
***************************************
Em sequência criar operações

1 - Consulta saldo
2 - Receber valor
3 - Transferir valor
4 - Sair
*****************************************/


/* Inicialização dos dados do cliente */
public class Main {

    public static void main(String[] args) {
        String nome = "Mayron Freitas";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("**********************************");
        System.out.println("\nNome do cliente: "+ nome);
        System.out.println("Tipo conta: "+ tipoConta);
        System.out.println("Saldo atual: "+ saldo);
        System.out.println("\n**********************************");

/* Menu opções  */

        int opcao = 0;

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair 
                               
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            /* Visualisação de saldo */

            if (opcao == 1) {
                System.out.println("O saldo atual é " + saldo);

            /* Enviar valor */

            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }

                /* Receber valor */

            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida");

            }
        }


    }
}