package dp10.strategy;

public class Context {    
	//���캯������Ҫʹ���ĸ����
	private IStrategy straegy;
	public Context(IStrategy strategy){
		this.straegy = strategy;
	}
	//ʹ�ü�ı�ˣ����ҳ�����    
	public void operate(){
		this.straegy.operate();
	}
}
