import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora, digite o número da agência com (-):");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo completo. Não esqueça de colocar os centavos:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " sua conta é " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
