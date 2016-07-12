package com.music.ui;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.*;
import java.applet.Applet;
import java.net.MalformedURLException;

import javax.swing.*;

public class MainUII extends JApplet{

	private JFrame frame;
	private JTextField textField;
//	private JTextField textField_1;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUII window = new MainUII();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUII() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
//		java.io.File file=new java.io.File("main.png");
//		java.awt.Image image = null;
//		try {
//			image = javax.imageio.ImageIO.read(file);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		java.net.URL imgURL = MainUII.class.getResource("/img/main.png");
//		Image img3 = null;
//		ImageIcon img = null;
//		try {
//			img3 = getImage(new java.net.URL(getCodeBase(),"img/main.png"));
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//			img = new ImageIcon(img3);
//		}
//		
		java.net.URL imageURL = this.getClass().getClassLoader().getResource("main.png");

		ImageIcon img = new ImageIcon(imageURL);
		JLabel imgLabel = new JLabel(img);      
		frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
		imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		
		Container cp=frame.getContentPane();
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new Menu();
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("menu.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new MenuPanel(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(650,580);  
				frame.setVisible(true);
//				frame.repaint();

			}
		});
		
		JButton button = new JButton("\u6CE8\u518C");
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setOpaque(false);
		
		textField_1 = new JPasswordField();
		textField_1.setOpaque(false);
		textField_1.setColumns(10);
//		textField_1.set
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(262)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(264, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
					.addGap(58))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(154)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(121))
		);
		frame.getContentPane().setLayout(groupLayout);
		((JPanel)cp).setOpaque(false);
		frame.setSize(600,540);   
		frame.setVisible(true);
	}
}
