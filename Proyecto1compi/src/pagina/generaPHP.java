/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagina;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static proyecto1compi.ventanaPrincipal.productoList;
import static proyecto1compi.ventanaPrincipal.tiendaList;

/**
 *
 * @author Jacky Montenegro
 */
public class generaPHP {

    public static ArrayList<Integer> lista = new ArrayList<Integer>();

    public void paginaP() {
        paginaProductos();
        String nombre = "";
        String imagen = "cuatro.jpg\"";
        String titulo = "";
        String direccion = "";
        String telefono = "";
        try {
            String ruta = "C:\\xampp\\htdocs\\compi\\pag.php";

            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("<html> <head> <title> compi </title></head><body><h2> TIENDAS</h2>");
            bw.write("<p align=\"center\"><table>\n");

            if (!tiendaList.isEmpty()) {

                //System.out.println(" la lista ya tiene elementos");
                for (int i = 0; i < tiendaList.size(); i++) {
                    //System.out.println(usuarioList.size());
                    for (int j = 0; j < tiendaList.get(i).getListaAtribu().size(); j++) {
                        titulo = tiendaList.get(i).getListaAtribu().get(j).getTitulo();

                        if ("nombre".equals(titulo)) {
                            nombre = tiendaList.get(i).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        if ("direccion".equals(titulo)) {
                            direccion = tiendaList.get(i).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        if ("telefono".equals(titulo)) {
                            telefono = tiendaList.get(i).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        if ("img".equals(titulo)) {
                            String[] arrayDato;
                            arrayDato = tiendaList.get(i).getListaAtribu().get(j).getContenido().split("\\\\");

                            imagen = arrayDato[arrayDato.length - 1];
                            //System.out.println(imagen);
                            //System.out.println(id + " codigo " + idn);
                        }
                    }

                    bw.write("  <tr>\n"
                            + "    <td><a href=\"tienda" + i + ".html\"><img src=\"" + imagen + " alt=\"tienda\" width=\"175\"></a></td>\n"
                            + "    <td><b>" + nombre + "</b>\n<b>"+direccion+"</b>\n<b>"+telefono+"</b></td>\n"
                            + "  </tr>\n");

                }

            }

            bw.write("</table></p>");
            bw.write("</body></html> ");

            bw.close();
          //  JOptionPane.showMessageDialog(null, "PHP");

        } catch (IOException e) {
        }

    }

    public void paginaProductos() {
        String titulo = "";
        String codigoTienda = "";

        for (int i = 0; i < tiendaList.size(); i++) {
            lista.clear();
            int indice = i;
            for (int j = 0; j < tiendaList.get(i).getListaAtribu().size(); j++) {
                titulo = tiendaList.get(i).getListaAtribu().get(j).getTitulo();
                if ("codigo".equals(titulo)) {
                    codigoTienda = tiendaList.get(i).getListaAtribu().get(j).getContenido();
                    productosdeTienda(indice, codigoTienda);
                    titulo = "";
                    codigoTienda = "";
                    break;
                }
            }
        }
    }

    private void productosdeTienda(int indiceT, String codigo) {
        String sucursal1 = "";
        String id1 = "";
        int indiceP = 0;

        for (int i = 0; i < productoList.size(); i++) {
            indiceP = i;
            for (int j = 0; j < productoList.get(i).getListaAtribu().size(); j++) {
                sucursal1 = " ";
                id1 = productoList.get(i).getListaAtribu().get(j).getTitulo();

                if ("sucursal".equals(id1)) {

                    sucursal1 = productoList.get(i).getListaAtribu().get(j).getContenido();
                    // System.out.println(sucursal1);

                }
            }

            if (sucursal1.equals(codigo)) {
                // System.out.println("SON IGUALES " + sucursal1 + " = " + sucursal2 + " " + indice);
                lista.add(indiceP);
                indiceP = 0;

            }
        }

        if (lista.size() != 0) {
            muestraProducto(indiceT);

        } else {
            tiendasinProductos(indiceT);
        }

    }

    private void muestraProducto(int indiceT) {
        String titulo = "";
        String nombre = "";
        String imagen = "cuatro.jpg\"";
        String cantidad = "";
        String marca = "";
        String color = "";
        String tamaño = "";
        
        int indice = 0;
        try {
            String ruta = "C:\\xampp\\htdocs\\compi\\tienda" + indiceT + ".html";

            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("<html> <head> <title> compi </title></head><body><h2> PRODUCTOS</h2>");
            bw.write("<p align=\"center\"><table>\n");

            if (!productoList.isEmpty()) {

                //System.out.println(" la lista ya tiene elementos");
                for (int i = 0; i < lista.size(); i++) {
                    //System.out.println(usuarioList.size());
                    indice = lista.get(i);
                    for (int j = 0; j < productoList.get(indice).getListaAtribu().size(); j++) {
                        titulo = productoList.get(indice).getListaAtribu().get(j).getTitulo();

                        if ("nombre".equals(titulo)) {
                            nombre = productoList.get(indice).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        if ("cantidad".equals(titulo)) {
                            cantidad = productoList.get(indice).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        if ("marca".equals(titulo)) {
                            marca = productoList.get(indice).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        if ("color".equals(titulo)) {
                            color = productoList.get(indice).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        if ("tamaño".equals(titulo)) {
                            tamaño = productoList.get(indice).getListaAtribu().get(j).getContenido();
                            //System.out.println(id + " codigo " + idn);
                        }
                        
                        if ("img".equals(titulo)) {
                            String[] arrayDato;
                            arrayDato = productoList.get(indice).getListaAtribu().get(j).getContenido().split("\\\\");

                            imagen = arrayDato[arrayDato.length - 1];
                           // System.out.println(imagen);
                            //System.out.println(id + " codigo " + idn);
                        }
                    }

                    bw.write("  <tr>\n"
                            + "    <td><a href=\"tienda" + i + ".html\"><img src=\"" + imagen + " alt=\"tienda\" width=\"175\"></a></td>\n"
                            + "    <td><b>" + nombre + "</b>\n<b>"+marca+"</b>\n<b>"+cantidad+"</b>\n<b>"+color+"</b>\n<b>"+tamaño+"</b></td>\n"
                            + "  </tr>\n");

                }

            }

            bw.write("</table></p>");
            bw.write("</body></html> ");

            bw.close();
            //JOptionPane.showMessageDialog(null, "PHP");

        } catch (IOException e) {
        }

    }

    private void tiendasinProductos(int indiceT) {
        try {
            String ruta = "C:\\xampp\\htdocs\\compi\\tienda" + indiceT + ".html";

            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("<html> <head> <title> compi </title></head><body><h2> NO POSEE NINGUN PRODUCTO</h2>");

            bw.write("</body></html> ");

            bw.close();
          //  JOptionPane.showMessageDialog(null, "PHP");

        } catch (IOException e) {
        }
    }

}
