package Function;

public class FunctionsParameter {

	public static void main(String[] args) 
	{
	sum(10,20);
	sum(1,20);
	sum(20,20);
	//Your name is "Anand" and your age is "32"
	
	
	message("Amruta", 32);
	
	
	}
	//Access Modifiers //Type//Nature//Return Type//Name   //Parameters
	public               static         void        sum     (int a,int b)
	{
	
	System.out.println(a+b);

	}
	public static void message(String name, int age)
	{
	
	System.out.println("Your name is "+name+" and Your age is "+age );

	}
}
