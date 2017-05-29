package c08;

/**
 * Created by Zack on 2017/5/29.
 */
public class Coffee {

    void prepereRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("boilWater");
    }

    public void brewCoffeeGrinds() {
        System.out.println("brewCoffeeGrinds");
    }

    public void pourInCup() {
        System.out.println("pourInCup");
    }

    public void addSugarAndMilk() {
        System.out.println("addSugarAndMilk");
    }
}
