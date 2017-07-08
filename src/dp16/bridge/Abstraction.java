package dp16.bridge;

public abstract class Abstraction {
    //�����ʵ�ֻ���ɫ������
    private Implementor imp;

    //Լ���������ʵ�ָù��캯��
    public Abstraction(Implementor _imp) {
        this.imp = _imp;
    }

    //�������Ϊ������
    public void request() {
        this.imp.doSomething();
    }

    //���ʵ�ֻ���ɫ
    public Implementor getImp() {
        return imp;
    }
}
