/*
 * 
 *  장점 : 상속받은 클래스가 완성해서 사용
 *  
 *  단점 : 형변환/재정의가 필요함
 *  
 *  공통 기능을 모아서 관리
 *    ex) 게시판
 *          => 목록
 *          => 글쓰기
 *          => 상세보기
 *          => 검색
 *          => 수정
 *          => 추가
 *          => 삭제
 *        
 *        자료실
 *          => 목록
 *          => 글쓰기
 *          => 상세보기 : 다운로드
 *          => 검색
 *          => 수정 : 파일 변경
 *          => 추가 : 업로드
 *          => 삭제 : 파일 삭제
 *          
 *      =>> 서로 다른 클래스를 모아서 관리
 *      
 *      형식)
 *      
 *         abstract class ClassName  << 구현 안된 메소드 때문에 abstract 를 넣어야함
 *         {
 *             변수
 *             생성자
 *             메소드
 *               => 구현 된 메소드 (공통적으로 쓰는 메소드)
 *               => 구현 안 된 메소드 (상황 따라 다른 메소드)
 *         }
 *         
 *         객체 생성이 안됨 (new 불가능)
 */

class AAA
{
	public void display()
	{
		
	}
}
public class 추상클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AAA a=new AAA();
       a.display();
	}

}
