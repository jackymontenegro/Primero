/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1compi;

import Analizador.Lexico;
import Analizador.parser;
import Listas.erroresList;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Jacky Montenegro
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    BufferedReader entrada;
    Writer salidaArchivo = null;
    String path;
    String nombreArchivo;
    File nombreArchivoJava;
    JTextArea AreaT[] = new JTextArea[50];

    public static ArrayList<erroresList> errorLex = new ArrayList<erroresList>();
    public static ArrayList<erroresList> errorSin = new ArrayList<erroresList>();
    
    int linea;
    int p = 0;
    int pestañaIndex = 0;

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        FileNameExtensionFilter Filter = new FileNameExtensionFilter("Archivo de Entrada", "txt");

        seleccionar.setFileFilter(Filter);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2 = new javax.swing.JButton();
        tp1 = new javax.swing.JTabbedPane();
        btn1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txte = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn2.setText("Analizar");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setText("Abrir");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        txte.setColumns(20);
        txte.setRows(5);
        jScrollPane3.setViewportView(txte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn1)
                .addGap(18, 18, 18)
                .addComponent(btn2)
                .addContainerGap(424, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tp1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tp1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2)
                    .addComponent(btn1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:-
        abrir();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txte.setText(" ");
        try {
            String texto = (AreaT[tp1.getSelectedIndex()]).getText();
            Lexico scan = new Lexico(new BufferedReader(new StringReader(texto)));
            parser sintactico = new parser(scan);
            sintactico.parse();
        } catch (Exception e) {
            Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }

        if (errorLex.size() > 0) {
            imprimirErrorListaL();

            errorLex.clear();
        } else {
            
            txte.setText("NO HAY ERRORES");
        }
        if (errorSin.size() > 0) {
            imprimirErrorListaS();

            errorSin.clear();
        } else {
           
            txte.setText("NO HAY ERRORES");
        }
        
        JOptionPane.showMessageDialog(null, "YA SE ANALIZO");
    }//GEN-LAST:event_btn2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane tp1;
    private javax.swing.JTextArea txte;
    // End of variables declaration//GEN-END:variables
 public String abrirArchivo(File archivo) throws UnsupportedEncodingException, FileNotFoundException, IOException {

        String documento = " ";

        pestaña();

        try {
            new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "UTF8"));
            entrada = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
            String linea;
            while ((linea = entrada.readLine()) != null) {
                documento += linea + '\n';
                AreaT[pestañaIndex].setText(documento);
            }

        } catch (IOException e) {

        } finally {
            entrada.close();
        }
        return documento;

    }

    private void AreaLugar(CaretEvent e, JTextArea a) throws BadLocationException {
        int cLine = 1;
        int cColumn = 1;

        try {
            int posicion = a.getCaretPosition();
            cLine = a.getLineOfOffset(posicion);
            cColumn = posicion - a.getLineStartOffset(cLine);

            String fila = String.valueOf(cLine + 1);
            String columna = String.valueOf(cColumn + 1);

        } catch (Exception ex) {
            String fila = String.valueOf(cLine + 1);
            String columna = String.valueOf(cColumn + 1);

        }
    }

    public void abrir() {
        try {

            if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionar.getSelectedFile();
                abrirArchivo(archivo);

            }

        } catch (HeadlessException r) {
            System.out.println("Error" + r);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void pestaña() {
        JTextArea AreaT = new JTextArea();
        JScrollPane sc = new JScrollPane();
        sc.setViewportView(AreaT);

        TextLineNumber tl = new TextLineNumber(AreaT);
        sc.setRowHeaderView(tl);
        this.AreaT[p] = AreaT;

        tp1.addTab(archivo.getName(), sc);
        pestañaIndex = p;
        p++;

        AreaT.addCaretListener(new javax.swing.event.CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                try {
                    AreaLugar(e, AreaT);
                } catch (BadLocationException ex) {
                    Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void imprimirErrorListaL() {
        String x = " ";

        for (int i = 0; i < errorLex.size(); i++) {
            System.out.println(errorLex.get(i).getTipo() + errorLex.get(i).getLexema() + errorLex.get(i).getLinea() + errorLex.get(i).getColumna() + errorLex.get(i).getDescripcion());
            x = x + errorLex.get(i).getTipo() + errorLex.get(i).getLexema() + errorLex.get(i).getLinea() + errorLex.get(i).getColumna() + errorLex.get(i).getDescripcion() + "\n";
            txte.setText(" ");
            txte.setText(x);
        }

    }
        public void imprimirErrorListaS() {

        String y = " ";

         for (int i = 0; i < errorSin.size(); i++) {
            System.out.println(errorSin.get(i).getTipo() + errorSin.get(i).getLexema() + errorSin.get(i).getLinea() + errorSin.get(i).getColumna() + errorSin.get(i).getDescripcion());
            y = y + errorSin.get(i).getTipo() + errorSin.get(i).getLexema() + errorSin.get(i).getLinea() + errorSin.get(i).getColumna() + errorSin.get(i).getDescripcion() + "\n";
            txte.setText(" ");
            txte.setText(y);
        }
    }

}