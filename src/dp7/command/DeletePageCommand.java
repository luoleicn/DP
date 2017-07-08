package dp7.command;

public class DeletePageCommand extends Command {
	//执行删除一个页面的命令    
	public void execute() {
		//找到页面组        
		super.pg.find();
		//删除一个页面        
		super.pg.delete();
		//给出计划        
		super.rg.plan();
	}
}
