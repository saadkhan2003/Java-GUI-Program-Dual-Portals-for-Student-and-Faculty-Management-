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

public class Programcode extends JFrame {

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

	
	public Programcode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 741, 463);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 726, 424);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
		lblNewLabel.setBounds(91, 11, 293, 134);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PROGRAM DETAILS");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(353, 88, 303, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2.setBounds(0, 141, 804, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Semester Numbers");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(20, 335, 141, 30);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Subject Numbers");
		lblNewLabel_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(309, 277, 120, 33);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Father Name");
		lblNewLabel_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(20, 222, 97, 30);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Student Name");
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(20, 176, 109, 30);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("cGPA");
		lblNewLabel_7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(534, 230, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Credit Hours");
		lblNewLabel_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(309, 340, 100, 21);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("GPA");
		lblNewLabel_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(534, 184, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Subject Marks (Total)");
		lblNewLabel_10.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(275, 222, 154, 30);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Obtained Marks");
		lblNewLabel_11.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(20, 283, 120, 21);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Student Reg No.");
		lblNewLabel_12.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(309, 176, 120, 30);
		panel.add(lblNewLabel_12);
		
		textField = new JTextField();
		textField.setBounds(144, 183, 117, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 230, 134, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 286, 97, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(175, 343, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(438, 184, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(438, 230, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(454, 286, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(423, 343, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(590, 184, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(590, 230, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
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
				
				
				try {
					File file = new File("F:\\OneDrive\\Documents\\PROGRAMING\\PROJECTGUI\\src\\UniPackage\\ProgramDetails.txt");
					
					 FileWriter fw = new FileWriter(file.getAbsoluteFile());
				     BufferedWriter bw = new BufferedWriter(fw);
				     bw.write(" "+a+" "+b+"  "+c+"  "+d+"  "+f+"  "+g+"  "+h+"  "+i+" "+j+" "+k);
				     bw.close();
				     JOptionPane.showMessageDialog(null, " Details Submitted");
				     dispose();
					
				}catch (Exception z) {
					JOptionPane.showMessageDialog(panel, z);
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(582, 360, 97, 33);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student obj=new Student();
				obj.setVisible(true);
				dispose();
					}
		});
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setBounds(20, 390, 89, 23);
		panel.add(btnNewButton_1);
	}
	public static void main (String []args) {
		Programcode obj = new Programcode();
		obj.setVisible(true);
		
	
		
	}
}
