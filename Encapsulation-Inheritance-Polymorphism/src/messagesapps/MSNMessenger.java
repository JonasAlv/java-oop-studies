package messagesapps;

import messagesapps.services.Message;

public class MSNMessenger extends Message {

    @Override
    public void sendMessage() {
        System.out.println("Sending MSN message to the server");
    }
}
