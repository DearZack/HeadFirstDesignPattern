package c03;

/**
 * Created by Zack on 2017/5/22.
 */
public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 0.5;
    }

    @Override
    public int getSize() {
        return GRANDE;
    }
}
