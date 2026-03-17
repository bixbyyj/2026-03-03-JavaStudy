// 데이터 수집 for 메소드 분리 2



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic {
     
	//1. 기능
	// 목록 읽기 => 노래명
	// 가수 읽기 
	// 앨범 읽기
	static String[] getTitle() throws Exception // << 목록 읽어올 배열 생성(노래제목)
	{
		String[] title=new String[200];      // << 배열 선언을 위한 크기 설정
		// geniemusic에 연결
		int index=0;
		for(int i=1;i<=4;i++)
		{
			Document doc= Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.title");
			for (int j=0;j<t.size();j++)
			{
				String s=t.get(j).text();
				title[index]=s;
				index++;
			}
		}
		return title;
	}
	//클래스
	/*
	 *  class Music
	 *  {
	 *     String title;
	 *     String singer;
	 *     String album;
	 *  }
	 * 
	 */
	static String[] getSinger() throws Exception // << 목록 읽어올 배열 생성(가수이름)
	{
		String[] artist=new String[200];      // << 배열 선언을 위한 크기 설정
		// geniemusic에 연결
		int index=0;
		for(int i=1;i<=4;i++)
		{
			Document doc= Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.artist");
			for (int j=0;j<t.size();j++)
			{
				String s=t.get(j).text();
				artist[index]=s;
				index++;
			}
		}
		return artist;
	}
	
	static String[] getAlbum() throws Exception // << 목록 읽어올 배열 생성(앨범이름)
	{
		String[] album=new String[200];      // << 배열 선언을 위한 크기 설정
		// geniemusic에 연결
		int index=0;
		for(int i=1;i<=4;i++)
		{
			Document doc= Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.albumtitle");
			for (int j=0;j<t.size();j++)
			{
				String s=t.get(j).text();
				album[index]=s;
				index++;
			}
		}
		return album;
	}
	
	static String[] getFind(String fd) throws Exception // << 목록 읽어올 배열 생성(앨범이름)
	{
	
		// geniemusic에 연결
		int count=0;
		String lowerFd = fd.toLowerCase();
		
		for(int i=1;i<=4;i++)
		{
			Document doc= Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.title");
			for (int j=0;j<t.size();j++)
			{
				if (t.get(j).text().toLowerCase().contains(lowerFd))
				{
					count++;
				}
			}
		}
		//동적 생성
		String[] title=new String[count];
		int index=0;
		for(int i=1;i<=4;i++)
		{
			Document doc= Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
			Elements t=doc.select("table.list-wrap a.title");
			for (int j=0;j<t.size();j++)
			{
				String orTitle=t.get(j).text();
				if (orTitle.toLowerCase().contains(lowerFd))
				{
					title[index]=orTitle;
					index++;
				}
			}
		}
		return title;
	}
}
