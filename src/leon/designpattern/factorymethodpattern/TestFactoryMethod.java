package leon.designpattern.factorymethodpattern;

import leon.designpattern.factorymethodpattern.factory.Provider;
import leon.designpattern.factorymethodpattern.factory.SendMailFactory;
import leon.designpattern.factorymethodpattern.sender.Sender;
import org.junit.Test;

public class TestFactoryMethod {

    @Test
    public void test(){

        //邮件发送器工厂
        Provider provider = new SendMailFactory();

        //邮件工厂提供对象
        Sender sender = provider.produce();

        sender.Send();

    }
}
