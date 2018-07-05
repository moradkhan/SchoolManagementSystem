
package com.pojo;

import java.util.Date;

public class AdmissionStudent {
    private String id;
    private int rollNumber;
    private String studentName;
    private String fatherName;
    private String gender;
    private String clas;
    private int admissionAmount;
    private Date admissionDate;
    private int mobileNumber;
    private String email;
    private int houseContactNumber;
    private Date dateOfBirth;
    private String address;
    private String picture;

    public AdmissionStudent() {
    }

    public AdmissionStudent(String id) {
        this.id = id;
    }

    public AdmissionStudent(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public AdmissionStudent(String id, int rollNumber, String studentName, String fatherName, String gender, String clas, int admissionAmount, Date admissionDate, int mobileNumber, String email, int houseContactNumber, Date dateOfBirth, String address, String picture) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.clas = clas;
        this.admissionAmount = admissionAmount;
        this.admissionDate = admissionDate;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.houseContactNumber = houseContactNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.picture = picture;
    }

    public AdmissionStudent(String id, int rollNumber, String studentName, String fatherName, String gender, String clas, int admissionAmount, Date admissionDate, int mobileNumber, String email, int houseContactNumber, Date dateOfBirth, String address) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.clas = clas;
        this.admissionAmount = admissionAmount;
        this.admissionDate = admissionDate;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.houseContactNumber = houseContactNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public int getAdmissionAmount() {
        return admissionAmount;
    }

    public void setAdmissionAmount(int admissionAmount) {
        this.admissionAmount = admissionAmount;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHouseContactNumber() {
        return houseContactNumber;
    }

    public void setHouseContactNumber(int houseContactNumber) {
        this.houseContactNumber = houseContactNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    
}
