package dp5.proxy.dynamic;

public class RealSubject implements Subject {
	//ҵ�����    
	public void doSomething(String str) {
		System.out.println("do something!---->" + str);
	}
}
