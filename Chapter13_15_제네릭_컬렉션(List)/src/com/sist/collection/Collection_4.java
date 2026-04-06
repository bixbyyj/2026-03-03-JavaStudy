package com.sist.collection;
/*
 * 
 *   제네릭 (13장)
 *   ----------
 *   1. 정의
 *      = 클래스나 메소드를 정의할 때 상용할 데이터형을 표준화해서 사용
 *      = 데이터형의 안정성, 가독성
 *      = 재사용성
 *      = 데이터형을 통일화 시킨다
 *      = 소스가 간결해진다 : 형변환 없이 사용 가능
 *      ArrayList<String> list=new ArrayList()
 *      list.add("홍길동");
 *      => let a=10
 *             a=10.5
 *             a=" "
 *             a={}
 *             a=[]
 *         => 데이터 형을 통일해야 관리가 편함
 *         
 *      list.add(30)
 *      list.add('A')
 *      list.add(180.5)
 *      
 *   2. 사용법
 *      <클래스만 사용이 가능>
 *      ------
 *      <int> <double> => 원시 데이터는 안됨 x
 *      <Integer> <Double> => Wrapper o
 *      
 *   3. 메소드(매개변수, 리턴형), 변수 => 전체가 한번에 변경이 된다
 *   
 *   Box box=new Box() => T:Object
 *   Box<String> => T:String
 * 
 */
class Box<T>
{
	T t;
	public void setT(T t)
	{
		this.t=t;		
	}
	public T getT()
	{
		return t;
	}
}
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box box=new Box();
        Box<String> box1=new Box<String>(); // T : String으로 변경
        /*
         *  T : Type (클래스형)
         *  E : Element (컬렉션에 담기는 항목)
         *  ------------------
         *  K : Key 
         *  V : Value
         *  ------------------ Map Map<String,Object..>
         *  
         *  
         *  Object => 프로그램에 필요한 데이터형으로 변환
         */
        
	}

}
