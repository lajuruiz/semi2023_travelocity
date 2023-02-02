package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class FormularioInicioSesion {

    public static final Target A_INICIAR_SESION = Target.the("enlace para iniciar sesion")
            .locatedBy("//a[@data-stid='link-header-account-signin']");
    public static final Target INPUT_CORREO_ELECTRONICO = Target.the("correo electronico")
            .locatedBy("//input[@name='email']");

    public static final Target INPUT_CONTRASENA = Target.the("contrasena")
                    .locatedBy("//input[@type='password']");

    public static final Target INPUT_CAJA_SELECCION = Target.the("caja para seleccionar mantener la sesion abierta")
            .locatedBy("//input[@id='loginFormRememberMeCheck']");
            ////input[@name='rememberMe']
    public static final Target SUBMIT_BUTTON = Target.the("iniciar sesion")
                    .locatedBy("//button[@id='loginFormSubmitButton']");
}

