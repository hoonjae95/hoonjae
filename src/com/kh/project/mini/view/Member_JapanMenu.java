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

public class Member_JapanMenu extends JPanel{
	int count = 0;
	String show = "";
	
	
	public Member_JapanMenu() {
		
		setLayout(null);
		setSize(1300,800);
		setBackground(new Color(228,247,186));
		

		JPanel foodPanel = new JPanel(); // �����г�
      foodPanel.setBounds(12, 172, 713, 560);
      foodPanel.setLayout(null);
      foodPanel.setBackground(new Color(228,247,186));
      
      
		// �� ������ �ֹ� ��Ȳ
		ImageIcon orderlist = new ImageIcon("image/orderlist.png");
		JLabel lb_orderlist = new JLabel(orderlist);
		lb_orderlist.setBounds(860,10,350,174);
		add(lb_orderlist);
	


	
	
	
      String j_menu[] = { "������Ű«��", "   ��   ��", "   ��   �� ", "   ��   ��", "Ÿ�ھ߳�", "   ��   ��"};
      JButton menu_btn[] = new JButton[j_menu.length];
      int price[] = { 6000, 6000, 9000, 4000, 4000, 6000};
      
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
        

  

        //���� �κ�
        amount[i] = new TextField("0");
        amount[i].setBackground(Color.white);
        amount[i].setEditable(false);
        amount[i].setBounds(menu_btn[i].getX() + 80, menu_btn[i].getY() + 220 , 40, 20);
        
        
        // "-" ��ư
        minus[i] = new Button("-");
        minus[i].setBounds(menu_btn[i].getX() + 56, menu_btn[i].getY()+220, 20, 20);
        minus[i].setEnabled(false);


        
        // "+" ��ư
        plus[i] = new Button("+");
        plus[i].setBounds(menu_btn[i].getX() + 125, menu_btn[i].getY()+220, 20, 20);
        plus[i].setEnabled(false);

        //'�̸�'��
        foodname[i] = new Label(j_menu[i] + "");
        foodname[i].setBounds(menu_btn[i].getX() + 0, menu_btn[i].getY()+190 , 120, 25);
        foodname[i].setBackground(Color.lightGray);
        foodname[i].setFont(new Font("Aharoni ����", Font.BOLD, 18));
        
        
        // ����
        l[i] = new Label(price[i] + "��");
        l[i].setBounds(menu_btn[i].getX() + 120, menu_btn[i].getY()+190 , 70, 25);
        l[i].setBackground(Color.lightGray);
        l[i].setFont(new Font("Aharoni ����", Font.BOLD, 18));

        // Ȯ�� ��ư
        ok[i] = new JButton("Ȯ��");
        ok[i].setBounds(menu_btn[i].getX() + 50, menu_btn[i].getY()+215 + 30, 100, 20);
        ok[i].setEnabled(false);
     
        
        
        foodPanel.add(amount[i]);  // �������� �гο� ����(TextField) �߰�
        foodPanel.add(minus[i]);  // �������� �гο� ���̳ʽ�(Button) �߰�
        foodPanel.add(plus[i]);
        foodPanel.add(l[i]);
        foodPanel.add(ok[i]);
        foodPanel.add(menu_btn[i]);
        foodPanel.add(foodname[i]);
    }
    
    add(foodPanel);
    
    
    
//	JTextArea ta = new JTextArea();
//	ta.setBackground(new Color(245,242,237));
//	ta.setBounds(811, 180, 439, 450);
//	ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
//	ta.setEditable(false);
//	ta.getSelectedText();
    Result rs=new Result().getInstance();
    JTextArea ta=rs.getTa();
	add(ta);
	
	System.out.println("JapanMenu ����");
	
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

         // "-" ��ư �̺�Ʈ
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
         
         // "+" ��ư �̺�Ʈ
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
         
         //Ȯ�� ��ư �̺�Ʈ
         ok[i].addActionListener(new ActionListener() {
//         	JTextArea ta = new Result().getTa();
             @Override
             public void actionPerformed(ActionEvent e) { 
                 show = menu_btn[j].getActionCommand();
                 ta.setText(rs.getTa().getText()+"   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                         + "��" + "\n");
              rs.setTa(ta);
             
                 ok[j].setEnabled(false);
             }
         });
         

     }
    
    
    Button order = new Button("�ֹ�");
    Button reset = new Button("�ʱ�ȭ");
    Button close = new Button("�ݱ�");
    
    

    order.setBounds(789,647,97,23);
    reset.setBounds(943,647,97,23);
    close.setBounds(1111,647,97,23);
    
    
    add(order);
    add(reset);
    add(close);
    
    // order �ֹ���ư
    order.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
//        	JTextArea ta = new Result().getTa();
            JOptionPane.showMessageDialog(null, ta.getText() + " �ֹ��Ǿ����ϴ�. \n�̿����ּż� �����մϴ�.");
            for (int i = 0; i < j_menu.length; i++) {
                menu_btn[i].setEnabled(true);
                minus[i].setEnabled(false);
                plus[i].setEnabled(false);
                amount[i].setText("0");
                ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
            }
        }
    });
    

    // reset �ʱ�ȭ ��ư
    reset.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
//        	JTextArea ta = new Result().getTa();
            for (int i = 0; i < j_menu.length; i++) {
                menu_btn[i].setEnabled(true);
                minus[i].setEnabled(false);
                plus[i].setEnabled(false);
                amount[i].setText("0");
                ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
            }
        }
    });
    
    
    
    
    
    
    setVisible(true);
    
		
		}
}
		