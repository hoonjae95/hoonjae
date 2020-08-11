package com.kh.project.mini.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class FoodKind extends JFrame implements MouseListener{
	
//	private JPanel panel;
	
	public FoodKind() {
		super("나 2번쨰프레임");
		setLayout(null);
		setSize(1300,800);
		
		koreanMenu koreanmenu = new koreanMenu();
		japanMenu japanmenu = new japanMenu();
		chinaMenu chinamenu = new chinaMenu();
		westMenu westmenu = new westMenu();
		Result result = new Result();
		
		
			
		ImageIcon khlogo = new ImageIcon("image/khlogo.png");
		JLabel lb_khlogo = new JLabel(khlogo);
		lb_khlogo.setBounds(150,0,90,85);
		add(lb_khlogo);
		
		
		ImageIcon menusel = new ImageIcon("image/menusel.png");
		JLabel lb_menusel = new JLabel(menusel);
		lb_menusel.setBounds(45,200,712,500);
		add(lb_menusel);
		
		
		
		
		
		
		JButton kfood_btn = new JButton("한식");
		kfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		kfood_btn.setBackground(new Color(0, 14, 39));
		kfood_btn.setForeground(Color.WHITE);
		kfood_btn.setBounds(45, 91, 161, 59);
		add(kfood_btn);
		
		
		
		kfood_btn.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) { 
				
				add(koreanmenu);
				add(result);
				
				remove(lb_menusel);
				remove(chinamenu);
				remove(japanmenu);
				remove(westmenu);
				
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		
		JButton jfood_btn = new JButton("일식");
		jfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		jfood_btn.setForeground(Color.WHITE);
		jfood_btn.setBounds(218, 91, 161, 59);
		jfood_btn.setBackground(new Color(0, 14, 39));
		add(jfood_btn);
		
		jfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				add(japanmenu);
				add(result);
				
				remove(lb_menusel);
				remove(koreanmenu);
				remove(chinamenu);
				remove(westmenu);
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		JButton cfood_btn = new JButton("중식");
		cfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		cfood_btn.setForeground(Color.WHITE);
		cfood_btn.setBounds(564, 91, 161, 59);
		cfood_btn.setBackground(new Color(0, 14, 39));
		add(cfood_btn);
		
		cfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				add(chinamenu);
				add(result);
				
				remove(lb_menusel);
				remove(koreanmenu);
				remove(japanmenu);
				remove(westmenu);

				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		JButton wfood_btn = new JButton("양식");
		wfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		wfood_btn.setForeground(Color.WHITE);
		wfood_btn.setBounds(391, 91, 161, 59);
		wfood_btn.setBackground(new Color(0, 14, 39));
		add(wfood_btn);
		
		wfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				add(westmenu);
				add(result);
				
				remove(lb_menusel);
				remove(koreanmenu);
				remove(japanmenu);
				remove(chinamenu);
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		kfood_btn.addMouseListener(this);
		cfood_btn.addMouseListener(this);
		wfood_btn.addMouseListener(this);
		jfood_btn.addMouseListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(223,195,130));
        b.setForeground(Color.black);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(223,195,130));
        b.setForeground(Color.black);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(0, 14, 39));
        b.setForeground(Color.white);
	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
