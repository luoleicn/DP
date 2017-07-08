package dp15.state;

public class ClosingState extends LiftState {
    //�����Źرգ����ǹر�״̬Ҫʵ�ֵĶ���
    @Override
    public void close() {
        System.out.println("�����Źر�...");
    }

    //�����Ź����ٴ�
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState); //��Ϊ����״̬
        super.context.getLiftState().open();
    }

    //�����Ź��˾����У�����������������
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        //����Ϊ����״̬
        super.context.getLiftState().run();
    }

    //�����Ź��ţ��ҾͲ���¥��
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        //����Ϊֹͣ״̬
        super.context.getLiftState().stop();
    }
}
