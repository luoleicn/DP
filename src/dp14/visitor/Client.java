package dp14.visitor;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            //���Ԫ�ض���
            Element el = ObjectStruture.createElement();
            //���ܷ����߷���
            el.accept(new Visitor());
        }
    }
}
