package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoVueloSencillo;
import com.travelocity.tasks.SeleccionarOrigenVueloSencillo;
import com.travelocity.userinterfaces.VuelosEncontrados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VuelosSencillosStepDefinitions {
    @Dado("{actor} esta en {string} y necesita un vuelo sencillo")
    public void viajeOrigen(Actor actor, String origen) {
        actor.attemptsTo(
               SeleccionarOrigenVueloSencillo.para(origen)
        );
    }
    @Cuando("quiera viajar a {string}")
    public void viajeDestino(String destino) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarDestinoVueloSencillo.destino(destino)
        );
    }

    @Entonces("debo obtener al menos una opcion de viaje")
    public void viajeObtenerAlgunaOpcion(){
        Ensure.that(VuelosEncontrados.LIST_VUELOS_ENCONTRADOS).values().hasSizeGreaterThan(0);

    }
}
