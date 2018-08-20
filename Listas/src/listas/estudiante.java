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
public class estudiante {
    public String nombre;
    public ArrayList<tarea> listanotas; 
    
    public estudiante(String n, ArrayList<tarea> notas){
        this.nombre = n;
        listanotas = notas;
    }
}
