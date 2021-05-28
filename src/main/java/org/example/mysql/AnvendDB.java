package org.example.mysql;


import org.example.SensorPulsoxi;
import org.example.SensorTemp;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class AnvendDB {

    //Objekter af de to klasser.
    SensorTemp sensortemp = new SensorTemp();
    SensorPulsoxi sensorpulsoxi= new SensorPulsoxi();

    //Attributter ?????????????? eller variabel ?????????????????
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    //????????????????????????
    public AnvendDB(Connection conn) {

        this.connection = conn;
    }

    //Her danner vi en liste, med temperatur målinger som vi indsætter i næste metode.
    public ArrayList getTemperatureMeasurements(){

        ArrayList out = new ArrayList();

        return out;
    }

    //I denne metode indsætter vi målingerne i tabellerne i mySQL. / vi fortæller tabellen hvilke målinger der skal indsættes.
    public void insertMeasurementsIntoTable(Date tidspunkt, int CPR) {

        //obejct til tempepratur fra klassen sensortemp som navngives randomtemp
        Double randomtemp = sensortemp.temperaturV();
        //indikerer hvilken tabel de forskellige værdier skal indsættes i
        String SQL = "INSERT INTO Temptable (Valuetemp,Tidspunkt,CPR) VALUES (?,?,?)";

        try {
            //kobler koden for nede med string sql for oven
            preparedStatement = connection.prepareStatement(SQL);

            // indikere hvor de forskellige værdi skal indsættets inde i sql database
            preparedStatement.setDouble(1, randomtemp);
            preparedStatement.setDate(2, tidspunkt);
            preparedStatement.setInt(3, CPR);

            // return af rækker
            preparedStatement.executeUpdate();

            System.out.println("Kolonne 1 indsat");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        int randompuls = sensorpulsoxi.puls();
        String SQL1 = "INSERT INTO pulstable (Valuepuls,Tidspunkt,CPR) VALUES (?,?,?)";
        try {

            preparedStatement = connection.prepareStatement(SQL1);

            preparedStatement.setDouble(1, randompuls);
            preparedStatement.setDate(2, tidspunkt);
            preparedStatement.setInt(3, CPR);

            preparedStatement.executeUpdate();

            System.out.println("Kolonne 2 indsat");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        double randomspo2 = sensorpulsoxi.SpO2();
        String SQL2 = "INSERT INTO spO2table (ValueSpo2,Tidspunkt,CPR) VALUES (?,?,?)";
        try {

            preparedStatement = connection.prepareStatement(SQL2);

            preparedStatement.setDouble(1, randomspo2);
            preparedStatement.setDate(2, tidspunkt);
            preparedStatement.setInt(3, CPR);

            preparedStatement.executeUpdate();

            System.out.println("Kolonne 3 indsat");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}





















