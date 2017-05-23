package c04;

/**
 * Created by Zack on 2017/5/23.
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println(this.getClass().getSimpleName() + "----prepare");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println(this.getClass().getSimpleName() + "----bake");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println(this.getClass().getSimpleName() + "----cut");
    }

    @Override
    public void box() {
        super.box();
        System.out.println(this.getClass().getSimpleName() + "----box");
    }
}
