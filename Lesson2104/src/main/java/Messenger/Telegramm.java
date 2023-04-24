package Messenger;

public class Telegramm implements Messenger{

    @Override
    public void sendMessenger() {
        System.out.println("Telegramm send");
    }

    @Override
    public void getMessenger() {
        System.out.println("Telegramm get");
    }
    public void close() {
        System.out.println("Telegram close");
    }
}
