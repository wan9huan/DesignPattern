package leon.designpattern.buildtype.factorymethodpattern.factory;


import leon.designpattern.buildtype.factorymethodpattern.sender.MailSender;
import leon.designpattern.buildtype.factorymethodpattern.sender.Sender;

//具体某种对象的工厂 实现Provider接口
public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}
