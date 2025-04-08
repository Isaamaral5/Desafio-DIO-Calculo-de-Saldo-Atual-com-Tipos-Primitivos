import java.util.Scanner;

public class DesafioUmDio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = scanner.nextDouble();

        // Entrada das três transações
        System.out.println("Digite o valor da primeira transação:");
        double transacao1 = scanner.nextDouble();

        System.out.println("Digite o valor da segunda transação:");
        double transacao2 = scanner.nextDouble();

        System.out.println("Digite o valor da terceira transação:");
        double transacao3 = scanner.nextDouble();

        // Cálculo do saldo final
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        // Saldo final
        System.out.printf("Saldo final da conta: %.2f\n", saldoFinal);

        scanner.close();
    }
}