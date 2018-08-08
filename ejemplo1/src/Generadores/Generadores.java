/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generadores;

/**
 *
 * @author Jacky Montenegro
 */
public class Generadores {
    public static void main(String[] args) {
        generarCompilador();
    }
    
    private static void generarCompilador(){
        try {
            String ruta = "C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\src\\Analizadores\\"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "AnalisisLexico.jflex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "AnalisisSintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
