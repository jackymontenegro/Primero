/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1.corto1;

import Analizador.Generadores;

/**
 *
 * @author Jacky Montenegro
 */
public class Compi1Corto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventanaPrincipal ventanita = new ventanaPrincipal();
        ventanita.setVisible(true);
        Generadores.generarCompilador();
       
    }
    
}
