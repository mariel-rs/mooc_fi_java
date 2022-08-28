
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message oneMsg = new Message("Mr S", "hello");
        Message twoMsg = new Message("Mr R", "bye");

        MessagingService svc = new MessagingService();

        svc.add(oneMsg);
        svc.add(twoMsg);
        System.out.println(svc.getMessages());

    }
}
