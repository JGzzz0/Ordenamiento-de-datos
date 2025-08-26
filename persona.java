import java.time.LocalDate;

public class persona implements Comparable<persona> {
    String nombre;
    private LocalDate fechaNacimiento;

    public persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(persona otra) {
        if (this.fechaNacimiento.isAfter(otra.fechaNacimiento)) {
            return 1;
        } else if (this.fechaNacimiento.isBefore(otra.fechaNacimiento)) {
            return -1;
        } else {
            return 0;
        }
    }

    
    @Override
    public String toString() {
        return nombre + " - " + fechaNacimiento;
    }
}