package com.GUI.TeamProject;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginScreen extends JPanel
{
	public LoginScreen(JFrame frame)
	{
			JPanel panelLabel = new JPanel();	//inner container for labels
			panelLabel.setLayout(new BoxLayout(panelLabel, BoxLayout.Y_AXIS));
			JLabel labelUserName = new JLabel("Username:");
			JLabel labelPassword = new JLabel("Password:");
			panelLabel.add(labelUserName);
			panelLabel.add(labelPassword);
			
			//frame.setContentPane(contentPane);
			
			JPanel panelTxtFld = new JPanel(); //inner container for textfield's
			panelTxtFld.setLayout(new BoxLayout(panelTxtFld, BoxLayout.Y_AXIS));
			JTextField txtFldUserName = new JTextField(20);
			JTextField txtFldPassword = new JTextField(20);
			panelTxtFld.add(txtFldUserName);
			panelTxtFld.add(txtFldPassword);
			
			JPanel panelBtn = new JPanel();	//inner container for button
			panelBtn.setLayout(new BoxLayout(panelBtn, BoxLayout.X_AXIS));
			JButton btnLogin = new JButton("Login");
			panelBtn.add(btnLogin);
			
			JPanel panelLogin = new JPanel();	//outer login container for label's, textfield's and button
			panelLogin.add(panelLabel);
			panelLogin.add(panelTxtFld);
			panelLogin.add(panelBtn);
			
			JButton btnDummyNorth = new JButton();	//dummy buttons 
			btnDummyNorth.setPreferredSize(new Dimension(50, 300));
			JButton btnDummyEast = new JButton();
			btnDummyEast.setPreferredSize(new Dimension(350,0));
			JButton btnDummyWest = new JButton();
			btnDummyWest.setPreferredSize(new Dimension(80,0));
			
			JPanel contentPane = new JPanel(new BorderLayout());	//main container other containers placed onto this
			JPanel panelDummyNorth = new JPanel(new BorderLayout());	//dummy panel set north in contentPane
			panelDummyNorth.add(panelLogin, BorderLayout.CENTER);
			contentPane.add(btnDummyNorth, BorderLayout.NORTH);
			contentPane.add(btnDummyEast, BorderLayout.EAST);
			contentPane.add(btnDummyWest, BorderLayout.WEST);
			
			
			contentPane.add(panelLogin);
			
			this.add(contentPane);
			
			
	}
	

}
