package dp4.constructor;

import java.util.ArrayList;

public class Client {  
	public static void main(String[] args) {       
		/*        
		 * �ͻ�����XX��˾����Ҫ����һ��ģ�ͣ�Ȼ��XX��˾�͸������ϴ�       
		 * ˵Ҫ����һ��ģ�ͣ�����һ��˳��Ȼ���Ҿ�������        
		 */        
		//���run��˳��       
		ArrayList<String> sequence = new ArrayList<String>();  
		sequence.add("engine boom"); //�ͻ�Ҫ��run��ʱ��ʱ���ȷ�������        
		sequence.add("start"); 	//��������        
		sequence.add("stop"); //����һ�ξ�ͣ
		//���ǰ����˳���豼�۳�        
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);        
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		benz.run();
	}
}