
package colegio;

import java.util.Scanner;


public class Test {
    
    public static void main(String[] args) {
        Colegio cole = new  Colegio();
        
        boolean aux = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        while (aux) {
            System.out.println("INGRESE LEGAJO");
            int leg = leer.nextInt();
            
            leer.nextLine();
            
            System.out.println("INGRESE APELLIDO");
            String ap = leer.nextLine();
            
            System.out.println("INGRESE NOMBRE");
            String nom=leer.nextLine();
            
            System.out.println("INGRESE AÑO QUE CURSA");
            int anio = leer.nextInt();
            
            leer.nextLine();
            
            Alumno al = new Alumno(leg, ap, nom, anio);
            cole.agregarAlumno(al);
            
            System.out.println("DESEA AGREGAR OTRO ALUMNO? S/N");
            String deci = leer.nextLine();
            
            if (deci.equalsIgnoreCase("n")) {
                aux=false;
            }
            
        }
        
        cole.lista();
        System.out.println("");
        cole.quitarAlumno(1);
        cole.lista();
        
        System.out.println("lista por apellido");
        cole.ordenPorApellido();
        cole.lista();
    }
}
