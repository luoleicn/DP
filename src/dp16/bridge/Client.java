package dp16.bridge;

/**
 * ������ģʽ���ŵ�
 *          �����ʵ�ַ�����Ҳ������ģʽ����Ҫ�ص㣬����ȫ��Ϊ�˽���̳е�ȱ�����������ģʽ��
 *       �ڸ�ģʽ�£�ʵ�ֿ��Բ��ܳ����Լ���������ٰ���һ���̶��ĳ������ϡ�
 *          ��������������������ǵ����ӣ�������ʵ�֣�û���⣡�����ӳ���Ҳû�����⣡ֻҪ����
 *       ��¶�Ľӿڲ����������ı仯�������Ѿ��ѱ仯�Ŀ����Լ�����С��
 */
public class Client {
    public static void main(String[] args) {
        //����һ��ʵ�ֻ���ɫ
        Implementor imp = new ConcreteImplementor1();
        //����һ�����󻯽�ɫ
        Abstraction abs = new RefinedAbstraction(imp);
        //ִ������
        abs.request();
    }
}
