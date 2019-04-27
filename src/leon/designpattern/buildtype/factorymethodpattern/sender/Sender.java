package leon.designpattern.buildtype.factorymethodpattern.sender;

/**
 * 不管需要实现什么样的发送器
 * 使用时均可使用发送器的引用接收
 */
public interface Sender {

    public void send();

}