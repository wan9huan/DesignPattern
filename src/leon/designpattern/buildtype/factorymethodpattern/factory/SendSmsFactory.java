package leon.designpattern.buildtype.factorymethodpattern.factory;

import leon.designpattern.buildtype.factorymethodpattern.sender.Sender;
import leon.designpattern.buildtype.factorymethodpattern.sender.SmsSender;

public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
