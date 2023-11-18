//GUI for Admin Main page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class AdminMain extends JFrame {
	
	JLabel welcome = new JLabel("		Welcome");
	JLabel name = new JLabel("		Abdulla");
	JLabel actvEve = new JLabel("	Active Events");
	JLabel pendEve = new JLabel("	Pending Events");
	
	String [] columnNames = {"Event name", "Event type", "date", "full", "See details"};
	Object [][] data = {{"Cleaning beaches", "evniromental cleaning", "12,12,2023", true, new JButton("Enter")},
			{"Cleaning parks", "evniromental cleaning", "12,12,2023", false, new JButton("Enter")},
			{"Recycling Plastic", "Recycling", "12,12,2023", false, new JButton("Enter")},
			{"Raising Awarness", "Educational ", "12,12,2023", true, new JButton("Enter")},
			{"Cleaning beaches", "evniromental cleaning", "12,12,2023", false, new JButton("Enter")}};
	
	String [] columnNames1 = {"Event name", "Event type", "date", "full"};
	Object [][] data1 = {{"Cleaning beaches", "evniromental cleaning", "12,12,2023", true},
			{"Cleaning parks", "evniromental cleaning", "12,12,2023", false},
			{"Recycling Plastic", "Recycling", "12,12,2023", false},
			{"Raising Awarness", "Educational ", "12,12,2023", true},
			{"Cleaning beaches", "evniromental cleaning", "12,12,2023", false}};
	
	JTable activeEvents = new JTable(data, columnNames);
	JTable pendingEvents = new JTable(data1, columnNames1);
	
	JScrollPane  scroll = new JScrollPane(activeEvents); 
	JScrollPane  scroll2 = new JScrollPane(pendingEvents);
	
	
	
	public AdminMain() { 
		
		super("Admin Main Page");
        
		add(welcome);
        add(name);
        add(new JLabel());
        add(new JLabel());
        add(actvEve);
        //activeEvents.getTableHeader().setBounds(50,0,700,50);
    	//activeEvents.setBounds(50,50,700,20);
    	//add(activeEvents.getTableHeader(), BorderLayout.PAGE_START);
    	//add(activeEvents, BorderLayout.CENTER);
    	scroll.setBounds(60,60,700,70);
        add(scroll);
        add(new JLabel());
        add(pendEve);
        //pendingEvents.getTableHeader().setBounds(50,0,700,50);
    	//pendingEvents.setBounds(50,50,700,200);
    	//add(pendingEvents.getTableHeader( ), BorderLayout.PAGE_START);
        //add(pendingEvents, BorderLayout.CENTER);
        scroll2.setBounds(60,60,700,70);
        add(scroll2);
        
        
       
        
        setLayout(new GridLayout(17,6));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 900);
        setVisible(true);
        
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





class ButtonRenderer extends JButton implements TableCellRenderer {

    public ButtonRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        } else {
            setForeground(table.getForeground());
            setBackground(UIManager.getColor("Button.background"));
        }
        setText((value == null) ? "" : value.toString());
        return this;
    }
}

class ButtonEditor extends DefaultCellEditor {

    protected JButton button;
    private String label;
    private boolean isPushed;

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            JOptionPane.showMessageDialog(button, label + ": Ouch!");
        }
        isPushed = false;
        return label;
    }

    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }
}
