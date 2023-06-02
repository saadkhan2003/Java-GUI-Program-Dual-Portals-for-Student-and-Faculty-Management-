package UniPackage;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;


public class Log extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 288);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 249);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(61, 123, 89, 14);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(61, 160, 89, 14);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(224, 122, 154, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(289, 215, 89, 23);
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				{   
			            if (textField.getText().equals("Saad") && passwordField.getText().equals("12345")) {
			                JOptionPane.showMessageDialog(null, "Login Successful");
			                MainGui obj = new MainGui();
			                obj.setVisible(true);
			                dispose();
			            } else {
			                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
			            }			
			}
		}
			
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(164, 215, 89, 23);
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\Downloads\\qq-removebg-preview.png"));
		lblNewLabel_2.setBounds(31, 11, 219, 90);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("-------------------------------------------------------------------------------------------------------------");
		lblNewLabel_3.setBounds(0, 95, 474, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LOGIN PORTAL");
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_4.setBounds(210, 39, 200, 45);
		panel.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(224, 159, 154, 20);
		panel.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == chckbxNewCheckBox ) {
			            if (chckbxNewCheckBox.isSelected()) {
			                passwordField.setEchoChar((char) 0);
			            } else {
			                passwordField.setEchoChar('*');
			            }


			        }
				
			}
		});
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(224, 186, 123, 14);
		panel.add(chckbxNewCheckBox);
		
	}
	public static void main (String []args) {
		Log obj = new Log();
		obj.setVisible(true);
		
	
		
	}
}
