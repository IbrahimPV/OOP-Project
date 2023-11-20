//GUI for cover page

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;



public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponents() {

        titleLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        adminButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();


        toAdminLogin a = new toAdminLogin();
        adminButton.addActionListener(a);
    
        toUserLogin u = new toUserLogin();
        loginButton.addActionListener(u);

        toSignUp s = new toSignUp();
        signUpButton.addActionListener(s);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 900));
		setVisible(true);
        
        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        titleLabel.setText("COP28 Login Page");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        emailLabel.setText("Email:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        passwordLabel.setText("Password:");

        emailText.setName(""); // NOI18N


        adminButton.setText("Admin Login");

        loginButton.setText("Login");
 
        signUpButton.setText("Sign Up");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(emailText)
                    .addComponent(passwordText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adminButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        pack();
    }
// </editor-fold>                        
                           

    /**
     * @param args the command line arguments
     */


	 class toAdminLogin implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
            AdminLogin adminLogin = new AdminLogin();
		}
	}
	 class toSignUp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			UserSignUp mySignUp = new UserSignUp();
		}
	}
	 class toUserLogin implements ActionListener {
		public void actionPerformed(ActionEvent e) {
            try {
            Connection connection = userDataBase.connect();
            if (emailText.getText().isEmpty() || passwordText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the boxes.");
            } else if (createUser.checkLogin(connection, emailText.getText(),passwordText.getText())) {
                dispose();
                UserLogin myUserLogin = new UserLogin();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email Or Password. Please Try Again.");

            }
			
		} catch(SQLException ex) {
            ex.printStackTrace();
        }

        }

	}


    // Variables declaration - do not modify                     
    private javax.swing.JButton adminButton;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField passwordText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration                   
}

