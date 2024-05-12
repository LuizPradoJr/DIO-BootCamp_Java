import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, digite o número da sua Conta !");
            int conta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite os dados da Agência !");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o seu Nome Completo!");
            String nomeCompleto = scanner.nextLine();

            System.out.println("Por favor, digite o seu Saldo!");
            String saldoInput = scanner.nextLine();
            saldoInput = saldoInput.replace(",", ".");
            double saldo = Double.parseDouble(saldoInput);

            System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        } finally {
            scanner.close();
        }
    }
}
