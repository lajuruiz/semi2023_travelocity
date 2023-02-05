package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuTravelocity {
    public static final Target A_VUELOS = Target.the("menu de vuelos").locatedBy("//span[text()='Vuelos']/..");
    public static final Target SENCILLO_TIPO_VUELOS = Target.the("button de tipo de viaje").locatedBy("//span[text()='Viaje sencillo']");
    public static final Target A_ACTIVIDADES = Target.the("menu de actividades").locatedBy("//span[text()='Actividades']/..");

}

