package dp11.adaptor;

public class Client {
	public static void main(String[] args) {
		//没有与外系统连接的时候，是这样写的        
		IUserInfo youngGirl = new UserInfo();
//		IUserInfo youngGirl = new OuterUserInfo();
		youngGirl.getMobileNumber();
	}
}
