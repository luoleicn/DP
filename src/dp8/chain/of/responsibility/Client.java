package dp8.chain.of.responsibility;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Client {
	public static void main(String[] args) {
		//随机挑选几个女性        
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<>();
		for(int i=0;i<5;i++){
			arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
		}
		//定义三个请示对象        
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		//设置请示顺序        
		father.setNext(husband);
		husband.setNext(son);
		for(IWomen women:arrayList){
			father.HandleMessage(women);
		}

		//lambda
		System.out.println("---------lambda-----------");
		Consumer<IWomen> lambdaFather = (women) -> {
		    if (women.getType() == Handler.FATHER_LEVEL_REQUEST) {
				System.out.println("--------女儿向父亲请示-------");
				System.out.println(women.getRequest());
				System.out.println("父亲的答复是:同意\n");
			}
		};

		Consumer<IWomen> lambdaHusband = (women) -> {
			if (women.getType() == Handler.HUSBAND_LEVEL_REQUEST) {
				System.out.println("--------妻子向丈夫请示-------");
				System.out.println(women.getRequest());
				System.out.println("丈夫的答复是：同意\n");
			}
		};

		Consumer<IWomen> lambdaSon = (women) -> {
			if (women.getType() == Handler.SON_LEVEL_REQUEST) {
				System.out.println("--------母亲向儿子请示-------");
				System.out.println(women.getRequest());
				System.out.println("儿子的答复是：同意\n");
			}
		};


		Consumer<IWomen> chain = lambdaFather.andThen(lambdaHusband).andThen(lambdaSon);
		arrayList.stream().forEach(w -> chain.accept(w));

	}
}
