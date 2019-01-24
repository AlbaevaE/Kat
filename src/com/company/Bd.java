package com.company;

import java.sql.*;


public class Bd {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "Babushka85";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


//    public int getTrainersCount() {
//        String SQL = "SELECT count(*) FROM coucher";
//        int count = 0;
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(SQL)) {
//            rs.next();
//            count = rs.getInt(1);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return count;
//    }
//
//    public String getTrainersName() {
//        String SQL = "SELECT coucher_id, full_name, phone_number from coucher";
//        String s = "";
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(SQL)) {
//            while (rs.next()) {
//                System.out.println(rs.getInt("coucher_id") + ": " +
//                        rs.getString("full_name") + ": " +
//                        rs.getString("phone_number"));
//            }
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return s;
//    }
//
//    public int getStudentsName() {
//        String SQL = "SELECT count(*) FROM student where student_name like '%a%'";
//        int count = 0;
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(SQL)) {
//            rs.next();
//            count = rs.getInt("count");
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return count;
//    }
//
//    public String getGroup() {
//        String SQL = "SELECT  grup_id, grup_name from grup";
//        String s = "";
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(SQL)) {
//            while (rs.next()) {
//                System.out.println(rs.getInt("grup_id") + ": " +
//                        rs.getString("grup_name"));
//            }
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return s;
//    }

    public int getTrainersWageAll() {
        String SQL = "SELECT SUM(wage) FROM sport";
        int a = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {

                System.out.println("Summa zp: "+rs.getInt("sum") + ": ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public String getTrainersInfo() {
        String SQL = "select  t.full_name, s.wage\n" +
                "from coucher t join sport s\n" +
                "on s.sport_type_id = t.sport_type_id";
        String k = " ";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {

                System.out.println("Info: "+rs.getString("full_name") + ": "+
                rs.getString("wage"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return k;
    }


//    public String getTrainersNameWhoHasMoreSimbols(){   //Вот так я пыталась реализовать свою функцию
//        String SQL = "SELECT full_name from coucher";
//        String string = " ";
//        String[] stArray = string.split(" ");
//
//        char[] str = stArray.toCharArray();
//        for (int i = 0; i < str.length; i++) {
//        for(int j = 0; j <= stArray.length;j++){
//            if(stArray[0] > str[3]){
//                System.out.println("Molodec!");
//            }
//        }
//        }
//        try(Connection conn = connect();
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery(SQL)){
//            while(rs.next()){
//                System.out.println("Info: "+rs.getString("full_name")
//           );
//
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return string;
//
//        }

    public String TrainersInfo(){    //Эту функцию я списала. Она выводит только одно имя
        String SQL = "select full_name from coucher";
        String count = " ";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()){
                count=(rs.getString("full_name"));
                if(count.contains(" ")){
                    count= count.substring(0, count.indexOf(" "));
                    if(count.length()>3){
                        System.out.println(count+" Молодец!");
                    }
                }
            }
            count = rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
}






