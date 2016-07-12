package com.music.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MenuPanel extends JPanel {
	
	private JFrame frame;

	/**
	 * Create the panel.
	 */
	public MenuPanel(JFrame frame1) {
		
		this.frame = frame1;
		
		JButton btnNewButton = new JButton("\u6211\u7684\u4F5C\u4E1A");
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setForeground(new Color(255, 250, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("tutorials.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new TutorialsPanel(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(640,560);  
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton("\u9996\u9875");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(new Color(255, 250, 250));
		button.setBackground(new Color(0, 102, 255));
		
		JButton button_1 = new JButton("\u5728\u7EBF\u5B66\u4E60");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("onlinestudy.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new OnlineStudy(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(650,580);  
				frame.setVisible(true);
			
			}
		});
		button_1.setForeground(new Color(255, 250, 250));
		button_1.setBackground(new Color(0, 102, 255));
		
		JButton button_2 = new JButton("\u6211\u7684\u8001\u5E08");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("teacher.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new MyTeacher(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(600,580);  
				frame.setVisible(true);
			}
		});
		button_2.setForeground(new Color(255, 250, 250));
		button_2.setBackground(new Color(0, 102, 255));
		
		JButton button_3 = new JButton("\u4EA4\u6D41\u4E92\u52A8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setForeground(new Color(255, 250, 250));
		button_3.setBackground(new Color(0, 102, 255));
		
		JButton button_6 = new JButton("\u62A5\u73ED\u9009\u8BFE");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("pieces.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new Pieces(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(650,530);  
				frame.setVisible(true);
			}
		});
		button_6.setForeground(new Color(255, 250, 250));
		button_6.setBackground(new Color(0, 102, 255));
		
		JButton button_4 = new JButton("\u7528\u6237\u7BA1\u7406");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setForeground(new Color(255, 250, 250));
		button_4.setBackground(new Color(0, 102, 255));
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("onlinestudy.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new OnlineStudy(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(650,580);  
				frame.setVisible(true);
			}
		});
		java.net.URL imageURL = this.getClass().getClassLoader().getResource("20160711224020.png");
		ImageIcon icon = new ImageIcon(imageURL);
		btnNewButton_1.setIcon(icon);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JButton button_5 = new JButton("New button");
		java.net.URL imageURL5 = this.getClass().getClassLoader().getResource("teacher_button.png");
		ImageIcon icon5 = new ImageIcon(imageURL5);
		button_5.setIcon(icon5);
		button_5.setBorder(null);
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("teacher.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new MyTeacher(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(600,580);  
				frame.setVisible(true);
			}
		});
		button_5.setBorder(null);
		
		JButton button_7 = new JButton("New button");
		java.net.URL imageURL7 = this.getClass().getClassLoader().getResource("tutorial_button.png");
		ImageIcon icon7 = new ImageIcon(imageURL7);
		button_7.setIcon(icon7);
		button_7.setBorder(null);
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("tutorials.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new TutorialsPanel(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(640,560);  
				frame.setVisible(true);
			}
		});
		button_7.setBorder(null);
		
		JButton button_8 = new JButton("New button");
		java.net.URL imageURL8 = this.getClass().getClassLoader().getResource("practice_button.png");
		ImageIcon icon8 = new ImageIcon(imageURL8);
		button_8.setIcon(icon8);
		button_8.setBorder(null);
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setBorder(null);
		
		JButton button_9 = new JButton("New button");
		java.net.URL imageURL9 = this.getClass().getClassLoader().getResource("lesson_button.png");
		ImageIcon icon9 = new ImageIcon(imageURL9);
		button_9.setIcon(icon9);
		button_9.setBorder(null);
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.setBorder(null);
		
		JButton button_10 = new JButton("New button");
		java.net.URL imageURL10 = this.getClass().getClassLoader().getResource("communica_button.png");
		ImageIcon icon10 = new ImageIcon(imageURL10);
		button_10.setIcon(icon10);
		button_10.setBorder(null);
		button_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setBorder(null);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
							.addGap(69)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(47)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(57)
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addGap(364))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(70)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addGap(90)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addGap(90)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
		);
		setLayout(groupLayout);
//		btnNewButton.setVisible(false);
		((JPanel)frame.getContentPane()).setOpaque(false);
		frame.setSize(600,540);   
		frame.setVisible(true);
		
		

	}
}
