package org.example.mysql;


import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

public class DBtester {

    public static void main(String[] args) {

        mySQL sql = new mySQL();      // definere object sql

        Connection connection = null;
        String SQLITEDriver = "jdbc:sqlite:";
        String MYSQLDriver = "jdbc:mysql://" + "localhost:3306/";// adresses på mysql
        String password = "hej123"; // koden til mig sql

        Connection conn = sql.getMYSQLConnection("root", "hej123", "IT2");// danees connection til mysql

        AnvendDB anvendDB = new AnvendDB(conn);// object af klassen anvenddb hvor vi indsætter forbindelsen

        java.util.Date javadate = new java.util.Date(); // object af pakken java.util.data
        Date date = new Date(System.currentTimeMillis());// atribut med current date som værdi
        System.out.println(javadate);
        System.out.println(date);
        anvendDB.insertMeasurementsIntoTable(date,1234567891);// hvilke date og cpr- værdi der skal ind i my sql i klassen anvenddb

        ArrayList Double = new ArrayList(); // ubrugelig
        Double = anvendDB.getTemperatureMeasurements(); //same here

    }

}


