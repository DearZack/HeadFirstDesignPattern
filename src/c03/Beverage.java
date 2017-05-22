package c03;

/**
 * Created by Zack on 2017/5/22.
 */
public abstract class Beverage {

    public static final int TALL = 1;
    public static final int GRANDE = 2;
    public static final int VENTI = 3;

    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public abstract int getSize();
}
