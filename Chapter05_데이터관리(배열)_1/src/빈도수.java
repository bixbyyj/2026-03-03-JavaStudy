/*
 *  0~9 난수 발생 => 100개 발생
 */
import java.util.Arrays;
public class 빈도수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[46];
        
        for (int i=0;i<=100;i++)
        {
        	int rand=(int)(Math.random()*45)+1; // 0~9 난수 발생
            arr[rand]++;
        }
        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(i+"==>"+arr[i]);
        }
	}

}
