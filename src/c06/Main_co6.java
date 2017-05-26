package c06;

/**
 * Created by Zack on 2017/5/26.
 */
public class Main_co6 {

    /**
     * 命令模式将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。
     * 命令模式也支持可撤销的操作。
     * @param args
     */
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
