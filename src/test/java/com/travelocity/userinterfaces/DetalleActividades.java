package com.travelocity.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class DetalleActividades {
    public static final Target BUT_ACTIVIDADES = Target.the("button de actividades").locatedBy("//button[@data-stid='location-field-location-menu-trigger']");
    public static final Target INPUT_ACTIVIDADES = Target.the("input actividades").locatedBy("//input[@id='location-field-location']");
    public static final Target SELECT_DATE_ACTIVIDADES = Target.the("selector de fecha regreso").locatedBy("//button[@id='d2-btn']");
    public static final Target DATE_ACTIVIDADES = Target.the("calendar fecha regreso").locatedByFirstMatching("//button[@data-day='26']");


}

