package dp12.facade;


/**
 * ����ģʽ������ί���ڶ�ϵͳ���ʵ��ϸ�ڣ����Ⱪ¶ͳһ����
 */
public class Facade {
    //��ί�еĶ���
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    //�ṩ���ⲿ���ʵķ���
    public void methodA(){
        this.a.doSomethingA();
    }
    public void methodB(){
        this.b.doSomethingB();
    }
    public void methodC(){
        this.c.doSomethingC();
    }

}
