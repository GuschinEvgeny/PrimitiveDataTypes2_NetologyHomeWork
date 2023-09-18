public class Main {
    public static void main(String[] args) {

        int accBal = 100; // initial account balance
        int chargeAccBal = 1100; // charge account balance  subscriber
        boolean a = ((chargeAccBal > 1000)); // comparison of account charging subscriber
        if (a) {
            int cashbk1 = ((chargeAccBal / 100)); // rules of cashback
            System.out.println(" вы пополнили счет " + chargeAccBal);
            System.out.println(" кэшбэк составил " + cashbk1);
            System.out.println(" теперь ваш баланс с учетом кэшбэка равен " + ((chargeAccBal + accBal) + cashbk1));
            System.out.println();
        } else {
            System.out.println(" вы пополнили счет " + chargeAccBal);
            System.out.println(" кэшбэк не начисляется ");
            System.out.println(" теперь ваш баланс  равен " + ((chargeAccBal + accBal)));
            System.out.println();
        }
    }
}