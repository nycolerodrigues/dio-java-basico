import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        System.out.println("Bem vindo ao Banco do terminal!");
        System.out.print("Digite o número da conta: ");
        numero=sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número da agencia: ");
        agencia=sc.nextLine();
        System.out.print("Digite o nome do titular da conta: ");
        nomeCliente=sc.nextLine();
        System.out.print("Digite o saldo da conta: ");
        saldo=sc.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.1f já está disponivel para saque.",nomeCliente,agencia,numero,saldo);
        sc.close();
    }
}