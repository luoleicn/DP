package dp8.chain.of.responsibility;

public abstract class Handler {    
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	//�ܴ���ļ���    
	private int level =0;
	//���δ��ݣ���һ������������˭    
	private Handler nextHandler;
	//ÿ���඼Ҫ˵��һ���Լ��ܴ�����Щ����    
	public Handler(int _level){
		this.level = _level;
	}
	//һ��Ů�ԣ�Ů�������ӻ�����ĸ�ף�Ҫ���֣���Ҫ�����������    
	public final void HandleMessage(IWomen women){
		if(women.getType() == this.level){            
			this.response(women); 
		}
		else{   
			if(this.nextHandler != null){
				//�к������ڣ��Ű������������                
				this.nextHandler.HandleMessage(women);
			}
			else{
				//�Ѿ�û�к����������ˣ����ô�����                
				System.out.println("---û�ط���ʾ�ˣ�����ͬ�⴦��---\n");
			}
		} 
	} 
	/*    * ����������㴦���������Ӧ����������һ�����ڵ��ˣ���Ů�������ˣ�    * ��������ʾ�Ƿ���Թ�֣��Ǹ��׾�Ӧ�ø���Ů����Ӧ�����ɷ���ʾ    */    
	public void setNext(Handler _handler){
		this.nextHandler = _handler;
	}
	//����ʾ�ǵ�ȻҪ��Ӧ    
	protected abstract void response(IWomen women);
}
