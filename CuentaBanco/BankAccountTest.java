public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount falabella = new BankAccount();
        falabella.depositaDinero(200, "cuenta de ahorro");
        falabella.verSaldo("cuenta de ahorro");
        falabella.depositaDinero(300, "cuenta de ahorro");
        falabella.verSaldo("cuenta de ahorro");

        falabella.depositaDinero(500, "cuenta corriente");
        falabella.verSaldo("cuenta corriente");
        falabella.depositaDinero(600, "cuenta corriente");
        falabella.verSaldo("cuenta corriente");
    }
}
