/*
 * 
 *   예외처리
 *     목적 : 비정상 종료를 방지하고 정상 수행을 가능하게 함
 *     정의 : 사전에 에러를 방지하는 프로그램
 *     
 *     에러(Error) : 수정 x 
 *                 JVM 설정을 바꾸는 등으로 해결해야함
 *   
 *     예외(Exception) : 소스상에서 수정이 가능한 오류 => try-catch 구문으로 처리할 수 있음
 *     System.out.println(ex.getMessage());
 *     e.printStackTrace(); => 오류 출력 
 *     ex)
 *     try
 *     {
 *      구현부
 *     }catch(ClassCastException e)
 *     {
 *     e.printStactTrace();
 *     }
 *                     unchecked : 컴파일러에 걸리진 않지만 내 실수로 잘못 짠 코드
 *                     
 *                               RuntimeException
 *                               정수 변환 : NumberFormatException => Integer.parseInt ("A")
 *                                                                  따옴표 안에 숫자가 아닌 문자열이 들어가면 Exception
 *                                                                   ****공백도 예외가 됨**** ex) "10 "
 *                               인덱스 번호 초과 : ArrayIndexOutOfBoundsException
 *                                             => int[] arr=new int[2];
 *                                                sysout(arr[5]); 
 *                                
 *                               지정된 값 없음 : NullPointerException
 *                               형변환 규칙 어겼을 때 : ClassCastException
 *                     
 *                     checked : 컴파일러에 걸림. 프로그램 외부와의 상호작용에서 발생하는 예외
 *                     
 *                               파일 : IOException => java.io   
 *                               데이터베이스 : SQLException => java.sql   
 *                               네트워크 : MalformedURLException => java.net / URL
 *                               메모리할당 : ClassNotFoundException => java.lang
 *                               스레드 관련 : InterruptedException => java.lang
 *                                                  
 *                                           
 *                                                   
 *     상속과정
 *     
 * 
 * 
 * 
 */

class A
{
	
}

class B extends A
{
	
}
public class 예외처리_1 {
	String msg;

	public static void main(String[] args) {
		 
		A a=new A();
		B b=(B)a;
		
		/*
		 * // TODO Auto-generated method stub //예외처리_1 a=new 예외처리_1(); 예외처리_1 a=null;
		 * a.msg.substring(2); int[] arr=new int[2]; try { arr[0]=10; arr[2]=20;
		 * }catch(ArrayIndexOutOfBoundsException ex) {
		 * System.out.println(ex.getMessage()); }
		 * 
		 * System.out.println(arr[0]);
		 */
		/*
		 * Runnable r=()-> { System.out.println("12345"); };
		 * 
		 * new Thread(r).start();
		 * 
		 * Integer.parseInt("100 ".trim());
		 */
	
				
		/*
		 * Runnable r=new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("12345"); } }; new
		 * Thread(r).start();
		 */
	}

}
