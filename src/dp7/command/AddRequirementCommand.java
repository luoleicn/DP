package dp7.command;

public class AddRequirementCommand extends Command {
	//ִ������һ�����������    
	public void execute() {
		//�ҵ�������       
		super.rg.find();
		//����һ������        
		super.rg.add();
		//�����ƻ�        
		super.rg.plan();
	}
}
