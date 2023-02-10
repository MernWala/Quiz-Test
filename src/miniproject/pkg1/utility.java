package miniproject.pkg1;

import static com.connection.connect.getConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class utility extends miniproject.pkg1.startPage {

    public static ArrayList<String> questions, option1, option2, option3, option4, answer;

    Color hoverClr = new Color(153, 153, 153);

    public static void BorderSpacing(JTextField field, int t, int l, int b, int r) {
        field.setBorder(BorderFactory.createCompoundBorder(
                field.getBorder(), BorderFactory.createEmptyBorder(t, l, b, r)
        ));
    }

    public static void BorderSpacing(JLabel field, int t, int l, int b, int r) {
        field.setBorder(BorderFactory.createCompoundBorder(
                field.getBorder(), BorderFactory.createEmptyBorder(t, l, b, r)
        ));
    }

    public static void BorderSpacing(JButton btn, int t, int l, int b, int r) {
        btn.setBorder(BorderFactory.createCompoundBorder(
                btn.getBorder(), BorderFactory.createEmptyBorder(t, l, b, r)
        ));
    }

    public static void BorderSpacing(JPanel btn, int t, int l, int b, int r) {
        btn.setBorder(BorderFactory.createCompoundBorder(
                btn.getBorder(), BorderFactory.createEmptyBorder(t, l, b, r)
        ));
    }

    public static void getTableDataFromDB(String tableName) {
        try {
            Connection con = getConnection();
            String query = "Select * from " + tableName;
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            questions = new ArrayList<>();
            option1 = new ArrayList<>();
            option2 = new ArrayList<>();
            option3 = new ArrayList<>();
            option4 = new ArrayList<>();
            answer = new ArrayList<>();

            while (rs.next()) {
                questions.add(rs.getString("Questions"));
                option1.add(rs.getString("Option1"));
                option2.add(rs.getString("Option2"));
                option3.add(rs.getString("Option3"));
                option4.add(rs.getString("Option4"));
                answer.add(rs.getString("answer"));
            }

        } catch (SQLException e) {
            System.out.println("Exception occur in getTableDataFromDB()");
        }
    }

    public static boolean setTextToAllLablesComponents(JLabel Qno, JTextArea que, JRadioButton op1, JRadioButton op2, JRadioButton op3, JRadioButton op4, int i, String testName) {
        getTableDataFromDB(testName);
        if (i == option1.size()) {
            return false;
        } else {
            Qno.setText(utility.changeQuestionNo(i + 1));
            que.setText(questions.get(i));
            op1.setText(option1.get(i));
            op2.setText(option2.get(i));
            op3.setText(option3.get(i));
            op4.setText(option4.get(i));
        }
        return true;
    }

    public static String changeQuestionNo(int a) {
        return "Que " + a + ")";
    }

    public static String getValue_JRadio(JRadioButton a, JRadioButton b, JRadioButton c, JRadioButton d, JRadioButton e) {
        if (a.isSelected()) {
            return "A";
        } else if (b.isSelected()) {
            return "B";
        } else if (c.isSelected()) {
            return "C";
        } else if (d.isSelected()) {
            return "D";
        } else if (e.isSelected()) {
            return "Y";
        } else {
            return "Blank";
        }
    }

    public static boolean isAnySelected(JRadioButton a, JRadioButton b, JRadioButton c, JRadioButton d, JRadioButton e) {
        return a.isSelected() || b.isSelected() || c.isSelected() || d.isSelected() || e.isSelected();
    }

//    public static void main(String[] args) {
//        getTableDataFromDB("PracticeSet1");
//        System.out.println(option1 + " Size: "+option1.size());
//        System.out.println(option2 + " Size: "+option2.size());
//        System.out.println(option3 + " Size: "+option3.size());
//        System.out.println(option4 + " Size: "+option4.size());
//    }
}
