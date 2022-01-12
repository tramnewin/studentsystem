package students;

import java.util.Scanner;

public class UserInput {
    private int studentID;
    private String name;
    private String address;
    private String phoneNum;
 
    
    public UserInput() {
 
    }
    
    public UserInput(int studentID, String name, String address, String phoneNum) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    
    public int getstudentID() {
        return studentID;
    }
 
    public void setstudentID(int studentID) {
        this.studentID = studentID;
    }
 
    public String getname() {
        return name;
    }
 
    public void setname(String name) {
        this.name = name;
    }
 
    public String getaddress() {
        return address;
    }
 
    public void setaddress(String address) {
        this.address = address;
    }
 
    public String getphoneNum() {
        return phoneNum;
    }
 
    public void setphoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    @Override
    public String toString() {
        return "UserInput{" +
                "studentID=" + studentID +
                ", name='" + name + ' ' +
                ", address='" + address + ' ' +
                ", phoneNum='" + phoneNum + ' ' +
                '}';
    }
   
    public void displayInfo() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", studentID, name, address, phoneNum);
    }


}
