/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1compi;

import Analizador.Generadores;  
import archivos.archivosExistentes;


/**
 *
 * @author Jacksggbgfvghbjklñ{}{pñolikuyty Montenegro
 */
public class Proyecto1compi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.setVisible(true);
        //Generadores.generarCompilador();
        archivosExistentes archivo = new archivosExistentes();
        archivo.verificacionArchivos();
        

    }

}
//---------------------------------------SIRVE PARA ORDENAR CUALQUIER COSA EN ESTE ES ALFABETICAMENTE
//
//        Collections.sort(a, new Comparator<Atributos>() {
//            public int compare(Atributos obj1, Atributos obj2) {
//                return obj1.getTitulo().compareTo(obj2.getTitulo());
//            }
//        });