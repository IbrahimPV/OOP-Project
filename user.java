import javax.swing.*;

public class user extends JFrame{
    
    JLabel signUpLabel = new JLabel("SignUp");
    JButton signUp = new JButton("SignUp");

    public user() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 580);
        setLayout(null);
		setVisible(true);
        signUp.setBounds(175,350,100,50);
        add(signUp);

    }
    

    
}
