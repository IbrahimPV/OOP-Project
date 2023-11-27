import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class user {
    private String name, password, email, phoneNumber, day, month, year, address;
    //private String userID;

    public user(String name, String password, String email, String phoneNumber, String address, String day, String month, String year) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = address;
        //userID = IDGenerator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // public void setUserID(String userID) {
    //     this.userID = userID;
    // }
    // public String getUserID() {
    //     return userID;
    // }
    // // public String IDGenerator() {
    //     return "#" + Integer.toString((int)Math.floor(Math.random()*1000000));

    // }
    
   
    
}
