import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaActual {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("MMM");

        String fechaFormateada = fechaActual.format(formateador);

        fechaFormateada = fechaFormateada.toUpperCase();

        System.out.println("El mes actual es: " + fechaFormateada);
    }
}