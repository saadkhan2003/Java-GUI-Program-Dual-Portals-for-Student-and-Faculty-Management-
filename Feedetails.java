package UniPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Feedetails extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField_9;


	public Feedetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 451, 444);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 406);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 289, 136);
		lblNewLabel.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FEE FORM");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(272, 103, 117, 44);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2.setBounds(0, 150, 434, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bank Slip No.");
		lblNewLabel_3.setBounds(260, 169, 75, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setBounds(28, 175, 68, 23);
		lblNewLabel_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Account Name");
		lblNewLabel_5.setBounds(212, 230, 123, 23);
		lblNewLabel_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Program Code");
		lblNewLabel_6.setBounds(212, 267, 123, 23);
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Date :");
		lblNewLabel_7.setBounds(282, 187, 46, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Contact");
		lblNewLabel_8.setBounds(28, 219, 68, 14);
		lblNewLabel_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Batch");
		lblNewLabel_9.setBounds(36, 257, 46, 19);
		lblNewLabel_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Semester");
		lblNewLabel_10.setBounds(28, 301, 79, 14);
		lblNewLabel_10.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		panel.add(lblNewLabel_10);
		
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
					File file = new File("F:\\OneDrive\\Documents\\PROGRAMING\\PROJECTGUI\\src\\UniPackage\\FeeDetails.txt");
					
					 FileWriter fw = new FileWriter(file.getAbsoluteFile());
				     BufferedWriter bw = new BufferedWriter(fw);
				     bw.write("Bank Slip No. : "+a+" // Date : "+b+"  Name : "+c+" // PhoneNo. : "+d+" // Batch : "+f+" // Semester : "+g+" // Bank : "+h+" // Program Code : "+i+"// Amount : "+j+"// Purpose : "+k);
				     bw.close();
				     JOptionPane.showMessageDialog(null, "Fee Details Submitted");
				     dispose();
					
				}catch (Exception z) {
					JOptionPane.showMessageDialog(panel, z);
					JOptionPane.showMessageDialog(null, "ERROR");
				}
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		btnNewButton.setBounds(282, 354, 99, 30);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(345, 170, 79, 14);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(345, 188, 79, 14);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 219, 99, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(92, 259, 110, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(116, 301, 89, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(338, 230, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(338, 271, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student obj= new Student();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(7, 372, 89, 23);
		panel.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 175, 123, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_10_1 = new JLabel("Amount");
		lblNewLabel_10_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		lblNewLabel_10_1.setBounds(28, 338, 79, 14);
		panel.add(lblNewLabel_10_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(116, 338, 89, 20);
		panel.add(textField_8);
		
		JLabel lblNewLabel_10_2 = new JLabel("Purpose");
		lblNewLabel_10_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		lblNewLabel_10_2.setBounds(234, 301, 79, 23);
		panel.add(lblNewLabel_10_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(312, 305, 112, 20);
		panel.add(textField_9);
	}
	public static void manin (String[]args) {
		Feedetails obj = new Feedetails();
		obj.setVisible(true);
		
	}
}
