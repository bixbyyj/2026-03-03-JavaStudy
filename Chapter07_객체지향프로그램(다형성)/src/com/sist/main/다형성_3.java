package com.sist.main;

import java.util.*;
class AA
{
	public void display()
	{
		System.out.println("AA : display Call");
	}
}

class BB extends AA
{
	@Override
	public void display()
	{
		System.out.println("BB : 안녕하세요");
	}
}

class CC extends AA
{
	public void display()
	{
		System.out.println("CC : display Call");
	}
}

class DD extends AA
{
	public void display()
	{
		System.out.println("DD : display Call");
	}
}

class EE
{
	public void display()
	{
		System.out.println("EE : display Call");
	}
}

class MM extends EE
{
	public void display()
	{
		System.out.println("MM : display Call");
	}
}

class Container
{
	Map map=new HashMap();
	public Container()
	{
		map.put(1, new AA());
		map.put(2, new BB());
		map.put(3, new CC());
		map.put(4, new DD());
	}
	
	public AA getBean(int key)
	{
		return (AA)map.get(key);
	}
}
public class 다형성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EE > MM
		/*
		 * MM mm=new MM(); mm.display();
		 * 
		 * EE ee=new EE(); ee.display();
		 * 
		 * EE ee1=new MM(); ee1.display();
		 * 
		 * MM mm1=(MM)ee;
		 */
		
		
		  Scanner scan=new Scanner(System.in); System.out.print("기능 입력 : "); int
		  menu=scan.nextInt(); 
		  Container c=new Container();
		  
		  AA aa=c.getBean(menu); 
		  aa.display();
		 
		
			/*
			 * if (menu==1) { AA aa=new AA(); aa.display(); }
			 * 
			 * else if(menu==2) { BB bb=new BB(); bb.display(); }
			 * 
			 * else if(menu==3) { CC cc=new CC(); cc.display(); }
			 * 
			 * else if(menu==4) { DD dd=new DD(); dd.display(); }
			 */
	}
	// 이런식으로 코딩하면 같은 작업을 너무 많이 반복해야함

}
