package c03;

/**
 * Created by Zack on 2017/5/22.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public int getSize() {
        return TALL;
    }
}
