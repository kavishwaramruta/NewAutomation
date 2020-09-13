package Function;

public class NonStaticFunctions {
	
	public int age=32;
	
	public static String name="Anand";

	public static void main(String[] args) {
		   
    
    //thumb rule: static function can only call static methods and static variables.
    //To call non static functions you have to create an object that lass
    
                 //reference    //object     
    NonStaticFunctions objRef= new NonStaticFunctions(); 
    
    int add=objRef.sum(10, 20);
    System.out.println(objRef.age);
    
    message();
    System.out.println(name);
	}
   public int sum(int a, int b) {
	   return a+b;
   }
   public static void message() {
	   System.out.println("Your message");
   }
}
