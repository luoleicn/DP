package dp9.decorator;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
	//����Ҫ������Ҫ�����ķ������ȸ��ϰ�˵ѧУ��߳ɼ�    
	private void reportHighScore(){        
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	} 
	//���ϰֿ���ϳɼ��������ٻ㱨ѧУ���������    
	private void reportSort(){
		System.out.println("����������38��...");
	}
	
	//���ڻ㱨�������Ѿ����������������Ҫ��д����    
	@Override    
	public void report(){
		this.reportHighScore();
		//��˵��߳ɼ�        
		super.report();
		//Ȼ���ϰֿ��ɼ���        
		this.reportSort();
		//Ȼ������ϰ�ѧϰѧУ����   
	}
}