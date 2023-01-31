package com.travelocity.tasks;

import com.travelocity.userinterfaces.DetalleVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDestinoVueloSencillo implements Task {

    private static String destino;

    public SeleccionarDestinoVueloSencillo(String destino){
        this.destino = destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(DetalleVuelos.BUT_DESTINO),
                Enter.theValue(this.destino).into(DetalleVuelos.INPUT_DESTINO).thenHit(Keys.ENTER),
                Click.on(DetalleVuelos.BUT_BUSCAR)

        );
    }
    public  static Performable destino(String destino){
        return instrumented(SeleccionarDestinoVueloSencillo.class, destino);
    }
}
