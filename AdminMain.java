//GUI for Admin Main page
import java.awt.*;
import javax.swing.*;

public class AdminMain extends JFrame {
	
	JLabel welcome = new JLabel("Welcome");
	JLabel actvEve = new JLabel("Active Events");
	
	
	
	public AdminMain() {
		
		setLayout(new GridLayout(17,4));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 580);
        setVisible(true);
        
	}

}
