package dp15.state;

public class RunningState extends LiftState {
    //�����Źرգ����ǿ϶���
    @Override
    public void close() {
        //do nothing
    }

    //���е�ʱ�򿪵����ţ�����ˣ����ݲ�����㿪��
    @Override
    public void open() {
        //do nothing
    }

    //����������״̬��Ҫʵ�ֵķ���
    @Override
    public void run() {
        System.out.println("������������...");
    }

    //���Ǿ����Ǻ���ģ�ֻ���в�ֹͣ����˭����������ݣ�������ֻ���ϵ���
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        //��������Ϊֹͣ״̬
        super.context.getLiftState().stop();
    }
}
