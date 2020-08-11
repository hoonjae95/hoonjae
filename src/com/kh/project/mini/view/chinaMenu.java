package com.kh.project.mini.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class chinaMenu extends JPanel{
	public chinaMenu() {
		setLayout(null);
		setSize(1300,500);
		setBackground(Color.red);
		
		JButton manager_btn = new JButton("중국음식 패널임");
		add(manager_btn);
		manager_btn.setBounds(350, 300, 80, 50);
		manager_btn.setBackground(Color.white);
		manager_btn.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent arg0) { 
			chinaMenu chinamenu = new chinaMenu();
			add(chinamenu);
			revalidate(); // 누르면 다음 그림으로 넘어가게함
			repaint(); // 안쓰여도됨
		} 
	}); 
		
		setVisible(true);
		
		
	}

}
