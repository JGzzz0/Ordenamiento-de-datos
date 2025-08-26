import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        persona[] personas = new persona[10];
        // Ejemplo de fechas de nacimiento
        personas[0] = new persona("Ana", LocalDate.of(2005, 5, 10)); // 2000-06-10
        personas[1] = new persona("Luis", LocalDate.of(1999, 3, 15)); // 1999-04-15
        personas[2] = new persona("Carlos",  LocalDate.of(2020, 7, 20)); // 2001-08-20
        personas[3] = new persona("Maria",  LocalDate.of(1985, 1, 5)); // 1998-02-05
        personas[4] = new persona("Sofia",  LocalDate.of(2015, 11, 25)); // 2002-12-25
        personas[5] = new persona("Pedro",  LocalDate.of(2005, 9, 30)); // 1997-10-30
        personas[6] = new persona("Lucia",  LocalDate.of(1999, 8, 1)); // 2003-01-01
        personas[7] = new persona("Miguel", LocalDate.of (2016, 6, 12)); // 1996-07-12
        personas[8] = new persona("Elena",  LocalDate.of(2018, 2, 18)); // 2004-03-18
        personas[9] = new persona("Jorge",  LocalDate.of(1998, 8, 22)); // 1995-09-22

        System.out.println("Antes de ordenar:");
        for (persona p : personas) {
            System.out.println(p.getFechaNacimiento() + " - " + p.nombre);
        }

        burbuja(personas);

        System.out.println("\nDespués de ordenar:");
        for (persona p : personas) {
            System.out.println(p.getFechaNacimiento() + " - " + p.nombre);
        }
    }

    // Método burbuja para ordenar por fecha de nacimiento
    public static void burbuja(persona[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    persona temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
