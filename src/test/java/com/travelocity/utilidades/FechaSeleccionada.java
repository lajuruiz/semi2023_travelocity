package com.travelocity.utilidades;


import java.text.SimpleDateFormat;
import java.util.Date;
public class FechaSeleccionada {
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

    public String FechaInicialFormateada (){
        Date fechaActual = new Date();
        return formatoFecha.format(fechaActual);
    }
}