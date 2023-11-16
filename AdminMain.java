//GUI for Admin Main page
import java.awt.*;
import javax.swing.*;

public class AdminMain extends JFrame {
	
	JLabel welcome = new JLabel("Welcome");
	JLabel name = new JLabel("");
	JLabel actvEve = new JLabel("Active Events");
	JTabbedPane activeEvents = new JTabbedPane();
	JLabel pendEve = new JLabel("Pending Events");
	JTabbedPane pendingEvents = new JTabbedPane();
	
	
	public AdminMain() {
		
		setLayout(new GridLayout(17,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 580);
        setVisible(true);
        
        add(new JLabel());
        
	}

}
