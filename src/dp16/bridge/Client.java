package dp16.bridge;

/**
 * 　桥梁模式的优点
 *          抽象和实现分离这也是桥梁模式的主要特点，它完全是为了解决继承的缺点而提出的设计模式。
 *       在该模式下，实现可以不受抽象的约束，不用再绑定在一个固定的抽象层次上。
 *          优秀的扩充能力看看我们的例子，想增加实现？没问题！想增加抽象，也没有问题！只要对外
 *       暴露的接口层允许这样的变化，我们已经把变化的可能性减到最小。
 */
public class Client {
    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        //定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        //执行行文
        abs.request();
    }
}
