import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner texto = new Scanner(System.in);

        int numero;

        String agencia, nomeCliente;

        double saldo;

        System.out.println("Informe o número da Conta:");
        numero = texto.nextInt();

        System.out.println("Informe o número da Agência:");
        agencia = texto.next();

        System.out.println("Informe seu Nome:");
        nomeCliente = texto.next();

        System.out.println("Informe seu saldo:");
        saldo = texto.nextDouble();

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta "
          +"em nosso banco, sua agência é " + agencia + " conta "+numero +
         " e seu saldo "+saldo+ " já está disponível para saque!");

        texto.close();

    }
}
