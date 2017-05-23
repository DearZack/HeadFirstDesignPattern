package c04;

/**
 * Created by Zack on 2017/5/23.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        }
        return null;
    }
}
