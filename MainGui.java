package UniPackage;



import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;



public class MainGui extends JFrame {

	private JPanel contentPane;

	 
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 391, 415);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 375, 376);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("STUDENT");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(107, 215, 170, 45);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 24));
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student obj=new Student ();
				obj.setVisible(true);
				dispose();
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("FACULTY");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faculty obj = new Faculty ();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setBounds(107, 289, 170, 45);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 24));
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Please Choose the Category Below");
		lblNewLabel.setBounds(77, 157, 240, 55);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\Downloads\\UOSwabi-Logo-removebg-preview - Shortcut.png"));
		lblNewLabel_1.setBounds(54, 11, 291, 135);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("-------------------------------------------------------------------------------------------------------");
		lblNewLabel_2.setBounds(0, 144, 422, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("LOGOUT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Log obj = new Log ();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.setBounds(276, 342, 79, 23);
		panel.add(btnNewButton_2);
	}
	public static void main (String []args) {
		MainGui obj = new MainGui();
		obj.setVisible(true);
		
	
		
	}
}
