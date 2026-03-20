package com.sist.music;
/*
 *  1. 패키지 만드는 법
 *    => 관련된 클래스 모음
 *    => 패키지 == 폴더
 *    => com(org).업체명.요약 ex) com.sist.oop
 *                             com.sist.server
 *    => 자바에서 제공하는 패키지는 java가 들어감 ex) java.util (사용이 많은 클래스 모음)
 *                                         java.io (입출력 관련)
 *                                         java.net (네트워크 관련)
 *                                         java.awt (윈도우 관련)
 *                                         -------- jdk 1.0
 *                                                  jdk 2.0
 *                                         javax.swing
 *                                         javax.xml
 *                                         ...
 *                                         -------- jdk 17
 *                                        
 *                                         jakarata
 *    -------------------------------------------------------------------------
 *  
 *  2. 패키지에 있는 클래스 가지고 오기
 *    => 다른 패키지에 있는 클래스는 인식을 못함
 *    => import 패키지.* : 패키지 안에 있는 모든 클래스 ex) import java.util.*;
 *    => import 패키지.클래스명 : 지정된 클래스 한개만 가지고 옴 ex) import java.util.Scanner; : 권장
 *    -------------------------------------------------------------------------
 *  
 *  3. 접근지정어
 *    => 인스턴수 변수 : private을 주로 사용함 
 *    => 클래스 : public, default(지정어 지정 안하면 자동으로 default 지정어임)
 *    => 메소드 : 가급적이면 public / 보통 다른 클래스랑 연결하기 때문에 public을 자주 씀
 *    => 생성자 : 같은 이유로 public을 주로 씀
 *   public : 어디서든 사용 가능 
 *   
 *   protected : 같은 패키지 / 상속 가능 (상속 받은 경우에 한해서 다른 패키지에 접근 가능)
 *                          
 *   default : 같은 패키지 / 상속 불가능
 *    
 *   private : 같은 클래스에서만 사용 가능 (노출 되면 안되는 데이터가 있는 경우)
 *           => 제한 허용 하는 법 
 *              getter / setter : 캡슐화
 *  
 *  4. 제어어
 *   static
 *   
 *   final
 *   
 *   abstract
 *     
 *                  
 *        
 * 
 */

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	//공개 (공유용) 로그인 한 사람들이(public) 똑같은 화면을(static) 봐야하기 때문에
     public static Music[] music=new Music[50];
    //초기화 => 객체 생성 없이 초기화 : MusicSystem 부르자마자 static 블럭 자동 불러옴
	 static //자동호출 :  예외 << 인스턴스 변수는 들어갈 수 없음
	 {
		 try
		 {
			 
			 //초기화 블럭
			 Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();	
			 Elements title=doc.select("table.list-wrap a.title");
			 ////< Genie뮤직에서 소스를 봤더니 table class 안에 list-wrap 이란 곳에서 
			 Elements singer=doc.select("table.list-wrap a.artist");
			 Elements album=doc.select("table.list-wrap a.albumtitle"); 
			 Elements etc=doc.select("table.list-wrap span.rank");
			 for(int i=0;i<title.size();i++)
			 {
				 Music m=new Music();
				 m.setNo(i+1);
				 m.setTitle(title.get(i).text());
				 m.setSinger(singer.get(i).text());
				 m.setAlbum(album.get(i).text());
				
				        System.out.println(i+1);
			            System.out.println(title.get(i).text());
			            System.out.println(singer.get(i).text());
			            System.out.println(album.get(i).text());
			            System.out.println(etc.get(i).text());
			            
			            String temp=etc.get(i).text();
			            String state=""; // < 등수 변동 유지 or 상승 하강 표기
			            String id=""; // < 등수 변동 숫자 기입
			            if(temp.equals("유지"))
			            {
			            	state="유지";
			            	id="0";
			            }
			            else
			            {
			            	state=temp.replaceAll("[^가-힣]", "");    //< 가-힣을(한글을) 제외하고 나머지를 지워라
			            	id=temp.replaceAll("[^0-9]", "");		//< 숫자를 제외하고 나머지를 지워라	            	
			            }
			            
			     m.setState(state);
			     m.setIdcrement(Integer.parseInt(id));
			     music[i]=m;
			            System.out.println("상태 : "+state);
			            System.out.println("등폭 : "+id);
			            System.out.println("=========================");
			 }
		 }catch(Exception ex) {}
	 }
	 
	 //기능 메소드
	 // 0. 메뉴 출력
	 public int menu() // 종결을 해줘야 송신이 됨
	 {
		 System.out.println("====== 메뉴 ======");
		 System.out.println("1. 뮤직 목록");
		 System.out.println("2. 상세보기");
		 System.out.println("3. 곡 찾기");		
		 System.out.println("4. 종료");
		 System.out.println("=================");
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("메뉴 선택 : ");
		 
		 int m=scan.nextInt();
		 return m;
	 }
	  // 1. 목록 출력
	 
	 public Music[] musicList()
	 {
		 for (Music m:music)
		 {
			 System.out.println(m.getNo()+"."+m.getTitle());
		 }
		 return music;
	 }
	  // 2. 상세보기
	 
	 public void musicData(int no)
	 {
		 for(Music m:music)
		 {
			 if (m.getNo()==no)
			 {
				 System.out.println("순위 : "+m.getNo());
				 System.out.println("곡명 : "+m.getTitle());
				 System.out.println("가수명 : "+m.getSinger());
				 System.out.println("앨범명 : "+m.getAlbum());
				 System.out.println("상태 : "+m.getState());
				 String s=m.getState();
				 if (s.equals("유지"))
				 {
					 System.out.println("등폭 :-");
				 }
				 
				 else if(s.equals("상승"))
				 {
					 System.out.println("등폭 : ▲");
				 }
				 
				 else if(s.equals("하강"))
				 {
					 System.out.println("등폭 : ▼");
				 }
			 }
			 
		 }
	 }
	  // 3. 검색 : 가수, 곡명 
	 
	 public void searchTitle(String fd)
	 {
		 for (Music m:music)
		 {
			 if (m.getTitle().toLowerCase().contains(fd.toLowerCase()))
			 {
				 System.out.println(m.getNo()+"."
						 +m.getTitle()+" "+m.getSinger());
			 }
		 }
	 }
	 
	 public void searchSinger(String fd)
	 {
		 for (Music m:music)
		 {
			 if (m.getSinger().toLowerCase().contains(fd.toLowerCase()))
			 {
				 System.out.println(m.getNo()+"."
						 +m.getTitle()+" "+m.getSinger());
			 }
		 }
	 }
	  // 4. 동영상
	  
	}


