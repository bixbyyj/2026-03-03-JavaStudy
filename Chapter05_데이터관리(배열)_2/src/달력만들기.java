import java.util.*;
/*
 * 입력된 년도/월 => 1일자의 요일이 필요함
 * 1년도 1월 1일=>월요일
 * 1년도 1월 1일 => 전년도까지
 * 입력한 달의 전 달 까지의 합
 */
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 설정
		Scanner scan=new Scanner(System.in);
		// 반복문에서 설정하면 안된다
		// new : 동적메모리 할당 => 메모리에 저장
		// OutOfMemoryException => 메모리가 부족한 거라 이클립스 껐다가 켜야함
		int year=0, month=0, date=0;
		
		System.out.println("년도 입력: ");
		year=scan.nextInt();
		
		System.out.println("월 입력: ");
		month=scan.nextInt();
		
		System.out.println("일 입력: ");
		date=scan.nextInt();
		
		System.out.println(year+"년도 "+month+"월");
		String[] strWeek= {"일", "월", "화", "수", "목", "금", "토"};
		
		for(String w:strWeek)
		{
			System.out.print(w+"\t");
		}
		
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		int[] lastday = {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		if((year%4==0 && year%100!=0 || year%400==0))
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		
		for (int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		
		//1일 확인 =>  바로 위 코드까지 하면 ex) 3월 15일이면 그 년도 2월 말일까지 
		//           더한 일 수가 나옴 근데 total++을 하면 하루가 더해져서 3월 1일까지의
		//           합 날짜를 알 수 있음 => 고로 요일 출력 가능
		total++;
		//요일 구하기
		int week=total%7;
		
		//달력  출력
		System.out.println();
		for (int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=1;j<=week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%d\t", i);
			// 요일 출력까지만 되어있음
			week++;
			if (week>6) //일요일이면 다음주로 내려가라는 구문
			{
				 week=0;
				 System.out.println();
			}
		}
				
		
		
	}

}
