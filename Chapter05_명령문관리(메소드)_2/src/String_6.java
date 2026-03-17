/*
 * 문자열 ㅁ분리 split
 * 
 * 
 * 원형
 * String[] split(String regex);
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String color="red,green,blue,yellow,black,magenta,pink";
        String[] colors=color.split(",");
        
        for (String c:colors) {
        	System.out.println(c);
        }
        
        color="red|green|blue|yellow|black|magenta|pink";
        String[] colors1=color.split("|");  // << 제대로 자를거면 \\|로 표기해야함 왜냐하면 |는 정규식이기 떄문(이미 있는 연산자)
        
        for (String d:colors1)
        {
        	System.out.println(d);
        }
	}

}
