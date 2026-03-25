/*
 *   예외처리의 종류
 *    직접처리 : 에러 복구 => try ~ catch
 *                       형식
 *                        try
 *                        {
 *                           정상 수행 가능한 문장
 *                        }catch(예상 예외처리 클래스)
 *                        {
 *                           에러 출력/에러 복구
 *                        }
 *                        finally
 *                        {
 *                           생략 가능
 *                           try/catch 관계없이 무조건 수행됨
 *                           
 *                           보통 파일닫기/연결해제 등의 구문 포함
 *                        }   
 *    
 *            
 *    
 *    간접처리 : 에러 회피
 *            에러 떠넘기기 => throws
 *            
 *    임의발생 : 테스트/프로그램 확인 => throw
 *    
 *    사용자 정의 : 지원하지 않는 예외
 *               class MyException extends Exception
 *               {
 *               }
 *    
 
 */
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		 System.out.println("1");
		 System.out.println("2");
		 System.out.println("3");
		 System.out.println("4");
		}catch(Exception e) // < 모든 에러를 예외처리 하는 구문
		{
			System.out.println("5");
		}
		finally
		{
			System.out.println("6");
		}

	}

}
