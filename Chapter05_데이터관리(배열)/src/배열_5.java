/*
 * 
 * 
 */
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        
        Random r=new Random();
        for (int i=0;i<arr.length;i++)
        {
        	arr[i]=r.nextInt(100)+1;
        }
        for (int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println("\n==== 결과값 ====");
        int max=arr[0];
        int min=arr[0];
        
        for (int i:arr)
        {
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        
        for (int i=0;i<arr.length;i++)
        {
        	if (max==arr[i])
        	{
        		System.out.println(max+"는"+i+"번 인덱스의 값");
        	}
        	if (min==arr[i])
        	{
        		System.out.println(min+"는"+i+"번 인덱스의 값");
        	}
        }
        
        System.out.println("최대값:"+max);
        System.out.println("최솟값:"+min);
        
        }
        
        	
	}


