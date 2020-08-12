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
      
      
      
      
      JButton eat_btn = new JButton(); 
      ImageIcon eating = new ImageIcon("image/eat_inside4.png");
      eat_btn.setIcon(eating);
      eat_btn.setContentAreaFilled(false);
      eat_btn.setBorderPainted(false);
      
      eat_btn.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent arg0) { 
            new Login();
            revalidate(); // 누르면 다음 그림으로 넘어가게함
            repaint(); // 안쓰여도됨
         } 
      }); 
      eat_btn.setBounds(40, 295, 200, 217); //위치조정
      eat_btn.setBackground(Color.white);
      getContentPane().add(eat_btn);
      
      
      
      //비회원주문 버튼
      JButton takeOut_btn = new JButton(); 
      ImageIcon takeout = new ImageIcon("image/takeout4.png");
        takeOut_btn.setIcon(takeout);
        takeOut_btn.setContentAreaFilled(false);
        takeOut_btn.setBorderPainted(false);
        takeOut_btn.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent arg0) { 
            new FoodKind();
            revalidate(); // 누르면 다음 그림으로 넘어가게함
            repaint(); // 안쓰여도됨
         } 
      }); 
        takeOut_btn.setBounds(255, 295, 200, 205);
        
      getContentPane().add(takeOut_btn);
      
      
      
      
      
      getContentPane().setBackground(new Color(217,229,255));
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }


   
}