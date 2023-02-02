package com.travelocity.stepdefinitions;

import com.travelocity.tasks.SeleccionarDestinoActividades;
import com.travelocity.tasks.SeleccionarFechaActividades;
import com.travelocity.userinterfaces.ActividadesEncontradas;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


public class ActividadesStepDefinitions {
    @Dado("{actor} esta buscando actividades en {string}")
    public void destinoActividades(Actor actor , String destino) {
        actor.attemptsTo(
                     SeleccionarDestinoActividades.para(destino)
                );
    }
    @Cuando("este alli por {int} dias")
    public void actividadesDias(Integer cantidadDeDias) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarFechaActividades.dias(cantidadDeDias)
        );
    }
    @Entonces("espera obtener al menos una actividad")
    public void espera_obtener_al_menos_una_actividad() {
        Ensure.that(ActividadesEncontradas.ACTIVIDADES_ENCONTRADAS).values().hasSizeGreaterThan(0);
    }
}