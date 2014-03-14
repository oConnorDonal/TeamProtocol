package com.GUI.TeamProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Screen extends JFrame
{
	public Screen(String title)
	{
		super(title);
		
		setBounds(50, 50, 800, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(new LoginScreen(this));
		setVisible(true);
	}
}





