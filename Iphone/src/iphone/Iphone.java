package iphone;

import iphone.services.Browser;
import iphone.services.CellPhone;
import iphone.services.MusicPlayer;

public class Iphone implements Browser, CellPhone, MusicPlayer {

    public void installApp(String app) {
        System.out.println("Installing " + app);
        validateApp();
        System.out.println("App installed");
    }

    private void validateApp() {
        System.out.println("Validating app");
    }

    public void playGame(String game) {
        System.out.println("Playing " + game);
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening URL: " + url);
    }

    @Override
    public void callNumber(String number) {
        System.out.println("Calling number: " + number);
    }

    @Override
    public void playSong(String fileName) {
        System.out.println("Playing file: " + fileName);
    }
}
