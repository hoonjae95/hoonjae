package com.kh.project.mini.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FoodKind extends JFrame{
	
	private JPanel panel;
	
	public FoodKind() {
		
		
		super("나 2번쨰프레임");
		setLayout(null);
		setSize(1300,800);
		setBackground(Color.white);
		
		koreanMenu koreanmenu = new koreanMenu();
		japanMenu japanmenu = new japanMenu();
		chinaMenu chinamenu = new chinaMenu();
		westMenu westmenu = new westMenu();
		
		
		
		
		
		
		JButton k_food = new JButton("한식");
		k_food.setBounds(0, 0, 325, 200);
		k_food.setBackground(Color.white);
		add(k_food);
		
		k_food.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				add(koreanmenu);
				
				remove(chinamenu);
				remove(japanmenu);
				remove(westmenu);
				
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		JButton j_food = new JButton("일식");
		j_food.setBounds(325, 0, 325, 200);
		j_food.setBackground(Color.white);
		add(j_food);
		
		j_food.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				add(japanmenu);
				
				remove(koreanmenu);
				remove(chinamenu);
				remove(westmenu);
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		JButton c_food = new JButton("중식");
		c_food.setBounds(650, 0, 325, 200);
		c_food.setBackground(Color.white);
		add(c_food);
		
		c_food.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				add(chinamenu);
				
				remove(koreanmenu);
				remove(japanmenu);
				remove(westmenu);

				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		JButton w_food = new JButton("양식");
		w_food.setBounds(975, 0, 325, 200);
		w_food.setBackground(Color.white);
		add(w_food);
		
		w_food.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				add(westmenu);
				
				remove(koreanmenu);
				remove(japanmenu);
				remove(chinamenu);
//				add(japanmenu);
//				add(chinamenu);
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
	}

}
