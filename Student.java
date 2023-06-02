package UniPackage;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Student extends JFrame {

	private JPanel contentPane;
 	
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 720, 440);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 703, 401);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel.setBounds(0, 148, 703, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    WELCOME TO UNIVERSITY");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBackground(new Color(0, 0, 153));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(313, 11, 390, 76);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
		lblNewLabel_2.setBounds(20, 11, 283, 136);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("STUDENT PORTAL");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(375, 70, 239, 67);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("PROGRAM DETAILS");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Programcode obj = new Programcode();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 22));
		btnNewButton.setBounds(379, 187, 251, 53);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXAM SYSTEM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExamSys obj = new ExamSys();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 22));
		btnNewButton_1.setBounds(397, 286, 218, 55);
		btnNewButton_1.setFocusPainted(false);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FEE MANAGEMENT");
		btnNewButton_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Feedetails obj= new Feedetails();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 22));
		btnNewButton_2.setBounds(47, 287, 258, 54);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ADMISSION FORM");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBackground(new Color(0, 0, 128));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admission obj =  new  Admission();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 22));
		btnNewButton_3.setBounds(44, 187, 261, 53);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LOGOUT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Log obj = new Log();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setForeground(new Color(0, 0, 128));
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(591, 367, 83, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGui obj = new MainGui();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setForeground(new Color(0, 0, 128));
		btnNewButton_5.setBounds(20, 367, 89, 23);
		panel.add(btnNewButton_5);
	}
	public static void main(String[]args) {
	Student obj= new Student();
	obj.setVisible(true);
	}
}
