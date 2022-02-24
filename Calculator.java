package week1.day2;

public class Calculator {
	public void add()
	{
		int a=6;
		int b=5;
		int c=4;
		System.out.println(+a+b+c);
	}

	public void sub()
	{
		int a=6;
		int b=5;
	
		System.out.println(a-b);
	}
	public void mul()
	{
		double a=666.11;
		double b=11.66;
	
		System.out.println(+a*b);
	}
	public void div()
	{
		float a=55.66f;
		float b=22.44f;
		
		System.out.println(+a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Cal=new Calculator();
		Cal.add();
		Cal.sub();
		Cal.mul();
		Cal.div();

	}

}
