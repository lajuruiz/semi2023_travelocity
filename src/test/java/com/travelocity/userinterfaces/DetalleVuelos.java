package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.targets.Target;

public class DetalleVuelos {
    public static final Target BUT_ORIGEN = Target.the("button de origen").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target INPUT_ORIGEN = Target.the("input de origen").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target BUT_DESTINO = Target.the("button de destino").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target INPUT_DESTINO = Target.the("input de destino").locatedBy("//input[@id='location-field-leg1-destination']");
    public static final Target SELECT_DATE_REGRESO = Target.the("selector de fecha regreso").locatedBy("//button[@id='d2-btn']");
    public static final Target DATE_REGRESO = Target.the("calendar fecha regreso").locatedByFirstMatching("//button[@data-day='27']");
    public static final Target BUT_LISTO = Target.the("boton listo ").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target BUT_BUSCAR = Target.the("boton buscar vuelos").locatedBy("//button[@data-testid='submit-button']");

    public static final Target DIV_TIPO_CLASE_VUELO = Target.the("pestana para seleccionar el tipo de clase").locatedBy("//button[@id='preferred-class-input-trigger']");


}
