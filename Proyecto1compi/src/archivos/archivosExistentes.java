/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import Analizador.parser;
import Listas.Atributos;
import Listas.elemento;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto1compi.Proyecto1compi;
import proyecto1compi.ventanaPrincipal;
import static proyecto1compi.ventanaPrincipal.productoList;
import static proyecto1compi.ventanaPrincipal.tiendaList;
import static proyecto1compi.ventanaPrincipal.usuarioList;

/**
 *
 * @author Jacky Montenegro
 */
public class archivosExistentes {

    public void verificacionArchivos() {
        File ruta1 = new File("C:\\Users\\Jacky Montenegro\\Desktop\\aProducto.txt");
        File ruta2 = new File("C:\\Users\\Jacky Montenegro\\Desktop\\aTienda.txt");
        File ruta3 = new File("C:\\Users\\Jacky Montenegro\\Desktop\\aUsuario.txt");
        if (!ruta1.exists()) {
        } else {

            agregarListaP();

        }

        if (!ruta2.exists()) {
        } else {
            agregarListaT();

        }

        if (!ruta3.exists()) {
        } else {

            agregarListaU();
        }
    }

    private void agregarListaT() {
        File archivo = new File("C:\\Users\\Jacky Montenegro\\Desktop\\aTienda.txt");
        BufferedReader entrada = null;
        String documento = "";

        try {
            new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "UTF8"));
            entrada = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
            String linea;
            while ((linea = entrada.readLine()) != null) {
                documento += linea + '\n';

            }
            //System.out.println(documento);

            listaTiendas(documento);

        } catch (IOException e) {

        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(archivosExistentes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void agregarListaP() {
        File archivo = new File("C:\\Users\\Jacky Montenegro\\Desktop\\aProducto.txt");
        BufferedReader entrada = null;
        String documento = "";

        try {
            new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "UTF8"));
            entrada = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
            String linea;
            while ((linea = entrada.readLine()) != null) {
                documento += linea + '\n';

            }
            // System.out.println(documento);
            listaProductos(documento);

        } catch (IOException e) {

        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(archivosExistentes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void agregarListaU() {
        File archivo = new File("C:\\Users\\Jacky Montenegro\\Desktop\\aUsuario.txt");
        BufferedReader entrada = null;
        String documento = "";

        try {
            new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "UTF8"));
            entrada = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
            String linea;
            while ((linea = entrada.readLine()) != null) {
                documento += linea + '\n';

            }
            // System.out.println(documento);
            listaUsuario(documento);

        } catch (IOException e) {

        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(archivosExistentes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void listaTiendas(String documento) {
        ArrayList<String> at = new ArrayList<String>();
        ArrayList<Atributos> listaA = new ArrayList<Atributos>();
        String[] element;
        element = documento.split("\n");
        int id = 0;
        for (int i = 0; i < element.length; i++) {
            listaA = new ArrayList<Atributos>();
            at = new ArrayList<String>();
            //listaA.clear();
            String[] atributos;
            atributos = element[i].split(",");

            for (int j = 1; j < atributos.length; j++) {
                //  System.out.println(atributos[j]);
                id = Integer.parseInt(atributos[0]);
                at.add(atributos[j]);
            }
            //  System.out.println("TIENDA " + id);
            for (int k = 0; k < at.size(); k++) {

                String[] ultimo;
                ultimo = at.get(k).split("!");
                String y = Character.toString(ultimo[0].charAt(0));
                if (" ".equals(y)) {

                    String x = ultimo[0].substring(1, ultimo[0].length() - 0);

                    Atributos ne = new Atributos(x, ultimo[1]);
                    listaA.add(ne);

                } else {
                    Atributos ne = new Atributos(ultimo[0], ultimo[1]);
                    listaA.add(ne);
                }

                //System.out.println(at.get(k));
                //System.out.println(ultimo[0]+" "+ultimo[1]);
            }
//            
            for (int q = 0; q < listaA.size(); q++) {
                // System.out.println(listaA.get(q).getContenido() + listaA.get(q).getTitulo());
            }

            elemento ele = new elemento(id, listaA);
            tiendaList.add(ele);

        }
//        for (int i = 0; i < tiendaList.size(); i++) {
//            System.out.println(tiendaList.get(i).getCodigo() + "adios-------------------------------------------------");
//            for (int j = 0; j < tiendaList.get(i).getListaAtribu().size(); j++) {
//                System.out.println(tiendaList.get(i).getListaAtribu().get(j).getContenido());
//            }
//
//        }
    }

    private void listaProductos(String documento) {
        ArrayList<String> at = new ArrayList<String>();
        ArrayList<Atributos> listaA = new ArrayList<Atributos>();
        String[] element;
        element = documento.split("\n");
        int id = 0;
        for (int i = 0; i < element.length; i++) {
            listaA = new ArrayList<Atributos>();
            at = new ArrayList<String>();
            //listaA.clear();
            String[] atributos;
            atributos = element[i].split(",");

            for (int j = 1; j < atributos.length; j++) {
                //  System.out.println(atributos[j]);
                id = Integer.parseInt(atributos[0]);
                at.add(atributos[j]);
            }
            //  System.out.println("TIENDA " + id);
            for (int k = 0; k < at.size(); k++) {

                String[] ultimo;
                ultimo = at.get(k).split("!");
                String y = Character.toString(ultimo[0].charAt(0));
                if (" ".equals(y)) {

                    String x = ultimo[0].substring(1, ultimo[0].length() - 0);

                    Atributos ne = new Atributos(x, ultimo[1]);
                    listaA.add(ne);

                } else {
                    Atributos ne = new Atributos(ultimo[0], ultimo[1]);
                    listaA.add(ne);
                }
                //System.out.println(at.get(k));
                //System.out.println(ultimo[0]+" "+ultimo[1]);
            }
//            
            for (int q = 0; q < listaA.size(); q++) {
                //System.out.println(listaA.get(q).getContenido() + listaA.get(q).getTitulo());
            }

            elemento ele = new elemento(id, listaA);
            productoList.add(ele);

        }
//        for (int i = 0; i < productoList.size(); i++) {
//            System.out.println(productoList.get(i).getCodigo() + "adios-------------------------------------------------");
//            for (int j = 0; j < productoList.get(i).getListaAtribu().size(); j++) {
//                System.out.println(productoList.get(i).getListaAtribu().get(j).getContenido());
//            }
//
//        }
    }

    private void listaUsuario(String documento) {
        ArrayList<String> at = new ArrayList<String>();
        ArrayList<Atributos> listaA = new ArrayList<Atributos>();
        String[] element;
        element = documento.split("\n");
        int id = 0;
        for (int i = 0; i < element.length; i++) {
            listaA = new ArrayList<Atributos>();
            at = new ArrayList<String>();
            //listaA.clear();
            String[] atributos;
            atributos = element[i].split(",");

            for (int j = 1; j < atributos.length; j++) {
                //  System.out.println(atributos[j]);
                id = Integer.parseInt(atributos[0]);
                at.add(atributos[j]);
            }
            //  System.out.println("TIENDA " + id);
            for (int k = 0; k < at.size(); k++) {

                String[] ultimo;
                ultimo = at.get(k).split("!");
                String y = Character.toString(ultimo[0].charAt(0));
                if (" ".equals(y)) {

                    String x = ultimo[0].substring(1, ultimo[0].length() - 0);

                    Atributos ne = new Atributos(x, ultimo[1]);
                    listaA.add(ne);

                } else {
                    Atributos ne = new Atributos(ultimo[0], ultimo[1]);
                    listaA.add(ne);
                }
                //System.out.println(at.get(k));
                //System.out.println(ultimo[0]+" "+ultimo[1]);
            }
//            
            for (int q = 0; q < listaA.size(); q++) {
                // System.out.println(listaA.get(q).getContenido() + listaA.get(q).getTitulo());
            }

            elemento ele = new elemento(id, listaA);
            usuarioList.add(ele);

        }
//        for (int i = 0; i < usuarioList.size(); i++) {
//            System.out.println(usuarioList.get(i).getCodigo() + "adios-------------------------------------------------");
//            for (int j = 0; j < usuarioList.get(i).getListaAtribu().size(); j++) {
//                System.out.println(usuarioList.get(i).getListaAtribu().get(j).getContenido());
//            }
//
//        }
    }
}
