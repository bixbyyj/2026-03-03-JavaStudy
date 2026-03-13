import java.util.Scanner;

public class 숫자야구2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);       
		
	   int[] com=new int[4];
       int[] user=new int[4];
       
       for (int i=0;i<com.length;i++)
       {
    	   com[i]=(int)(Math.random()*9)+1;
    	   for (int j=0;j<i;j++)
    	   {
    		   if (com[i]==com[j])
    		   {
    			   i--;
    			   break;
    		   }
    	   }
    	   
    	   
    	   
       }
       
       
	}

}
