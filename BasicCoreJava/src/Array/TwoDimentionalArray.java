package Array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		String[][] data= {{"user1","password1"},{"user2","password2"},{"user3","password3"}};
		System.out.println();
		
		 for(int r=0; r<data.length; r++){
	        	
	        	for(int c=0; c<data[r].length; c++)
	        	{
	        		System.out.print(data[r][c]+" ");
	        	}
	        	System.out.println();
	}

}
}



