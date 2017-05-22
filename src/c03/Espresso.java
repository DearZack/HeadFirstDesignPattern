package c03;

/**
 * Created by Zack on 2017/5/22.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public int getSize() {
        return VENTI;
    }
}
