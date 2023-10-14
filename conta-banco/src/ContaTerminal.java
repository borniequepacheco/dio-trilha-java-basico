import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws IOException {

        // Conhecer e importar a classe Scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da sua conta!");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da sua Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o seu primeiro nome");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o seu ultimo nome");
            String sobreNomeCliente = scanner.next();

            System.out.println("Por favor, digite o seu saldo");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + " " + sobreNomeCliente
                    + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        } finally {

        }
    }
}
