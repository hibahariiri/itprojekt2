package org.example.mysql;


import java.sql.Connection;
import java.sql.Date;

public class DBtester {

    public static void main(String[] args) {

        mySQL sql = new mySQL();

        Connection connection = null;
        String SQLITEDriver = "jdbc:sqlite:";
        String MYSQLDriver = "jdbc:mysql://" + "localhost:3306/";
        String password = "Dgy99yhf123";

        Connection conn = sql.getMYSQLConnection("root", "Dgy99yhf123", "IT2");

        AnvendDB anvendDB = new AnvendDB(conn);

        java.util.Date javadate = new java.util.Date();
        Date date = new Date(System.currentTimeMillis());
        System.out.println(javadate);
        System.out.println(date);
        anvendDB.insertMeasurementsIntoTable(date,1234567891);


    }

}


