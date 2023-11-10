import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class user extends JFrame{
    
    JLabel LoginLabel = new JLabel("Log-in");
    JButton Login = new JButton("Log-in");
    JLabel un = new JLabel("     Enter Username: ", SwingConstants.LEFT);
    JLabel pas = new JLabel("     Enter Password: ", SwingConstants.LEFT);
    JTextField unf = new JTextField();
    JTextField pasf = new JTextField();


    public user() {
        setLayout(new GridLayout(17,4));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 580);
		setVisible(true);
        //Login.setBounds(175,350,100,50);
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel("Users Lo",SwingConstants.RIGHT));
        add(new JLabel("gin Page",SwingConstants.LEFT));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(un);
        add(unf);
        add(new JLabel(" "));
		add(new JLabel(" "));
        add(pas);
        add(pasf);
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
       // add(Login);
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(Login);

    }
    

    
}
