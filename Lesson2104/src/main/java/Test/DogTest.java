package Test;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        CatDog catDog = new CatDog();

        dog.voice();
        catDog.voice();
        dog.eat();


        catDog.craiseVoice();



    }
}
