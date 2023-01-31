#language:es

Característica: vuelos sencillos

  Escenario: vuelo sencillo con opciones por defecto
    Dado "django" esta en "bogota" y necesita un vuelo sencillo
    Cuando quiera viajar a "cali"
    Entonces debo obtener al menos una opcion de viaje

