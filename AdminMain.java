//GUI for Admin Main page
import java.awt.*;
import javax.swing.*;

public class AdminMain extends JFrame {
	
	JLabel welcome = new JLabel("Welcome");
	JLabel name = new JLabel("");
	JLabel actvEve = new JLabel("Active Events");
	JLabel pendEve = new JLabel("Pending Events");
	JTable activeEvents = new JTable();
	JTable pendingEvents = new JTable();
	
	
	
	public AdminMain() {
		
		setLayout(new GridLayout(17,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 580);
        setVisible(true);
   
        
        add(welcome);
        add(name);
        add(new JLabel());
        add(new JLabel());
        add(actvEve);
        add(activeEvents);
        add(new JLabel());
        add(pendEve);
        add(pendingEvents);
        
	}

}
