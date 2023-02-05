# language: es
Característica: Hospedaje
  Yo como viajero
  quiero realizar las reservas
  para facilitar mi hospedaje en los lugares donde vaya

  Escenario: hospedaje en Honolulu con opciones por defecto
    Dado "Laura" esta en "Honolulu" y quiere realizar una reserva en un hotel
    Cuando realice el proceso de reserva por 8 dias para 4 Adultos
    Entonces debe visualizar por lo menos una opcion de hotel

@manual
  Escenario: hospedaje en hotel Dann Carlton
    Dado quiero hospedarme en Hotel Dann Carlton Bogota
    Cuando quiero reservar por 8 días para 3 adultos
    Entonces debo visualizar 3 opciones de habitacion


