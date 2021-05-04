package org.example.mysql;


import org.example.SensorPulsoxi;
import org.example.SensorTemp;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class AnvendDB {

    SensorTemp sensortemp = new SensorTemp();
    SensorPulsoxi sensorpulsoxi= new SensorPulsoxi();


    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public AnvendDB(Connection conn) {

        this.connection = conn;
    }

    public ArrayList getTemperatureMeasurements(){

        ArrayList out = new ArrayList();

        return out;
    }

    public void insertMeasurementsIntoTable(Date tidspunkt, int CPR) {

        //TO DO : Del metoden op i tre.


        Double randomtemp = sensortemp.temperaturV();
        String SQL = "INSERT INTO Temptable (Valuetemp,Tidspunkt,CPR) VALUES (?,?,?)";

        try {

            preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setDouble(1, randomtemp);
            preparedStatement.setDate(2, tidspunkt);
            preparedStatement.setInt(3, CPR);

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





















