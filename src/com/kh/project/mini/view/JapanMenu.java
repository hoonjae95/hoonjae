package com.kh.project.mini.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JapanMenu extends JPanel{
	int count = 0;
	String show = "";
	
	
	public JapanMenu() {
		
		setLayout(null);
		setSize(1300,800);
		setBackground(new Color(228,247,186));
		
		
		

		JPanel foodPanel = new JPanel(); // 공통패널
      foodPanel.setBounds(12, 172, 713, 560);
      foodPanel.setLayout(null);
      foodPanel.setBackground(new Color(228,247,186));
      
      
		// 탭 누르면 주문 현황
		ImageIcon orderlist = new ImageIcon("image/orderlist.png");
		JLabel lb_orderlist = new JLabel(orderlist);
		lb_orderlist.setBounds(860,10,350,174);
		add(lb_orderlist);
	


	
	
	
      String j_menu[] = { "나가사키짬뽕", "   라   멘", "   초   밥 ", "   우   동", "타코야끼", "   모   름"};
      JButton menu_btn[] = new JButton[j_menu.length];
      int price[] = { 7000, 7000, 10000, 5000, 5000, 7000};
      
    TextField amount[] = new TextField[j_menu.length];
   Button minus[] = new Button[j_menu.length];
    Button plus[] = new Button[j_menu.length];
    JButton ok[] = new JButton[j_menu.length];
    Label l[] = new Label[j_menu.length];
    Label foodname[] = new Label[j_menu.length];
    
    ImageIcon icon[] = new ImageIcon[j_menu.length];
    for (int i = 0; i < j_menu.length; i++) {
        
        
        menu_btn[i] = new JButton(j_menu[i]);
        if (i < 3) {
            menu_btn[i].setBounds(20 + (i * 224), 10, 190, 187);
        } else {
            menu_btn[i].setBounds(20 + ((i-3) * 224), 285, 190, 187);
        }
        icon[i] = new ImageIcon("foodpicture/j_" + i + ".png");
        menu_btn[i].setIcon(icon[i]);
        

  

        //수량 부분
        amount[i] = new TextField("0");
        amount[i].setBackground(Color.white);
        amount[i].setEditable(false);
        amount[i].setBounds(menu_btn[i].getX() + 80, menu_btn[i].getY() + 220 , 40, 20);
        
        
        // "-" 버튼
        minus[i] = new Button("-");
        minus[i].setBounds(menu_btn[i].getX() + 56, menu_btn[i].getY()+220, 20, 20);
        minus[i].setEnabled(false);


        
        // "+" 버튼
        plus[i] = new Button("+");
        plus[i].setBounds(menu_btn[i].getX() + 125, menu_btn[i].getY()+220, 20, 20);
        plus[i].setEnabled(false);

        //'이름'라벨
        foodname[i] = new Label(j_menu[i] + "");
        foodname[i].setBounds(menu_btn[i].getX() + 0, menu_btn[i].getY()+190 , 120, 25);
        foodname[i].setBackground(Color.lightGray);
        foodname[i].setFont(new Font("Aharoni 굵게", Font.BOLD, 18));
        
        
        // 가격
        l[i] = new Label(price[i] + "원");
        l[i].setBounds(menu_btn[i].getX() + 120, menu_btn[i].getY()+190 , 70, 25);
        l[i].setBackground(Color.lightGray);
        l[i].setFont(new Font("Aharoni 굵게", Font.BOLD, 18));

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
        foodPanel.add(foodname[i]);
    }
    
    add(foodPanel);
    
    
    
    
    
    Result rs=new Result().getInstance();
    JTextArea ta=rs.getTa();
	add(ta);
	
	System.out.println("JapanMenu 생성");
	
	 for (int i = 0; i < j_menu.length; i++) {
         int j = i;

         // 
         menu_btn[i].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 minus[j].setEnabled(true);
                 plus[j].setEnabled(true);
                 menu_btn[j].setEnabled(false);
                 ok[j].setEnabled(true);

                 count = 0;
             }
         });

         // "-" 버튼 이벤트
         minus[i].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 if (count > 0) {
                     count = count - 1;
                     amount[j].setText(count + "");
                     ok[j].setEnabled(true);
                 } else {
                     minus[j].setEnabled(false);
                 }
             }
         });
         
         // "+" 버튼 이벤트
         plus[i].addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 count = count + 1;
                 amount[j].setText(count + "");
                 ok[j].setEnabled(true);
                 if (count > 0) {
                     minus[j].setEnabled(true);
                 }
             }
         });
         
         //확인 버튼 이벤트
         ok[i].addActionListener(new ActionListener() {
//         	JTextArea ta = new Result().getTa();
             @Override
             public void actionPerformed(ActionEvent e) { 
                 show = menu_btn[j].getActionCommand();
                 
                 ta.setText(rs.getTa().getText()+"   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                         + "원" + "\n");
              rs.setTa(ta);
             
                 ok[j].setEnabled(false);
             }
         });
         

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
//        	JTextArea ta = new Result().getTa();
            JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
            for (int i = 0; i < j_menu.length; i++) {
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
//        	JTextArea ta = new Result().getTa();
            for (int i = 0; i < j_menu.length; i++) {
                menu_btn[i].setEnabled(true);
                minus[i].setEnabled(false);
                plus[i].setEnabled(false);
                amount[i].setText("0");
                ta.setText("   상품명        단가        수량        합계\n\n");
            }
        }
    });
    
    

    
    

    
    
    
    
    
    
//    setVisible(true);
    
		
		}
}
		