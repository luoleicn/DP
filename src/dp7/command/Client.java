package dp7.command;

public class Client {
	public static void main(String[] args) {
		//�������ǵĽ�ͷ��        
		Invoker xiaoSan = new Invoker();//��ͷ�˾���С��       
		//�ͻ�Ҫ������һ������        
		System.out.println("------------�ͻ�Ҫ������һ������---------------");
		//�ͻ���������������        
		Command command = new AddRequirementCommand();
		//��ͷ�˽��յ�����        
		xiaoSan.setCommand(command);
		//��ͷ��ִ������        
		xiaoSan.action();   
	}
}
