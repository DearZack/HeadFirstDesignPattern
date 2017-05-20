package c01;

/**
 * Created by Zack on 2017/5/20.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
