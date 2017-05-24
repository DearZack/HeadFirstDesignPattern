package c04;

/**
 * Created by Zack on 2017/5/23.
 */
public class Main_c04 {
    public static void main(String[] args) {
        //工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。
        //工厂方法让类把实例化推迟到子类。

        //抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
        PizzaStore store = new ChicagoStylePizzaStore();
        store.orderPizza("cheese");
        store.orderPizza("veggie");

    }
}
