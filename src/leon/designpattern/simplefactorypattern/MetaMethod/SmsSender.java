package leon.designpattern.simplefactorypattern.MetaMethod;

//短息发送器
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("短信发送器");
    }

}
