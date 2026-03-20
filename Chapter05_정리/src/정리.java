/*
 * 숫자 야구
 * 
 */
import java.util.*;
public class 정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=new int[3];
        
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
