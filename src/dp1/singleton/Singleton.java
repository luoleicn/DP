package dp1.singleton;

public class Singleton {    
	private static Singleton singleton = null;
	//限制产生多个对象    
	private Singleton(){    
	} 
	//通过该方法获得实例对象   
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