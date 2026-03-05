//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Random;

// => 웹버전 10 이상 jakarta /10 이하 javax

public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*File f=new File("C:\\Users\\sist14\\eclipse-workspace\\Chapter02_변수_데이터형\\src\\변수_정리.java");
        long l=f.lastModified();
        System.out.println(l);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(l)));
	}*/
		/*
		 * 변수 선언
		 * 변수 = 초기값
		 *       ---- 명시적 ex String name="홍길동"
		 *       ---- 입력값
		 *       ---- 랜덤 ex Math.random()
		 *                   -----------
		 *                      (int)(0.0~0.99) => 0~99 +1
		 *       ---- 외부에서 데이터 읽기
		 *       ---- 윈도우
		 *            JOptionPane.
		 *       
		 */



//String name=JOptionPane.showInputDialog("이름 입력:");
 //System.out.println(name);
 //int kor=(int)(Math.random()*101);
 
 //System.out.println("국어:"+kor);
		Random r=new Random();
		int kor=r.nextInt(101);
		System.out.println("국어:"+kor);

}

}
