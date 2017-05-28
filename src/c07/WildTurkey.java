package c07;

/**
 * Created by Zack on 2017/5/28.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println(this.getClass().getSimpleName() + "--gobble");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + "--fly");
    }
}
