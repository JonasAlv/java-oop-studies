package messagesapps;

import messagesapps.services.Message;

public class FacebookMessenger extends Message {

    @Override
    public void sendMessage() {
        System.out.println("Facebook Message");
    }
}
