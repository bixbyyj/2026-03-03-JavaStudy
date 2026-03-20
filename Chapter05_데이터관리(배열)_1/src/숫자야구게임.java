import java.util.Arrays;
import java.util.Scanner;


public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       
       int[] com=new int[3];
       int[] user=new int[3];
       
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
      
       while(true)
       {
    	   int strike=0;
    	   int ball=0;
    	   System.out.println("내 숫자를 입력하세요 :");
    	   for (int i=0;i<user.length;i++)
    	   {
    		   user[i]=scan.nextInt();
    	   }
    	   
    	   for (int i=0;i<com.length;i++)
    	   {
    		   for (int j=0;j<user.length;j++)
    		   {
    			   if (com[i]==user[j])
    			   {
    				   if (i==j)
    				   {
    					   strike++;
    				   }
    				   else 
    				   {
    					   ball++;
    				   }
    			   }
    			   
    			}
    			   
    		}
    	   if (strike==3)
    	   {
    		   System.out.println("정답입니다." + Arrays.toString(com));
    		   break;
    	   }
    	   else if (strike==0 && ball==0)
    	   {
    		   System.out.println("out");
    	   }
    	   else
    	   {
    		   System.out.println(strike+"strike"+ball+"ball");
    	   }
       }
	}

}
