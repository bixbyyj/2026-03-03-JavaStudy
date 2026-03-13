import java.io.FileReader;
import java.util.StringTokenizer;
public class 영화데이터 {

	static String[] rank=new String[1938];
    static String[] title=new String[1938];
    static String[] genre=new String[1938];
    static String[] poster=new String[1938];
    static String[] actor=new String[1938];
    static String[] regdate=new String[1938];
    static String[] grade=new String[1938];
    static String[] director=new String[1938];
    static//자동화처리 
       {
    	try {
    		FileReader in = new FileReader("C:\\javaDev\\movie.txt");
    		StringBuffer sb = new StringBuffer();
    		int i=0;
    		while((i=in.read())!=-1)
    		{ 
    			sb.append((char)i);
    		}
    		in.close();
    		
    		String[] movie=sb.toString().split("\n");
    		for (i=0;i<movie.length;i++)
    		{
    			String m=movie[i];
    			StringTokenizer st=new StringTokenizer(m,"|");
    			
    			rank[i]=st.nextToken();
    			title[i]=st.nextToken();
    			genre[i]=st.nextToken();
    			poster[i]=st.nextToken();
    			actor[i]=st.nextToken();
    			regdate[i]=st.nextToken();
    			grade[i]=st.nextToken();
    			director[i]=st.nextToken();    		
    		}
    	} catch (Exception e)
    	{
    		e.printStackTrace();
    		
    	}
       }
}
    	
	


