/*
 *    *
 *   ***
 *  *****
 * *******   
 * 
 */
public class 제어문_중첩반복문_6 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		/*
		 * for (int i=1;i<=6;i++) { int lotto=(int)(Math.random()*45)+1;
		 * Thread.sleep(200); System.err.println(lotto+" "); }
		 */
		/*
		 * for (int i=1;i<=4;i++) { for (int j=1;j<=4-i;j++) { System.out.print(" "); }
		 * for (int k=1;k<=i;k++) { System.out.print("*"); } System.out.println(); }
		 */
		
		for (int i=1;i<=4;i++)
		{
		    for (int j=1;j<=4-i;j++)
		    {
		    	System.out.print(" ");
		    }
		    for (int k=1;k<=2*i-1;k++)
		    {
		    	System.out.print("*");
		    }
		    for (int j=1;j<=4-i;j++)
		    {
		    	System.out.print(" ");
		    }
		    System.out.println();
		} 
	}

}
