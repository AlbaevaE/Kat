package com.company;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

//        Bd bd = new Bd();
//        bd.connect();
////        System.out.println(bd.getTrainersCount());
////        System.out.println(bd.getTrainersName());
////        System.out.println("В группе "+bd.getStudentsName()+" студентов");
////        System.out.println(bd.getGroup());
//        bd.getTrainersWageAll();
//        bd.getTrainersInfo();
//        bd.TrainersInfo();

        Bd bd = new Bd();
//        System.out.println(bd.insertHuman(new Human(666,"Max")));
//        System.out.println(bd.insertHuman(new Human(999,"Kex")));
//        System.out.println(bd.insertCountries(new Countries(1,"Kyrgyz Republic")));
//        System.out.println(bd.insertCountries(new Countries(2,"Peru")));
//        System.out.println(bd.insertCountries(new Countries(3,"Jordan")));
//        System.out.println(bd.insertCountries(new Countries(4,"Japan")));
//        System.out.println(bd.insertCountries(new Countries(5,"Israel")));

        //  System.out.println(bd.insertCities(1,"Bishkek",));
        ArrayList<Town> arrayList = new ArrayList<>();
        ArrayList<Town> arrayList2 = new ArrayList<>();
        ArrayList<Town> arrayList3 = new ArrayList<>();

        arrayList.add(new Town(1, "Osh"));
        arrayList.add(new Town(2, "Osh"));
        arrayList.add(new Town(3, "Osh"));
        arrayList.add(new Town(4, "Osh"));
        arrayList.add(new Town(5, "Osh"));

//        for (Town t : arrayList) {
//            bd.insertTown(t);
//
//        }


        arrayList2.add(new Town(11, "St.P."));
        arrayList2.add(new Town(22, "St.P."));
        arrayList2.add(new Town(33, "St.P."));
        arrayList2.add(new Town(44, "St.P."));
        arrayList2.add(new Town(5, "St.P."));

//        for (Town t : arrayList2) {
//            bd.insertTown(t);
//            bd.sortingTownId(t);
//        }
       for(int i = 0; i < arrayList.size(); i++) {  //идея была такой
            int l = arrayList.get(i).length();
            if (arrayList.get(i).length() == arrayList2.get(i).length()) {
                arrayList3.add(arrayList.get(i));
                arrayList3.add(arrayList2.get(i));
            } else {

            }
            System.out.println(l);
        }
        for (Town t : arrayList3) {
            bd.insertTown(t);

            }





    }
//    public int sortingTownId(ArrayList arrayList){
//        int id = 0;
//        for(int i = 0; i <= arrayList.size(); i++){
//            if(arrayList.set(i,arrayList.get(i) == arrayList.get(i))){
//
//            }
//        }
//    }


}

class Town {
    int id;
    String name;

    public Town(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int length() {
        return 0;
    }
}

// class Countries {
//    int id;
//    String name;
//
//    public Countries(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}
//
//
//class Human  {
//    int id;
//    String name;
//
//    public Human(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}
//class Cities{
//    int id;
//    String name;
//    Countries countries;
//    Human human;
//
//    public Cities(Countries countries, Human human) {
//        this.countries = countries;
//        this.human = human;
//    }
//
//    public Cities(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}






