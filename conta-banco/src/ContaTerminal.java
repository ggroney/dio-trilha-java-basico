import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner.
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Bem vindo ao BancoTerminal! ");
        //Obeter pela classe Scanner os valores digitados no terminal 
        System.out.println("Digite a sua Agencia: ");
        String agencia = sc.next();
        System.out.println("Digite o numero da sua conta:");
        int conta = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Digite o seu nome completo:");
        String nome = sc.nextLine();
        System.out.println("Informe seu saldo inicial:");
        double saldo = sc.nextDouble();
        //Exibir a mensagem da conta criada
        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ " sua conta é " +conta+ " e seu saldo é R$ " +saldo+ " já está disponível para saque.");
    }
}
