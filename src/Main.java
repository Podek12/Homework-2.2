//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int bonusAccount = 100;
        int accountRefill = 1250;
        int bonus;

        if (accountRefill >= 1000){
            bonus = accountRefill / bonusAccount;
        } else {
            bonus = 0;
        }

        int totalAccount = customerAccount + accountRefill + bonus;

        System.out.println("Вы пополнили счёт на: " + accountRefill + " руб.");
        System.out.println("Ваш бонусный счёт составил: " + bonus + " руб.");
        System.out.println("Ваш баланс составил: " + totalAccount + " руб.");
    }
}