package com.travelocity.utilidades;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class SeleccionarFechas {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));

        public String getFechaInicialFormateada() {
            LocalDate fechaInicial = LocalDate.now();
            return fechaInicial.format(formato);
        }

        public String getFechaFinalFormateada(Integer diasViaje) {
            LocalDate fechaInicial = LocalDate.now();
            LocalDate fechaFinal = fechaInicial.plusDays(diasViaje);
            return fechaFinal.format(formato);
        }
}

