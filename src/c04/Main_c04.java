package c04;

/**
 * Created by Zack on 2017/5/23.
 */
public class Main_c04 {
    public static void main(String[] args) {
        PizzaStore store = new ChicagoStylePizzaStore();
        store.orderPizza("cheese");
        store.orderPizza("veggie");

    }
}
