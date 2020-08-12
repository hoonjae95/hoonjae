package com.kh.project.mini.view;

import java.awt.Button;
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
	
	private int menucount=0;
	
	public FoodKind() {
		super("나 2번쨰프레임");
		getContentPane().setLayout(null);
		setSize(1300,800);
		getContentPane().setBackground(new Color(228,247,186));
		
		
		KoreanMenu koreanmenu = new KoreanMenu();
		JapanMenu japanmenu = new JapanMenu();
		ChinaMenu chinamenu = new ChinaMenu();
		WestMenu westmenu = new WestMenu();
		Result result = new Result();
		
	
		//두번째 프레임 상단 로고
		ImageIcon khlogo = new ImageIcon("image/khlogo3-1.png");
		JLabel lb_khlogo = new JLabel(khlogo);
		lb_khlogo.setBounds(0,9,800,100);
		getContentPane().add(lb_khlogo);
		
		
		// 탭 누르기전 설명사진
		ImageIcon menusel = new ImageIcon("image/menusel.png");
		JLabel lb_menusel = new JLabel(menusel);
		lb_menusel.setBounds(45,200,712,500);
		getContentPane().add(lb_menusel);
		
		
		// 탭 누르기전 식당 이용사항
		ImageIcon reference = new ImageIcon("image/reference.png");
		JLabel lb_reference = new JLabel(reference);
		lb_reference.setBounds(814,29,370,600);
		getContentPane().add(lb_reference);
		
		
//		// 탭 누르면 주문 현황
//		ImageIcon orderlist = new ImageIcon("image/orderlist.png");
//		JLabel lb_orderlist = new JLabel(orderlist);
//		lb_orderlist.setBounds(814,29,370,600);
		
		
		
		
		
		//한식버튼
		JButton kfood_btn = new JButton("한식");
		kfood_btn.setFont(new Font("Aharoni 굵게", Font.BOLD, 30));
		kfood_btn.setBackground(new Color(166, 166, 166));
		kfood_btn.setForeground(Color.WHITE);
		kfood_btn.setBounds(45, 105, 161, 59);
		getContentPane().add(kfood_btn);
		
		
		
		kfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				getContentPane().add(koreanmenu);
				if(menucount==0) {
					menucount++;
					getContentPane().add(result);
				}
				remove(lb_reference);
				remove(lb_menusel);
				remove(chinamenu);
				remove(japanmenu);
				remove(westmenu);
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		
		
		//일식버튼
		JButton jfood_btn = new JButton("일식");
		jfood_btn.setFont(new Font("Aharoni 굵게", Font.BOLD, 30));
		jfood_btn.setForeground(Color.WHITE);
		jfood_btn.setBounds(218, 105, 161, 59);
		jfood_btn.setBackground(new Color(166, 166, 166));
		getContentPane().add(jfood_btn);
		
		jfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				getContentPane().add(japanmenu);
				if(menucount==0) {
					menucount++;
					getContentPane().add(result);
				} 
				remove(lb_reference);
				remove(lb_menusel);
				remove(koreanmenu);
				remove(chinamenu);
				remove(westmenu);
				
				
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		
		
		
		//양식버튼
		JButton wfood_btn = new JButton("양식");
		wfood_btn.setFont(new Font("Aharoni 굵게", Font.BOLD, 30));
		wfood_btn.setForeground(Color.WHITE);
		wfood_btn.setBounds(391, 105, 161, 59);
		wfood_btn.setBackground(new Color(166, 166, 166));
		getContentPane().add(wfood_btn);
		
		wfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().add(westmenu);
				
				if(menucount==0) {
					menucount++;
					getContentPane().add(result);
				} 
				remove(lb_reference);
				remove(lb_menusel);
				remove(koreanmenu);
				remove(japanmenu);
				remove(chinamenu);
				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		
		
		
		//중식버튼
		JButton cfood_btn = new JButton("중식");
		cfood_btn.setFont(new Font("Aharoni 굵게", Font.BOLD, 30));
		cfood_btn.setForeground(Color.WHITE);
		cfood_btn.setBounds(564, 105, 161, 59);
		cfood_btn.setBackground(new Color(166, 166, 166));
		getContentPane().add(cfood_btn);
		
		cfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				getContentPane().add(chinamenu);
				
				if(menucount==0) {
					menucount++;
					getContentPane().add(result);
				} 
				remove(lb_reference);
				remove(lb_menusel);
				remove(koreanmenu);
				remove(japanmenu);
				remove(westmenu);

				
				
				revalidate(); // 누르면 다음 그림으로 넘어가게함
				repaint(); // 안쓰여도됨
			} 
		}); 
		
		
		
		
		
		kfood_btn.addMouseListener(this);
		cfood_btn.addMouseListener(this);
		wfood_btn.addMouseListener(this);
		jfood_btn.addMouseListener(this);
		
		
		
		
		//닫기버튼누르면 2번째 프레임창만 꺼짐
		Button close = new Button("닫기");
		close.setBounds(1111,647,97,23);
		getContentPane().add(close);
        
        close.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
		
		
		
		
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
        b.setBackground(new Color(166, 166, 166)); //<<버튼이랑 똑같은색깔
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
