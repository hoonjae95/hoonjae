package com.kh.project.mini.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Result extends JPanel{
	public JTextArea ta;
	public Result() {
		setLayout(null);
		setSize(1300,800);
		setBackground(new Color(150,150,150));
		
		
		
		
		
		JTextArea ta = new JTextArea();
		ta = new JTextArea();
		ta.setBackground(new Color(245,242,237));
		ta.setBounds(811, 180, 439, 450);
		ta.setText("   상품명        단가        수량        합계33\n\n");
		ta.getText();
		ta.setEditable(false);
		
		add(ta);
		
	}
	
	public JTextArea getTa() {
		return ta;
	}

}
