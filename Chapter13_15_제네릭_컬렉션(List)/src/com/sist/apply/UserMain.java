package com.sist.apply;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Sawon
{
	private int sabun;
	private String name;
	/*public Sawon(int sabun, String name) {
		
		this.sabun = sabun;
		this.name = name;
	}
	public Sawon() {}*/
}

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList();
		list.add(new Sawon(1,"aaa"));
		list.add(new Sawon(2,"bbb"));
		list.add(new Sawon(3,"ccc"));
		//list.add(4); // 정수가 하나 들어가서 형변환이 안된 바람에 에러가 남
		
		for(Sawon o:list)
		{
			//Sawon s=(Sawon)o;
			System.out.println(
					o.getSabun()+" "
					+o.getName()
					);
		}

	}

}
