package educacion;

/**
 *
 * @author cavargas10
 */
public class Ciclo {

    private String nombre;
    private int numAlumnos;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNumAlumnos(int nalum) {
        numAlumnos = nalum;
    }

    public int obtenerNumAlumnos() {
        return numAlumnos;
    }
}
