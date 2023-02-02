package com.travelocity.tasks;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.userinterfaces.DetalleActividades;
import com.travelocity.userinterfaces.MenuTravelocity;
import net.serenitybdd.core.pages.WebElementExpectations;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.travelocity.userinterfaces.DetalleActividades.BUT_ACTIVIDADES;

public class SeleccionarDestinoActividades {

    public static Performable para (String actividadesName) {
        return Task.where("{0} abrir travelocity en vuelos y seleccionar actividades {1}",
                Open.browserOn().the(TravelocityHomePage.class),
                Click.on(MenuTravelocity.A_ACTIVIDADES),
                Click.on(BUT_ACTIVIDADES),
                Enter.theValue(actividadesName).into(DetalleActividades.INPUT_ACTIVIDADES).thenHit(Keys.ENTER)


        );
    }

}

