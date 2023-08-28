package module_3.lesson_13.intheritance;

public class CatFamily {
    protected int legs;
    protected int eyes;
    protected boolean canEatPersone;
    protected String eatSound = "Хрум хрум... глоть глоть...";

    public void eat() {
        System.out.println(eatSound);
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return this.eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public boolean isCanEatPersone() {
        return this.canEatPersone;
    }

    public boolean getCanEatPersone() {
        return this.canEatPersone;
    }

    public void setCanEatPersone(boolean canEatPersone) {
        this.canEatPersone = canEatPersone;
    }

    public CatFamily(int legs, int eyes, boolean canEatPersone) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPersone = canEatPersone;
    }
}
