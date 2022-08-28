import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> listMessages;

    public MessagingService() {
        this.listMessages = new ArrayList<>();
    }

    public void add(Message msg) {
        
        if (msg.getContent().length() <= 280) {
            this.listMessages.add(msg);
        }
    }

    public ArrayList<Message> getMessages() {
        
        return this.listMessages;
    }
}
