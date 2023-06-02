package UniPackage;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Faculty extends JFrame {

	private JPanel contentPane;

	
	public Faculty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 723, 357);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(1, 0, 705, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel.setBounds(2, 147, 703, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    WELCOME TO UNIVERSITY");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(313, 11, 390, 76);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
		lblNewLabel_2.setBounds(10, 11, 285, 137);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("FACULTY PORTAL");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(375, 70, 239, 67);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("WORKLOAD DETAILS");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Workload obj = new Workload();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 22));
		btnNewButton.setBounds(406, 198, 272, 59);
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("APPLICATION FORM");
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplyForm obj = new ApplyForm();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 0, 128));
		btnNewButton_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 22));
		btnNewButton_3.setBounds(38, 198, 257, 62);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LOGOUT");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setForeground(new Color(0, 0, 128));
		btnNewButton_4.setBackground(Color.ORANGE);
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Log obj = new Log();
				obj.setVisible(true);
				dispose();
				}
		});
		btnNewButton_4.setBounds(596, 282, 85, 23);
		btnNewButton_4.setFocusPainted(false);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Back");
		btnNewButton_4_1.setFocusPainted(false);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGui obj = new MainGui();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4_1.setForeground(new Color(0, 0, 128));
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_1.setBackground(Color.ORANGE);
		btnNewButton_4_1.setBounds(10, 283, 85, 23);
		panel.add(btnNewButton_4_1);
	}
	public static void main (String []args) {
		Faculty obj = new Faculty();
		obj.setVisible(true);
		
	
		
	}
}