package c04;

/**
 * Created by Zack on 2017/5/23.
 */
public abstract class PizzaStore {
//    private SimplePizzaFactory factory;
//
//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
