package leon.designpattern.structpattern.proxyPattern;

public class Proxy implements Action{

    private Action proxyed;

    public Proxy(Action proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public void action() {
        System.out.println("------代理类动作开始------");
        proxyed.action();
        System.out.println("------代理类动作结束------");
    }
}

