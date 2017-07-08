package dp1.singleton;

public class Singleton {    
	private static Singleton singleton = null;
	//���Ʋ����������    
	private Singleton(){    
	} 
	//ͨ���÷������ʵ������   
	public static Singleton getSingleton(){
		if(singleton == null) {
			synchronized (singleton) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;    
	}
}