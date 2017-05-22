package c03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Zack on 2017/5/22.
 */
public class Main_c03 {
    //Java中的IO也用的是装饰着模式
    //缺点：
    //利用装饰着模式，常常造成设计中有大量的小类，数量实在是太多，可能会在使用此API时有困难，记不清
    //一旦使用装饰着模式，不只需要实例化组件，还要把此组件包装进装饰着中
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
            while ((c = in.read()) >=0) {
//                System.out.println((char) c);
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
