package educacion;

/**
 *
 * @author cavargas10
 */
public class Universidad {

    private String nombre;
    private Carrera[] listaCarreras;
    private int AlumnosUniversidad;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerListaCarreras(Carrera[] lista) {
        listaCarreras = lista;
    }

    public Carrera[] obtenerListaCarreras() {
        return listaCarreras;
    }
    
    public void establecerAlumnosUniversidad(int alumnUni){
        AlumnosUniversidad = alumnUni;
    }
    
    public int obtenerAlumnosUniversidad(){
        return AlumnosUniversidad;
    }

}
