import javax.swing.*;

public class user extends JFrame{
    
    JLabel LoginLabel = new JLabel("Log-in");
    JButton Login = new JButton("Log-in");

    public user() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 580);
        setLayout(null);
		setVisible(true);
        Login.setBounds(175,350,100,50);
        add(Login);

    }
    

    
}
