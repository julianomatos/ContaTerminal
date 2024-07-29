import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        conta.nome = scanner.nextLine();

        System.out.print("Digite sua agência: ");
        conta.agencia = scanner.nextLine();

        System.out.print("Digite sua conta: ");
        conta.conta = scanner.nextInt();

        System.out.print("Digite seu saldo: ");
        conta.saldo = scanner.nextDouble();

        conta.mostraDados();

    }
}