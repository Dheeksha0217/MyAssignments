package week1.day;

public class Mobile {
	
	public void makeCall()
	{
		System.out.println("Make Call to TestLeaf during working Hours 9:00 AM to 9:00 PM");
	}
	public void sendMsg()
	{
		System.out.println("Send Message to TestLeaf during working Hours 9:00 AM to 9:00 PM");
	}
	
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
	}
}
