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
	
	public FoodKind() {
		super("�� 2����������");
		getContentPane().setLayout(null);
		setSize(1300,800);
		getContentPane().setBackground(new Color(228,247,186));
		
		KoreanMenu koreanmenu = new KoreanMenu();
		JapanMenu japanmenu = new JapanMenu();
		ChinaMenu chinamenu = new ChinaMenu();
		WestMenu westmenu = new WestMenu();
		Result result = new Result();
		
		
			
		ImageIcon khlogo = new ImageIcon("image/khlogo3.png");
		JLabel lb_khlogo = new JLabel(khlogo);
		lb_khlogo.setBounds(0,11,800,100);
		getContentPane().add(lb_khlogo);
		
		
		ImageIcon menusel = new ImageIcon("image/menusel.png");
		JLabel lb_menusel = new JLabel(menusel);
		lb_menusel.setBounds(45,200,712,500);
		getContentPane().add(lb_menusel);
		
		
		
		
		
		
		JButton kfood_btn = new JButton("�ѽ�");
		kfood_btn.setFont(new Font("Aharoni ����", Font.BOLD, 30));
		kfood_btn.setBackground(new Color(166, 166, 166));
		kfood_btn.setForeground(Color.WHITE);
		kfood_btn.setBounds(45, 105, 161, 59);
		getContentPane().add(kfood_btn);
		
		
		
		kfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				getContentPane().add(koreanmenu);
				getContentPane().add(result);
				
				remove(lb_menusel);
				remove(chinamenu);
				remove(japanmenu);
				remove(westmenu);
				
				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		
		
		
		JButton jfood_btn = new JButton("�Ͻ�");
		jfood_btn.setFont(new Font("Aharoni ����", Font.BOLD, 30));
		jfood_btn.setForeground(Color.WHITE);
		jfood_btn.setBounds(218, 105, 161, 59);
		jfood_btn.setBackground(new Color(166, 166, 166));
		getContentPane().add(jfood_btn);
		
		jfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				getContentPane().add(japanmenu);
				getContentPane().add(result);
				
				
				remove(lb_menusel);
				remove(koreanmenu);
				remove(chinamenu);
				remove(westmenu);
				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		
		
		JButton cfood_btn = new JButton("�߽�");
		cfood_btn.setFont(new Font("Aharoni ����", Font.BOLD, 30));
		cfood_btn.setForeground(Color.WHITE);
		cfood_btn.setBounds(564, 105, 161, 59);
		cfood_btn.setBackground(new Color(166, 166, 166));
		getContentPane().add(cfood_btn);
		
		cfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) { 
				getContentPane().add(chinamenu);
				getContentPane().add(result);
				
				remove(lb_menusel);
				remove(koreanmenu);
				remove(japanmenu);
				remove(westmenu);

				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		
		
		JButton wfood_btn = new JButton("���");
		wfood_btn.setFont(new Font("Aharoni ����", Font.BOLD, 30));
		wfood_btn.setForeground(Color.WHITE);
		wfood_btn.setBounds(391, 105, 161, 59);
		wfood_btn.setBackground(new Color(166, 166, 166));
		getContentPane().add(wfood_btn);
		
		wfood_btn.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().add(westmenu);
				
				getContentPane().add(result);
				
				remove(lb_menusel);
				remove(koreanmenu);
				remove(japanmenu);
				remove(chinamenu);
				
				
				revalidate(); // ������ ���� �׸����� �Ѿ����
				repaint(); // �Ⱦ�������
			} 
		}); 
		
		
		
		kfood_btn.addMouseListener(this);
		cfood_btn.addMouseListener(this);
		wfood_btn.addMouseListener(this);
		jfood_btn.addMouseListener(this);
		
		
		
		
//close �ݱ��ư
		
		Button close = new Button("�ݱ�");
		close.setBounds(1111,647,97,23);
		add(close);
        
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
        b.setBackground(new Color(166, 166, 166)); //<<��ư�̶� �Ȱ�������
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
