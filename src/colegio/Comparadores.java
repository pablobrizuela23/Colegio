
package colegio;

import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Alumno> apellido= new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getApellido().compareTo(t.getApellido());
        }
    };
}
