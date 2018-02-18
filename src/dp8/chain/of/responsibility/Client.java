package dp8.chain.of.responsibility;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Client {
	public static void main(String[] args) {
		//�����ѡ����Ů��        
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<>();
		for(int i=0;i<5;i++){
			arrayList.add(new Women(rand.nextInt(4),"��Ҫ��ȥ���"));
		}
		//����������ʾ����        
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		//������ʾ˳��        
		father.setNext(husband);
		husband.setNext(son);
		for(IWomen women:arrayList){
			father.HandleMessage(women);
		}

		//lambda
		System.out.println("---------lambda-----------");
		Consumer<IWomen> lambdaFather = (women) -> {
		    if (women.getType() == Handler.FATHER_LEVEL_REQUEST) {
				System.out.println("--------Ů��������ʾ-------");
				System.out.println(women.getRequest());
				System.out.println("���׵Ĵ���:ͬ��\n");
			}
		};

		Consumer<IWomen> lambdaHusband = (women) -> {
			if (women.getType() == Handler.HUSBAND_LEVEL_REQUEST) {
				System.out.println("--------�������ɷ���ʾ-------");
				System.out.println(women.getRequest());
				System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");
			}
		};

		Consumer<IWomen> lambdaSon = (women) -> {
			if (women.getType() == Handler.SON_LEVEL_REQUEST) {
				System.out.println("--------ĸ���������ʾ-------");
				System.out.println(women.getRequest());
				System.out.println("���ӵĴ��ǣ�ͬ��\n");
			}
		};


		Consumer<IWomen> chain = lambdaFather.andThen(lambdaHusband).andThen(lambdaSon);
		arrayList.stream().forEach(w -> chain.accept(w));

	}
}
