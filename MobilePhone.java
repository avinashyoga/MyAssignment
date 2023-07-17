package Week1.Day1;

public class MobilePhone {
	public void sendmessage() {
		System.out.println("sendmessage");
	}
	public void shareDocument() {
		System.out.println("shareDocument");
	}
	public void makecalls() {
		System.out.println("makecalls");
	}
	
	public static void main(String[] args) {
		MobilePhone myMobilePhone=new MobilePhone();
		myMobilePhone.sendmessage();
		myMobilePhone.shareDocument();
		myMobilePhone.makecalls();
		
	}

}
