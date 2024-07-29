public class Conta {
    int conta;
    String agencia;
    String nome;
    double saldo;

    public void mostraDados() {
        System.out.println("Olá " + nome + ", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta +
                " e seu saldo R$" + saldo + " " +
                "já está disponível para saque.");
    }

}
