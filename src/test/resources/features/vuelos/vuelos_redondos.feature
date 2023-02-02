# language: es
Característica: Vuelos redondos
  Yo como viajero
  quiero diseñar vuelos de ida y regreso
  para facilitar mis viajes de paseo

  Escenario: vuelo redondo con opciones por defecto
    Dado Laura esta en "medellín"
    Cuando quiera viajar a "Cancún" por 15 dias
    Entonces debe obtener alguna opcion de vuelo

  Escenario: vuelo redondo en primera clase
    Dado "Laura" esta en "bogota" y desea conseguir un vuelo en "primera clase"
    Cuando desee viajar a "canada" por 20 dias
    Entonces debe obtener alguna opcion de viaje en primera clase

  Escenario: vuelo redondo para 3 personas con opcion de primera clase
    Dado Laura esta en bogota
    Y necesita un vuelo para tres personas
    Cuando quiera viajar a Mexico por 12 dias en primera clase
    Entonces debe obtener alguna opcion de viaje

  @manual
  Escenario: vuelo redondo con opcion clase economica premium
    Dado Diego esta en Medellin
    Cuando quiera viajar a Cancun en clase economica premium por 15 dias
    Entonces debe obtener al menos una opcion de viaje

  @manual
  Escenario: vuelo redondo con opción de agregar auto
    Dado Laura esta en Medellin
    Cuando quiera viajar a Cancun agregando un auto
    Entonces debe obtener alguna opcion de auto

  @manual
  Escenario: vuelo redondo con opción de agregar hospedaje
    Dado Diego esta en Medellin
    Cuando quiera viajar a Cancun agregando un hospedaje por 8 dias
    Entonces debe obtener alguna opcion de viaje
    Y  debe obtener alguna opcion de hospedaje