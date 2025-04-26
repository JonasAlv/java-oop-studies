package messagesapps;

public class UserComputer {

    public static void main(String[] args) {

        var msnInstance = new MSNMessenger();
        msnInstance.sendMessage("Hello World, MSN");

        var fbInstance = new FacebookMessenger();
        fbInstance.sendMessage("Hello World, FB");
    }
}
