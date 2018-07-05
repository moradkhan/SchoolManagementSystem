package com.pojo;

import java.util.Date;

public class StudentFeesRecipt {

    private int Student_Roll_Number;
    private String Student_Name;
    private String Student_Father_Name;
    private String Student_Class;
    private String Class_Section;
    private Date Date;
    private double Fees_Balance;
    private double Back_Amount;
    private double Monthly_Fees;
    private double Paid;
    private double Arears;
    private Date Fee_Pay_Date;
    private String Month;

    public StudentFeesRecipt() {
    }

    public StudentFeesRecipt(int Student_Roll_Number, String Student_Name, String Student_Father_Name, String Student_Class, String Class_Section, Date Date, double Fees_Balance, double Back_Amount, double Monthly_Fees, double Paid, double Arears, Date Fee_Pay_Date, String Month) {
        this.Student_Roll_Number = Student_Roll_Number;
        this.Student_Name = Student_Name;
        this.Student_Father_Name = Student_Father_Name;
        this.Student_Class = Student_Class;
        this.Class_Section = Class_Section;
        this.Date = Date;
        this.Fees_Balance = Fees_Balance;
        this.Back_Amount = Back_Amount;
        this.Monthly_Fees = Monthly_Fees;
        this.Paid = Paid;
        this.Arears = Arears;
        this.Fee_Pay_Date = Fee_Pay_Date;
        this.Month = Month;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public int getStudent_Roll_Number() {
        return Student_Roll_Number;
    }

    public void setStudent_Roll_Number(int Student_Roll_Number) {
        this.Student_Roll_Number = Student_Roll_Number;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String Student_Name) {
        this.Student_Name = Student_Name;
    }

    public String getStudent_Father_Name() {
        return Student_Father_Name;
    }

    public void setStudent_Father_Name(String Student_Father_Name) {
        this.Student_Father_Name = Student_Father_Name;
    }

    public String getStudent_Class() {
        return Student_Class;
    }

    public void setStudent_Class(String Student_Class) {
        this.Student_Class = Student_Class;
    }

    public String getClass_Section() {
        return Class_Section;
    }

    public void setClass_Section(String Class_Section) {
        this.Class_Section = Class_Section;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public double getFees_Balance() {
        return Fees_Balance;
    }

    public void setFees_Balance(double Fees_Balance) {
        this.Fees_Balance = Fees_Balance;
    }

    public double getBack_Amount() {
        return Back_Amount;
    }

    public void setBack_Amount(double Back_Amount) {
        this.Back_Amount = Back_Amount;
    }

    public double getMonthly_Fees() {
        return Monthly_Fees;
    }

    public void setMonthly_Fees(double Monthly_Fees) {
        this.Monthly_Fees = Monthly_Fees;
    }

    public double getPaid() {
        return Paid;
    }

    public void setPaid(double Paid) {
        this.Paid = Paid;
    }

    public double getArears() {
        return Arears;
    }

    public void setArears(double Arears) {
        this.Arears = Arears;
    }

    public Date getFee_Pay_Date() {
        return Fee_Pay_Date;
    }

    public void setFee_Pay_Date(Date Fee_Pay_Date) {
        this.Fee_Pay_Date = Fee_Pay_Date;
    }
    

   
}
