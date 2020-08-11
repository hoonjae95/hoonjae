package com.kh.project.mini.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Result extends JPanel{
	public Result() {
		setLayout(null);
		setSize(1300,800);
		setBackground(new Color(150,150,150));
		
		
		
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(245,242,237));
		textArea.setBounds(811, 180, 439, 450);
		add(textArea);
	}

}
