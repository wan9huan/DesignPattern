package leon.designpattern.buildtype.prototypepattern;

import java.util.Objects;

//实现Cloneable接口后可以拥有一个接口的克隆方法
public class Prototype implements Cloneable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prototype)) return false;
        Prototype prototype = (Prototype) o;
        return Objects.equals(getName(), prototype.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    //实现一个Object.clone方法
    public Object clone(){
        try {
            //super.clone()这个方法将返回一个和本类一样的实例
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
