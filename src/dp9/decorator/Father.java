package dp9.decorator;

public class Father {
	public static void main(String[] args) {
		//�ѳɼ����ù���        
		SchoolReport sr;
		//ԭװ�ĳɼ���        
		sr = new FouthGradeSchoolReport();
		//������߷�˵���ĳɼ���        
		sr = new HighScoreDecorator(sr);
		//�ּ��˳ɼ�������˵��        
		sr = new SortDecorator(sr);
		//���ɼ���        
		sr.report();
		//Ȼ���ϰ�һ�����ܿ��ģ���ǩ����        
		sr.sign("����"); //�ҽ�С�����ϰֵ�Ȼ������
	}
}