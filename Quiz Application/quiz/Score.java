import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener
{
	String name;
	int score = 0;
	Score(String name,int score)
	{
		this.name = name;
		this.score = score;
		
		setBounds(400,150,750,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon("E:/proj/Quiz Application/icons/score.png");
		Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,200,300,250);
		add(image);
		
		JLabel heading = new JLabel("Thank you " + name + " for playing Quizzify");
		heading.setBounds(45,30,700,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel score1 = new JLabel("Your Score is " + score);
		score1.setBounds(350,200,300,30);
		score1.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(score1);
		
		JButton submit = new JButton("Play Again");
		submit.setBounds(380,270,120,30);
		submit.setBackground(new Color(30,144,254));
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new Login();
	}
	public static void main(String args[])
	{
		new Score("User",0);
		
	}
}