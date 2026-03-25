/*
 * 형식/구성요소
 *  
 *  public abstract class ClassName
 *  {
 *      변수 static / instance
 *      
 *      생성자 초기화
 *      
 *      메소드 
 *         구현 된 메소드
 *         
 *         구현 안된 메소드(선언만 한 메소드)
 *         
 *         ex) 버튼을 눌렀을 때
 *             마우스를 클릭했을 때
 *             키보드로 입력했을 때
 *  }
 *  
 *     =>부모 클래스로 기능하며 자식 클래스에서 자세하게 구현하여 사용
 *     => new 사용할 수 없음(객체 할당이 안됨)
 *     => 여러 개의 클래스를 묶어서 하나의 이름으로 제어할 수 있음 ex) aa.display();
 *        변수가 여러개면 배열이고
 *        클래스가 여러개면 추상클래스/인터페이스
 *     => 
 *     
 * 
 */

abstract class figure{
	public abstract void draw();
}

class square extends figure
{
	@Override
	public void draw() 
	{
		System.out.println("사각형을 그린다.");
	}
	
	
}

class triangle extends figure
{
	@Override
	public void draw() 
	{
		System.out.println("삼각형을 그린다.");
	}
	
}

class circle extends figure
{
	@Override
	public void draw() 
	{
		System.out.println("원을 그린다.");
	}
	
}

abstract class DBDriver  // << 이 추상클래스를 상속받으면 모든 데이터 베이스 연결
{
	public abstract void connection(); //연결
	public abstract void disConnection(); //닫기

	
	public void preparedStatement() //SQL 문장 abstract 가 없으면 구현
	{
		System.out.println("Select 문장 전송");
	}
	
	public void getResultSet() //결과값 abstract가 없으므로 구현
	{
		System.out.println("읽은 데이터를 저장 : 브라우저 전송");
	}
}


class Oracle extends DBDriver
{
	@Override
	public void connection()
	{
		System.out.println("오라클 연결");
	}
	
	@Override
	public void disConnection()       //< 오라클을 안닫아주면 계속 열려서 디도스 처럼 인식됨
	{
		System.out.println("오라클 닫기");
	}
}

class MySQL extends DBDriver
{
	@Override
	public void connection()
	{
		System.out.println("MySQL 연결");
	}

	@Override
	public void disConnection()       //< 오라클을 안닫아주면 계속 열려서 디도스 처럼 인식됨
	{
		System.out.println("MySQL 닫기");
	}

}

class MariaDB
{
	
}

class MSSQL
{
	
}

class DB2
{
	// 라이브러리를 보면 추상클래스인지 일반클래스인지 확인 가능
	// new 없으면 추상 new 있으면 일반
	// ex)Calendar cal=Calendar.  << 추상
}
public class 추상클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DBDriver db=new Oracle();
        
        db.connection();
        db.preparedStatement();
        db.getResultSet();
        db.disConnection();
        
        db=new MySQL();
        db.connection();
        db.preparedStatement();
        db.getResultSet();
        db.disConnection();
	}

}
