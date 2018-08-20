/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkgstatic;

/**
 *
 * @author Jacky Montenegro
 */
public class EjemploStatic {
    public static String nombre = "mosho"; //variables globales pero a nivel clases
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjemploStatic.metodoestatico();
        
        EjemploStatic b = new EjemploStatic();
        b.metodonoestatico();
       // metodonoestatico();
        clasea a = new clasea();
        
        String c = a.global;
        
        System.out.println(nombre);
    }
    
    
    public void metodonoestatico(){
        System.out.println("soy el metodo no estatico");
        EjemploStatic.metodoestatico();

    }
    
    public static void metodoestatico(){
        System.out.println("soy un metodo estatico");
    }
}
