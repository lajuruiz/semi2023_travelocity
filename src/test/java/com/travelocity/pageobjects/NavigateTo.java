package com.travelocity.pageobjects;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theTravelocityHomePage(){
        return Task.where("{0} open Travelocity",
                Open.browserOn().the(TravelocityHomePage.class));


    }
}
