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
	
	String [] columnNames = {"Event name", "Event type", "Date", "full?", "More details"};
	Object [][] data = {{"Cleaning beaches", "evniromental cleaning", "12,12,2023", true,"Enter"},
			{"Cleaning parks", "evniromental cleaning", "12,12,2023", false, "Enter"},
			{"Recycling Plastic", "Recycling", "12,12,2023", false, "Enter"},
			{"Raising Awarness", "Educational ", "12,12,2023", true, "Enter"},
			{"Cleaning beaches", "evniromental cleaning", "12,12,2023", false, "Enter"}};
	
	
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
        activeEvents.getColumn("More details").setCellRenderer(new ButtonRenderer());
    	activeEvents.getColumn("More details").setCellEditor(new ButtonEditor(new JCheckBox()));
    	scroll.setBounds(10,220,700,100);
        c.add(scroll);
        pendEve.setBounds(20, 350, 100, 100);
        c.add(pendEve);
        //pendingEvents.getTableHeader().setBounds(50,0,700,50);
    	//pendingEvents.setBounds(50,50,700,200);
    	//add(pendingEvents.getTableHeader( ), BorderLayout.PAGE_START);
        //add(pendingEvents, BorderLayout.CENTER);
        pendingEvents.getColumn("More details").setCellRenderer(new ButtonRenderer());
    	pendingEvents.getColumn("More details").setCellEditor(new ButtonEditor(new JCheckBox()));
        scroll2.setBounds(10,420,700,100);
        c.add(scroll2);
        
        
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
