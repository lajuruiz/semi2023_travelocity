package com.travelocity.utilidades;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FechaActual{
    public static void main(String[] args) {
        DateFormat dateformat = new SimpleDateFormat("d MMM yyyy");
        String date = dateformat.format(new Date());

        System.out.println(date);
    }
}
