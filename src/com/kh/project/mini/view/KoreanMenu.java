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




public class KoreanMenu extends JPanel {
	
	int count = 0;
	String show = "";
	
	public KoreanMenu() {
		setLayout(null);
		setSize(1300,800);
		setBackground(new Color(228,247,186));
		
		
		
			JPanel foodPanel = new JPanel(); // �����г�
	      foodPanel.setBounds(12, 172, 713, 560);
	      foodPanel.setLayout(null);
	      foodPanel.setBackground(new Color(228,247,186));
		
		
		
		
		
	      String k_menu[] = { "�����", "��������", "�η�ġ��", "���ܺ����", "��Ǭ�����", "��ġ������"};
	      JButton menu_btn[] = new JButton[k_menu.length];
	      int price[] = { 5000, 5500, 6000, 6500, 7000, 7500};
	      
        TextField amount[] = new TextField[k_menu.length];
       Button minus[] = new Button[k_menu.length];
        Button plus[] = new Button[k_menu.length];
        JButton ok[] = new JButton[k_menu.length];
        Label l[] = new Label[k_menu.length];
        
        ImageIcon icon[] = new ImageIcon[k_menu.length];
        for (int i = 0; i < k_menu.length; i++) {
            
            
            menu_btn[i] = new JButton(k_menu[i]);
            if (i < 3) {
                menu_btn[i].setBounds(20 + (i * 224), 10, 202, 187);
            } else {
                menu_btn[i].setBounds(20 + ((i-3) * 224), 285, 202, 187);
            }
//            icon[i] = new ImageIcon("image/" + i + ".png");
//            bt[i].setIcon(icon[i]);
            

      

//             ���� �κ�
            amount[i] = new TextField("0");
            amount[i].setBackground(Color.white);
            amount[i].setEditable(false);
//            amount[i].
            amount[i].setBounds(menu_btn[i].getX() + 80, menu_btn[i].getY() + 220 , 40, 20);
            
            
            // "-" ��ư
            minus[i] = new Button("-");
            minus[i].setBounds(menu_btn[i].getX() + 56, menu_btn[i].getY()+220, 20, 20);
            minus[i].setEnabled(false);
 

            
            // "+" ��ư
            plus[i] = new Button("+");
            plus[i].setBounds(menu_btn[i].getX() + 125, menu_btn[i].getY()+220, 20, 20);
            plus[i].setEnabled(false);
 
            // ����
            l[i] = new Label(price[i] + "��");
            l[i].setBounds(menu_btn[i].getX() + 75, menu_btn[i].getY()+194 , 50, 20);
            l[i].setBackground(Color.lightGray);
 
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
        }
        add(foodPanel);
        
        
//		JTextArea textArea = new JTextArea();
//		textArea.setBackground(new Color(245,242,237));
//		textArea.setBounds(811, 180, 439, 450);
//		add(textArea);
		
		
		
        for (int i = 0; i < k_menu.length; i++) {
            int j = i;
 
            // �ܹ��� ��ư �̺�Ʈ
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
 
                @Override
                public void actionPerformed(ActionEvent e) { 
                    show = menu_btn[j].getActionCommand();
                    JTextArea textArea = new JTextArea();
                    textArea.append("   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                            + "��" + "\n");
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
        
//        // order �ֹ���ư
//        order.addActionListener(new ActionListener() {
// 
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, ta.getText() + " �ֹ��Ǿ����ϴ�. \n�̿����ּż� �����մϴ�.");
//                for (int i = 0; i < k_menu.length; i++) {
//                    menu_btn[i].setEnabled(true);
//                    minus[i].setEnabled(false);
//                    plus[i].setEnabled(false);
//                    amount[i].setText("0");
//                    ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
// 
//                }
//            }
//        });
// 
//        // reset �ʱ�ȭ ��ư
//        reset.addActionListener(new ActionListener() {
// 
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                for (int i = 0; i < k_menu.length; i++) {
//                    menu_btn[i].setEnabled(true);
//                    minus[i].setEnabled(false);
//                    plus[i].setEnabled(false);
//                    amount[i].setText("0");
//                    ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
// 
//                }
//            }
//        });
// 
// 
        //close �ݱ��ư
        
//        close.addActionListener(new ActionListener() {
//            
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               remove(FoodKind);
//            }
//        });
//        
        
        
        
        

		
		
		setVisible(true);
		
		}

	
}
		
		