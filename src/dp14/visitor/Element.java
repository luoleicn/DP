package dp14.visitor;

public abstract class Element {
    //����ҵ���߼�
    public abstract void doSomething();
    //����˭������
    public abstract void accept(IVisitor visitor);
}
