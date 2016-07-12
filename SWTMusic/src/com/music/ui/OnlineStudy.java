package com.music.ui;

import java.awt.Color;
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

public class OnlineStudy extends JPanel {
	
	private JFrame frame;

	/**
	 * Create the panel.
	 */
	public OnlineStudy(JFrame frame1) {

		this.frame = frame1;
		
		JButton button = new JButton("\u9996\u9875");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
			}
		});
		button.setForeground(new Color(255, 250, 250));
		button.setBackground(new Color(0, 102, 255));
		
		JButton btnNewButton1 = new JButton("\u6211\u7684\u4F5C\u4E1A");
		btnNewButton1.setBackground(new Color(0, 102, 255));
		btnNewButton1.setForeground(new Color(255, 250, 250));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.getLayeredPane().removeAll();
				java.net.URL imageURL = this.getClass().getClassLoader().getResource("tutorials.png");
				ImageIcon img = new ImageIcon(imageURL); 
				JLabel imgLabel = new JLabel(img);      
				frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
				imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
				frame.setContentPane(new TutorialsPanel(frame));
				((JPanel)frame.getContentPane()).setOpaque(false);
				frame.setSize(650,580);  
				frame.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton("\u6211\u7684\u8001\u5E08");
		button_1.addActionListener(new ActionListener() {
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
		button_1.setForeground(new Color(255, 250, 250));
		button_1.setBackground(new Color(0, 102, 255));
		JButton button_2 = new JButton("\u4EA4\u6D41\u4E92\u52A8");
		button_2.setForeground(new Color(255, 250, 250));
		button_2.setBackground(new Color(0, 102, 255));
		JButton button_3 = new JButton("\u6211\u7684\u4F5C\u4E1A");
		button_3.addActionListener(new ActionListener() {
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
		button_3.setForeground(new Color(255, 250, 250));
		button_3.setBackground(new Color(0, 102, 255));
		JButton button_4 = new JButton("\u62A5\u73ED\u9009\u8BFE");
		button_4.addActionListener(new ActionListener() {
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
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(new Color(0, 102, 255));
		
		JButton button_6 = new JButton("\u5728\u7EBF\u5B66\u4E60");
		button_6.setForeground(new Color(255, 250, 250));
		button_6.setBackground(new Color(0, 102, 255));
		
		JButton button_7 = new JButton("\u7528\u6237\u7BA1\u7406");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_7.setForeground(new Color(255, 250, 250));
		button_7.setBackground(new Color(0, 102, 255));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(203, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
								.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
								.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
							.addGap(177))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(177, Short.MAX_VALUE))))
		);
		setLayout(groupLayout);
		((JPanel)frame.getContentPane()).setOpaque(false);
		frame.setSize(640,570);   
		frame.setVisible(true);
		
		

	}

}
