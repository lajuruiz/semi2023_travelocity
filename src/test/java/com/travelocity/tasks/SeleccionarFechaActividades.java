package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechaActividades implements Task {
    private Integer diasViaje;


    public SeleccionarFechaActividades (Integer diasViaje){
        this.diasViaje = diasViaje;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleVuelos.SELECT_DATE_REGRESO),
                Click.on(DetalleVuelos.DATE_REGRESO),
                Click.on(DetalleVuelos.BUT_LISTO),
                Click.on(DetalleVuelos.BUT_BUSCAR)
        );

    }

    public static Performable dias (Integer diasViaje){
        return instrumented(SeleccionarFechaActividades.class, diasViaje);
    }
}
