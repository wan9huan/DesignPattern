package leon.designpattern.buildtype.simplefactorypattern.multimethod;

//短息发送器
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("短信发送器");
    }

}
