//GUI for cover page

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class MainPage extends JFrame{
	
	public static void main(String [] args) {
		new MainPage();
	}
	
	JLabel Title;
	JButton Admin, User;
	
	public MainPage() {
		super("COP28 APP");
		setLayout(new GridLayout(9,1));
		
		Title = new JLabel("Wlecome to COP28 App", SwingConstants.CENTER);
		Admin = new JButton("Admins login");
		User = new JButton("Users login");
		
		add(new JLabel());
		add(new JLabel());
		add(new JLabel());
		add(Title);
		add(new JLabel());
		add(new JLabel());
		add(Admin);
		add(User);
		
		
		setSize(350, 580);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}

}
