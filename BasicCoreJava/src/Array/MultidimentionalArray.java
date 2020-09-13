package Array;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[][] data=new String[3][2];
        
        //row 1
        data[0][0]="User1";
        data[0][1]="Password1";
      //row 2
        data[1][0]="User2";
        data[1][1]="Password2";
      //row 3
        data[2][0]="User3";
        data[2][1]="Password3";
        
        for(int r=0; r<data.length; r++){
        	
        	for(int c=0; c<data[r].length; c++)
        	{
        		System.out.println(data[r][c]);
        	}
        }
	}

}
