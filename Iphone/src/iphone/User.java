package iphone;

public class User {

    public static void main(String[] args) {

        Iphone iphoneX = new Iphone();
        iphoneX.playGame("Angry Birds");
        System.out.println("_".repeat(20));

        iphoneX.installApp("Instagram");
        System.out.println("_".repeat(20));

        iphoneX.playSong("Roar - katty perry");
        System.out.println("_".repeat(20));

        iphoneX.callNumber("123456789");
        System.out.println("_".repeat(20));

        iphoneX.openURL("https://www.google.com");
    }
}
