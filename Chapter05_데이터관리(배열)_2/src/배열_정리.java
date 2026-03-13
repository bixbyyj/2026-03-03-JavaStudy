import java.util.Scanner;
public class 배열_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        영화데이터 movie=new 영화데이터();
        
        while(true)
        {
        	System.out.println("====메뉴====");
            System.out.println("1. 영화 목록");
            System.out.println("2. 영화 상세보기");
            System.out.println("3. 영화명 찾기");
            System.out.println("4. 출연진");
            System.out.println("5. 장르별 찾기");
            System.out.println("6. 종료");
            System.out.println("===========");
            System.out.print("메뉴 선택");
            
            int menu=scan.nextInt();
            
            if (menu==6)
            {
            	System.out.println("프로그램 종료");
            	break;           	
            }
            else if(menu==1)
            {
            	for(int i=0;i<영화데이터.title.length;i++)
            	{
            		System.out.println((i+1)+"."
            				+영화데이터.title[i]);
            	}
            }
            else if(menu==2)
            {
            	System.out.println("찾아볼 영화번호 입력(1~1938):");
            	int no=scan.nextInt();
            	if(no<1||no>1938)
            	{
            		System.out.println("없는 영화입니다.");
            		continue;
            	}
            	System.out.println("====영화상세====");
            	System.out.println("영화명: "+movie.title[no-1]);
            	System.out.println("장르: "+movie.genre[no-1]);
            	System.out.println("출연: "+movie.actor[no-1]);
            	System.out.println("감독: "+movie.director[no-1]);
            	System.out.println("개봉일: "+movie.regdate[no-1]);
            	System.out.println("등급: "+movie.grade[no-1]);
            }
            else if(menu==3)
            {
            	System.out.print("검색어 입력: ");
            	String fd=scan.next();
                
            	for (String data:movie.title)//영화데이터도 쓸 수 있음
            	{
            		if(data.contains(fd)) //movie.title 중에
            			                  //fd에 스캔된 내용을 contain 한 게 있다면
            		{
            			System.out.println(data);
            		}
            	}
            }
            else if(menu==4)
            {
            	System.out.print("배우명: ");
            	String fd=scan.next();
                
            	for (int i=0;i<movie.actor.length;i++)//영화데이터도 쓸 수 있음
            	{
            		if(movie.actor[i].contains(fd)) //movie.actor 중에
            			                  //fd에 스캔된 내용을 contain 한 게 있다면
            		{
            			System.out.println(movie.title[i]
            					+"("+movie.actor[i]+")");
            		}
            	}
            }
            else if(menu==5)
            {
            	System.out.print("장르명: ");
            	String fd=scan.next();
                
            	for (int i=0;i<movie.genre.length;i++)//영화데이터도 쓸 수 있음
            	{
            		if(movie.genre[i].contains(fd)) //movie.actor 중에
            			                  //fd에 스캔된 내용을 contain 한 게 있다면
            		{
            			System.out.println(movie.title[i]
            					+"("+movie.genre[i]+")");
            		}
            	}
            }
            }
        }
	}


