package leon.designpattern.buildtype.simplefactorypattern.multimethod;

//邮件发送器
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("邮件发送器");
    }

}
