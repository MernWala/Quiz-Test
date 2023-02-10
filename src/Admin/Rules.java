package Admin;

public class Rules {

    public static String testName = "PracticeSet1";
    public static String testNameAns = "PracticeSet1_Ans";
    public static int totalQuestion = 10;

    public static String genrateQuery_createTable(String tabName, int colNo) {
        String temp = "CREATE TABLE IF NOT EXISTS " + tabName + "(Enrollment varchar(15) not null primary key, ";
        for (int i = 1; i <= colNo; i++) {
            temp = temp + ("OptionSelect_" + i) + " VARCHAR(1) not null, ";
        }
        temp = temp.substring(0, temp.length() - 2) + ");";
        return temp;
    }

    public static String genrateQuery_insertInto(String tabName, int colNo) {
        colNo += 1;
        String temp = "INSERT INTO " + tabName + " VALUES(";
        for (int i = 0; i < colNo; i++) {
            temp = temp + "?, ";
        }
        temp = temp.substring(0, temp.length() - 2) + ");";
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(genrateQuery_createTable("testing", 5));
        System.out.println(genrateQuery_insertInto("testing", 5));
    }
}
