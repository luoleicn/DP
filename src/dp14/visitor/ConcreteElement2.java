package dp14.visitor;

public class ConcreteElement2 extends Element{
    //����ҵ���߼�
    public void doSomething(){
        //ҵ����
    }
    //�����Ǹ������߷���
     public void accept(IVisitor visitor){
        visitor.visit(this);
    }
}
