import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 인터페이스_2 extends JFrame implements ActionListener{ // <상속 받은 후에 아래에서 구현시키겠다
	JButton north=new JButton("North");
	JButton south=new JButton("South");
	JButton center=new JButton("Center");
	JButton east=new JButton("East");
	JButton west=new JButton("West");
	JTextField tf=new JTextField();
	
	public 인터페이스_2() 
	{
		//화면 UI
		add("North",north); // < add 메소드는 첫 자를 대문자로 써야함
		/* add("South",south); */
		add("Center",center);
		add("East",east);
		add("West",west);
		add("South",tf);
		
		// 윈도우 크기 설정
		setSize(350,400);
		setVisible(true);
		
		north.addActionListener(this); //<이 클래스 내 아래쪽에 보면 Actionlistener가 들어있으므로 자기 자신에 들어있음.   
		                                 //  그래서 this 를 매개변수로 씀
		/* south.addActionListener(this); */
		center.addActionListener(this);
		west.addActionListener(this);
		east.addActionListener(this);
		
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		new 인터페이스_2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==north)
		{
			JOptionPane.showMessageDialog(this, "North Button Click");
		}
		
		/*
		 * if(e.getSource()==south) { JOptionPane.showMessageDialog(this,
		 * "South Button Click"); }
		 */
		
		if(e.getSource()==center)
		{
			JOptionPane.showMessageDialog(this, "Center Button Click");
		}
		
		if(e.getSource()==east)
		{
			JOptionPane.showMessageDialog(this, "East Button Click");
		}
		
		if(e.getSource()==west)
		{
			JOptionPane.showMessageDialog(this, "West Button Click");
		}
		
		else if(e.getSource()==tf)
		{
			String msg=tf.getText();
			if(msg.length()<1)
			{
				return;
			}
			JOptionPane.showMessageDialog(this, msg);
		}
	}

}
