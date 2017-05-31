package c11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Zack on 2017/5/31.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    /**
     * 假设proxy.setHotOrNotRating(9)，见P480
     * @param proxy  上面的proxy
     * @param method 上面的setHotOrNotRating
     * @param args 上面的9
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(person, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException("本人不能访问自己的setHotOrNotRating方法");
        } else if (method.getName().startsWith("set")) {
            return method.invoke(person, args);
        }
        return null;
    }
}
