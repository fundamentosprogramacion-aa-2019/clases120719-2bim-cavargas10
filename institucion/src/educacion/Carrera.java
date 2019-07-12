package educacion;

/**
 *
 * @author cavargas10
 */
public class Carrera {

    private String nombre;
    private Ciclo[] listaCiclo;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public String obtenerNombre (){
        return nombre;
    }
    public void establecerListaCiclo(Ciclo[] lista){
        listaCiclo = lista;
    }
    public Ciclo[] obtenerListaCiclo(){
        return listaCiclo;
    }
}
