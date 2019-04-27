package leon.designpattern.buildtype.factorymethodpattern;

import leon.designpattern.buildtype.factorymethodpattern.factory.Provider;
import leon.designpattern.buildtype.factorymethodpattern.factory.SendMailFactory;
import leon.designpattern.buildtype.factorymethodpattern.sender.Sender;
import org.junit.Test;

public class TestFactoryMethod {

    @Test
    public void test(){

        //邮件发送器工厂
        //工厂接收均可使用Provider引用
        Provider provider = new SendMailFactory();

        //邮件工厂提供对象
        //发送器接收均可使用Sender引用
        Sender sender = provider.produce();

        sender.send();

    }
}
