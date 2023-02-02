package com.travelocity.tasks;

import com.travelocity.userinterfaces.FormularioInicioSesion;
import com.travelocity.userinterfaces.NavTravelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarInicioSesion implements Task {
    private String correoElectronico;
    private String contrasena;

    public SeleccionarInicioSesion(String correoElectronico, String contrasena){
        this.correoElectronico=correoElectronico;
        this.contrasena=contrasena;
    }
    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(NavTravelocity.NAV_INICIAR_SESION),
                Click.on(FormularioInicioSesion.A_INICIAR_SESION)
               // Click.on(FormularioInicioSesion.INPUT_CORREO_ELECTRONICO)
                // Enter.theValue(this.correoElectronico).into(FormularioInicioSesion.INPUT_CORREO_ELECTRONICO).thenHit(Keys.ENTER)
                //Click.on(FormularioInicioSesion.INPUT_CONTRASENA)
                //Enter.theValue(this.contrasena).into(FormularioInicioSesion.INPUT_CONTRASENA).thenHit(Keys.ENTER)
                //Click.on(FormularioInicioSesion.INPUT_CAJA_SELECCION)
                //Click.on(FormularioInicioSesion.SUBMIT_BUTTON)


        );
    }
    public static Performable iniciarSesion(String correoElectronico, String contrasena) {
        return instrumented (SeleccionarInicioSesion.class, correoElectronico, contrasena);
    }
}

