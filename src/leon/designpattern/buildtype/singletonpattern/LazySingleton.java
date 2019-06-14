package leon.designpattern.buildtype.singletonpattern;

public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance(){

        if(lazySingleton == null) return new LazySingleton();

        return lazySingleton;
    }
}
