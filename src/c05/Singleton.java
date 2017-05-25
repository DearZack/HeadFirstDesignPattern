package c05;

/**
 * Created by Zack on 2017/5/25.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    /**
     * 第一种单例模式，在多线程下还是无法保存单利的
     * @return
     */
    public static Singleton getSingleton1() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * 懒汉模式
     * 第二种单例模式，把getSingleton2变成同步方法，就不会有两个线程同时访问了。
     * 同步会降低性能，但是如果这个方便不是频繁得被使用，也可以接受
     * @return
     */
    public static synchronized Singleton getSingleton2() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * 饿汉单例模式
     * 第三种单例模式，在静态初始化器种实例化，避免了线程安全的问题。
     * 缺点是一开始就实例化了这个对象，当这是一个比较重量级的对象时，该方法不太适合
     */
    private static Singleton singleton3 = new Singleton();//此行针对方法getSingleton3
    public static Singleton getSingleton3() {
        return singleton3;
    }

    /**
     * Double CheckLock单例模式
     * 第四种单例模式，利用双重检查加锁，首先检查是否被实例化了，如果没有，才进行同步。
     * 这样只有第一次会同步。
     */
    private volatile static Singleton singleton4;
    public static Singleton getSingleton4() {
        if (singleton4 == null) {
            synchronized (Singleton.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton();
                }
            }
        }
        return singleton4;
    }

    /**
     * 静态内部类单例模式，第一次加载Singleton类时并不会初始化SingletonHolder,
     * 在调用getSingleton5()后才会被加载。
     * 这种单例模式可以保证线程安全，对象唯一，同时也延迟了单例的实例化，比较推荐这种实现方式。
     * 一下是内部类加载时机的分析文章
     * http://blog.csdn.net/brouth/article/details/51656603
     * @return
     */
    public static Singleton getSingleton5() {
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }
}
