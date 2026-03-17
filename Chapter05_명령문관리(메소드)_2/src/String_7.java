/*
 * trim() : 좌우의 공백 제거 (***가운데는 제거 하지 않음!!***)
 *   => 유효성 검사
 *   "Hello"
 *   " Hello"
 * valueOf() : 모든 데이터형을 문자열로 변경 : static
 *   valueOf(100) => "100"
 *   => 윈도우 출력하려면 문자열로 변경해야함 그럴 떄 사용
 * format() : 형식을 변경
 *   => printf와 동일
 * 
 * 
 * 
 */
import javax.swing.*;
public class String_7 extends JFrame {
    JTextField tf=new JTextField();
    
    public String_7()
    {
    	add("North", tf);
    	tf.setText(String.valueOf(10));
    	//<= 입력만 하는 윈도우 창에 10을 미리 써놓고 싶은데 윈도우라 문자열로 변환하고 넣어줘야함
    	// static이기 떄문에 메모리에 저장을 하지 않고 쓴다
    	setSize(300,350);
    	setVisible(true);    	
    }
    
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        new String_7();
	}

}
