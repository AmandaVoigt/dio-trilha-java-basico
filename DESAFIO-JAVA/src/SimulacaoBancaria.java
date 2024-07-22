import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    boolean valorCerto = true;
                    while (valorCerto) {
                        double valorDepositado = scanner.nextDouble();
                        if (valorDepositado > 0) {
                            saldo += valorDepositado;
                            System.out.printf("Saldo atual: %.1f\n", saldo);
                            valorCerto = false;
                        } else {
                            System.out.println("Valor não permitido!");
                        }
                    }
                    break;
                case 2:

                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("\nSaldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}