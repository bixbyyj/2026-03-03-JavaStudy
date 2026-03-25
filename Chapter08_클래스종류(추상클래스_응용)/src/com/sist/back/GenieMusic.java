package com.sist.back;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;
// 사용자 정의 클래스의 package가 다른 경우 import로 불러와야함
// 지금 Music.java가 있는 com.sist.vo.*; 를 back이라는 package로 불러왔음

public class GenieMusic extends CommonsMusic{
	// out.println("<a href=  << 브라우저에서 인식하게 만드는 방법
	@Override
	public void init() {
		try
		{
			// 예외 처리 => 사전 에러 방지
			// 비정상 종료 방지하고 정상적으로 종료되게 함
			// 프로그램 진행하다 에러가 나면 catch 구문에서 예외처리해라
			// if 문과 형식이 비슷함 if 에러 발생, {건너뛰어라}
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); //해당 링크에 연결해서 소스를 가져오라는 구문
			Elements title=doc.select("table.list-wrap a.title");
			Elements singer=doc.select("table.list-wrap a.artist");
			Elements album=doc.select("table.list-wrap a.albumtitle");
			Elements poster=doc.select("table.list-wrap a.cover img");
			Elements etc=doc.select("table.list-wrap span.rank");
			
			for (int i=0;i<title.size();i++)
			{
				Music m=new Music();
				m.setMno(i+1); 
				// <a href="">aaa</a> => 괄호 사이에 있는 걸 크롤링 하는데 text()
				// <img src="http..."> => attr()
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				m.setPoster(poster.get(i).attr("src"));
				
				String temp=etc.get(i).text();
				String state="";
				String id="";
				
				if(temp.equals("유지"))
				{
					state="유지";
							id="0";
				}
				
				else
				{
					// n상승 n하강 써있는데 한글만 날리는 코드
					state=temp.replaceAll("[^가-힣]", "");
					// 같은 방법으로 숫자만 날리는 코드
					id=temp.replaceAll("[^0-9]","");
				}
				
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id)); // < 정수형 변경
				
				musics[i]=m;
		
			}
			
		}catch(Exception ex){}
	}

}
