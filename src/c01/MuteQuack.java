package c01;

/**
 * Created by Zack on 2017/5/20.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
