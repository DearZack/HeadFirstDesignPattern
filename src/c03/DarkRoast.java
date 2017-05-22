package c03;

/**
 * Created by Zack on 2017/5/22.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.1;
    }

    @Override
    public int getSize() {
        return TALL;
    }
}
