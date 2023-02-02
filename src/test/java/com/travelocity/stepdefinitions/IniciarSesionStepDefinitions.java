package com.travelocity.stepdefinitions;

import com.travelocity.pageobjects.TravelocityHomePage;
import com.travelocity.tasks.SeleccionarInicioSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class IniciarSesionStepDefinitions {

    @Dado("{actor} esta en la pagina de travelocity")
    public void esta_en_la_pagina_de_travelocity(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class)
        );
    }
    @Cuando("inicia sesion con {string} y {string}")
    public void quiera_iniciar_sesion(String correoElectronico, String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarInicioSesion.iniciarSesion("laurajulianaru@gmail.com",  "%Nai2456823176")
        );
    }
    @Entonces("{actor} debera iniciar sesion correctamente")
    public void debera_iniciar_sesion_correctamente(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(TravelocityHomePage.class)
        );
    }

}
