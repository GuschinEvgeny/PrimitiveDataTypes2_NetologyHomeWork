public class Main {
    public static void main(String[] args) {

        int accBal = 100; // initial account balance
        int chargeAccBal = 300; // charge account balance first subscriber #1
        int chargeAccBalCl2 = 1100; // charge account balance first subscriber #2
        boolean cshbkCrd = chargeAccBal == 1000; // comparison of account charging subscriber #1
        int cashback1 = ((chargeAccBal / 1000) * 10); // rules of cashback
        System.out.println(" вы пополнили счет " + chargeAccBal);
        System.out.println(" кэшбэк составил " + cashback1);
        System.out.println(" теперь ваш баланс с учетом кэшбэка равен " + ((chargeAccBal + accBal) + cashback1));
        System.out.println();
        boolean cshbkCrd2 = chargeAccBalCl2 == 1000; // comparison of account charging subscriber #2
        int cashback2 = ((chargeAccBalCl2 / 100)); // condition must be added. If cshbk_crd2 = true do {...}
        System.out.println(" вы пополнили счет " + chargeAccBalCl2);
        System.out.println(" кэшбэк составил " + cashback2);
        System.out.println(" теперь ваш баланс с учетом кэшбэка равен " + (chargeAccBalCl2 + accBal + cashback2));
    }
}