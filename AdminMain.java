public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form AdminMain
     */
    public AdminMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Main Page");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to Admins Main Page");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Initiative ", "Initiator ", "Credit Points", "Time", "Date", "Description ", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Initiative", "Initiator ", "Credit Points", "Time", "Date", "Description", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setText("Pending Events:");

        jLabel3.setText("Active Events:");

        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reject");

        jButton3.setText("Veiw Volunteers");

        jButton4.setText("Delete");

        jLabel4.setText("Search:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Search:");

        jButton5.setText("Save Change & Sign Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton4)))
                                    .addGap(6, 6, 6))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addGap(6, 6, 6))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}




/*//GUI for Admin Main page
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

        Delete d = new Delete();
        del.addActionListener(d);
        Approve a = new Approve();
        apr.addActionListener(a);
        Reject r = new Reject();
        rej.addActionListener(r);
        
        
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
    @Override
    public void actionPerformed(ActionEvent e) {
       /*
        DefaultTableModel tb1 = (DefaultTableModel) activeEvents.getModel();
        if(activeEvents.getSelectedRowCount() == 1) {
            activeEvents.removeRow(activeEvents.getSelectedRow());
        } 
        else if(activeEvents.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "The table is empty");
        }
    *//* 
    }
}

class Approve implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

class Reject implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}*/