package c11;

import java.rmi.Remote;

/**
 * Created by Zack on 2017/5/31.
 */
public interface MyRemote extends Remote{
    String sayHello() throws RuntimeException;
}
