package leon.designpattern.structpattern.proxyPattern;

import org.junit.Test;

public class TestProxy {
    /**
     * 1.使用者无法直接创建被代理对象，但可以创建代理对象
     *
     * 2.想对被代理对象进行增强
     *   但是被代理类无法修改，可以创建一个代理类来增强它
     *   AOP
     */

    @Test
    public void testProxy(){

        Action proxy = new Proxy(new Proxyed());

        proxy.action();
    }

}
