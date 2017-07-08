package dp13.memento;

public class Client {
    public static void main(String[] args) {
        //�����������
        Originator originator = new Originator();
        //���������¼����Ա
        Caretaker caretaker = new Caretaker();
        //����һ������¼
        caretaker.setMemento(originator.createMemento());
        //�ָ�һ������¼
        originator.restoreMemento(caretaker.getMemento());
    }
}
