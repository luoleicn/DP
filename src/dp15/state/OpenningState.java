package dp15.state;

public class OpenningState extends LiftState {
    //������Ȼ���Թر��ˣ��Ҿ������һ�µ����ſ��ع���
    @Override
    public void close() {
        //״̬�޸�
        super.context.setLiftState(Context.closingState);
        //����ί��ΪCloseState��ִ��
        super.context.getLiftState().close();
    }
    //�򿪵�����
    @Override
    public void open() {
        System.out.println("�����ſ���...");
    }

    //�ſ���ʱ���ݾ������ܣ�����ݣ������㣡
    @Override
    public void run() {
        //do nothing;
    }

    //���Ż���ֹͣ��
    public void stop() {
        //do nothing;
    }
}
