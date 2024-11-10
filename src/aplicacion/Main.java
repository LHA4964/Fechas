package aplicacion;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Formato de fecha en España (día/mes/año hora:minuto:segundo)
        DateTimeFormatter formatoEspannolFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoEspannolHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatoEspannol = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        //1. La fecha actual local
        LocalDate fechaMadrid = LocalDate.now();
        System.out.println("Fecha actual local: "+fechaMadrid.format(formatoEspannolFecha));

        //2. La fecha actual en caracas
        LocalDate fechaCaracas = LocalDate.now(ZoneId.of("America/Caracas"));
        System.out.println("Fecha actual en Caracas: "+fechaCaracas.format(formatoEspannolFecha));

        //3. Los años transcurridos desde el descubrimiento de América
        LocalDate fechaDescubrimientoAmerica = LocalDate.of(1492, Month.OCTOBER, 12);
        long annosDesdeDescubrimiento = ChronoUnit.YEARS.between(fechaDescubrimientoAmerica, LocalDate.now());
        System.out.println("Annos transcurridos desde el descubrimiento de América: "+annosDesdeDescubrimiento);

        //4. La hora actual
        LocalTime horaMadrid = LocalTime.now();
        System.out.println("Hora actual local: "+horaMadrid.format(formatoEspannolHora));

        //5. La hora actual en Caracas
        LocalTime horaCaracas = LocalTime.now(ZoneId.of("America/Caracas"));
        System.out.println("Hora actual en Caracas: "+horaCaracas.format(formatoEspannolHora));

        //6. Las horas de diferencia entre Madrid y Caracas
        long diferenciaHoras = ChronoUnit.HOURS.between(horaCaracas, horaMadrid);
        System.out.println("Diferencia de horas entre Madrid y Caracas: "+diferenciaHoras+" Horas");

        //7. La fecha y la hora cuando Neil Armstrong pisó la luna
        LocalDateTime aterrizajeLuna = LocalDateTime.of(1969, 7, 21, 3, 56);
        System.out.println("Fecha y hora cuando Neil Armstrong pisó la luna (hora de Madrid): "+ aterrizajeLuna.format(formatoEspannol));
    }
}