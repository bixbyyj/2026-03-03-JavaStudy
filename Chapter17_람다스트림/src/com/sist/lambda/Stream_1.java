package com.sist.lambda;

import java.util.Arrays;
import java.util.List;

public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 데이터가 짝수면 그 수의 제곱을 출력
		//      filter        map
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		// List.of() , Arrays.asList(1,2,3,4,5)
		// 데이터 이동하는 통로=stream
		list.stream()
		   .filter(n->n%2==0) // 데이터를 2로 나눈 나머지가 0이라면
		   .map(n->n*n)
		   .forEach(System.out::println);
		
		//for(int i:list) // stream
		/*
		 * { 
		 *   if(i%2==0) // filter 
		 * { 
		 *    i=i*i; // map 
		 *    System.out.println(i); // forEach 
		 *    } 
		 *    }
		 */
		
		System.out.println("==== 문자열을 대문자로 변환 ====");
		//map만 이용=> forEach이용
		List<String> names=Arrays.asList("king", "scott", "queen");
		
		names.stream()
		    .map(String::toUpperCase) // map(name->name.toUpperCase) 랑 결과값은 같음
		    .forEach(System.out::println);
		
		/*
		 *  for(String name:names)
		 *  {
		 *     name=name.toUpperCase();
		 *     Sysout(name);
		 *  }
		 *    
		 */
		
	}

}
