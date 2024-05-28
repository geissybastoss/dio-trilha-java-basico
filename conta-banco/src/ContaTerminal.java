import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();
        
        
        System.out.println("Olá, " + nome + ". Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de: " + saldo + " já está disponível para saque.");
        
    }
}
