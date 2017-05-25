package c03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Zack on 2017/5/22.
 */
public class Main_c03 {
    //Java中的IO也用的是装饰着模式
    //缺点：
    //利用装饰着模式，常常造成设计中有大量的小类，数量实在是太多，可能会在使用此API时有困难，记不清
    //一旦使用装饰着模式，不只需要实例化组件，还要把此组件包装进装饰着中

    //2017-05-25补充
    //装饰这模式的意图是动态地给一个对象添加一些额外的职责，这些职责也可以动态的撤销。
    //需要的参与者
//
//    1.Component（被装饰对象的基类）
//    定义一个对象接口，可以给这些对象动态地添加职责。
//
//    2.ConcreteComponent（具体被装饰对象）
//    定义一个对象，可以给这个对象添加一些职责。
//
//    3.Decorator（装饰者抽象类）
//    维持一个指向Component实例的引用，并定义一个与Component接口一致的接口。
//
//    4.ConcreteDecorator（具体装饰者）
//    具体的装饰对象，给内部持有的具体被装饰对象，增加具体的职责。
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Soy(new Mocha(new Mocha(beverage2)));
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());


        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("in.txt")));
            while ((c = in.read()) >= 0) {
//                System.out.println((char) c);
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
