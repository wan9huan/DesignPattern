package leon.designpattern.structpattern.proxyPattern;

public class Proxyed implements Action{

    @Override
    public void action() {

        System.out.println("我是被代理类的动作！");
    }
}
