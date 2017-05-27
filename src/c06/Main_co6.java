package c06;

/**
 * Created by Zack on 2017/5/26.
 */
public class Main_co6 {

    /**
     * 命令模式将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。
     * 命令模式也支持可撤销的操作。
     *
     *
     * 宏命令：在宏命令中，用命令数组存储一大堆命令，当这个宏命令被遥控器执行时，
     * 就一次性执行数组里的每一个命令。
     *
     * 队列请求：将命令放进队列，按需求依次取出，执行相应动作。
     * 日志请求：执行命令时，将历史记录在磁盘。一旦系统死机再将命令对象重新加载，依次调用这些对象来恢复之前的状态。
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
