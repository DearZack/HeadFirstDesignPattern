package c07;


/**
 * Created by Zack on 2017/5/28.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName() + "--quack");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + "--fly");
    }
}
