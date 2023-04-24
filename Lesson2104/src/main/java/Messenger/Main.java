package Messenger;

public class Main {
    public static void main(String[] args) {
        Messenger[] mes = new Messenger[6];
        Telegramm telegramm = new Telegramm();
        mes[0] = telegramm;
        mes[1] = new Viber();
        mes[2] = new WhatsApp();
        mes[3] = new Telegramm();
        mes[4] = new Viber();
        mes[5] = new WhatsApp();

        for (int i = 0; i < mes.length; i++) {
            mes[i].sendMessenger();
            mes[i].getMessenger();
        }
    }
}
