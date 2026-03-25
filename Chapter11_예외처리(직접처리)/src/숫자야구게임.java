import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface Rand{
	public void rand(int[] com);
}
public class 숫자야구게임 extends JFrame implements ActionListener,Rand{ //다중 상속을 받을 수 있다.
	// 힌트
	JTextArea ta=new JTextArea(); //출력되는 자리
	JTextField tf=new JTextField(10); //입력하는 자리
	JButton start=new JButton("시작"); //시작버튼
	JButton end=new JButton("종료"); //종료버튼
	// 게임에 필요한 변수
	private int[] com=new int[3];
	private int[] user=new int[3];
	private int s,b; // 0
	// 화면 UI
    public 숫자야구게임()
    {
    	JScrollPane js=new JScrollPane(ta); //스크롤
    	JPanel p=new JPanel(); //버튼들 일자로 정렬해주는 기능
    	p.add(tf);p.add(start);p.add(end);
    	ta.setEditable(false); //읽기 전용 모드
    	tf.setEnabled(false); //비활성화
    	add("Center",js);
    	add("South",p);
    	setSize(350,400);
    	setVisible(true);
    	
    	start.addActionListener(this); //상호작용 키를 내 클래스 안에 있는 거에서 불러와라
    	end.addActionListener(this);
    	tf.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 숫자야구게임();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==end)
		{
			JOptionPane.showMessageDialog(this, "프로그램 종료");
			System.exit(0);
		}
		
		else if(e.getSource()==start)
		{
			
			JOptionPane.showMessageDialog(this, "야구게임을 시작합니다.");
			// 난수발생 
			rand(com); //Call by Reference : 객체/배열 주소값을 주고 값을 채워달라 요청
			tf.setEnabled(true);
			tf.requestFocus();
			start.setEnabled(false);
		}
		
		else if(e.getSource()==tf) //값 입력 했을 때 어떻게 처리할건지
		{
			// 입력값 읽기
			String strInput=tf.getText();
			int input=0;
			try
			{
				//문자열을 정수열로 변경
				input=Integer.parseInt(strInput);
				
			}catch(NumberFormatException ex)
			{
				//복구
				//this => 어느 윈도우 위에 보여줄지 : 현재는 게임 창 위에 출력함
				JOptionPane.showMessageDialog(this,"세 자리 자연수만 입력이 가능합니다.");
				//잘못 입력한 내용을 지워주기
				tf.setText("");
				//다시 커서 띄워주기
				tf.requestFocus();
				return;
			}
			//정상적으로 오류없이 진행이 되어있는 상태
			if (input<99 || input>999)
			{
				JOptionPane.showMessageDialog(this, "세 자리 자연수만 입력이 가능합니다.");
				tf.setText("");
				tf.requestFocus();
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//중복되면 안됨
			if (user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				JOptionPane.showMessageDialog(this, "중복된 수는 사용하실 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
				//지금 JOptionPane.showMessageDialog(this, "세 자리 자연수만 입력이 가능합니다.");
				//tf.setText("");
				//tf.requestFocus();  해당구문이 반복되므로 메소드 화 하면 좋을 것
			}
			
			//0을 입력하면 안됨
			if (user[0]==0 || user[1]==0 || user[2]==0)
			{
				JOptionPane.showMessageDialog(this, "0을 사용하실 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
			}
			
			//비교
			s=0;
			b=0;
			for (int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++) //user
				{
					if (com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			
			//힌트
			String hit=String.format("Input Number:%d,Result:%dS-%dB\n",input,s,b );
			ta.append(hit);
			tf.setText("");
			tf.requestFocus();
			
			//종료
			if(s==3)
			{
				JOptionPane.showMessageDialog(this, "Win!");
				System.exit(0);
			}
		}
	}
	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rand(int[] com) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9까지 난수 발생
			for(int j=0;j<i;j++)
			{
				if (com[i]==com[j])
				{
					i--;
					break; // 중복된 숫자를 뽑았으니까 다시 컴퓨터의 숫자를 뽑아라
				}
			}
		}
		
	}

}
