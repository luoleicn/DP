package dp5.proxy.dynamic;

public class RealSubject implements Subject {
	//ÒµÎñ²Ù×÷    
	public void doSomething(String str) {
		System.out.println("do something!---->" + str);
	}
}
