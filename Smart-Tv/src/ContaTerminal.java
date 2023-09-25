import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String Agencia;
        String NomeCliente;
        Float Saldo;


        System.out.print("Por favor, digite o número da Agência !:");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite a Agência!:");
        Agencia = scanner.nextLine();


       System.out.print("Por favor, digite Seu nome!:");
       NomeCliente = scanner.nextLine();
        
       System.out.print("Por favor, digite Seu Saldo!:");
       Saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " conta " + numero + " e seu saldo $" + Saldo + " já está disponível para saque");
    }
}
