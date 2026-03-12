/*
 * 
 * 
 */

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {100, 200, 300, 400, 500};
       int[] copy=arr; // 같은 집에 arr 과 copy 두개의 키가 배정되어버림
       
       int[] copy2=arr.clone(); // arr과 내용만 같은 다른 집이 배정됨
       copy2[0]=500;
       System.out.println(arr[0]); // arr 그대로 보존
       
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(copy2));
       
       copy[0]=1000;
       System.out.println(arr[0]); //copy와 값이 같기 때문에 인덱스 0번이 1000으로 바뀜
       
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(copy));
       
	}

}
