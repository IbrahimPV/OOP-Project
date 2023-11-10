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
		
		setLayout(new GridLayout(18,2));
		setSize(350, 580);
		setVisible(true);
		
	}

}
