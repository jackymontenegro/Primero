/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import static proyecto1compi.ventanaPrincipal.productoList;
import static proyecto1compi.ventanaPrincipal.tiendaList;
import static proyecto1compi.ventanaPrincipal.usuarioList;

/**
 *
 * @author Jacky Montenegro
 */
public class creacionJMarchivos {

    public void aUsuario() {
        try {
            String ruta = "C:\\Users\\Jacky Montenegro\\Desktop\\aUsuario.txt";

            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < usuarioList.size(); i++) {
                String cadena = " ";
                String cadenaf = " ";
                String usu = Integer.toString(usuarioList.get(i).getCodigo());
                for (int j = 0; j < usuarioList.get(i).getListaAtribu().size(); j++) {

                    String usu2 = usuarioList.get(i).getListaAtribu().get(j).getTitulo();
                    String usu3 = usuarioList.get(i).getListaAtribu().get(j).getContenido();

                    cadena += usu2 + ":" + usu3 + ",";
                }

                cadenaf = usu + "," + cadena + "\n";
                bw.write(cadenaf);
            }

            bw.close();
            JOptionPane.showMessageDialog(null, "JM USUARIO");

        } catch (IOException e) {
        }

    }

    public void aTienda() {
        try {
            String ruta = "C:\\Users\\Jacky Montenegro\\Desktop\\aTienda.txt";

            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tiendaList.size(); i++) {
                String cadena = " ";
                String cadenaf = " ";
                String usu = Integer.toString(tiendaList.get(i).getCodigo());
                for (int j = 0; j < tiendaList.get(i).getListaAtribu().size(); j++) {

                    String usu2 = tiendaList.get(i).getListaAtribu().get(j).getTitulo();
                    String usu3 = tiendaList.get(i).getListaAtribu().get(j).getContenido();

                    cadena += usu2 + ":" + usu3 + ",";
                }

                cadenaf = usu + "," + cadena + "\n";
                bw.write(cadenaf);
            }

            bw.close();
            JOptionPane.showMessageDialog(null, "JM TIENDA");

        } catch (IOException e) {
        }

    }

    public void aProducto() {
        try {
            String ruta = "C:\\Users\\Jacky Montenegro\\Desktop\\aProducto.txt";

            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < productoList.size(); i++) {
                String cadena = " ";
                String cadenaf = " ";
                String usu = Integer.toString(productoList.get(i).getCodigo());
                for (int j = 0; j < productoList.get(i).getListaAtribu().size(); j++) {

                    String usu2 = productoList.get(i).getListaAtribu().get(j).getTitulo();
                    String usu3 = productoList.get(i).getListaAtribu().get(j).getContenido();

                    cadena += usu2 + ":" + usu3 + ",";
                }

                cadenaf = usu + "," + cadena + "\n";
                bw.write(cadenaf);
            }

            bw.close();
            JOptionPane.showMessageDialog(null, "JM PRODUCTO");

        } catch (IOException e) {
        }

    }

}
