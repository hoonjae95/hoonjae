package com.kh.project.mini.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChinaMenu extends JPanel{
	public ChinaMenu() {
		setLayout(null);
		setSize(1300,800);
		setBackground(new Color(228,247,186));
		

		JPanel foodPanel = new JPanel(); // 공통패널
      foodPanel.setBounds(12, 172, 713, 560);
      foodPanel.setLayout(null);
      foodPanel.setBackground(new Color(228,247,186));
	
	
	
	
     
	
      String c_menu[] = { "짜장면", "짜장면", "짜장면", "짜장면", "짜장면", "짜장면"};
      JButton menu_btn[] = new JButton[c_menu.length];
      int price[] = { 5000, 5500, 6000, 6500, 7000, 7500};
      
    TextField amount[] = new TextField[c_menu.length];
   Button minus[] = new Button[c_menu.length];
    Button plus[] = new Button[c_menu.length];
    JButton ok[] = new JButton[c_menu.length];
    Label l[] = new Label[c_menu.length];
    
    ImageIcon icon[] = new ImageIcon[c_menu.length];
    for (int i = 0; i < c_menu.length; i++) {
        
        
        menu_btn[i] = new JButton(c_menu[i]);
        if (i < 3) {
            menu_btn[i].setBounds(20 + (i * 224), 10, 202, 187);
        } else {
            menu_btn[i].setBounds(20 + ((i-3) * 224), 285, 202, 187);
        }
//        icon[i] = new ImageIcon("image/" + i + ".png");
//        bt[i].setIcon(icon[i]);
        

  

//         수량 부분
        amount[i] = new TextField("0");
        amount[i].setBackground(Color.white);
        amount[i].setEditable(false);
//        amount[i].
        amount[i].setBounds(menu_btn[i].getX() + 80, menu_btn[i].getY() + 220 , 40, 20);
        
        
        // "-" 버튼
        minus[i] = new Button("-");
        minus[i].setBounds(menu_btn[i].getX() + 56, menu_btn[i].getY()+220, 20, 20);
        minus[i].setEnabled(false);


        
        // "+" 버튼
        plus[i] = new Button("+");
        plus[i].setBounds(menu_btn[i].getX() + 125, menu_btn[i].getY()+220, 20, 20);
        plus[i].setEnabled(false);

        // 가격
        l[i] = new Label(price[i] + "원");
        l[i].setBounds(menu_btn[i].getX() + 75, menu_btn[i].getY()+194 , 50, 20);
        l[i].setBackground(Color.lightGray);

        // 확인 버튼
        ok[i] = new JButton("확인");
        ok[i].setBounds(menu_btn[i].getX() + 50, menu_btn[i].getY()+215 + 30, 100, 20);
        ok[i].setEnabled(false);
     
     
        
        
        foodPanel.add(amount[i]);  // 음식정보 패널에 수량(TextField) 추가
        foodPanel.add(minus[i]);  // 음식정보 패널에 마이너스(Button) 추가
        foodPanel.add(plus[i]);
        foodPanel.add(l[i]);
        foodPanel.add(ok[i]);
        foodPanel.add(menu_btn[i]);
    }
    
    
    Button order = new Button("주문");
    
    Button reset = new Button("초기화");
    
    Button close = new Button("닫기");
    
    

    order.setBounds(789,647,97,23);
    reset.setBounds(943,647,97,23);
    close.setBounds(1111,647,97,23);
    
    
    add(order);
    add(reset);
    add(close);
    
    // order 주문버튼
    order.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        	JTextArea ta = new JTextArea();
            JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
            for (int i = 0; i < c_menu.length; i++) {
                menu_btn[i].setEnabled(true);
                minus[i].setEnabled(false);
                plus[i].setEnabled(false);
                amount[i].setText("0");
                ta.setText("   상품명        단가        수량        합계\n\n");

            }
        }
    });

    // reset 초기화 버튼
    reset.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        	JTextArea ta = new JTextArea();
            for (int i = 0; i < c_menu.length; i++) {
                menu_btn[i].setEnabled(true);
                minus[i].setEnabled(false);
                plus[i].setEnabled(false);
                amount[i].setText("0");
                ta.setText("   상품명        단가        수량        합계\n\n");

            }
        }
    });
    
    
    
    
    
    add(foodPanel);
		
		setVisible(true);
		
		
	}

}
