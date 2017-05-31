package c11;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by Zack on 2017/5/31.
 */
public class Main_c11 {
    /**
     *代理模式为另一个对象提供一个替身或占位符以控制这个对象的访问。
     */

    public static void main(String[] args) {
        /**
         * 警告: 为 JRMP 生成和使用骨架及静态存根
         * 已过时。骨架不再必要, 而静态存根
         * 已由动态生成的存根取代。建议用户
         * 不再使用rmic来生成骨架和静态存根。
         * 请参阅 java.rmi.server.UnicastRemoteObject 的文档。
         * error: 找不到类MyRemoteImpl
         */
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
