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
      getContentPane().setLayout(null);
      JPanel panel = new JPanel(); // �г� ��ü����
      setLocationRelativeTo(null); //���������� �����ġ
      
      

      //ù��° ���������� Ÿ��Ʋ �ΰ�
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
            revalidate(); // ������ ���� �׸����� �Ѿ����
            repaint(); // �Ⱦ�������
         } 
      }); 
      eat_btn.setBounds(40, 295, 200, 217); //��ġ����
      eat_btn.setBackground(Color.white);
      getContentPane().add(eat_btn);
      
      
      
      //��ȸ���ֹ� ��ư
      JButton takeOut_btn = new JButton(); 
      ImageIcon takeout = new ImageIcon("image/takeout4.png");
        takeOut_btn.setIcon(takeout);
        takeOut_btn.setContentAreaFilled(false);
        takeOut_btn.setBorderPainted(false);
        takeOut_btn.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent arg0) { 
            new FoodKind();
            revalidate(); // ������ ���� �׸����� �Ѿ����
            repaint(); // �Ⱦ�������
         } 
      }); 
        takeOut_btn.setBounds(255, 295, 200, 205);
        
      getContentPane().add(takeOut_btn);
      
      
      
      
      
      getContentPane().setBackground(new Color(217,229,255));
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }


   
}