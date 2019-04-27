package leon.designpattern.buildtype.factorymethodpattern.sender;



//短息发送器
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("短信发送器");
    }

}
