package com.sist.lambda;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// 회원 + 주문 => 관리자 통계
// 관리자 모드
class User
{
	private String name;
	private int age;
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Order
{
	private String userName;
	private int price;
}
public class Stream_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<User> users=Arrays.asList(
            new User("홍길동", 25),
            new User("이순신", 17),
            new User("박문수", 30),
            new User("김두한", 23),
            new User("강감찬", 32)
        );
        List<Order> orders=Arrays.asList(
            new Order("홍길동", 20000),
            new Order("이순신", 25000),
            new Order("박문수", 30000),
            new Order("김두한", 55000),
            new Order("강감찬", 15000),
            new Order("홍길동", 46000),
            new Order("이순신", 24000),
            new Order("박문수", 37000),
            new Order("홍길동", 13000),
            new Order("이순신", 97000),
            new Order("박문수", 88000)
        );
        
        
        // 1. 성인 회원만 출력
        System.out.println("=== 성인 회원 ===");
        List<User> adults=users.stream()
        		.filter(u->u.getAge()>=18)
        		.collect(Collectors.toList()); // toList:List에서 조건에 맞는 회원만 담아줌
        adults.stream()
           .forEach(u->System.out.println(
        		   u.getName()+"("+u.getAge()+")"));
        
        System.out.println("=== 회원 이름만 추출 ===");
        List<String> names=users.stream()
        		.map(User::getName) // String 리턴형이기 때문에 List<String>으로 받아줘야함
        		.collect(Collectors.toList());
        
        names.stream()
           .forEach(System.out::println);
        
        System.out.println("=== 3만원 이상 구매자만 추출 ===");
        List<Order> hbuyer=orders.stream()
        		.filter(b->b.getPrice()>=30000)
        		.collect(Collectors.toList());
        hbuyer.stream()
            .forEach(b->System.out.println(
            		b.getUserName()+"("+b.getPrice()+"원"+")"));
        
        System.out.println("=== 특정 회원의 주문만 조회 ===");
        Scanner scan=new Scanner(System.in);
        System.out.println("이름 입력: ");
        String n=scan.next();
        List<Order> buyer=orders.stream()
        		.filter(y->y.getUserName().equals(n))
        		.collect(Collectors.toList());
        buyer.stream()
            .forEach(y->System.out.println(y.getUserName()+"("+y.getPrice()+"원"+")"));
        
        System.out.println("=== 총 매출 계산 ===");
        int total=
        		orders.stream()
        		.map(Order::getPrice)
        		.reduce(0, Integer::sum);
        DecimalFormat df=new DecimalFormat("#,###,###,###");
        System.out.println("총 금액:"+df.format(total)+"원");
        
        System.out.println("=== 총 주문 금액 ===");
        Scanner scan1=new Scanner(System.in);
        System.out.println("이름 입력: ");
        String na=scan.next();
           int totalprice=orders.stream()
        		.filter(t->t.getUserName().equals(na))
        		.map(Order::getPrice)
        		.reduce(0, Integer::sum);
        System.out.println("총 금액:"+df.format(totalprice)+"원");
        
        
       
        		
        		
	}

}
