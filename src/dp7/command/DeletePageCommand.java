package dp7.command;

public class DeletePageCommand extends Command {
	//ִ��ɾ��һ��ҳ�������    
	public void execute() {
		//�ҵ�ҳ����        
		super.pg.find();
		//ɾ��һ��ҳ��        
		super.pg.delete();
		//�����ƻ�        
		super.rg.plan();
	}
}
