
package com.pojo;

import java.util.Date;

public class StudentMarkSheet {
    private int Student_Roll_Number;
    private String Student_Name;
    private String Student_Father_Name;
    private String Student_Class;
    private String Class_Section;
    private Date Date;
    private int Bangla;
    private int English;
    private int Math;
    private int Biology;
    private int History;
    private int Social_Science;
    private int General_Science;
    private int Physics;
    private int Chemistry;
    private int Total_Marks;
    private double Average;
    private String Grade;

    public StudentMarkSheet() {
    }

    public StudentMarkSheet(int Student_Roll_Number) {
        this.Student_Roll_Number = Student_Roll_Number;
    }

    public StudentMarkSheet(int Student_Roll_Number, String Student_Name, String Student_Father_Name, String Student_Class, String Class_Section, Date Date) {
        this.Student_Roll_Number = Student_Roll_Number;
        this.Student_Name = Student_Name;
        this.Student_Father_Name = Student_Father_Name;
        this.Student_Class = Student_Class;
        this.Class_Section = Class_Section;
        this.Date = Date;
    }

    public StudentMarkSheet(int Bangla, int English, int Math, int Biology, int History, int Social_Science, int General_Science, int Physics, int Chemistry, int Total_Marks, double Average, String Grade) {
        this.Bangla = Bangla;
        this.English = English;
        this.Math = Math;
        this.Biology = Biology;
        this.History = History;
        this.Social_Science = Social_Science;
        this.General_Science = General_Science;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
        this.Total_Marks = Total_Marks;
        this.Average = Average;
        this.Grade = Grade;
    }

    public StudentMarkSheet(int Total_Marks, double Average, String Grade) {
        this.Total_Marks = Total_Marks;
        this.Average = Average;
        this.Grade = Grade;
    }

    public StudentMarkSheet(int Student_Roll_Number, String Student_Name, String Student_Father_Name, String Student_Class, String Class_Section, Date Date, int Bangla, int English, int Math, int Biology, int History, int Social_Science, int General_Science, int Physics, int Chemistry, int Total_Marks, double Average, String Grade) {
        this.Student_Roll_Number = Student_Roll_Number;
        this.Student_Name = Student_Name;
        this.Student_Father_Name = Student_Father_Name;
        this.Student_Class = Student_Class;
        this.Class_Section = Class_Section;
        this.Date = Date;
        this.Bangla = Bangla;
        this.English = English;
        this.Math = Math;
        this.Biology = Biology;
        this.History = History;
        this.Social_Science = Social_Science;
        this.General_Science = General_Science;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
        this.Total_Marks = Total_Marks;
        this.Average = Average;
        this.Grade = Grade;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
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

    public int getBangla() {
        return Bangla;
    }

    public void setBangla(int Bangla) {
        this.Bangla = Bangla;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int English) {
        this.English = English;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int Math) {
        this.Math = Math;
    }

    public int getBiology() {
        return Biology;
    }

    public void setBiology(int Biology) {
        this.Biology = Biology;
    }

    public int getHistory() {
        return History;
    }

    public void setHistory(int History) {
        this.History = History;
    }

    public int getSocial_Science() {
        return Social_Science;
    }

    public void setSocial_Science(int Social_Science) {
        this.Social_Science = Social_Science;
    }

    public int getGeneral_Science() {
        return General_Science;
    }

    public void setGeneral_Science(int General_Science) {
        this.General_Science = General_Science;
    }

    public int getPhysics() {
        return Physics;
    }

    public void setPhysics(int Physics) {
        this.Physics = Physics;
    }

    public int getChemistry() {
        return Chemistry;
    }

    public void setChemistry(int Chemistry) {
        this.Chemistry = Chemistry;
    }

    public int getTotal_Marks() {
        return Total_Marks;
    }

    public void setTotal_Marks(int Total_Marks) {
        this.Total_Marks = Total_Marks;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double Average) {
        this.Average = Average;
    }

    
}
