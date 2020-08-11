package com.kh.project.mini.view;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class japanMenu extends JPanel{
	
	
	public japanMenu() {
		setLayout(null);
		setSize(1300,500);
		setBackground(Color.blue);
		
		JButton jfood_btn = new JButton("일본음식 패널임");
		jfood_btn.setBounds(500, 300, 150, 50);
		jfood_btn.setBackground(Color.white);
		add(jfood_btn);
//		
//		jfood_btn.addActionListener(new ActionListener());
//	}
//		class MyActionListener implements ActionListener{
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					win.change("panel01");
//			} 
		}
}
		