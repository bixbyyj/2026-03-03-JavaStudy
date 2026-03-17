/*
 *  목표
 *  
 *  1. 메소드 이해
 *  2. String 클래스 이해
 *  3. 객체 지향 개념 이해
 * 
 * 
 * indexOf 앞에서 몇 자를 복사해서 가져와라 / lastIndexOf 뒤에서 몇 자를 복사해서 가져와라(경로/파일)
 * 
 * int indexOf(char, String)
 *  => 리턴값 -1인 경우 없음
 *  
 * int lastIndexOf(char String)
 *  => 리턴값 -1인 경우 없음
 * 
 */
import java.io.*;
public class String_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * File dir=new File("C:\\javaDev"); File[] files=dir.listFiles();
		 * 
		 * for(File f:files) { if (f.isFile()) // 파일 일Eo만 출력 { String name=f.getName();
		 * String ext=name.substring(name.lastIndexOf(".")+1); System.out.println(ext);
		 * }
		 * 
		 * }
		 */
		
		String msg="Hello Java World";
		System.out.println("a의 위치 : "+msg.indexOf("a"));
		System.out.println("a의 위치 : "+msg.lastIndexOf("a"));
		System.out.println("b의 위치 : "+msg.indexOf("b"));
		String ext=msg.substring((msg.lastIndexOf("b")+1));
		System.out.println(ext);
		
        int start = msg.indexOf("Java");
        int end = start+"Java".length();
        
        String result = msg.substring(start,end);
        String result1 = msg.substring(start);
        String result2 = msg.substring(0, msg.length()-4);
        
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
	}

}
