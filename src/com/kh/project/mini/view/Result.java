package com.kh.project.mini.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Result extends JPanel {
	public static JTextArea ta;

	private static Result instance;

	public static Result getInstance() {
		if (instance == null) {
			instance = new Result();
		} else {
			System.out.println("�̹� ��ü�� �����մϴ�.");
		}
		return instance;
	}

	public Result() {
		setLayout(null);
		setSize(1300, 800);
		setBackground(new Color(150, 150, 150));

		ta = new JTextArea();
		ta.setBackground(new Color(245, 242, 237));
		ta.setBounds(811, 180, 439, 450);
		ta.setText("   ��ǰ��        �ܰ�        ����        �հ�               ��������\n\n");
		ta.setEditable(false);


		setVisible(true);

	}

	public JTextArea getTa() {
		return ta;
	}

	public static void setTa(JTextArea ta) {
		Result.ta = ta;
	}

}
