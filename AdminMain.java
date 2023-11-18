//GUI for Admin Main page
import java.awt.*;
import javax.swing.*;

public class AdminMain extends JFrame {
	
	JLabel welcome = new JLabel("		Welcome");
	JLabel name = new JLabel("		Abdulla");
	JLabel actvEve = new JLabel("	Active Events");
	JLabel pendEve = new JLabel("	Pending Events");
	
	String [] columnNames = {"Event name", "Event type", "date", "full"};
	Object [][] data = {{"Cleaning beaches", "evniromental cleaning", "12,12,2023", true},
			{"Cleaning parks", "evniromental cleaning", "12,12,2023", false},
			{"Recycling Plastic", "Recycling", "12,12,2023", false},
			{"Raising Awarness", "Educational ", "12,12,2023", true},
			{"Cleaning beaches", "evniromental cleaning", "12,12,2023", false}};
	
	JTable activeEvents = new JTable(data, columnNames);
	JTable pendingEvents = new JTable(data, columnNames);
	
	JScrollPane  scroll = new JScrollPane(activeEvents); 
	JScrollPane  scroll2 = new JScrollPane(pendingEvents);
	
	
	
	public AdminMain() { 
        
		add(welcome);
        add(name);
        add(new JLabel());
        add(new JLabel());
        add(actvEve);
        //activeEvents.getTableHeader().setBounds(50,0,700,50);
    	//activeEvents.setBounds(50,50,700,20);
    	//add(activeEvents.getTableHeader(), BorderLayout.PAGE_START);
    	//add(activeEvents, BorderLayout.CENTER);
    	scroll.setBounds(50,50,700,70);
        add(scroll);
        add(new JLabel());
        add(pendEve);
        pendingEvents.getTableHeader().setBounds(50,0,700,50);
    	pendingEvents.setBounds(50,50,700,200);
    	add(pendingEvents.getTableHeader( ), BorderLayout.PAGE_START);
        add(pendingEvents, BorderLayout.CENTER);
        
        
       
        
        setLayout(new GridLayout(17,4));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 900);
        setVisible(true);
        
	}
	
	public static void main(String [] args) {
		new AdminMain();
	}

}
