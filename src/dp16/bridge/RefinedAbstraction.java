package dp16.bridge;

public class RefinedAbstraction extends Abstraction {
    //��д���캯��
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }

    //�����������Ϊ
    @Override
    public void request() {
         /*        * ҵ����....        */
        super.request();
        super.getImp().doAnything();
    }
}
