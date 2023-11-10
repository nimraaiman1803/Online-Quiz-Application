//package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener
{
	String name;
	JButton start,back;
	public Rules(String name)
	{
		this.name = name;
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Welcome " + name + " to Quizzify");
		heading.setBounds(50,60,700,30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 28));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(20,100,700,350);
		rules.setFont(new Font("Tahoma",Font.PLAIN, 16));
		rules.setText(
		"<html>"+ 
                "1. Strictly prohibit the use of any external resources or devices during the quiz." + "<br><br>" +
                "2. Set a time limit for each question or round to keep the quiz moving at a good pace." + "<br><br>" +
                "3. Specify whether participants are allowed to collaborate with others or if it's an individual effort." + "<br><br>" +
                "4. Include surprise bonus rounds with extra points for participants who answer correctly." + "<br><br>" +
                "5. In some rounds, award points to the participant or team that buzzes in or answers first." + "<br><br>" +
                "6. Have rounds with specific themes, such as Movie Madness or Historical Highlights."+ "<br><br>" +
                "7. Introduce the possibility of point deductions for incorrect answers to add a strategic element." + "<br><br>" +
                "8. Clearly state that participants should not use search engines for answers." + "<br><br>" +
            "<html>"
		);
		add(rules);
		
		
		
		back = new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		start = new JButton("Start");
		start.setBounds(400,500,100,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
		
		setSize(800,650);
		setLocation(350,100);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == start)
		{
			setVisible(false);
			new Quiz(name);
		}
		else
		{
			setVisible(false);
			new Login();
		}
	}
	public static void main(String args[])
	{
		new Rules("User");
	}
}