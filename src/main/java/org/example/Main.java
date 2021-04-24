package org.example;


import org.example.mysql.DBtester;
import org.example.mysql.mySQL;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static Object SensorPulsoxi;

    public static void main(String[] args) throws FileNotFoundException {

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        SensorTemp ST = new SensorTemp();
        SensorPulsoxi SP = new SensorPulsoxi();
        Scanner Tastatur = new Scanner(System.in);

        //Her kan man indtaste sin alder.
        System.out.println("Indtast din alder: ");
        int alder;
        alder = Tastatur.nextInt();
        Tastatur.nextLine();

        if (alder <= 11) {
            System.out.println("Du er barn, og din temperatur ligger på: " + numberFormat.format(ST.temperaturB()));
        } else {
            System.out.println("Du er voksen, og din temperatur ligger på: " + numberFormat.format(ST.temperaturV()));
        }

        System.out.println("Din puls ligger på: " + SP.puls());

        System.out.println("Din iltmætning ligger på: " + numberFormat.format(SP.SpO2()) + "%");

        SensorPulsoxi SensorPulsoxi = new SensorPulsoxi();

        mySQL singleton = new mySQL();
        DBtester dbt = new DBtester();


        }
}




