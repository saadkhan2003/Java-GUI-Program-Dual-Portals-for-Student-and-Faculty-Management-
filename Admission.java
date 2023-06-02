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

public class Admission extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	
	public Admission() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 809, 507);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 793, 468);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO UNIVERSITY");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblNewLabel.setBounds(335, 11, 448, 111);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
		lblNewLabel_1.setBounds(10, 11, 289, 137);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADMISSION FORM");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(370, 88, 239, 54);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_3.setBounds(0, 145, 793, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 166, 70, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Father Name");
		lblNewLabel_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 210, 108, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone");
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_6.setBounds(20, 394, 82, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email");
		lblNewLabel_7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_7.setBounds(20, 254, 70, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CNIC");
		lblNewLabel_8.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_8.setBounds(20, 300, 70, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Matric Marks");
		lblNewLabel_10.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_10.setBounds(249, 347, 101, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Test Marks");
		lblNewLabel_11.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_11.setBounds(249, 300, 82, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Gender");
		lblNewLabel_12.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_12.setBounds(249, 254, 70, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("FSc Marks");
		lblNewLabel_13.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_13.setBounds(249, 394, 70, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("3rd Program");
		lblNewLabel_14.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_14.setBounds(514, 249, 95, 25);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("2nd Program");
		lblNewLabel_15.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_15.setBounds(514, 204, 95, 26);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("1st Program");
		lblNewLabel_16.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_16.setBounds(514, 166, 95, 21);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Programs");
		lblNewLabel_17.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_17.setBounds(20, 344, 70, 20);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("College");
		lblNewLabel_18.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_18.setBounds(249, 205, 70, 25);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("School");
		lblNewLabel_19.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_19.setBounds(249, 170, 70, 14);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Address");
		lblNewLabel_20.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		lblNewLabel_20.setBounds(514, 300, 70, 14);
		panel.add(lblNewLabel_20);
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
				String j = textField_9.getText();
				String k = textField_10.getText();
				String l = textField_11.getText();				
				try {
					File file = new File("F:\\OneDrive\\Documents\\PROGRAMING\\PROJECTGUI\\src\\UniPackage\\AdmisionFom.txt");
					
					 FileWriter fw = new FileWriter(file.getAbsoluteFile());
				     BufferedWriter bw = new BufferedWriter(fw);
				     bw.write("  97"+a+"  "+b+"  "+c+"  "+d+"  "+f+"  "+g+"  "+h+"   "+i+" "+j+"   "+k+"   "+l);
				     bw.close();
				     JOptionPane.showMessageDialog(null, "Details Submitted");
				     dispose();
					
				}catch (Exception z) {
					JOptionPane.showMessageDialog(panel, z);
					JOptionPane.showMessageDialog(null, "ERROR");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 19));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(567, 373, 114, 35);
		panel.add(btnNewButton);
		
		JComboBox combo = new JComboBox();
		combo.addItem("Select Field");
		combo.addItem("Computer Science");
		combo.addItem("Political Science");
		combo.addItem("English");
		combo.addItem("Pakistan Studies");
		combo.addItem("Geology");
		combo.addItem("Chemistry");
		combo.addItem("Physics");
		combo.addItem("BBA");
		combo.addItem("Urdu");
		combo.addItem("Islamiyat");
		combo.addItem("Hospitality & Tourism");
		combo.addItem("Agriculture");
		combo.addItem("Zoology");
		combo.addItem("Botany");
		combo.addItem("Mathematics");
		
		
		combo.setForeground(new Color(0, 0, 128));
		combo.setToolTipText("Computer Science\r\nPhysics\r\nMathematics\r\n");
		combo.setBounds(635, 170, 114, 22);
		panel.add(combo);
		
		JComboBox combos = new JComboBox();
		combos.addItem("Select Field");
		combos.addItem("Computer Science");
		combos.addItem("Political Science");
		combos.addItem("English");
		combos.addItem("Pakistan Studies");
		combos.addItem("Geology");
		combos.addItem("Chemistry");
		combos.addItem("Physics");
		combos.addItem("BBA");
		combos.addItem("Urdu");
		combos.addItem("Islamiyat");
		combos.addItem("Hospitality & Tourism");
		combos.addItem("Agriculture");
		combos.addItem("Zoology");
		combos.addItem("Botany");
		combos.addItem("Mathematics");
		combos.setBackground(new Color(255, 255, 255));
		combos.setForeground(new Color(0, 0, 128));
		combos.setBounds(635, 208, 114, 22);
		panel.add(combos);
		
		JComboBox combo2 = new JComboBox();
		combo2.addItem("Select Field");
		combo2.addItem("Computer Science");
		combo2.addItem("Political Science");
		combo2.addItem("English");
		combo2.addItem("Pakistan Studies");
		combo2.addItem("Geology");
		combo2.addItem("Chemistry");
		combo2.addItem("Physics");
		combo2.addItem("BBA");
		combo2.addItem("Urdu");
		combo2.addItem("Islamiyat");
		combo2.addItem("Hospitality & Tourism");
		combo2.addItem("Agriculture");
		combo2.addItem("Zoology");
		combo2.addItem("Botany");
		combo2.addItem("Mathematics");
		combo2.setBackground(new Color(255, 255, 255));
		combo2.setForeground(new Color(0, 0, 128));
		combo2.setBounds(635, 252, 114, 22);
		panel.add(combo2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(613, 297, 136, 54);
		panel.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(85, 165, 121, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 209, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 253, 111, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(100, 299, 124, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 346, 116, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(93, 393, 131, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(329, 165, 136, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(335, 209, 130, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(370, 299, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(358, 346, 98, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(358, 393, 95, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		
		comboBox_3.addItem("Select Gender");
		comboBox_3.addItem("Male");
		comboBox_3.addItem("Female");
		comboBox_3.setForeground(new Color(0, 0, 128));
		comboBox_3.setBackground(new Color(255, 255, 255));
		comboBox_3.setBounds(348, 252, 108, 22);
		panel.add(comboBox_3);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admission obj = new Admission();
				obj.setVisible(true);
				dispose();
				}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 19));
		btnReset.setBackground(new Color(0, 0, 128));
		btnReset.setBounds(567, 422, 114, 35);
		panel.add(btnReset);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student obj =new Student();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(10, 432, 89, 23);
		panel.add(btnNewButton_1);
	}
	public static void main (String []args) {
		Admission obj = new Admission();
		obj.setVisible(true);
	}
}







