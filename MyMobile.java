package week1.day2;

public class MyMobile {

	
	static long MobileNumber =9115776666l;
	static boolean isMobileSwitchoff=false;
	static int num=1234;
	static char name='R';
	public void makecall()
	{
		System.out.println("make call");
	}
	public void sendMsg()
	{
		System.out.println("send message");
	}
	
	public void paybills()
	
	{
		System.out.println("pay my bills");
	}
	public static void main(String[] args) {
		System.out.println( MobileNumber );
		System.out.println(isMobileSwitchoff);
		System.out.println(num);
		System.out.println(name);
		
	MyMobile obj=new MyMobile();
	obj.makecall();
	obj.sendMsg();
	obj.paybills();
	}
	
	}


