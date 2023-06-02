package UniPackage;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Workload extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	
	public Workload() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 635, 501);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 619, 463);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
		lblNewLabel.setBounds(43, 11, 295, 137);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WORKLOAD DETAILS");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(309, 84, 267, 65);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2.setBounds(0, 142, 643, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				String b = textField_1.getText();
				String c = textField_2.getText();
				String d = textField_3.getText();
				String f = textField_4.getText();
				String g = textField_5.getText();
				String h = textField_6.getText();
				String i = textField_7.getText();
				String j = textField_8.getText();
				String k = textField_9.getText();
				String l = textField_10.getText();
				String m = textField_11.getText();
				
				
				try {
					File file = new File("F:\\OneDrive\\Documents\\PROGRAMING\\PROJECTGUI\\src\\UniPackage\\WorkLoadDetails.txt");
					
					 FileWriter fw = new FileWriter(file.getAbsoluteFile());
				     BufferedWriter bw = new BufferedWriter(fw);
				     bw.write(" "+a+" "+b+"  "+c+"  "+d+"  "+f+"  "+g+"  "+h+"  "+i+" "+j+" "+k+" "+l+" "+m);
				     bw.close();
				     JOptionPane.showMessageDialog(null, " Details Submitted");
				     dispose();
					
				}catch (Exception z) {
					JOptionPane.showMessageDialog(panel, z);
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnNewButton.setBounds(475, 412, 101, 29);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faculty obj = new Faculty ();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		btnBack.setBackground(new Color(0, 0, 128));
		btnBack.setBounds(10, 423, 91, 29);
		panel.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("Lecturer Name");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_3.setBounds(40, 177, 94, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Department");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_4.setBounds(43, 215, 91, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Intake & Semester ");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_5.setBounds(26, 256, 135, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Credit Hours");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_6.setBounds(53, 294, 91, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Subject Name");
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_7.setBounds(43, 329, 91, 22);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Program Code");
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_8.setBounds(309, 215, 120, 20);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Subject Code");
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_9.setBounds(43, 362, 101, 24);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Total Labs");
		lblNewLabel_10.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_10.setBounds(320, 367, 80, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("No. of Students");
		lblNewLabel_11.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_11.setBounds(311, 294, 118, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("Total Lectures");
		lblNewLabel_13.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_13.setBounds(320, 333, 109, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("Research Supervision");
		lblNewLabel_15.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_15.setBounds(293, 250, 133, 27);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Total Classes");
		lblNewLabel_16.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_16.setBounds(312, 177, 91, 14);
		panel.add(lblNewLabel_16);
		
		textField = new JTextField();
		textField.setBounds(156, 176, 127, 15);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(413, 176, 91, 15);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(413, 217, 101, 15);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(142, 217, 127, 15);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(156, 255, 127, 15);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(439, 255, 127, 15);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(181, 295, 68, 15);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(426, 293, 80, 15);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(426, 332, 80, 15);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(408, 366, 127, 15);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(154, 366, 127, 15);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(156, 332, 127, 15);
		panel.add(textField_11);
	}
	public static void main(String[]args) {
	Workload obj= new Workload();
	obj.setVisible(true);
	}
	
}
