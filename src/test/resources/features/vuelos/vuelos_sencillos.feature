#language:es
Característica: vuelos sencillos

  Escenario: vuelo sencillo con opciones por defecto
    Dado "django" esta en "bogota" y necesita un vuelo sencillo
    Cuando quiera viajar a "cali"
    Entonces debo obtener al menos una opcion de viaje


  Escenario: vuelo sencillo para dos personas con clase ejecutiva
    Dado Samuel esta en Pereira
    Y    necesita un vuelo sencillo para dos personas
    Cuando quiera viajar a "cartagena" en clase ejecutiva
    Entonces debo obtener al menos una opcion de viaje


  Escenario: vuelo sencillo con hospedaje
    Dado gloria esta en san andres
    Y necesita vuelo sencillo con hospedaje
    Cuando quiera viajar a medellin
    Entonces debe obtener alguna opcion de viaje
    Y debe obtener alguna opcion de hospedaje
