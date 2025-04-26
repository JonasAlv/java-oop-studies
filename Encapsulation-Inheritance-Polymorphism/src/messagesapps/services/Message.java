package messagesapps.services;

public abstract class Message {

    public  void sendMessage(String message) {
        checkInternet();
        System.out.println(message);
        saveMessage();
    }

    public void receiveMessage() {
        checkInternet();
        System.out.println("Message received");
    }

    private  void saveMessage() {
        System.out.println("Saving Message");
    }

    protected   void checkInternet() {
        System.out.println("Checking Internet Connection");
    }

    public  void deleteMessage() {
        System.out.println("Delete message");
    }

    public abstract void sendMessage();
}
