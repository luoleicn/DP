package dp14.visitor;

public class Visitor implements IVisitor {
    //����el2Ԫ��
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }
    //����el2Ԫ��
     public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}
