import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String welcome = "Bem vindo!";
        System.out.println(welcome);

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.printf("Por favor,  %s. Digite o número da agência: \n", nome);
        String agencia = input.nextLine();
        System.out.println("Digite seu numero da conta: ");
        int conta = input.nextInt();
        System.out.println("Digite seu saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Obrigado pelas informações. Abaixo estará tudo oque precisa saber.");
        System.out.println("==================================================================");
        System.out.printf("Olá %s. Obrigado por criar uma conta bancária conosco.\n", nome);
        System.out.printf("Sua agência é %s; O número de sua conta é: %s.\n", agencia, conta);
        System.out.printf("Seu saldo é de %s reais. E está disponível para saque! \n", saldo);

        System.out.println("Obrigado por usar nossos serviços.");
    }
}