#language:es

Característica: Inicio de sesion
  yo como usuaria de la pagina
  quiero ingresar siempre que necesite
  programar un viaje

  Escenario: Inicio de sesion en pagina web
    Dado "Laura" esta en la pagina de travelocity
    Cuando inicia sesion con "correo" y "contrasena"
    Entonces "Laura" debera iniciar sesion correctamente


 Escenario: Cerrar sesion en pagina web
   Dado "Laura" esta logueada en la pagina travelocity
   Cuando cierra sesion
   Entonces deberia ver la sesion cerrada
