package c06;

/**
 * Created by Zack on 2017/5/26.
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
