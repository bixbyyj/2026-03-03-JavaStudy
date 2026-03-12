import java.util.*;
public class 문제풀이_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Random r=new Random();
    int[] arr=new int[10];
    
    for (int i=0;i<arr.length;i++)
    {
    	arr[i]=r.nextInt(100)+1;
    }
    System.out.println(Arrays.toString(arr));
    
    int max=arr[0];
    int min=arr[0];
    
    for (int i:arr)
    { 
    	if (max<i)
    	{
    		max=i;
    	}
    	if (min>i)
    	{
    		min=i;
    	}
    }
    System.out.printf("최댓값:%d\n최솟값:%d\n", max, min);
    
	}

}
