package com.kh.project.mini.view;





import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
   JFrame main = new JFrame("KH FoodCourt �α��� / ȸ������");
   
   
   //join ��ҵ�
   JPanel joinPanel = new JPanel();
   JLabel l1, l2, l3, l4;
   JPasswordField t3;
   JTextField t1, t2, t4;
   String newId = "";
   String newPw = "";
   
   public Login() {

      
      main.setLayout(null);
      main.setSize(450,200);

      
      
      JLabel idLabel = new JLabel("ID");
      idLabel.setBounds(107, 29, 21, 15);
      idLabel.setFont(new Font("Serif", Font.BOLD, 11));
      
      
      JTextField id = new JTextField(0);
      id.setBounds(156, 26, 129, 21);
      id.setColumns(10);

      JLabel passLabel = new JLabel("PS");
      passLabel.setBounds(107, 60, 21, 15);
      passLabel.setFont(new Font("Serif", Font.BOLD, 11));
      
      JPasswordField pass = new JPasswordField(0);
      pass.setColumns(10);
      pass.setBounds(156, 57, 129, 21);
     
      
      
     //����
      
      
      JButton btn1 = new JButton("�α���");
      btn1.setBounds(317, 25, 83, 53);
     
      
      JButton btn2 = new JButton("ȸ������");
      btn2.setBounds(95, 110, 97, 23);
    
      JButton btn3 = new JButton("���");
      btn3.setBounds(219, 110, 97, 23);
      
      main.add(btn3);
      main.add(btn2);
     main.add(btn1);
      main.add(id);
      main.add(pass);
      main.add(idLabel);
      main.add(id);
      main.add(passLabel);
      
      btn3.addActionListener(new ActionListener() {
      
         @Override
         public void actionPerformed(ActionEvent e) {
            main.dispose();
            
         }
   });
      
      
      
      
      main.setVisible(true);
      main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      main.setLocationRelativeTo(null);
      
      
      //�α��� �׼�
      btn1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String idd = id.getText().trim();
            String pww = pass.getText().trim();
            
            if(idd.length() == 0 || pww.length() == 0) {
               JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �Է��ϼž� �մϴ�.", "���̵� ����� �Է�!", JOptionPane.WARNING_MESSAGE);
               return;
            }            
            if(idd.equals("user01") && pww.equals("pass01")) {
               JOptionPane.showMessageDialog(null, "user01�� ȯ���մϴ�!", "2", JOptionPane.DEFAULT_OPTION);
               new Member_FoodKind();  
               main.dispose();
               
               return;
            }           
            if(id.getText().equals(newId) && pass.getText().equals(newPw)) {
               JOptionPane.showMessageDialog(null, t2.getText()+"�� ȯ���մϴ�!", "2", JOptionPane.DEFAULT_OPTION);
               new Member_FoodKind();  
               main.dispose();
               return;
            }
            
            JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� �ٽ� �Է��� �ּ���.", "2", JOptionPane.DEFAULT_OPTION);
            id.setText("");
            pass.setText("");
         }
      });    
      
      //ȸ������ �׼�
      btn2.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         new JoinFrame();
         return;
      }        
      });
            
//      main.add(titleLabel,BorderLayout.NORTH);
//      main.add(login,BorderLayout.CENTER);
//      main.add(button,BorderLayout.SOUTH);
      
       
   }
   
   class JoinFrame extends JFrame {   
      public JoinFrame() {
   
         l1 = new JLabel("�̸�");
         l2 = new JLabel("���̵�");
         l3 = new JLabel("�н�����");
         l4 = new JLabel("�ּ�");
         add(l1);
         add(l2);
         add(l3);
         add(l4);
         
         t1 = new JTextField();
         t2 = new JTextField();
         t3 = new JPasswordField();
         t4 = new JTextField();
         add(t1);
         add(t2);
         add(t3);
         add(t4);
         
         JButton btn1 = new JButton("����");
         JButton btn2 = new JButton("���");
         add(btn1);
         add(btn2);

         l1.setBounds(40, 10, 40, 40);
         l2.setBounds(40, 50, 40, 40);
         l3.setBounds(40, 90, 60, 40);
         l4.setBounds(40, 130, 40, 40);
         
         t1.setBounds(120, 10, 200, 30);
         t2.setBounds(120, 50, 200, 30);
         t3.setBounds(120, 90, 200, 30);
         t4.setBounds(120, 130, 280, 30);
         
         btn1.setBounds(125, 200, 80, 30);
         btn2.setBounds(240, 200, 80, 30);
         
         add(joinPanel);
         
         btn1.addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                    String newName = t1.getText().trim();
                    newId = t2.getText().trim();
                    newPw = t3.getText().trim();
                    String newAddr = t4.getText().trim();
                     
                     try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter("ȸ�����.txt",true));
                        bw.write(t1.getText() + "/");
                        bw.write(t2.getText() + "/");
                        String showPwd = "";
                        char[] pwdArr = t3.getPassword();
                        for(int i = 0; i <pwdArr.length; i++) {
                           showPwd += pwdArr[i] + "";
                        }
                        bw.write(showPwd);
                        bw.write("/" +t4.getText() + "\r\n");
                        bw.close();
                        dispose();
                        
                        if(newId.length() == 0 || newPw.length() == 0 || newName.length() == 0 || newAddr.length() == 0) {
                           JOptionPane.showMessageDialog(null, "�Է� ���� ���� �׸��� �ֽ��ϴ�.", "", JOptionPane.WARNING_MESSAGE);
                           return;
                        }
                        
                        if(newId.length() != 0 && newPw.length() != 0 && newName.length() != 0 && newAddr.length() != 0) {
                           JOptionPane.showMessageDialog(null, "ȸ�������� ���ϵ帳�ϴ�!", "MovieFlex", JOptionPane.DEFAULT_OPTION);
                           t2.setText(newId);
                           t3.setText(newPw);
                           setVisible(false);
                           return;
                        }
               } catch (IOException e1) {
                  
                  }
                }         
            });
         
         btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//               t1.setText("");
//               t2.setText("");
//               t3.setText("");
//               t4.setText("");
            	dispose();
            }
            
         });
               
         setTitle("ȸ������");
         setSize(500, 300);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
   }
}