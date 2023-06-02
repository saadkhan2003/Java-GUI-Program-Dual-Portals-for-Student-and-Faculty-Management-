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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ApplyForm extends JFrame {

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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;

	
	public ApplyForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 813, 558);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(1, 1, 795, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\Downloads\\qq-removebg-preview.png"));
		lblNewLabel.setBounds(23, 3, 177, 88);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Application Form");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblNewLabel_1.setBounds(301, 43, 204, 59);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("UNIVERSITY OF SWABI");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(229, 3, 331, 66);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2.setBounds(2, 93, 838, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(23, 118, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FATHER NAME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(23, 160, 95, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("( Must be filled by the Candidate )");
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_5.setBounds(525, 80, 221, 22);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("AGE");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(23, 201, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("C.N.I.C No.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(398, 201, 71, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Percentage");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(170, 400, 100, 22);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("GPA");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(330, 365, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Obtained");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(23, 326, 68, 22);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Mailing Address");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(131, 197, 112, 22);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("D.O.B");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setBounds(229, 118, 46, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Matric");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setBounds(55, 301, 46, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("WorkPLace Address");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_14.setBounds(23, 243, 155, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Inter");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_15.setBounds(213, 301, 46, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Destinction");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_16.setBounds(599, 201, 106, 14);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Contact No.");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_17.setBounds(313, 160, 75, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("University");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_18.setBounds(603, 324, 86, 23);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Total Marks");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_19.setBounds(23, 365, 95, 14);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_21 = new JLabel("P.hD");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_21.setBounds(659, 301, 46, 14);
		panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("CGPA");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_22.setBounds(330, 330, 46, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("University");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_23.setBounds(333, 402, 68, 18);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Grade");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_24.setBounds(180, 443, 46, 14);
		panel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("From");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_25.setBounds(330, 443, 46, 14);
		panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Obtained");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_26.setBounds(170, 326, 73, 22);
		panel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("To");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_27.setBounds(330, 468, 46, 14);
		panel.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("Destinction");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_28.setBounds(110, 487, 78, 14);
		panel.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("GPA");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_29.setBounds(482, 365, 46, 14);
		panel.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("CGPA");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_30.setBounds(485, 330, 46, 14);
		panel.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Current Position");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_31.setBounds(315, 243, 122, 14);
		panel.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("M.Phil.");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_32.setBounds(506, 301, 46, 14);
		panel.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Bachelor's");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_33.setBounds(354, 301, 75, 14);
		panel.add(lblNewLabel_33);
		
		JLabel lblNewLabel_8_1 = new JLabel("Percentage");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8_1.setBounds(23, 400, 78, 22);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_24_1 = new JLabel("Grade");
		lblNewLabel_24_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_24_1.setBounds(33, 443, 46, 14);
		panel.add(lblNewLabel_24_1);
		
		JLabel lblNewLabel_25_1 = new JLabel("From");
		lblNewLabel_25_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_25_1.setBounds(482, 443, 46, 14);
		panel.add(lblNewLabel_25_1);
		
		JLabel lblNewLabel_27_1 = new JLabel("To");
		lblNewLabel_27_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_27_1.setBounds(482, 468, 46, 14);
		panel.add(lblNewLabel_27_1);
		
		JLabel lblNewLabel_34 = new JLabel("EDUCATIONAL RECORD :");
		lblNewLabel_34.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_34.setBounds(274, 268, 195, 22);
		panel.add(lblNewLabel_34);
		
		JLabel lblNewLabel_17_1 = new JLabel("E-Mail");
		lblNewLabel_17_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_17_1.setBounds(536, 243, 46, 14);
		panel.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2_1.setBounds(0, 256, 838, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_19_1 = new JLabel("Total Marks");
		lblNewLabel_19_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_19_1.setBounds(170, 365, 95, 14);
		panel.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_23_1 = new JLabel("University");
		lblNewLabel_23_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_23_1.setBounds(482, 404, 68, 14);
		panel.add(lblNewLabel_23_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Under Progress");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(653, 357, 132, 41);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCompleted = new JRadioButton("Completed");
		rdbtnCompleted.setBackground(new Color(255, 255, 255));
		rdbtnCompleted.setBounds(653, 401, 132, 31);
		panel.add(rdbtnCompleted);
		
		textField = new JTextField();
		textField.setBounds(88, 331, 58, 14);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(250, 331, 58, 14);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(398, 331, 58, 14);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(541, 331, 52, 14);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(532, 365, 58, 14);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(398, 363, 58, 14);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(260, 365, 58, 14);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(110, 365, 52, 14);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(110, 402, 46, 14);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(262, 402, 58, 14);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(411, 402, 58, 14);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(560, 402, 58, 14);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(330, 418, 139, 14);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(482, 418, 136, 14);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(88, 441, 58, 14);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(229, 441, 58, 14);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(386, 441, 83, 14);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(538, 441, 80, 14);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(679, 326, 106, 14);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(524, 469, 94, 14);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(371, 468, 98, 14);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(198, 485, 110, 14);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(79, 118, 140, 14);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(274, 119, 86, 14);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(120, 158, 171, 14);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(398, 158, 107, 14);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(55, 202, 58, 14);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(243, 202, 145, 14);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(470, 201, 112, 14);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(170, 244, 135, 14);
		panel.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(426, 243, 102, 14);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(582, 243, 139, 14);
		panel.add(textField_31);
		
		JLabel lblNewLabel_17_1_1 = new JLabel("Position Applied for:");
		lblNewLabel_17_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel_17_1_1.setBounds(609, 113, 112, 14);
		panel.add(lblNewLabel_17_1_1);
		
		JLabel lblNewLabel_17_1_2 = new JLabel("Advertisement No.");
		lblNewLabel_17_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel_17_1_2.setBounds(621, 135, 100, 14);
		panel.add(lblNewLabel_17_1_2);
		
		JLabel lblNewLabel_17_1_3 = new JLabel("S.No. of the Post:");
		lblNewLabel_17_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel_17_1_3.setBounds(626, 157, 95, 14);
		panel.add(lblNewLabel_17_1_3);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(731, 116, 46, 14);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(731, 135, 46, 14);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(731, 158, 46, 14);
		panel.add(textField_34);
		
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
				String m = textField_12.getText();
				String n = textField_13.getText();
				String o = textField_14.getText();
				String p = textField_15.getText();
				String q = textField_16.getText();
				String r = textField_17.getText();
				String s = textField_18.getText();
				String t = textField_19.getText();
				String u = textField_20.getText();
				String v = textField_21.getText();
				String x = textField_22.getText();
				String y = textField_23.getText();
				String zz = textField_24.getText();
				String aa = textField_25.getText();
				String bb = textField_26.getText();
				String cc = textField_27.getText();
				String dd = textField_28.getText();
				String ee = textField_29.getText();
				String ff = textField_30.getText();
				String gg = textField_31.getText();
				String hh = textField_32.getText();
				String ii = textField_33.getText();
				String jj = textField_34.getText();
				String kk = textField_35.getText();
				
				try {
					File file = new File("F:\\OneDrive\\Documents\\PROGRAMING\\PROJECTGUI\\src\\UniPackage\\ApplyForm.txt");
					
					 FileWriter fw = new FileWriter(file.getAbsoluteFile());
				     BufferedWriter bw = new BufferedWriter(fw);
				     bw.write(" "+a+" "+b+"  "+c+"  "+d+"  "+f+"  "+g+"  "+h+"  "+i+" "+k+"  "+l+"   "+m+"  "+n+"  "+o+"  "+p+"  "+q+"  "+r+"  "+s+"  "+t+"  "+u+"  "+v+"  "+x+"   "+y+"  "+zz+"  "+aa+"  "+bb+"  "+cc+"  "+dd+"  "+ee+"  "+ff+"  "+gg+"  "+hh+"  "+ii+"  "+jj+"  "+kk);
				     bw.close();
				     JOptionPane.showMessageDialog(null, "Details Submitted");
				     dispose();
					
				}catch (Exception z) {
					JOptionPane.showMessageDialog(panel, z);
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(673, 468, 89, 29);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faculty obj = new Faculty();
				obj.setVisible(true);
				dispose();
				}
		});
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		btnBack.setBackground(new Color(0, 0, 128));
		btnBack.setBounds(12, 486, 89, 22);
		panel.add(btnBack);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(678, 201, 107, 14);
		panel.add(textField_35);
	}
	public static void main(String[]args) {
		ApplyForm obj = new ApplyForm();
		obj.setVisible(true);
	}
	
}
