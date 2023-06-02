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

public class ExamSys extends JFrame {

		private JPanel contentPane;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_10;
		private JTextField textField_11;
		private JTextField textField_4;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_12;
		private JTextField textField_13;
		private JTextField textField_3;
		private JTextField textField_2;

		
		public ExamSys () {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setBounds(100, 100, 648, 483);
			this.setLocationRelativeTo(null);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 632, 444);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 11, 289, 136);
			lblNewLabel.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("EXAM MANAGMENT SYSTEM");
			lblNewLabel_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_1.setBounds(259, 90, 363, 44);
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			lblNewLabel_2.setBounds(0, 158, 779, 14);
			panel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Reg No.");
			lblNewLabel_3.setBounds(487, 161, 46, 31);
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			panel.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Name");
			lblNewLabel_4.setBounds(28, 183, 68, 23);
			lblNewLabel_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			panel.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Discipline");
			lblNewLabel_5.setBounds(287, 183, 79, 23);
			lblNewLabel_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			panel.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("Subject Code");
			lblNewLabel_6.setBounds(281, 223, 110, 23);
			lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			panel.add(lblNewLabel_6);
			
			JLabel lblNewLabel_7 = new JLabel("Roll No.");
			lblNewLabel_7.setBounds(487, 193, 46, 14);
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
			panel.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel("Father Name");
			lblNewLabel_8.setBounds(28, 216, 102, 37);
			lblNewLabel_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			panel.add(lblNewLabel_8);
			
			JLabel lblNewLabel_9 = new JLabel("Batch");
			lblNewLabel_9.setBounds(50, 264, 46, 19);
			lblNewLabel_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			panel.add(lblNewLabel_9);
			
			JLabel lblNewLabel_10 = new JLabel("Semester");
			lblNewLabel_10.setBounds(38, 306, 79, 14);
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
					String o = textField_8.getText();
					String p = textField_9.getText();
					String q = textField_10.getText();

					String r = textField_11.getText();
					String s = textField_12.getText();

					
					
					
					try {
						File file = new File("F:\\OneDrive\\Documents\\PROGRAMING\\PROJECTGUI\\src\\UniPackage\\ExamDetails.txt");
						
						 FileWriter fw = new FileWriter(file.getAbsoluteFile());
					     BufferedWriter bw = new BufferedWriter(fw);
					     bw.write(" "+a+" "+b+"  "+c+"  "+d+"  "+f+"  "+g+"  "+h+"  "+i+" "+o+" "+p+" "+q+" "+r+" "+s);
					     bw.close();
					     JOptionPane.showMessageDialog(null, " Details Submitted");
					     dispose();
						
					}catch (Exception z) {
						JOptionPane.showMessageDialog(panel, z);
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				}
			});
			btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
			btnNewButton.setBounds(523, 317, 99, 30);
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(0, 0, 128));
			panel.add(btnNewButton);
			
			textField = new JTextField();
			textField.setBounds(543, 170, 79, 14);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(543, 194, 79, 14);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			textField_5 = new JTextField();
			textField_5.setBounds(137, 308, 102, 16);
			panel.add(textField_5);
			textField_5.setColumns(10);
			
			textField_6 = new JTextField();
			textField_6.setBounds(391, 183, 86, 20);
			panel.add(textField_6);
			textField_6.setColumns(10);
			
			textField_7 = new JTextField();
			textField_7.setBounds(391, 227, 86, 19);
			panel.add(textField_7);
			textField_7.setColumns(10);
			
			JButton btnNewButton_1 = new JButton("Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student obj  = new Student();
					obj.setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setBackground(new Color(0, 0, 128));
			btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
			btnNewButton_1.setBounds(7, 410, 89, 23);
			panel.add(btnNewButton_1);
			
			JLabel lblNewLabel_11 = new JLabel("( Only Filled by Candidate )");
			lblNewLabel_11.setForeground(new Color(0, 0, 128));
			lblNewLabel_11.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
			lblNewLabel_11.setBounds(249, 134, 143, 26);
			panel.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_1 = new JLabel("UNIVERSITY");
			lblNewLabel_1_1.setForeground(new Color(0, 0, 128));
			lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 45));
			lblNewLabel_1_1.setBounds(315, 35, 285, 44);
			panel.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_10_1 = new JLabel("MidTerm (Obt)");
			lblNewLabel_10_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			lblNewLabel_10_1.setBounds(260, 264, 130, 23);
			panel.add(lblNewLabel_10_1);
			
			JLabel lblNewLabel_10_2 = new JLabel("Assigments");
			lblNewLabel_10_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			lblNewLabel_10_2.setBounds(28, 341, 102, 23);
			panel.add(lblNewLabel_10_2);
			
			JLabel lblNewLabel_10_3 = new JLabel("Presentations");
			lblNewLabel_10_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			lblNewLabel_10_3.setBounds(28, 375, 124, 17);
			panel.add(lblNewLabel_10_3);
			
			JLabel lblNewLabel_10_1_1 = new JLabel("FinalTerm (Obt)");
			lblNewLabel_10_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			lblNewLabel_10_1_1.setBounds(255, 301, 130, 23);
			panel.add(lblNewLabel_10_1_1);
			
			JLabel lblNewLabel_10_1_2 = new JLabel("LAB");
			lblNewLabel_10_1_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			lblNewLabel_10_1_2.setBounds(305, 341, 58, 23);
			panel.add(lblNewLabel_10_1_2);
			
			JLabel lblNewLabel_10_1_3 = new JLabel("QUIZ");
			lblNewLabel_10_1_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
			lblNewLabel_10_1_3.setBounds(305, 372, 68, 23);
			panel.add(lblNewLabel_10_1_3);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(140, 376, 102, 16);
			panel.add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(137, 343, 102, 16);
			panel.add(textField_11);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(137, 266, 102, 16);
			panel.add(textField_4);
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(383, 347, 102, 16);
			panel.add(textField_8);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(383, 306, 102, 16);
			panel.add(textField_9);
			
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(383, 266, 102, 16);
			panel.add(textField_12);
			
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(383, 378, 102, 16);
			panel.add(textField_13);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(140, 227, 124, 16);
			panel.add(textField_3);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(95, 187, 169, 16);
			panel.add(textField_2);
			
			JButton btnClear = new JButton("CLEAR");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ExamSys obj = new ExamSys();
					obj.setVisible(true);
					dispose();
				}
			});
			btnClear.setForeground(Color.WHITE);
			btnClear.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
			btnClear.setBackground(new Color(0, 0, 128));
			btnClear.setBounds(523, 369, 99, 30);
			panel.add(btnClear);
		}
		public static void main(String[]args) {
			ExamSys obj = new ExamSys();
			obj.setVisible(true);
		}
	}

	


