//GUI for cover page

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class MainPage extends JFrame{
	
	
	JLabel Title, d1;
	JButton Admin, User, UserReg;
	
	public MainPage() {
		super("COP28 APP");
		setLayout(new GridLayout(10,1));
		
		Title = new JLabel("Wlecome to COP28 App", SwingConstants.CENTER);
		Admin = new JButton("Admins login");
		User = new JButton("Users login");
		d1 = new JLabel("Are you a new User?", SwingConstants.CENTER); 
		UserReg = new JButton("SignUp");

		
		add(new JLabel());
		add(new JLabel());
		add(new JLabel());
		add(Title);
		add(new JLabel());
		add(new JLabel());
		add(Admin);
		add(User);
		add(d1);
		add(UserReg);

		
		ImageIcon logo = new ImageIcon("logo.jpeg");
		setIconImage(logo.getImage());
		
		setSize(350, 580);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		toUser u1 = new toUser();
		User.addActionListener(u1);

	}
	class toUser implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			user myUser = new user();
		}
	}


}
