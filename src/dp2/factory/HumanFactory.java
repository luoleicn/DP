package dp2.factory;

public class HumanFactory extends AbstractHumanFactory {    

	public <T extends Human> T createHuman(Class<T> c){
		//����һ������������        
		Human human=null;
		try {   
			//����һ������   
			human = (Human)Class.forName(c.getName()).newInstance();
		} 
		catch (Exception e) {
			System.out.println("�������ɴ���");        
		} 
		return (T)human;
	}
}