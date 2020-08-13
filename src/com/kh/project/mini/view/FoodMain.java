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
      super("나 메인");
      

      
      setSize(500, 700); //메인프레임 사이즈
      getContentPane().setLayout(null); 
      getContentPane().setLayout(null);
      JPanel panel = new JPanel(); // 패널 객체생성
      setLocationRelativeTo(null); //메인프레임 가운데배치
      
      

      //첫번째 메인프레임 타이틀 로고
      ImageIcon khlogo = new ImageIcon("image/khlogo2-2.png");
      JLabel lb_khlogo = new JLabel(khlogo);
      lb_khlogo.setBounds(14,12,452,180);
      getContentPane().add(lb_khlogo);
      
      
      
      //회원 버튼
      JButton memner_btn = new JButton(); 
      ImageIcon eating = new ImageIcon("image/member.png");
      memner_btn.setIcon(eating);
      memner_btn.setContentAreaFilled(false);
      memner_btn.setBorderPainted(false);
      
      memner_btn.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent arg0) { 
            new Login();
            revalidate(); // 누르면 다음 그림으로 넘어가게함
            repaint(); // 안쓰여도됨
         } 
      }); 
      memner_btn.setBounds(31, 274, 210,350); //위치조정
      memner_btn.setBackground(Color.white);
      getContentPane().add(memner_btn);
      
      
      
      
      //비회원 버튼
      JButton nonmemer_btn = new JButton(); 
      ImageIcon takeout = new ImageIcon("image/nonmember.png");
      nonmemer_btn.setIcon(takeout);
      nonmemer_btn.setContentAreaFilled(false);
      nonmemer_btn.setBorderPainted(false);
      nonmemer_btn.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent arg0) { 
            new FoodKind();
            revalidate(); // 누르면 다음 그림으로 넘어가게함
            repaint(); // 안쓰여도됨
         } 
      }); 
      nonmemer_btn.setBounds(245, 274, 210, 350);
        
      getContentPane().add(nonmemer_btn);
      

      
      
      getContentPane().setBackground(new Color(217,229,255));
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }


   
}