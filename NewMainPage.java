import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;

public class NewMainPage extends JFrame {

    private JButton adminLogin, signUp, logIn;
    private JLabel title, email, pass;
    private JTextField emailInput, passInput;
    private Container c;

    public static void main(String [] args) {
        new NewMainPage();
    }

    public NewMainPage() {

        super("Main Page");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 600);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);

        emailInput = new JTextField();
        passInput = new JTextField();

        adminLogin = new JButton("Admin Login");
        adminLogin.setBounds(350, 20, 80, 40);
        //toAdminLogin a = new toAdminLogin();
        //adminLogin.addActionListener(a);
        c.add(adminLogin);

        title = new JLabel("COP28 Login Page");
        title.setFont(new Font("Arial",Font.PLAIN,28));
        title.setSize(300,30);
        title.setLocation(120,50);
        c.add(title);

        email = new JLabel("Email:");
        email.setFont(new Font("Arial", Font.PLAIN, 22));
        email.setSize(150,100);
        email.setLocation(20, 180);
        c.add(email);

        emailInput.setSize(200, 30);
        emailInput.setLocation(220,215);
        c.add(emailInput);

        pass = new JLabel("Password:");
        pass.setFont(new Font("Arial", Font.PLAIN, 22));
        pass.setSize(150,100);
        pass.setLocation(20, 250);
        c.add(email);

        passInput.setSize(200, 30);
        passInput.setLocation(220, 285);
        c.add(passInput);

        signUp = new JButton("SignUp");
        signUp.setBounds(20,450,200,50);
        //toSignUp b = new toSignUp();
        //signUp.addActionListener(b);
        c.add(signUp);

        logIn = new JButton("Login");
        logIn.setBounds(225,450,200,50);
        //toUserLogin d = new toUserLogin();
        //logIn.addActionListener(d);
        c.add(logIn);


        
    }
    class toAdminLogin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //dispose();
            new AdminLogin();
        }
    }
     class toSignUp implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //dispose();
            new UserSignUp();
        }
    }
    
     class toUserLogin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
            Connection connection = userDataBase.connect();
            if (emailInput.getText().isEmpty() || passInput.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the boxes.");
            } else if (createUser.checkLogin(connection, emailInput.getText(), passInput.getText())) {
                //dispose();
                UserMainM x = new UserMainM();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email Or Password. Please Try Again.");
    
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    
        }
    
    }
}



// emailInput.getText().isEmpty() || passInput.getText().isEmpty()
//emailInput.getText(), passInput.getText()