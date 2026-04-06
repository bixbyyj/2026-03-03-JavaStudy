package com.sist.lambda;
import java.util.*;
import lombok.Getter;
import lombok.Setter;
import java.io.*;
@Getter
@Setter
class Customer{
	private String cno;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regdate;
	private String grade;
}
class CustomerManager{
	public static List<Customer> cList=
			  new ArrayList<Customer>();
	static 
	{
		try
		{
			FileReader fr=
					new FileReader("c:\\javaDev\\고객.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close();
			String[] datas=data.split("\n");
			for(String cust:datas)
			{
				StringTokenizer st=
						new StringTokenizer(cust,",");
				Customer c=new Customer();
				c.setCno(st.nextToken());
				c.setId(st.nextToken());
				c.setPwd(st.nextToken());
				c.setName(st.nextToken());
				c.setEmail(st.nextToken());
				c.setPhone(st.nextToken());
				c.setLoc(st.nextToken());
				c.setRegdate(st.nextToken());
				c.setGrade(st.nextToken());
				cList.add(c);
			}
		}catch(Exception ex){}
	}
}

public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("이름 입력: ");
        String name=scan.next();
        CustomerManager cm=new CustomerManager();
        
        /*
         * for(Customer c:cm.cList)
         * {
         *      if(c.getName().contains(name))
         *      {
         *           sysout(c.getName());
         *      }
         * }
         */
        
		/*
		 * cm.cList.stream() 
		 * .filter(c->c.getName().contains(name))
		 * .forEach(c->System.out.println(c.getName())); // String으로 가공이 안되어있어서 참조 불가
		 */
        
        List<String> list=
        		Arrays.asList("박문수","이순신","홍길동","강감찬","김두한");
        //Collections.sort(list,(a,b)->a.compareTo(b));
        list.sort(String::compareTo);
        System.out.println(list);
        
        List<Integer> data=
        		Arrays.asList(1,2,3,4,5,6,7);
        int sum=data.stream()
        		.reduce(0,  (a,b)->a+b); //reduce => 통계낼 때 쓰는 메소드
        System.out.println(sum);
	}

}
