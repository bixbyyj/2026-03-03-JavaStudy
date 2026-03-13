/*
 * 
 *  데이터 저장
 *   => 1개
 *   => 같은 데이터 여러 개
 *      배열(고정적)
 *   => 다른 데이터 여러 개
 *      클래스(가변적)
 *        1) 데이터 보호 : 캡슐화
 *        2) 재사용 : 상속/포함
 *        3) 수정/추가 : 오버라이딩/오버로딩
 *        4) 공통 : 추상화 
 *   ---- 메모리 -----
 *  영구적인 저장
 *   => 파일
 *   => 오라클/MYSQL (RDBMS)
 *       => DB2
 *   => XML/JSON    
 *  
 *  배열
 *   1) 같은 데이터형을 여러 개 묶을 수 있다
 *   2) 선언
 *         데이터형[] 배열명 = 
 *         
 *   3) **초기화** 특히 나는 까먹지 말기
 *         데이터형[] 배열명 = 값 (명시적) 
 *         
 *         데이터형[] 배열명 = new 데이터형[갯수];
 *   4) 값 변경
 *         전체 변경 => for
 *         일부 변경 => 배열명[i]=값       
 *   5) 화면 출력
 *         향상된 for
 *   sysout(Arrays.toString)
 *   
 *   
 *   1|
 *   쇼생크 탈출|
 *   드라마|
 *   https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 *   팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 *   2016 .02.24 재개봉, 1995 .01.28 개봉|
 *   15세 관람가|
 *   프랭크 다라본트
 *   
 *   
 *   class Movie{
 *      String rank,title,actor,poster,grade,regdate,director;
 *      }
 *      
 *      Movie[] movies=new Movie[1938]
 *  */

public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] rank=new String[1938];
        String[] title=new String[1938];
        String[] genre=new String[1938];
        String[] poster=new String[1938];
        String[] actor=new String[1938];
        String[] regdate=new String[1938];
        String[] grade=new String[1938];
        String[] director=new String[1938];
        
	}

}
