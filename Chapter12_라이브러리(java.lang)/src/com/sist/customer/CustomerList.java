package com.sist.customer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;


public class CustomerList extends JPanel implements ActionListener {
	
	JLabel la,la1;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2;
	TableColumn column;
	int curpage=1;
	int totalpage=0;
	CustomerDataCollection cdc = new CustomerDataCollection();
	
	public CustomerList()
	{
		la=new JLabel("사원 목록", JLabel.CENTER);
		la1=new JLabel("0page / 0pages", JLabel.CENTER);
		b1=new JButton("이전");
		b2=new JButton("다음");
	    String[] col= {"아이디", "이름", "이메일", "지역", "등급"};
	    String[][] row=new String[0][5];
	    
	    model=new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
	    	// 익명의 클래스 => 상속없이 오버라이딩이 가능
	    	// 생성자 안에서 처리됨 : 오버라이딩+데이터추가	    	
	    };
	    
	    table=new JTable(model);
	    JScrollPane js=new JScrollPane(table);
	    table.setRowHeight(40);
	    table.getTableHeader().setReorderingAllowed(false); // 상단 메뉴바 이동 방지
	    
	    // 배치
	    setLayout(null); //자바가 잡아준 모양 대신에 내가 직접 넣겠다고 선언
	    la.setFont(new Font("굴림체", Font.BOLD,50));
	    la.setBounds(10, 15, 920, 60);
	    add(la);
	    
	    js.setBounds(10, 90, 920, 500);
	    add(js);
	    
	    JPanel p=new JPanel();
	    p.add(b1);p.add(la1);p.add(b2);
	    
	    p.setBounds(10, 600, 920, 35);
	    add(p);
	    
	    for(int i=0;i<col.length;i++)
	    {
	    	column=table.getColumnModel().getColumn(i);
	    	if(i==0)
	    		column.setPreferredWidth(80);
	    	else if(i==1)
	    		column.setPreferredWidth(80);
	    	else if(i==2)
	    		column.setPreferredWidth(400);
	    	else if(i==3)
	    		column.setPreferredWidth(120);
	    	else if(i==4)
	    		column.setPreferredWidth(100);
	    	
	    }
	    print();
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	}
	
	public void print() // 위의 칼럼에 값을 채우려는 메소드
	{
		// 테이블 초기화
		for(int i=model.getRowCount()-1;i>=0;i--) //맨 마지막 데이터 부터 지우기
		{
			model.removeRow(i);
		}
		
		CustomerVO[] cust=cdc.customerListData(curpage);
		totalpage=cdc.customerTotalPage();
		
		for(CustomerVO vo:cust)
		{
			String[] data= {
					vo.getLogin_id(),
					vo.getName(),
					vo.getEmail(),
					vo.getLoc(),
					vo.getGrade()
			};
			model.addRow(data); //테이블에 호출을 하되
		}
		
		la1.setText(curpage+" page/ "+totalpage+" pages"); // 1/10 페이지 이런 식으로 출력해줘
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			if(curpage>1)
			{
				curpage--;
				print();
			}
			if(curpage==1)
			{
				curpage=totalpage;
				print();
			}
		}
		else if(e.getSource()==b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				print();
			}
			if(curpage==totalpage)
			{
				curpage=1;
				print();
			}
		}
	}
	
	

}
