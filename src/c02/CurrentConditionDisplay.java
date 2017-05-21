package c02;

/**
 * Created by Zack on 2017/5/21.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDate;

    public CurrentConditionDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        this.weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay---temp:" + temperature + "---humidity" + humidity);
    }
}
