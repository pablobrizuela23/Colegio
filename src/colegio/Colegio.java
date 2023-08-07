
package colegio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class Colegio {

    private HashSet<Alumno> al;
    private ArrayList<Alumno> listaAlumnos;

    public Colegio() {
        this.al = new HashSet<>();
        
    }
    
    public void agregarAlumno(Alumno alumno) {
        al.add(alumno);
    }

    public void quitarAlumno(int legajo){
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getLegajo()==legajo) {
                al.remove(alumno);
            }
        }
       
       
        
        
    }
    
    public void lista(){
       listaAlumnos = new ArrayList(al);
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
    
    public void ordenPorApellido(){
        Collections.sort(listaAlumnos, Comparadores.apellido);
    }
}
