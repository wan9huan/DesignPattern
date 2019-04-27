package leon.designpattern.buildtype.singletonpattern;

import org.junit.Test;

public class TestSingleton {

    @Test
    public void testSingleton(){

        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();
        System.out.println("简单饿汉单例："+ (h1==h2));

        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println("简单懒汉单例："+(l1==l1));
    }
}
