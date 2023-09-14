public class Main {
    public static void main(String[] args) {

        int acc_bal = 100; // initial account balance
        int charge_acc_bal = 300; // charge account balance first subscriber #1
        int charge_acc_bal_cl2 = 1100; // charge account balance first subscriber #2
        boolean cshbk_crd = charge_acc_bal == 1000; // comparison of account charging subscriber #1
        int cashback1 = ((charge_acc_bal/1000)*10); // rules of cashback
        System.out.println( " вы пополнили счет " + charge_acc_bal );
        System.out.println( " кэшбэк составил " + cashback1);
        System.out.println(" теперь ваш баланс с учетом кэшбэка равен " +  ((charge_acc_bal + acc_bal) + cashback1));
        System.out.println();
        boolean cshbk_crd2 =  charge_acc_bal_cl2 == 1000; // comparison of account charging subscriber #2
        int cashback2 = ((charge_acc_bal_cl2/100)); // condition must be added. If cshbk_crd2 = true do {...}
        System.out.println( " вы пополнили счет " + charge_acc_bal_cl2 );
        System.out.println( " кэшбэк составил " + cashback2);
        System.out.println(" теперь ваш баланс с учетом кэшбэка равен " + (charge_acc_bal_cl2 + acc_bal+cashback2));
    }
}