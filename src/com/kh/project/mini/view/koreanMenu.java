package com.kh.project.mini.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;



public class koreanMenu extends JPanel{
	
	
	public koreanMenu() {
		setLayout(null);
		setSize(1300,500);
		setBackground(Color.yellow);
		
		JButton kfood_btn = new JButton("한국음식 패널");
		kfood_btn.setBounds(350, 300, 150, 150);
		kfood_btn.setBackground(Color.white);
		add(kfood_btn);
//		
//		kfood_btn.addActionListener(new ActionListener());
//	}
//		class MyActionListener implements ActionListener{
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					win.change("panel02");
//			} 
		}
}
		
		
