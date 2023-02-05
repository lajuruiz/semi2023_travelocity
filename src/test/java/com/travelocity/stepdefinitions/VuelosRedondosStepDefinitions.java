package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoVuelos;
import com.travelocity.tasks.SeleccionarOrigenVuelos;
import com.travelocity.tasks.SeleccionarVueloClase;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


public class VuelosRedondosStepDefinitions {

    @Dado("{actor} esta en {string}")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.para(origen)
        );
    }
    @Cuando("quiera viajar a {string} por {int} dias desde la fecha actual")
    public void viajeDestinoConDias(String destino, Integer cantidadDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.destinoYDias(destino, cantidadDias)
        );
    }

    @Entonces("debe obtener alguna opcion de vuelo")
    public void viajeObtenerAlgunaOpcion() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }

    @Dado("{actor} esta en {string} y desea conseguir un vuelo en {string}")
    public void vueloOrigen(Actor actor, String origen, String tipoclaseVuelo) {
        actor.attemptsTo(
                SeleccionarOrigenVuelos.para(origen),
                SeleccionarVueloClase.en(tipoclaseVuelo)
        );
    }
    @Cuando("desee viajar a {string} por {int} dias desde la fecha actual")
    public void viajeDestino(String destino, int diasViaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVuelos.destinoYDias(destino, diasViaje)
        );
    }
    @Entonces("debe obtener alguna opcion de viaje en primera clase")
    public void opcionViajeEnClaseEconomica() {
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);
    }
}
