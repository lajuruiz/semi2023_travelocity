#language:es
Característica: actividades

  Escenario: renta de autos con opciones por defecto
    Dado "Django" esta en "Pasto" y necesita rentar un auto con entrega a las "0800AM"
    Cuando va a realiza el proceso de reserva para 4 dias con entrega en "Pasto"
    Y con hora de devolucion a las "1600PM"
    Entonces debe obtener por lo menos una opcion de carro
