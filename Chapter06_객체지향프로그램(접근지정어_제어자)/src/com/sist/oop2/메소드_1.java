package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// 매개변수를 알 수 없는 경우 => 웹 (필터) => ***가변매개변수***
/*
 *  printf("%d",10)
 *  printf("%d%d",10, 20)
 *  printf("%d%d%d", 10, 20, 30)
 *  String ... str
 * 
 * 
 * 검색 => 필터링 => String.format(String, Object ... org)
 * ex) 100,000,000
 */
class temp
{
	public void sum(int ... value)
	{
		int s=0;
	     for (int i=0;i<value.length;i++)
	     {
	    	 s+=value[i]; //  값 읽기=> 배열
	     }
	     System.out.println("sum="+s);
	}
	
	public String change(int num)
	{
		DecimalFormat d=new DecimalFormat("###,###,###");// <변환용 메소드 DecimalFormat
		return d.format(num);
	}
	
	public String dateChange(Date date)
	{
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 변환용 메소드 SimpleDateFormat
        return sdf.format(date);
	}
}

public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        temp t=new temp();
        t.sum(10,20); // < 이 호출부에 여러개 넣어도 가변매개변수기 때문에 다 받아줄 수 있음
        int a=100000000;
        String res=t.change(a);
        
        System.out.println(new Date());
        String result=t.dateChange(new Date()); // << import 로 Date를 넣어줘야함
        
        System.out.println(res+"원");
        System.out.println(result);
	}

}
