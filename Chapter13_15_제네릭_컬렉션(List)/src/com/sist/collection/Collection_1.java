package com.sist.collection;

/*
 *   1. 컬렉션 : 데이터를 담아두는 메모리들의 모음 => 데이터를 쉽게 관리하기 위해 만든 것(컬렉션 프레임워크)****
 *                                                                  ------------> 표준화 / 기본 틀
 *       ex) 이름/번호/맛집 정보
 *   
 *   2. 사용하는 이유 : 배열의 단점을 커버하기 위해서
 *                  1) 크기 고정 해결 (확장/축소)
 *                  2) 정렬/검색 기능 제공
 *                  3) 모든 개발자가 동일하게 사용
 *   3. 종류
 *        Collection ---- interface
 *            |
 *        List : 구현된 클래스 - interface
 *           => 순서가 있다 (추가 시 마다 자동으로 인덱스 번호 부여)
 *           => 데이터 중복 허용
 *          1) ArrayList** : 데이터베이스(웹 핵심)
 *                       => 비동기
 *          2) Vector : 네트워크 
 *                       => 접속자 관리
 *                       => 동기화
 *          3) LinkedList => Queue : 파일 관리
 *                       => C언어
 *        Set 
 *           => 순서가 없다
 *           => 데이터 중복 불가
 *          1) HashSet**
 *          2) TreeSet
 *        Map 
 *           => 목차 : 키/값을 동시에 저장
 *           => 클래스 관리/SQL/Spring/MyBatis
 *          1) HashTable
 *          2) HashMap**
 *   ------------------------------------------
 *       List      순서 O   중복 O  : 목록/전화번호
 *   ------------------------------------------
 *       Set       순서 X   중복 X  : 로또번호/수험번호
 *                                 파일
 *   ------------------------------------------
 *       Map       key-value     : 이름-전화번호
 *   ------------------------------------------
 *    
 *    
 *       
 *  
 * 
 */

// ArrayList => java.util에 들어있음
import java.util.*;
/*
 *  순서 O 중복 O ( 리스트에 추가시 마다 인덱스가 자동으로 재설정) => 배열 기반
 *  // 인덱스 번호는 0부터
 *  메모리상에 저장 => CRUD
 *  비동기적 => 데이터베이스 연결 => 최적화
 *  주요 기능
 *     추가 : add(데이터) : 맨 뒤에 추가
 *           add(int index, 데이터) : 저장된 위치에 추가
 *           0 1 2 3 4 5
 *                |
 *           0 1 2 3 4 5 6 => 항상 순차적 : 반복문 수행에 좋음(for)
 *     삭제 : remove(int index)
 *           0 1 2 3 4 5
 *                |
 *           0 1 2 3 4
 *     수정 : set(int index, 변경될 데이터)
 *     읽기 : get(int index)
 *     갯수 : size()
 *     전체 삭제 : clear()
 *     데이터 존재 여부 : isEmpty() => List
 *  사용처
 *     오라클 데이터 읽어서 브라우저에 전송
 *     쿠키를 읽어서 브라우저에 전송
 */
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 저장 공간을 만듦
		ArrayList<String> list=new ArrayList(); // => ArrayList<리턴형>
		// 추가
		list.add("홍길동"); //0
		list.add("심청이"); //1
		list.add("박문수"); //2
		list.add("춘향이"); //3
		list.add("이순신"); //4
		// 저장된 데이터 출력
		//for(Object//String name:list) //<>없이 String으로 쓰면 에러가 남 => 
			                  //ArrayList의 구성원은 Object로 설정 되어 있음(뭐가 들어올 지 모르기 때문)
			                  //리턴형 Object 매개변수 Object
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 저장
		System.out.println("==== 지정된 위치에 저장 ====");
		list.add(2,"김두한"); // 인덱스 번호에 김두한 저장
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 삭제 : remove(int index)
		list.remove(3);
		System.out.println("==== 삭제하고 출력 ====");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 수정 : set
		System.out.println("==== 수정하고 출력 ====");
		list.set(2, "강감찬");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 갯수 : size
		System.out.println("현재 인원 : "+list.size());
		// 읽기 : get
		System.out.println("3번 : "+list.get(3));
		// 전체 삭제 : clear
		list.clear();
		System.out.println("현재 인원 : "+list.size());
		
		if(list.isEmpty()) //ex)장바구니
		{
			System.out.println("저장된 데이터가 없습니다.");
		}
		else
		{
			System.out.println("저장된 데이터가 있습니다.");
		}
	
		
	}

}
