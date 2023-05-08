package Messenger;

public class Viber implements Messenger{
    @Override
    public void sendMessenger() {
        System.out.println("Viber send");
    }

    @Override
    public void getMessenger() {
        System.out.println("Viber get");
        
    }
}
