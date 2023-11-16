//The GUI for the user sign up page

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserSignUp extends JFrame{

    // Creating Variables
    Container c;
    JButton backButton, submitButton;
    JLabel titleLabel,nameLabel, DOBLabel, emailLabel, phoneNumberLabel, addressLabel, passwordLabel;
    JComboBox day, month, year;
    JTextField nameText, DOBText, emailText, phoneNumberText, addressText, passwordText;

    // Lists for the Date of Birth Box
    private String days[] = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10","11", "12", "13", "14", "15","16", "17", "18", "19", "20","21", "22", "23", "24", "25","26", "27", "28", "29", "30","31"};
    private String months[] = { "Jan", "feb", "Mar", "Apr","May", "Jun", "July", "Aug","Sep", "Oct", "Nov", "Dec" };
    private String years[] = {"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980","1979","1978","1977","1976","1975","1974","1973","1972","1971","1970","1969","1968","1967","1966","1965","1964","1963","1962","1961","1960","1959","1958","1957","1956","1955","1954","1953","1952","1951","1950","1949","1948","1947","1946","1945","1944","1943","1942","1941","1940","1939","1938","1937","1936","1935","1934","1933","1932","1931","1930","1929","1928","1927","1926","1925","1924","1923","1922","1921","1920","1919","1918","1917","1916","1915","1914","1913","1912","1911","1910","1909","1908","1907","1906","1905","1904","1903","1902","1901","1900"};

    // Constructer
    public UserSignUp() {
        super("COP28 User SignUp");

		setSize(600, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


        c = getContentPane();
        c.setLayout(null);


        // Title Label
        titleLabel = new JLabel("User Sign Up");
        titleLabel.setSize(300,30);
        titleLabel.setLocation(200,100);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        c.add(titleLabel);


        // Name Label
        nameLabel = new JLabel("Name: ");
        nameLabel.setFont(new Font("Arial",Font.PLAIN,20));
        nameLabel.setSize(100,80);
        nameLabel.setLocation(100,170);
        c.add(nameLabel);

        // Name TextField
        nameText = new JTextField();
        nameText.setSize(200,20);
        nameText.setLocation(250,200);
        c.add(nameText);

        
        // Password Label
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Arial",Font.PLAIN,20));
        passwordLabel.setSize(100,80);
        passwordLabel.setLocation(100,220);
        c.add(passwordLabel);
        
        // Password Text
        passwordText = new JTextField();
        passwordText.setSize(200,20);
        passwordText.setLocation(250,250);
        c.add(passwordText);

        
        // Email Label
        emailLabel = new JLabel("Email: ");
        emailLabel.setFont(new Font("Arial",Font.PLAIN,20));
        emailLabel.setSize(100,80);
        emailLabel.setLocation(100,270);
        c.add(emailLabel);


        // Email Text
        emailText = new JTextField();
        emailText.setSize(200,20);
        emailText.setLocation(250,300);
        c.add(emailText);

        
        // Phone No Label
        phoneNumberLabel = new JLabel("Phone No: ");
        phoneNumberLabel.setFont(new Font("Arial",Font.PLAIN,20));
        phoneNumberLabel.setSize(100,80);
        phoneNumberLabel.setLocation(100,320);
        c.add(phoneNumberLabel);


        // Phone No Text
        phoneNumberText = new JTextField();
        phoneNumberText.setSize(200,20);
        phoneNumberText.setLocation(250,350);
        c.add(phoneNumberText);

        // Address Label
        addressLabel = new JLabel("Address: ");
        addressLabel.setFont(new Font("Arial",Font.PLAIN,20));
        addressLabel.setSize(100,80);
        addressLabel.setLocation(100,370);
        c.add(addressLabel);


        // Address Text
        addressText = new JTextField();
        addressText.setSize(200,20);
        addressText.setLocation(250,400);
        c.add(addressText);


        // Date Of Birth Label
        DOBLabel = new JLabel("Date Of Birth: ");
        DOBLabel.setFont(new Font("Arial",Font.PLAIN,16));
        DOBLabel.setSize(100,80);
        DOBLabel.setLocation(100,420);
        c.add(DOBLabel);


        // Day Scroll Box
        day = new JComboBox(days);
        day.setSize(50,30);
        day.setLocation(250,450);
        c.add(day);


        // month Scroll Box
        month = new JComboBox(months);
        month.setSize(60,30);
        month.setLocation(300,450);
        c.add(month);


        // Year Scroll Box
        year = new JComboBox(years);
        year.setSize(100,30);
        year.setLocation(360,450);
        c.add(year);


    

        // Back Button
        backButton = new JButton("Back");
        backButton.setBounds(50, 650, 100, 50);
        c.add(backButton);
        backToMainPage b1 = new backToMainPage();
        backButton.addActionListener(b1);


        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(170,525,300,50);
        c.add(submitButton);
        submit s = new submit();
        submitButton.addActionListener(s);


    }
    class backToMainPage implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            dispose();
            MainPage back = new MainPage();
            

        }
    }
    class submit implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if((nameText.getText().isEmpty()) || (passwordText.getText().isEmpty()) || (emailText.getText().isEmpty()) || (phoneNumberText.getText().isEmpty()) || (addressText.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Please Fill All The Boxes");
            } else if (false){ 
                
            } else {
                user newUser = new user(nameText.getText(),passwordText.getText(),emailText.getText(),phoneNumberText.getText(),addressText.getText(),(String)day.getSelectedItem(),(String)month.getSelectedItem(), (String)year.getSelectedItem());
            }
        }
    }

}
