import java.util.*;
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* char[] c=new char[10];
       int[] n= {0, 1, 2, 3, 4, 5};
       char[] day= {'일', '월', '화', '수', '목', '금', '토'};
       boolean[] bool= {true, false, false, true};
       
       char[] alpha= {'a', 'b', 'c', 'd'};
       
       for (int i=0;i<alpha.length;i++)
       { 
    	   System.out.print(alpha[i]);
       }  */
		
		Scanner scan=new Scanner(System.in);		
		int[] n=new int[10];
	    
		System.out.println("양의 정수 10개를 입력하세요.");
		
		
	    for (int i=0;i<n.length;i++)
	    	{
             n[i] = scan.nextInt();
             
             if (n[i]<=0)
             {
            	 System.out.println("잘못된 입력입니다.");
            	 i--;
            	 continue;
             }       
            }
	    System.out.print("\n3의 배수는:");
	    for (int num : n)
	    { if (num%3==0)
	        {
	    	  System.out.print(num+" ");
	        }
	    }
	    
	    }
	}
	     

    		   
    		   
       
       
	


