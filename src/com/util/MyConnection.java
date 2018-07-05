
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MyConnection {
     String url;
    String user;
    String pass;
    Connection conn;

    public Connection doConnect() {

        try {
            url = "jdbc:mysql://localhost:3306/school";
            user = "root";
            pass = "32079";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, cnfe);
        }
        return conn;
    }
}
