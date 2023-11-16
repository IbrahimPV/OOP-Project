//GUI for cover page

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class MainPage extends JFrame{
	
	public static void main(String [] args) {
		new MainPage();
	}
	
	
	JLabel Title, d1;
	JButton Admin, User, userReg;
	
	public MainPage() {
		super("COP28 APP");
		setLayout(new GridLayout(10,1));
		
		Title = new JLabel("Wlecome to COP28 App", SwingConstants.CENTER);
		Admin = new JButton("Admins login");
		User = new JButton("Users login");
		d1 = new JLabel("Are you a new User?", SwingConstants.CENTER); 
		userReg = new JButton("SignUp");

		
		add(new JLabel());
		add(new JLabel());
		add(new JLabel());
		add(Title);
		add(new JLabel());
		add(new JLabel());
		add(Admin);
		add(User);
		add(d1);
		add(userReg);

		
		ImageIcon logo = new ImageIcon("logo.jpeg");
		setIconImage(logo.getImage());
		
		setSize(350, 580);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		toUserLogin u1 = new toUserLogin();
		User.addActionListener(u1);

		toSignUp s1 = new toSignUp();
		userReg.addActionListener(s1);
		
		toAdimLogin a1 = new toAdimLogin();
		Admin.addActionListener(a1);



	}
	class toUser implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
		class toUserLogin implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			UserLogin myUserLogin = new UserLogin();
		}
	}
	class toSignUp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			UserSignUp mySignUp = new UserSignUp();
		}
	}
	class toAdimLogin implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			AdminLogin adminLogin = new AdminLogin();
			
		}
		
	}

}
