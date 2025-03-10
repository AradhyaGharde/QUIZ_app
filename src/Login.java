
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
	
	JButton rules, back;
	JTextField tfname;
	
	Login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image= new JLabel(i1);
		image.setBounds(0, 0, 600, 500);
		add(image);
		
		JLabel heading= new JLabel("Simple Minds");
		heading.setBounds(750, 70, 300, 45);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name= new JLabel("Enter Your Name");
		name.setBounds(800, 200, 200, 30);
		name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
		name.setForeground(new Color(30,144,254));
		add(name);
		
		tfname = new JTextField();
		tfname.setBounds(735,240,300,25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,18));
		add(tfname);
		
		rules= new JButton("Rules");
		rules.setBounds(735,300,120,25);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		back= new JButton("Exit");
		back.setBounds(915,300,120,25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		
		
		setSize(1200,500);
		setLocation(200,200);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== rules) {
			String name= tfname.getText();
			
			setVisible(false);
			new Rules(name);
			
			
		} else if(ae.getSource()== back) {
			setVisible(false);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
