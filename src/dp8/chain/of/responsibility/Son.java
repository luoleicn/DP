package dp8.chain.of.responsibility;

public class Son extends Handler {
	//����ֻ����ĸ�׵�����    
	public Son(){
		super(Handler.SON_LEVEL_REQUEST);
	}
	//���ӵĴ�
	protected void response(IWomen women) {
		System.out.println("--------ĸ���������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	}
}
