//GUI for Admin login page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminLogin extends JFrame {
	
	JLabel LoginLabel = new JLabel("Log-in");
    JButton Login = new JButton("Log-in");
    JLabel un = new JLabel("     Enter Username: ", SwingConstants.LEFT);
    JLabel pas = new JLabel("     Enter Password: ", SwingConstants.LEFT);
    JTextField unf = new JTextField();
    JTextField pasf = new JTextField();

    String Username = "Admin";
    String Password = "Admin123";
    
    
    public AdminLogin() {
        setLayout(new GridLayout(17,4));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 900);
        setVisible(true);
        //Login.setBounds(175,350,100,50);
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel("Admins Lo",SwingConstants.RIGHT));
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

        login2 l = new login2();
        Login.addActionListener(l);



        }

        class login2 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(unf.getText().equals(Username) && pasf.getText().equals(Password))
                    new AdminMain().setVisible(true);
            }

        }
}
