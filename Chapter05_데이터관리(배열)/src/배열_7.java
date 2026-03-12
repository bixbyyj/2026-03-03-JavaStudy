/*
 * 
 * char[] op={'+', '-', '*', '/'}
 * 
 *        op  100  102  104  106
 *        
 *        op[0] == '+'
 *        
 */
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[10];
        
        for (int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char) ((int)(Math.random()*26)+65); 
        }
        for(char c:alpha)
        {
        	System.out.print(c+" ");
        }
        
        // char c='A'
        /*
         * for (int i=0;i<=9;i++)
         *     alpha[i]=c;
         *     c++
         */
        
        
        for(int i=0;i<=9;i++)
        {
        	alpha[i]=(char)(i+65);
        }
        System.out.println("변경 후...");
        for (char c:alpha)
        {
        	System.out.print(c+" ");
        }
        }
        	
	}


