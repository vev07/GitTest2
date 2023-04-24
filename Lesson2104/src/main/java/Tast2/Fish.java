package Tast2;

public class Fish extends Animal{
    private boolean eatable;

    public boolean isEatable() {
        return eatable;
    }

    @Override
    void breath() {
        System.out.println("gills");
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }
}
