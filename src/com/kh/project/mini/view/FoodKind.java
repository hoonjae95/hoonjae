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
		
		
		super("�� 2����������");
		setLayout(null);
		setSize(1300,800);
		setBackground(Color.white);
		
		koreanMenu koreanmenu = new koreanMenu();
		japanMenu japanmenu = new japanMenu();
		chinaMenu chinamenu = new chinaMenu();
		westMenu westmenu = new westMenu();
		
		
		
		
		
		
		JButton k_food = new JButton("�ѽ�");
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
				
				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		
		
		JButton j_food = new JButton("�Ͻ�");
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
				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		
		
		JButton c_food = new JButton("�߽�");
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

				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		JButton w_food = new JButton("���");
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
				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
	}

}
