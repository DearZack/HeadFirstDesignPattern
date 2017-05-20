package c01;

/**
 * Created by Zack on 2017/5/20.
 */
public class Main_c01 {
    //针对接口编程
    //将鸭子动作的实现具体抽象出来

    //遇到新的需求只需要将增加其具体的实现类即可
    //例如需要一种模型鸭子。只需要将FlyNoWag和Quack赋值即可
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();



        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();

        //动态设定行为
        model.setFlyBehavior(new FlyRocketPowered());
        System.out.println("after change");
        model.performFly();
    }
}
