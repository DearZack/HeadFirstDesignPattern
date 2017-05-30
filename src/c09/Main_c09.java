package c09;

import java.util.*;

/**
 * Created by Zack on 2017/5/30.
 */
public class Main_c09 {
    /**
     * java.util.Iterator
     * aggregate：聚合
     * 迭代器模式提供一个方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。
     * 迭代器模式让我们能游走于聚合内的每一个元素，而又不暴露其内部的表示。
     * 把游走的任务放在迭代器上，而不是聚合上。这样简化了聚合的接口和实现，也让责任各得其所。
     *
     * 单一职责：一个类应该只有一个引起变化的原因。
     * 内聚：用来度量一个类或模块紧密地达到单一目的或责任。
     *
     * 组合模式允许你将对象组合成树结构来表现”整体/部分”层次结构。
     * 组合能让客户以一致的方式处理个别对象以及对象组合。
     */

    public static void main(String[] args) {
        /**
         * 在java中, 在对一些集合迭代的过程中对集合进行一些修改的操作,
         * 比如说add,remove之类的操作, 搞不好就会抛ConcurrentModificationException
         */
//        ArrayList<String> strings = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            strings.add("string:" + i);
//        }
//        Iterator<String> iterator = strings.iterator();
//        strings.add("new String");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        MenuComponent menuComponent1 = new Menu("name1", "description1");
        MenuComponent menuComponent2 = new Menu("name2", "description2");
        MenuComponent menuComponent3 = new Menu("name3", "description3");
        MenuComponent menuComponent4 = new Menu("name4", "description4");
        MenuComponent all = new Menu("all", "all");
        all.add(menuComponent1);
        all.add(menuComponent2);
        all.add(menuComponent3);
        all.add(menuComponent4);

        menuComponent1.add(new MenuItem("name1", "des1", false, 11.1));
        menuComponent1.add(menuComponent2);

        Waitress waitress = new Waitress(all);
        waitress.printMenu();
    }
}
