package com.impl;

import com.pojo.AdmissionStudent;
import com.pojo.StudentFeesRecipt;
import com.pojo.StudentMarkSheet;
import com.pojo.User;
import com.util.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatabaseCRUD {

    MyConnection mc = new MyConnection();
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public boolean addRecord(User s) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?)");
            pstmt.setString(1, s.getFirstname());
            pstmt.setString(2, s.getLastname());
            pstmt.setString(3, s.getUsername());
            pstmt.setString(4, s.getPassword());
            pstmt.setString(5, s.getRetypepassword());
            pstmt.setString(6, s.getPicture());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return ret;
    }

    public boolean addAddmissionRecord(AdmissionStudent as) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, as.getId());
            pstmt.setInt(2, as.getRollNumber());
            pstmt.setString(3, as.getStudentName());
            pstmt.setString(4, as.getFatherName());
            pstmt.setString(5, as.getGender());
            pstmt.setString(6, as.getClas());
            pstmt.setInt(7, as.getAdmissionAmount());
            java.sql.Date sd = new Date(as.getAdmissionDate().getTime());
            pstmt.setDate(8, sd);
            pstmt.setInt(9, as.getMobileNumber());
            pstmt.setString(10, as.getEmail());
            pstmt.setInt(11, as.getHouseContactNumber());
            java.sql.Date sd1 = new Date(as.getDateOfBirth().getTime());
            pstmt.setDate(12, sd1);
            pstmt.setString(13, as.getAddress());
            pstmt.setString(14, as.getPicture());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return ret;
    }

    public ArrayList<AdmissionStudent> findAllAdmissionStudent() {
        ArrayList<AdmissionStudent> allSudentsDetail = new ArrayList<AdmissionStudent>();

        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("select * from student");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                AdmissionStudent s1 = new AdmissionStudent(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getString(10), rs.getInt(11), rs.getDate(12), rs.getString(13), rs.getString(14));
                allSudentsDetail.add(s1);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
//                e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return allSudentsDetail;
    }

    public ArrayList<AdmissionStudent> findCountAdmissionStudent() {
        ArrayList<AdmissionStudent> allSudentsCount = new ArrayList<AdmissionStudent>();

        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("select count(id) from student");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                AdmissionStudent s1 = new AdmissionStudent(rs.getString(1));
                allSudentsCount.add(s1);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

        return allSudentsCount;
    }

    public AdmissionStudent findAllAdmissionStudentById(int id) {

        AdmissionStudent s1 = null;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("SELECT * FROM student WHERE id=?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s1 = new AdmissionStudent(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getString(10), rs.getInt(11), rs.getDate(12), rs.getString(13), rs.getString(14));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return s1;
    }

    public boolean updateRecord(AdmissionStudent as) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("UPDATE student SET rollNumber=?,studentName=?,fatherName=?,gender=?,clas=?,admissionAmount=?,admissionDate=?,mobileNumber=?,email=?,houseContactNumber=?,dateOfBirth=?,address=?,picture=? WHERE id=?");

            pstmt.setInt(1, as.getRollNumber());
            pstmt.setString(2, as.getStudentName());
            pstmt.setString(3, as.getFatherName());
            pstmt.setString(4, as.getGender());
            pstmt.setString(5, as.getClas());
            pstmt.setInt(6, as.getAdmissionAmount());
            java.sql.Date sd = new Date(as.getAdmissionDate().getTime());
            pstmt.setDate(7, sd);
            pstmt.setInt(8, as.getMobileNumber());
            pstmt.setString(9, as.getEmail());
            pstmt.setInt(10, as.getHouseContactNumber());
            java.sql.Date sd1 = new Date(as.getAdmissionDate().getTime());
            pstmt.setDate(11, sd1);
            pstmt.setString(12, as.getAddress());
            pstmt.setString(13, as.getPicture());
            pstmt.setString(14, as.getId());
            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return ret;
    }

    public boolean deleteRecord(AdmissionStudent as) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("DELETE FROM STUDENT WHERE id=?");
            pstmt.setString(1, as.getId());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {

        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
        return ret;
    }

    public boolean addStudentMarksRecord(StudentMarkSheet sm) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("INSERT INTO studentmarksheet VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1, sm.getStudent_Roll_Number());
            pstmt.setString(2, sm.getStudent_Name());
            pstmt.setString(3, sm.getStudent_Father_Name());
            pstmt.setString(4, sm.getStudent_Class());
            pstmt.setString(5, sm.getClass_Section());
            java.sql.Date sd = new Date(sm.getDate().getTime());
            pstmt.setDate(6, sd);
            pstmt.setInt(7, sm.getBangla());
            pstmt.setInt(8, sm.getEnglish());
            pstmt.setInt(9, sm.getMath());
            pstmt.setInt(10, sm.getBiology());
            pstmt.setInt(11, sm.getHistory());
            pstmt.setInt(12, sm.getSocial_Science());
            pstmt.setInt(13, sm.getGeneral_Science());
            pstmt.setInt(14, sm.getPhysics());
            pstmt.setInt(15, sm.getChemistry());
            pstmt.setInt(16, sm.getTotal_Marks());
            pstmt.setDouble(17, sm.getAverage());
            pstmt.setString(18, sm.getGrade());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return ret;
    }

    public StudentMarkSheet findAllStudentMarksRecordById(int Student_Roll_Number) {

        StudentMarkSheet s1 = null;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("SELECT * FROM studentmarksheet WHERE Student_Roll_Number=?");
            pstmt.setInt(1, Student_Roll_Number);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s1 = new StudentMarkSheet(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16), rs.getDouble(17), rs.getString(18));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return s1;
    }

    public StudentMarkSheet studentInformation(int Student_Roll_Number) {

        StudentMarkSheet s1 = null;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("SELECT * FROM studentmarksheet WHERE Student_Roll_Number=?");
            pstmt.setInt(1, Student_Roll_Number);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s1 = new StudentMarkSheet(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return s1;
    }

    public boolean addStudentFeesRecord(StudentFeesRecipt sf) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("INSERT INTO studentfees VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1, sf.getStudent_Roll_Number());
            pstmt.setString(2, sf.getStudent_Name());
            pstmt.setString(3, sf.getStudent_Father_Name());
            pstmt.setString(4, sf.getStudent_Class());
            pstmt.setString(5, sf.getClass_Section());
            java.sql.Date sd = new Date(sf.getDate().getTime());
            pstmt.setDate(6, sd);
            pstmt.setDouble(7, sf.getFees_Balance());
            pstmt.setDouble(8, sf.getBack_Amount());
            pstmt.setDouble(9, sf.getMonthly_Fees());
            pstmt.setDouble(10, sf.getPaid());
            pstmt.setDouble(11, sf.getArears());
            java.sql.Date sd1 = new Date(sf.getDate().getTime());
            pstmt.setDate(12, sd1);
            pstmt.setString(13, sf.getMonth());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return ret;
    }
     public StudentFeesRecipt findAllStudentFeesRecordById(int Student_Roll_Number) {

        StudentFeesRecipt s2 = null;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("SELECT * FROM studentfees WHERE Student_Roll_Number=?");
            pstmt.setInt(1, Student_Roll_Number);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                s2 = new StudentFeesRecipt(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6),rs.getDouble(7),rs.getDouble(8),rs.getDouble(9),rs.getDouble(10),rs.getDouble(11),rs.getDate(12),rs.getString(13));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return s2; 
    }
 public boolean updateStudentMarkSheetRecord(StudentMarkSheet sms) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("UPDATE studentmarksheet SET Student_Name=?,Student_Father_Name=?,Student_Class=?,Class_Section=?,Date=?,Bangla=?,English=?,Math=?,Biology=?,History=?,Social_Science=?,General_Science=?,Physics=?,Chemistry=?,Total_Marks=?,Average=?,Grade=? WHERE Student_Roll_Number=?");

            pstmt.setInt(18, sms.getStudent_Roll_Number());
            pstmt.setString(1, sms.getStudent_Name());
            pstmt.setString(2, sms.getStudent_Father_Name());
            pstmt.setString(3, sms.getStudent_Class());
            pstmt.setString(4, sms.getClass_Section());
            java.sql.Date sd = new Date(sms.getDate().getTime());
            pstmt.setDate(5, sd);
            pstmt.setInt(6, sms.getBangla());
            pstmt.setInt(7, sms.getEnglish());
            pstmt.setInt(8, sms.getMath());
            pstmt.setInt(9, sms.getBiology());
            pstmt.setInt(10, sms.getHistory());
            pstmt.setInt(11, sms.getSocial_Science());
            pstmt.setInt(12, sms.getGeneral_Science());
            pstmt.setInt(13, sms.getPhysics());
            pstmt.setInt(14, sms.getChemistry());
            pstmt.setInt(15, sms.getTotal_Marks());
            pstmt.setDouble(16, sms.getAverage());
            pstmt.setString(17, sms.getGrade());
            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return ret;
    }
 public boolean deleteStudentMarkSheetRecord(StudentMarkSheet dmr) {
        boolean ret = false;
        try {
            conn = mc.doConnect();
            pstmt = conn.prepareStatement("DELETE FROM STUDENTMARKSHEET WHERE Student_Roll_Number=?");
            pstmt.setInt(1, dmr.getStudent_Roll_Number());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                ret = true;
            }

        } catch (Exception e) {

        } finally {
            try {
                pstmt.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
        return ret;
    }

}
