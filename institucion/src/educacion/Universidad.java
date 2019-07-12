package educacion;

/**
 *
 * @author cavargas10
 */
public class Universidad {

    private String nombre;
    private Carrera[] listaCarrera;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public String obtenerNombre (){
        return nombre;
    }
    public void establecerListaCarrera(Carrera[] lista){
        listaCarrera = lista;
    }
    public Carrera[] obtenerListaCarrera(){
        return listaCarrera;
    }
}
