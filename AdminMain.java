//GUI for Admin Main page
import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class AdminMain extends JFrame {
	
	JLabel welcome = new JLabel("Welcome");
	JLabel actvEve = new JLabel("Active Events");
	JLabel pendEve = new JLabel("Pending Events");
    JButton apr = new JButton("Approve");
    JButton rej = new JButton("Reject");
    JButton del = new JButton("Delete event");
    
	
	String [] columnNames = {"Event name", "Event type", "Date", "full?"};

	Object [][] data = {{"Cleaning beaches", "evniromental cleaning", "12,12,2023", true},
			{"Cleaning parks", "evniromental cleaning", "12,12,2023", false},
			{"Recycling Plastic", "Recycling", "12,12,2023", false},
			{"Raising Awarness", "Educational ", "12,12,2023", true},
			{"Cleaning beaches", "evniromental cleaning", "12,12,2023", false}};
	
	
	JTable activeEvents = new JTable(data, columnNames);
	JTable pendingEvents = new JTable(data, columnNames);
	
	JScrollPane  scroll = new JScrollPane(activeEvents); 
	JScrollPane  scroll2 = new JScrollPane(pendingEvents);
	
	Container c;
	
	
	public AdminMain() { 
		
		super("Admin Main Page");
		
		c = getContentPane();
		c.setLayout(null);
		
		welcome.setBounds(10, 50, 100, 100);
		c.add(welcome);
		
		actvEve.setBounds(20,150, 100, 100);
        c.add(actvEve);
        //activeEvents.getTableHeader().setBounds(10,220,700,50);
    	//activeEvents.setBounds(10,220,700,100);
    	//add(activeEvents.getTableHeader());
    	//add(activeEvents, BorderLayout.CENTER);
    	//activeEvents.setFillsViewportHeight(true);
        //activeEvents.getColumn("More details").setCellRenderer(new ButtonRenderer());
    	//activeEvents.getColumn("More details").setCellEditor(new ButtonEditor(new JCheckBox()));
    	scroll.setBounds(10,220,700,100);
        activeEvents.setRowSelectionAllowed(true);
        c.add(scroll);
        del.setBounds(610, 330, 100, 60);
        c.add(del);
        pendEve.setBounds(20, 410, 100, 100);
        c.add(pendEve);
        //pendingEvents.getTableHeader().setBounds(50,0,700,50);
    	//pendingEvents.setBounds(50,50,700,200);
    	//add(pendingEvents.getTableHeader( ), BorderLayout.PAGE_START);
        //add(pendingEvents, BorderLayout.CENTER);
        //pendingEvents.getColumn("More details").setCellRenderer(new ButtonRenderer());
    	//pendingEvents.getColumn("More details").setCellEditor(new ButtonEditor(new JCheckBox()));
        scroll2.setBounds(10,480,700,100);
        pendingEvents.setRowSelectionAllowed(true);
        c.add(scroll2);
        apr.setBounds(610, 590, 100, 60);
        c.add(apr);
        rej.setBounds(500, 590, 100, 60);
        c.add(rej);
        
        
        //setLayout(new GridLayout(17,6));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 900);
        setVisible(true);
        
        ImageIcon logo = new ImageIcon("logo.jpeg");
		setIconImage(logo.getImage());
        
	}
	
	public static void main(String [] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AdminMain();
			}
			});
		}
}

class Delete implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        @Override
        
    }
}