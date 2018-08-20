/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author Jacky Montenegro
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<estudiante> estumorros = new ArrayList<estudiante>();
        
        
        ArrayList<tarea> listanotas = new ArrayList<tarea>();
        listanotas.add(new tarea("tarea1",100));
        listanotas.add(new tarea("tarea2",100));
        listanotas.add(new tarea("tarea1",10));
        
        estudiante mosho = new estudiante("mosho",listanotas);
        
        
        estumorros.add(mosho);
        
        ArrayList<tarea> listanotas2 = new ArrayList<tarea>();
        listanotas2.add(new tarea("tarea1",10));
        listanotas2.add(new tarea("tarea2",40));
        listanotas2.add(new tarea("tarea1",10));
        
         estudiante mosho2 = new estudiante("mosho",listanotas);
         
        estumorros.add(mosho2);
        
        
        
        
        
        
    }
    
}
