package c03;

/**
 * Created by Zack on 2017/5/22.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == TALL) {
            cost += 0.1;
        } else if (getSize() == GRANDE) {
            cost += 0.15;
        } else if (getSize() == VENTI) {
            cost += 0.20;
        }
        return cost;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
