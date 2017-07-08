package dp15.state;

public class StoppingState extends LiftState {
    //ֹͣ״̬���ţ������ű������ǹ��ŵģ�
    @Override
    public void close() {
        //do nothing;
    }

    //ֹͣ״̬�����ţ�����Ҫ�ģ�
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    //ֹͣ״̬�����������������ú�
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    //ֹͣ״̬����ô�������أ���Ȼ��ֹͣ����ִ����
    @Override
    public void stop() {
        System.out.println("����ֹͣ��...");
    }
}
