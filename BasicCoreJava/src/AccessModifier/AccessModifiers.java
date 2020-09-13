package AccessModifier;

public class AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
		
		//Public, Private,Protected,No-Access Modifier
		
		//Public ==> can be accessed throughout the project 
		//[class]-Y[package] Y [project] Y
		
		//Private==> can be accessed only within the class
		//[class]-Y [package] N [project] N
		
		//default==> can be accessed within the package	
		//[class]Y[package] Y [project] N
		
	//protected==> can be accessed within the package 
    //and can be accessed outside package by using child class object
	//[class] Y[package] Y [project] N
	}
	
	public void publicFunction()
   {
	   System.out.println("Public Function");
   }
	private void privateFunction()
	   {
		   System.out.println("privateFunction");
	   }
	 void defaultFunction()
	   {
		   System.out.println("default Function");
	   }
	protected void protectedFunction()
	   {
		   System.out.println("protected Function");
	   }
   
	}


