package c02;

/**
 * Created by Zack on 2017/5/21.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
