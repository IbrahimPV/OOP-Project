import javax.swing.*;

public class user {
    JFrame frame = new JFrame();
    JLabel signUpLabel = new JLabel("SignUp");
    JButton signUp = new JButton("SignUp");

    public user() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 580);
        frame.setLayout(null);
		frame.setVisible(true);
        signUp.setBounds(175,350,100,50);
        frame.add(signUp);

    }
    

    
}
