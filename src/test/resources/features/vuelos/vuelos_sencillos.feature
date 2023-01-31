#language:es

Característica: vuelos sencillos

  Escenario: vuelo sencillo con opciones por defecto
    Dado "django" esta en "bogota" y necesita un vuelo sencillo
    Cuando quiera viajar a "cali"
    Entonces debo obtener al menos una opcion de viaje

  /home/lajuruiz/Documentos/semi20223_travelocity/src/test/resources/features/vuelos/vuelos_sencillos.feature