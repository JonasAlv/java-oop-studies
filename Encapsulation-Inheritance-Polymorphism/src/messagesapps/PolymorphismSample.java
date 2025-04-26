package messagesapps;

import messagesapps.services.Message;

public class PolymorphismSample {

    public static void main(String[] args) {

        Message anyApp = null;

        String anyAppName = "FB";
        if (anyAppName.equals("MSN")) {
            anyApp = new MSNMessenger();
        }
        if (anyAppName.equals("FB")) {
            anyApp = new FacebookMessenger();
        }

        anyApp.sendMessage();
    }
}
