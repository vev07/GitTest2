package Test;

public class CatDog extends Dog{
    @Override
    public void voice() {
        System.out.println("CatDog is void");
    }
    public void craiseVoice() {
        super.voice();
    }
}
