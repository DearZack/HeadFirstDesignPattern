package c01;

/**
 * Created by Zack on 2017/5/20.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //使用Quack类处理叫，所以当performQuack被调用的时候，叫的职责被委托给了Quack对象
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'am real Mallard Duck");
    }
}
