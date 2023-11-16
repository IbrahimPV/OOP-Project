//GUI for Admin Main page
import java.awt.*;
import javax.swing.*;

public class AdminMain extends JFrame {
	
	JLabel welcome = new JLabel("Welcome");
	JLabel name = new JLabel("");
	JLabel actvEve = new JLabel("Active Events");
	JTabbedPane activeEvents = new JTabbedPane();
	JLabel event1, event2, event3 = new JLabel();
	JLabel pendEve = new JLabel("Pending Events");
	JTabbedPane pendingEvents = new JTabbedPane();
	JLabel pevent1, pevent2, pevent3 = new JLabel();
	
	
	public AdminMain() {
		
		setLayout(new GridLayout(17,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 580);
        setVisible(true);
        
        activeEvents.add(event1);
        activeEvents.add(event2);    
        activeEvents.add(event3);    
        
        pendingEvents.add(pevent1);    
        pendingEvents.add(pevent2);    
        pendingEvents.add(pevent3);    
        
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
