package com.sist.oop;
/*
 * 접근지정어 / 제어자
 * -------------
 * => 패키지로 클래스들을 구분해야함 => import 메소드 사용
 * 
 * 1. package : 한번만 사용
 * 2. import : 여러번 사용이 가능
 * 3. class
 *    -----
 *      | 접근지정어 => public / protected / default / private
 *           public : 어디서든 접근 가능
 *           
 *           protected : 같은 패키지 + 상속해준 자식 클래스 => 요새 상속이 없어지는 추세라서 잘 사용하지 않음
 *           
 *           default : 같은 패키지(폴더) ex) src폴더 내에서는 접근 가능
 *           
 *           private : 해당 클래스에서만
 *        단 오버라이딩시에 접근지정어는 축소할 수 없다.
 *        
 *        
 *           오버로딩 : 같은 이름의 메소드를 여러 개 만드는 것
 *           오버라이딩 : 상속 관계에서 부모가 물려준 메소드를 자식 클래스 에서만 바꾸는 것
 * 4. 클래스 구조
 *   
 *   (public) class ClassName
 *    {
 *       private 변수(클래스 내에서만 사용해야하므로)
 *       public 생성자(다른 클래스와 연결 되어야 하므로)
 *       public 메소드(다른 클래스와 통신 되어야 하므로)
 *    }
 *    
 *    1) static / instance : 둘 다 프로그램 종료까지 메모리 유지
 *       static : 객체 생성없이 사용이 가능 (중요!!)
 *              => 컴파일 시에 메모리 저장
 *              => 독립적으로 사용 가능 ex) 클래스.변수명
 *                                    클래스.메소드()
 *              => this 못씀                     
 *              => static 메소드 안에서는 static만 사용 가능
 *       instance : 객체 생성해야 사용 가능
 *              => 반드시 new로 객체를 생성해야 접근이 됨
 *              => this 사용 가능 ex) this.변수명=변수
          
           *              class A
           *              { 
           *                  int a,b;       <= A를 새로운 변수에 할당할 때 마다 새로 생김
           *                  static int c;  <=c는 변동되지 않음
           *                  static void disp()
           *                  {
           *                     여기서 a,b를 사용못함
           *                  }
           *                  void display()
           *                  {
           *                     sysout(this.a); => 구분할 변수명이 없는 경우에는 this.를 생략 가능
           *                     sysout(this.b);
           *                     sysout(A.c);
           *                  }
           *              }
           *              ----------------------> a,b만 메모리에 저장되어서 8byte만 사용    
 *                        A aa=new A();
 *                        aa ->   Heap      MethodArea
 *                                this
 *                                 a            c
 *                                 b\
 *     2) 생성자
 *          => 클래스를 저장해서 객체 생성시에 호출
 *             생성자 호출 => new 생성자();
 *             
 *          => 특징
 *               : 클래스 명과 동일
 *               : 리턴형이 없다
 *               : 오버로딩이 용이 : 같은 이름의 메소드로 새로운 기능 생성 ex) 아까의 Member2 생성자
 *               
 *               
 *               class A
 *                {
 *                    public A()   <= 리턴형이 없는 모습 ex) int, String..
 *       
 *                    {
 *                    }
 *                }    
 *                
 *                this.                    this()
 *                   this.name=   n;              this();
 *                       |멤버변수 |지역변수
 *                       
 *      3) 구현
 *          static 메소드 : 공통으로 적용되는 기능 ex) Math.random()
 *          instance 메소드 : 각 개체마다 따로 적용되는 기능 ex) Scanner scan=new Scanner(system.in)
 *                                                    scan.nextInt()
 *                                                    String s="";
 *                                                    s.length()
 *          abstract 메소드 : 미완성 =>선언만 하는 상태
 *          
 *      
 *      프로그램
 *      ----
 *      1. 기능 설정 => 메소드
 *                 : 메소드 안에서 공통으로 사용되는 변수(인스턴스 변수)
 *                 
 *                 
 *               

*/


/*interface A // 생략 안해도 public
{
	 void display();
	 
}

class B implements A
{
	void display();	 // < public에서 default 로 축소 되어서 오류가 남
}*/


class Sawon
{
	private int sabun; // 블럭 밖으로 나가면 사용하지 못함 
	private String name; //
	String dept; // default가 들어가있음
	protected String job; // 상속 가능
	public String loc;
	private long pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
}
public class 접근지정어_1 {
	
	/*
	 * int a=10; void display(int a) { this.a=a; }
	 */
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon hong = new Sawon();
        //hong.sabun=1; // < private으로 선언했기 때문에 접근할 수 없음
        hong.dept = "개발부";
        hong.job = "사원";
        hong.loc = "제주";
        // 메소드로 private 에 접근
        hong.setSabun(1);
        hong.setName("홍길동");
        hong.setPay(3000);
        // 저장은 setXXX, 읽기는 getXXX
        
        System.out.println("이름 : "+hong.getName());
        System.out.println("사번 : "+hong.getSabun());
        System.out.println("연봉 : "+hong.getPay());
        System.out.println("부서 : "+hong.dept);
        System.out.println("직위 : "+hong.job);
        System.out.println("근무지 : "+hong.loc);
        
        
        
	}

}
