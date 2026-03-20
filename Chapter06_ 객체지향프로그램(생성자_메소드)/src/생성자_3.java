/*;
 *  생성자 선언 => 모든 클래스에서 제작하는 것은 아니다
 *              필요시에만 만든다
 *              
 *          ***************초기값을 다르게 주고 싶으면 매개변수를 이용해라********************
 * 
 */
class Student
{
	int hakbun;
	String name;
	int kor,eng,math;
	// => 변수값을 다르게 저장
	Student(int h,String n,int k,int e,int m)// 매개변수는 값을 다르게 저장할 때 사용
	{
	     hakbun=h;
	     name=n;
	     kor=k;
	     eng=e;
	     math=m;
	}
	
	Student(int hakbun, String name)
	{ 
		System.out.println("this : "+this);
		this.hakbun=hakbun;
		/*
		 * this : 자기 블럭에서의 객체명
		 * 
		 * 객체 생성
		 */
		this.name=name;
	}
	/*
	 *  변수 찾기
	 *  지역 변수 찾고 => 인스턴스 변수 찾고 => 메모리가 다르면 Heap/Stack
	 */
	
}
public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student hong=new Student(1, "홍길동", 90, 90, 90);
        Student shim=new Student(2, "심청이", 80, 80, 80);
        Student lee=new Student(3, "이순신", 70, 70, 70);
        Student park=new Student(4, "박문수", 65, 65, 65);
        Student kang=new Student(5, "강감찬");
        
        System.out.println(hong.hakbun+" "
        		+hong.name+" "
        		+hong.kor+" "
        		+hong.eng+" "
        		+hong.math+" ");
        
        System.out.println(shim.hakbun+" "
        		+shim.name+" "
        		+shim.kor+" "
        		+shim.eng+" "
        		+shim.math+" ");
        
        System.out.println(lee.hakbun+" "
        		+lee.name+" "
        		+lee.kor+" "
        		+lee.eng+" "
        		+lee.math+" ");
        
        System.out.println(park.hakbun+" "
        		+park.name+" "
        		+park.kor+" "
        		+park.eng+" "
        		+park.math+" ");
        
        System.out.println(kang.hakbun+" "
        		+kang.name+" ");
        		

        


        
	}

}
