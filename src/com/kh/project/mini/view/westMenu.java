package com.kh.project.mini.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class westMenu extends JPanel{
	public westMenu() {
		setLayout(null);
		setSize(1300,500);
		setBackground(Color.green);
		
		JButton manager_btn = new JButton("서양음식패널임");
		add(manager_btn);
		manager_btn.setBounds(350, 300, 80, 50);
		manager_btn.setBackground(Color.white);
		manager_btn.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent arg0) { 
			westMenu westmenu = new westMenu();
			add(westmenu);
			revalidate(); // 누르면 다음 그림으로 넘어가게함
			repaint(); // 안쓰여도됨
		} 
	}); 
		
		setVisible(true);
		
		
	}

}
