package c10;

/**
 * Created by Zack on 2017/5/30.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
