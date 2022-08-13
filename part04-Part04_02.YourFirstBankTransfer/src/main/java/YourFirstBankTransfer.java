
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java

        Account matthewsAcc = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);

        matthewsAcc.withdrawal(100);
        myAcc.deposit(100);

        System.out.println(matthewsAcc);
        System.out.println(myAcc);
    }
}
