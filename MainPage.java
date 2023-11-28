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


        private void initComponents() {
            setVisible(true);

            titleLabel = new javax.swing.JLabel();
            emailLabel = new javax.swing.JLabel();
            passwordLabel = new javax.swing.JLabel();
            emailText = new javax.swing.JTextField();
            adminButton = new javax.swing.JButton();
            loginButton = new javax.swing.JButton();
            signUpButton = new javax.swing.JButton();
            passwordText = new javax.swing.JPasswordField();
            jCheckBox1 = new javax.swing.JCheckBox();

            toAdminLogin a = new toAdminLogin();
            adminButton.addActionListener(a);
        
            toUserLogin u = new toUserLogin();
            loginButton.addActionListener(u);
    
            toSignUp s = new toSignUp();
            signUpButton.addActionListener(s);
    
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(450, 430));
            setResizable(false);
            getContentPane().setLayout(null);
    
            titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
            titleLabel.setText("COP28 Login Page");
            getContentPane().add(titleLabel);
            titleLabel.setBounds(100, 10, 484, 110);
    
            emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            emailLabel.setText("Email:");
            getContentPane().add(emailLabel);
            emailLabel.setBounds(20, 160, 110, 40);
    
            passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            passwordLabel.setText("Passowrd:");
            getContentPane().add(passwordLabel);
            passwordLabel.setBounds(10, 220, 120, 58);
    
            emailText.setName(""); // NOI18N

            getContentPane().add(emailText);
            emailText.setBounds(130, 170, 250, 30);
    
            adminButton.setText("Admin Login");

            getContentPane().add(adminButton);
            adminButton.setBounds(320, 20, 120, 23);
    
            loginButton.setText("Login");

            getContentPane().add(loginButton);
            loginButton.setBounds(210, 320, 170, 45);
    
            signUpButton.setText("Sign Up");
  
            getContentPane().add(signUpButton);
            signUpButton.setBounds(40, 320, 153, 45);
    

            getContentPane().add(passwordText);
            passwordText.setBounds(130, 240, 250, 30);
    
            jCheckBox1.setText("show password");
            jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox1ActionPerformed(evt);
                }
            });
            getContentPane().add(jCheckBox1);
            jCheckBox1.setBounds(130, 280, 110, 20);
    
            pack();
        }// </editor-fold>  
// </editor-fold>                        
                           

    /**
     * @param args the command line arguments
     */
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox1.isSelected()){
            passwordText.setEchoChar((char)0);
        } else {
            passwordText.setEchoChar('*');
        }
    }       

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
                UserMainM x = new UserMainM();
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
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration                   
}

