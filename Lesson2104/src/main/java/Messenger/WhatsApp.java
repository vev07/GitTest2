package Messenger;

public class WhatsApp implements Messenger{
    @Override
    public void sendMessenger() {
        System.out.println("WhatsApp send");
    }

    @Override
    public void getMessenger() {
        System.out.println("WhatsApp get");
    }
}
