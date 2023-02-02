package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Link;

public class SeleccionarVueloClase {
    public static Performable en(String tipoDeClase){
        return Task.where("{0} abrir pagina de  travelocity en vuelos y selecciona la clase deseada {1}",
                Click.on(DetalleVuelos.DIV_TIPO_CLASE_VUELO),
                Click.on(Link.withText(tipoDeClase))
        );
    }
}
