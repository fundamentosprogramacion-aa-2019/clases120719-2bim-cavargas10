/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author cavargas10
 */
public class Paralelo {

    private String nombre;
    private Asignatura[] listaAsignatura;
    private double creditosParalelo;
    
    public void establecerCreditosParalelo(){
        double suma = 0;
        for (int i = 0; i < listaAsignatura.length ; i++) {
            suma = suma + listaAsignatura[i].obtenerCredito();
        }
        creditosParalelo = suma;
    }
    
    public double obtenerCreditosParalelo(){
        return creditosParalelo;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerListaAsignatura(Asignatura[] lista) {
        listaAsignatura = lista;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Asignatura[] obtenerListaAsignatura() {
        return listaAsignatura;
    }
    
    
}
