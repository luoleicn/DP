package dp11.adaptor;

public class Client {
	public static void main(String[] args) {
		//û������ϵͳ���ӵ�ʱ��������д��        
		IUserInfo youngGirl = new UserInfo();
//		IUserInfo youngGirl = new OuterUserInfo();
		youngGirl.getMobileNumber();
	}
}
