package c07;

/**
 * Created by Zack on 2017/5/28.
 */
public class Main_c07 {
    /**
     * 适配器模式将一个类的接口，转换成客户期望的另一个接口。
     * 适配器让原本接口不兼容的类可以合作无间。
     *
     * 外观模式提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
     */

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


        System.out.println("-----Turkey-----");
        turkey.gobble();
        turkey.fly();


        System.out.println("-----MallardDuck-----");
        testDuck(mallardDuck);

        System.out.println("-----turkeyAdapter-----");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
