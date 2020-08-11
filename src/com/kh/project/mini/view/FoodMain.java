package com.kh.project.mini.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class FoodMain extends JFrame{
	private JPanel panel;

	
	public FoodMain() {
		super("�� ����");
		

		
		setSize(500, 700); //���������� ������
		getContentPane().setLayout(null); 
		setLayout(null);
		JPanel panel = new JPanel(); // �г� ��ü����
//		frame.getContentPane().setLayout(null);
		setLocationRelativeTo(null); //���������� �����ġ
		
		
//		JLabel mainTitle = new JLabel("kh�ΰ�"); //���������� ���Ÿ��Ʋ
//		mainTitle.setFont(new Font("����", Font.PLAIN, 30)); // ����Ÿ��Ʋ ���� ����
//		mainTitle.setBounds(190, 50, 500, 50); // ����Ÿ��Ʋ ��ġ
//		add(mainTitle);
		
		ImageIcon khlogo = new ImageIcon("image/khlogo.png");
		JLabel lb_khlogo = new JLabel(khlogo);
		lb_khlogo.setBounds(150,0,200,190);
		add(lb_khlogo);
		
		
		
		JLabel select_eat_location = new JLabel("�Ļ��Ͻ� ��Ҹ� ������ �ּ���");
		select_eat_location.setForeground(Color.white);
		select_eat_location.setFont(new Font("����", Font.PLAIN, 30)); // ����Ÿ��Ʋ ���� ����
		select_eat_location.setFont(select_eat_location.getFont().deriveFont(15.0f)); //����Ÿ��Ʋ ����ũ������
		select_eat_location.setBounds(150, 150, 500, 50); // ����Ÿ��Ʋ ��ġ
		add(select_eat_location);
		
		
		
		
		JButton eat_btn = new JButton(); //���忡�� �Ļ� ��ư
		ImageIcon eating = new ImageIcon("image/eat_inside3.png");
		eat_btn.setIcon(eating);
		
		eat_btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) { 
				FoodKind foodkind = new FoodKind();
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		eat_btn.setBounds(40, 200, 185, 300); //��ġ����
		eat_btn.setBackground(Color.white);
		add(eat_btn);
		
		
		
		JButton takeOut_btn = new JButton(); //����ũ�ƿ� ��ư
		takeOut_btn.setBounds(255, 200, 185, 300);
		ImageIcon takeout = new ImageIcon("image/takeout3.png");
        takeOut_btn.setIcon(takeout);
        takeOut_btn.setBackground(Color.white);
		add(takeOut_btn);
		
		JButton manager_btn = new JButton("������");
		manager_btn.setBounds(350, 600, 80, 50);
		manager_btn.setBackground(Color.white);
		add(manager_btn);
		

		
		
		getContentPane().setBackground(new Color(100,200,0));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}


	
}