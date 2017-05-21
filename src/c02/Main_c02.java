package c02;

/**
 * Created by Zack on 2017/5/20.
 */
public class Main_c02 {
    /**
     * 观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新
     */

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(111f, 222, 0);

        //利用Java内置的java.util.Observable和java.util.Observer来实现
        //非特殊情况下尽量用这个实现，并发情况下默认已经实现了同步，是线程安全的。

        //缺点
        //Observable是一个类，Java不支持多继承，如果该类有想继承别的类就是比较尴尬
        WeatherData2 weatherData2 = new WeatherData2();
        CurrentConditionDisplay2 currentConditionDisplay2 = new CurrentConditionDisplay2(weatherData2);
        weatherData2.setMeasurements(1, 2, 3);
    }
}
