package c11;

import java.lang.reflect.Proxy;

/**
 * Created by Zack on 2017/5/31.
 */
public class Tester {

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.drive();
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("joe");
        joe.setGender("man");
        joe.setHotOrNotRating(1);
        joe.setInterests("football");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("name is" + ownerProxy.getName());
        ownerProxy.setInterests("Go");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        try {
            nonOwnerProxy.setHotOrNotRating(10);
            System.out.println(nonOwnerProxy.getHotOrNotRating());
            nonOwnerProxy.setInterests("bowling");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
