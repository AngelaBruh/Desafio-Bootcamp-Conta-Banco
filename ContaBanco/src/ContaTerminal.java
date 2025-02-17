//import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Bem-vindo ao Banco DIO !!!");
    System.out.println("Informe seu nome:");
    String nomeCliente = leitor.nextLine();

    System.out.println("Informe o número da conta:");
    int numero = leitor.nextInt();

    System.out.println("Informe a agência da conta:");
    String agencia = leitor.nextLine();

    System.out.println("Qual o valor que deseja depositar?");
    double saldo = leitor.nextDouble();

    System.out.println("===========================================");

    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
    " ,conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");






  }
}
