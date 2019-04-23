package leon.designpattern.factorymethodpattern.factory;

import leon.designpattern.factorymethodpattern.sender.Sender;
import leon.designpattern.factorymethodpattern.sender.SmsSender;

public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
