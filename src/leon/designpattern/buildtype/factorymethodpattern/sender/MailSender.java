package leon.designpattern.buildtype.factorymethodpattern.sender;

//邮件发送器
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("邮件发送器");
    }

}
