package dp7.command;

public abstract class Command {
	//�������鶼����ã��������ֱ��ʹ��    
	protected RequirementGroup rg = new RequirementGroup();	//������    
	protected PageGroup pg = new PageGroup();	//������    
	protected CodeGroup cg = new CodeGroup(); 	//������    
	//ֻ��һ����������Ҫ����ʲô����    
	public abstract void execute();
}
