package com.company;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {

        Bd bd = new Bd();
        bd.connect();
//        System.out.println(bd.getTrainersCount());
//        System.out.println(bd.getTrainersName());
//        System.out.println("В группе "+bd.getStudentsName()+" студентов");
//        System.out.println(bd.getGroup());
        bd.getTrainersWageAll();
        bd.getTrainersInfo();
        bd.TrainersInfo();

    }

}






