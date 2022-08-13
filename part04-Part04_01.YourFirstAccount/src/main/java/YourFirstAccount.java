
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        
        Account marielAccount = new Account("Mariel", 100);

        marielAccount.deposit(20);

        System.out.println("Final state");
        System.out.println(marielAccount);
    }
}
