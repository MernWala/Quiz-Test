package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class connect {

    final public static String USER = "root";
    final public static String PATH = "jdbc:mysql://localhost:3306/quizeproject";
    final public static String PASS = "Kashyap@9798";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(PATH, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception in getConnection()");
        }
        return con;
    }

    public int registerStudent(String stuEnroll, String stuName) {
        try {
            Connection con = getConnection();
            String query = "insert into registeredStudent(Enrollment, Name) values (?, ?);";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, stuName);
            st.setString(2, stuEnroll);
            int i = st.executeUpdate();
            con.close();
            return i;
        } catch (SQLException e) {
            System.out.println("Exception in registerStudent()");
            System.out.println(e);
        }
        return -1;
    }

    public static void main(String[] args) {
        connect obj = new connect();        
    }
}
