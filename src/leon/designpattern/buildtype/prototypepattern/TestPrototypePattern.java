package leon.designpattern.buildtype.prototypepattern;

import org.junit.Test;

public class TestPrototypePattern {
    @Test
    public void testPrototypePattern(){

        Prototype orgin = new ConcretePrototype("orgin instance");


        //直接从原对象进行克隆新对象
        Prototype newInstance = (Prototype) orgin.clone();

        System.out.println(orgin.equals(newInstance));

        System.out.println(orgin == newInstance);
    }
}
