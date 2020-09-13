package ifelsestatements;

public class AirthmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println(a); //20
		System.out.println(b); //10 
		
		
		
		System.out.println(a+b); //Addition
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//% mode		
		System.out.println(10%20);
		System.out.println(20%10);
		
		//+ -->> Addition, Concatenation
		
		String name="anand";
		String surname="bhayre";
		
		System.out.println(name+surname); //Concatenate 
		
		System.out.println(a+name+b);
		
		System.out.println(a+b+name);

		System.out.println(name+a+b);
		System.out.println(name+(a+b));


	}

}
