/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anallizadores;

import java.io.File;



/**
 *
 * @author Jacky Montenegro
 */
public class Generadores {
    public static void main(String[] args) {
        generarCompilador();
    }
    
    public static void generarCompilador(){
        try {
            String ruta = "C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\src\\Anallizadores\\"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "AnalisisLexico.jflex", "-d", ruta };
        //    File fila = new File(opcFlex);
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "AnalisisSintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
