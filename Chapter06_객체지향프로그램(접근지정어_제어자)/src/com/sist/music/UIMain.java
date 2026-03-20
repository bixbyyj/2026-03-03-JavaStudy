package com.sist.music;

import com.sist.music.GenieMusicSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class UIMain extends JFrame{
	
	JTextField tf;
	JButton btn;
	JTable table;
	DefaultTableModel model;
	
	GenieMusicSystem GMS = new GenieMusicSystem();
	
	public UIMain() 
	{
		tf=new JTextField(30);
		btn=new JButton("검색");
		btn.addActionListener(this);
		String[] col= {"순위", "곡명", "가수명", "앨범"};
		String[][] row=new String[0][4];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		JPanel p=new JPanel();
		p.add(tf);p.add(btn);
		add("North",p);
		add("Center",js);
		setSize(800, 600);
		
		init();
		setVisible(true);
		
		
		
	}
	public void init()
	{
		for (int i=model.getRowCount()-1;i>=0;i--)
			model.removeRow(i);
		for (Music m:GMS.musicList())
		{
			String[] data= {
					String.valueOf(m.getNo()),
					m.getTitle(),
					m.getSinger(),
					m.getAlbum()
			};
			model.addRow(data);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new UIMain();
	}

}
