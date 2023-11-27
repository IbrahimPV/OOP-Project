//GUI for Admin login page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminLogin extends JFrame {
	
	JLabel un, pas, title;
    JButton login, back;
    JTextField unf = new JTextField();
    JTextField pasf = new JTextField();
    Container c;

    String Username = "Admin";
    String Password = "Admin123";
    
    
    public AdminLogin() {

        super("Admin Login Page");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 700);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Admins Login Page");
        title.setFont(new Font("Arial",Font.PLAIN,28));
        title.setSize(300,30);
        title.setLocation(120,90);
        c.add(title);

        un = new JLabel("Enter Username:");
        un.setFont(new Font("Arial", Font.PLAIN, 18));
        un.setSize(150, 100);
        un.setLocation(20, 200);
        c.add(un);

        unf.setSize(200,30);
        unf.setLocation(220, 235);
        c.add(unf);

        pas = new JLabel("Enter Password:");
        pas.setFont(new Font("Arial", Font.PLAIN, 18));
        pas.setSize(150, 100);
        pas.setLocation(20, 280);
        c.add(pas);

        pasf.setSize(200,30);
        pasf.setLocation(220, 315);
        c.add(pasf);
        
        back = new JButton("Back");
        back.setBounds(20,450,225,50);
        backToMainPage b = new backToMainPage();
        back.addActionListener(b);
        c.add(back);

        login = new JButton("Login");
        login.setBounds(250,450,225,50);
        login2 l = new login2();
        login.addActionListener(l);
        c.add(login);

        



        }

        class login2 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(unf.getText().equals(Username) && pasf.getText().equals(Password))
                    new AdminMain();
            }

        }

        class backToMainPage implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainPage back = new MainPage();
                
    
            }
        }
}
