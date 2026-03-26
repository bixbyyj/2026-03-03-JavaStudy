// 부분적 처리
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		try
		{
			System.out.println(s.trim()); //nullpoint 발생
			int[] arr=new int[2];
			arr[2]=100;
		    System.out.println(10/0); //arithmeticexception 발생
		
		    System.out.println(Integer.parseInt("10 ")); //numberformatexception 발생
		    System.out.println("4");
		}
		 catch(ArithmeticException e)
		{
			System.out.println("6.에러발생 수행 : 에러 복구");
		}catch(NumberFormatException e)
		{
		    System.out.println("7. 에러발생 수행 : 에러 복구");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("8. 에러발생 수행 : 에러 복구");
		}
		catch(RuntimeException e) // 런타임 에러가 
		{
			System.out.println("5.문자열 처리");
		}
		finally
		{
			System.out.println("9. 무조건 수행 문장");
		}
		System.out.println("End");		

	}

}
