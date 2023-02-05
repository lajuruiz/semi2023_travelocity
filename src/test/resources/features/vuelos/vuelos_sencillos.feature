#language:es
Característica: vuelos sencillos

  Escenario: vuelo sencillo con opciones por defecto
    Dado "Django" esta en "Bogota" y necesita un vuelo sencillo
    Cuando quiera viajar a "Cali"
    Entonces debo obtener al menos una opcion de viaje


  Escenario: vuelo sencillo para dos personas con clase ejecutiva
    Dado Samuel esta en Pereira
    Y    necesita un vuelo sencillo para dos personas
    Cuando quiera viajar a "cartagena" en clase ejecutiva
    Entonces debo obtener por lo menos una opcion de viaje


  Escenario: vuelo sencillo con hospedaje
    Dado Gloria esta en San andres
    Y necesita vuelo sencillo con hospedaje
    Cuando quiera viajar a Medellin
    Entonces debe obtener alguna opcion de viaje
    Y debe obtener alguna opcion de hospedaje
