/*
 *  new 사용
 *  int=>0
 *  double=>0.0
 *  boolean=>false
 *  String=>null
 *  char=>'\0'
 *  ==> 자동으로 초기화
 *  ==> 반드시 메모리 생성 갯수를 써줘야함
 *  
 */

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr=new int[5];
    
	/*
	 * for (int a:arr) { System.out.println(a); }
	 */
    
    for (int i=0;i<arr.length;i++)
    {
    	arr[i]=(int)(Math.random()*100)+1;
    }
	/*
	 * for (int a:arr) { System.out.println(Arrays.toString(arr)); }
	 */
    
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
	}}


