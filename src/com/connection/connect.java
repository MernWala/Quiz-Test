package com.connection;

import Admin.Rules;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

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

    public static void createTable(String tableQuery) {
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            st.executeUpdate(tableQuery);
        } catch (SQLException e) {
            System.out.println("Exception in createTable()");
            e.printStackTrace();
        }
    }

    public static boolean insert_into_DB(String table, int col, String[] ans, String Enroll) {
        try {
            String query = Rules.genrateQuery_insertInto(table, col);
            Connection con = connect.getConnection();
            PreparedStatement st = con.prepareStatement(query);

            st.setString(1, Enroll);
            
            for (int i = 2; i <= col + 1; i++) {
                st.setString(i, ans[i - 2]);
            }
            int i = st.executeUpdate();
            con.close();
            return i > 0;
        } catch (SQLException e) {
            System.out.println("Exception in insert_into_DB()");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        connect obj = new connect();

//        connect.createTable();
        connect.createTable(Rules.genrateQuery_createTable(Rules.testNameAns, 10));
        
        String[] ans = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        connect.insert_into_DB(Rules.testNameAns, Rules.totalQuestion, ans, "0103cs213d16");

        
    }
}
