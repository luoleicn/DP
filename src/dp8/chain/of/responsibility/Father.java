package dp8.chain.of.responsibility;

public class Father extends Handler {
	//����ֻ����Ů��������    
	public Father(){
		super(Handler.FATHER_LEVEL_REQUEST);
	}
	 //���׵Ĵ�    
	protected void response(IWomen women) {
		System.out.println("--------Ů��������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}
}
