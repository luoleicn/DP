package dp8.chain.of.responsibility;

public class Husband extends Handler {
	//�ɷ�ֻ�������ӵ�����    
	public Husband(){
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}
	protected void response(IWomen women) {
		System.out.println("--------�������ɷ���ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");
	}
}
