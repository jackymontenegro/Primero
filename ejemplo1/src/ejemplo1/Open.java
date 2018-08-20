/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
import Anallizadores.*;
import Listas.erroresList;
import com.itextpdf.text.DocumentException;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.Desktop;
import java.io.StringReader;
import java.util.HashSet;
import java_cup.runtime.*;
import java.util.Scanner;

/**
 *
 * @author Jacky Montenegro
 */
public class Open extends javax.swing.JFrame {

    public static ArrayList<erroresList> lista = new ArrayList();
    public static ArrayList<erroresList> lista2 = new ArrayList();
    public static ArrayList<erroresList> lista3 = new ArrayList();
    public static ArrayList<erroresList> encabezado = new ArrayList();
    public static ArrayList<erroresList> cuerpo = new ArrayList();
    public static ArrayList<erroresList> estilo = new ArrayList();
    public static ArrayList<erroresList> reporte = new ArrayList();
    public static ArrayList<erroresList> ponderacion = new ArrayList();
    public static ArrayList<erroresList> cuerpoAtt = new ArrayList();
    public static ArrayList<erroresList> estiloAtt = new ArrayList();
    
   

    generadorPDF genera = new generadorPDF();

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    BufferedReader entrada;
    Writer salidaArchivo = null;
    String path;
    String nombreArchivo;
    File nombreArchivoJava;

    ArrayList<String> textos = new ArrayList<String>();
    JTextArea AreaT[] = new JTextArea[50];

    int linea;
    int p = 0;
    int pestañaIndex = 0;

    int numeroReporte = 0;

    int fin = 0;

    int contE;
    int contEs;
    int contC;
    int contP;
    int contR;

    public int contadorDeReportes = 0;

    String R = " ";

    /**
     * Creates new form Open
     */
    //---------------------------------------------------------------ABRIR
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

            lblLinea.setText(fila);
            lblColumna.setText(columna);

        } catch (Exception ex) {
            String fila = String.valueOf(cLine + 1);
            String columna = String.valueOf(cColumn + 1);
            lblLinea.setText(fila);
            lblColumna.setText(columna);

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
            Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Open() {

        FileNameExtensionFilter Filter = new FileNameExtensionFilter("Archivo de Entrada", "txt");
        FileNameExtensionFilter Filter1 = new FileNameExtensionFilter("Archivo de Entrada", "xml");
        seleccionar.setFileFilter(Filter);
        seleccionar.setFileFilter(Filter1);

        initComponents();
        this.setLocationRelativeTo(null);

        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblColumna = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txte = new javax.swing.JTextArea();
        tp1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("archivo");

        jLabel1.setText("Archivos Cargados");

        jLabel2.setText("Reportes Creados");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\logoPDF.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\logoPDF.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\logoPDF.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\logoPDF.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Aprobados");

        jLabel7.setText("Reprobados");

        jLabel8.setText("Publicacion");

        jLabel9.setText("Excelencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Consola de Errores");

        jLabel4.setText("Linea:");

        lblLinea.setText("0");

        jLabel6.setText("Columna:");

        lblColumna.setText("0");

        txte.setColumns(20);
        txte.setRows(5);
        jScrollPane3.setViewportView(txte);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cerrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Analizar");

        jMenuItem3.setText("Analizar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(485, 485, 485)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tp1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLinea)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColumna)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tp1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lblLinea)
                    .addComponent(jLabel6)
                    .addComponent(lblColumna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        numeroReporte = 3;
        escogeReporte(numeroReporte);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        numeroReporte = 4;
        escogeReporte(numeroReporte);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        pestañaIndex = tp1.getSelectedIndex();
        tp1.remove(pestañaIndex);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        abrir();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        numeroReporte = 1;
        escogeReporte(numeroReporte);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        numeroReporte = 2;
        escogeReporte(numeroReporte);
    }//GEN-LAST:event_jButton2ActionPerformed

    @SuppressWarnings("empty-statement")
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

        txte.setText(" ");
        try {
            String texto = (AreaT[tp1.getSelectedIndex()]).getText();
            Lexico scan = new Lexico(new BufferedReader(new StringReader(texto)));
            parser sintactico = new parser(scan);
            sintactico.parse();
        } catch (Exception e) {
            Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        if (lista.size() > 0) {
            imprimirLista();

            lista.clear();
        } else {
            System.out.println("NO HAY ERRORES");
            txte.setText("NO HAY ERRORES");
        }

        if (lista2.size() > 0) {
            contE = 0;
            contEs = 0;
            contP = 0;
            contR = 0;
            contC = 0;

            // imprimirLista2();
            repetidosTitulos();
            imprimirLista3();

            System.out.println("ENCABEZADO*********************************************************");
            imprimirEncabezado();
            System.out.println("CUERPO*********************************************************");
            imprimirCuerpo();

            //imprimirReporte();
            //imprimirEstilo();
            //imprimirCuerpoA();
            System.out.println("ESTILO*********************************************************");
            imprimirEstiloA();

            System.out.println("PONDERACION*********************************************************");
            imprimirPonderacion();
            
            System.out.println("CUERPOAAAAAAAAAAAAAAAAAAAAA*********************************************************");
            imprimirCuerpoA();
            
            
            genera.creaPDF();

            estiloAtt.clear();
            cuerpoAtt.clear();
            lista2.clear();
            lista3.clear();
            encabezado.clear();;
            estilo.clear();
            ponderacion.clear();
            reporte.clear();
            cuerpo.clear();
        } else {
            System.out.println("NO HAY CADENA");
           // txte.setText("NO HAY CADENA");

        }

        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);

        contadorDeReportes++;


    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JTabbedPane tp1;
    private javax.swing.JTextArea txte;
    // End of variables declaration//GEN-END:variables

    public void escogeReporte(int numR) {

        switch (numR) {
            case 1: {

                File ru = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reporteAprobados" + (contadorDeReportes - 1) + ".pdf");
                if (!ru.exists()) {
                    System.out.println("NO EXISTE RUTA");
                    JOptionPane.showMessageDialog(null, "EL REPORTE NO FUE CREADO");
                } else {
                    try {
                        Desktop.getDesktop().open(ru);
                    } catch (IOException ex) {
                        Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case 2: {
                File ru = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reporteReprobados" + (contadorDeReportes - 1) + ".pdf");
                if (!ru.exists()) {
                    System.out.println("NO EXISTE RUTA");
                    JOptionPane.showMessageDialog(null, "EL REPORTE NO FUE CREADO");
                } else {
                    try {
                        Desktop.getDesktop().open(ru);
                    } catch (IOException ex) {
                        Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case 3: {
                File ru = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reportePublicacion" + (contadorDeReportes - 1) + ".pdf");
                if (!ru.exists()) {
                    System.out.println("NO EXISTE RUTA");
                    JOptionPane.showMessageDialog(null, "EL REPORTE NO FUE CREADO");
                } else {
                    try {
                        Desktop.getDesktop().open(ru);
                    } catch (IOException ex) {
                        Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            case 4: {
                File ru = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reporteExcelencia" + (contadorDeReportes - 1) + ".pdf");
                if (!ru.exists()) {
                    System.out.println("NO EXISTE RUTA");
                    JOptionPane.showMessageDialog(null, "EL REPORTE NO FUE CREADO");
                } else {
                    try {
                        Desktop.getDesktop().open(ru);
                    } catch (IOException ex) {
                        Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            }
            default:
                break;
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
                    Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void imprimirLista() {
        String x = " ";
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getTipo() + lista.get(i).getLexema() + lista.get(i).getLinea() + lista.get(i).getColumna() + lista.get(i).getDescripcion());
            x = x + lista.get(i).getTipo() + lista.get(i).getLexema() + lista.get(i).getLinea() + lista.get(i).getColumna() + lista.get(i).getDescripcion() + "\n";
            txte.setText(" ");
            txte.setText(x);
        }
    }

    public void imprimirLista2() {
        String x = " ";
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i).getLexema());
        }
    }

    public void imprimirLista3() {
        String x = " ";
        for (int i = 0; i < lista3.size(); i++) {
            System.out.println(lista3.get(i).getLexema());
        }
    }

    public void imprimirEncabezado() {
        String x = " ";
        for (int i = 0; i < encabezado.size(); i++) {
            System.out.println(encabezado.get(i).getLexema());
        }
    }

    public void imprimirEstilo() {
        String x = " ";
        for (int i = 0; i < estilo.size(); i++) {
            System.out.println(estilo.get(i).getLexema());
        }
    }

    public void imprimirReporte() {
        String x = " ";
        for (int i = 0; i < reporte.size(); i++) {
            System.out.println(reporte.get(i).getLexema());
        }
    }

    public void imprimirPonderacion() {
        String x = " ";
        for (int i = 0; i < ponderacion.size(); i++) {
            System.out.println(ponderacion.get(i).getLexema());
        }
    }

    public void imprimirCuerpo() {
        String x = " ";
        for (int i = 0; i < cuerpo.size(); i++) {
            System.out.println(cuerpo.get(i).getLexema());
        }
    }

    public void imprimirCuerpoA() {
        String x = " ";
        for (int i = 0; i < cuerpoAtt.size(); i++) {
            System.out.println(cuerpoAtt.get(i).getLexema());
        }
    }

    public void imprimirEstiloA() {
        String x = " ";
        for (int i = 0; i < estiloAtt.size(); i++) {
            System.out.println(estiloAtt.get(i).getLexema());
        }
    }

    public void traeEncabezado(String a) {

    }

    public void traeEstiloE(String a) {

    }

    public void traeEstiloC(String a) {

    }

    public void traeCuerpo(String a) {

    }

    public void traePonderacion(String a) {

    }

    public void traeReporte(String a) {

    }

    public void repetidosTitulos() {

        String x = " ";
        String y = " ";
        String z = " ";

        for (int i = 0; i < lista2.size(); i++) {

            char[] se;
            String h = lista2.get(i).getLexema();
            se = h.toCharArray();
            y = Character.toString(se[0]);
            z = Character.toString(se[1]);

            if (null != y) {
                switch (y) {
                    case "e":
                    case "E":
                        if ("s".equals(z) || "S".equals(z)) {
                            if (contEs == 0) {
                                addEstilo(h);
                                contEs = contEs + 1;
                                erroresList list = new erroresList(h);
                                lista3.add(list);

                            }
                        } else {
                            if (contE == 0) {
                                addEncabezado(h);
                                erroresList list = new erroresList(h);
                                lista3.add(list);
                                contE++;
                            }
                        }
                        break;
                    case "c":
                    case "C":
                        if (contC == 0) {
                            addCuerpo(h);
                            erroresList list = new erroresList(h);
                            lista3.add(list);
                            contC++;
                        }
                        break;
                    case "r":
                    case "R":
                        if (contR == 0) {
                            addReporte(h);
                            erroresList list = new erroresList(h);
                            lista3.add(list);
                            contR++;
                        }
                        break;
                    case "p":
                    case "P":
                        if (contP == 0) {
                            addPonderacion(h);
                            erroresList list = new erroresList(h);
                            lista3.add(list);
                            contP++;
                        }
                        break;
                    default:
                        erroresList listas = new erroresList("SINTACTICO", h, "li", "h","NO ESTA DENTRO DE LOS PERMITIDOS");
                        lista.add(listas);
                        break;
                }
            }

            x = x + h + "\n";
            // txte.setText(" ");
            //  txte.setText(x);
        }
    }

    public void addEncabezado(String cadena) {
        String[] arrayDato = cadena.split("¡");
        for (int i = 0; i < arrayDato.length; i++) {
            erroresList list = new erroresList(arrayDato[i]);
            encabezado.add(list);
            traeEncabezado(arrayDato[i]);
        }
    }

    public void addEstilo(String cadena) {
        String[] arrayDato = cadena.split("¡");
        for (int i = 0; i < arrayDato.length; i++) {
            erroresList list = new erroresList(arrayDato[i]);
            estilo.add(list);
            addEstiloAtt(arrayDato[i]);
        }
    }

    public void addReporte(String cadena) {
        String[] arrayDato = cadena.split("¡");
        for (int i = 0; i < arrayDato.length; i++) {
            erroresList list = new erroresList(arrayDato[i]);
            reporte.add(list);
            traeReporte(arrayDato[i]);
        }
    }

    public void addPonderacion(String cadena) {
        String[] arrayDato = cadena.split("¡");
        for (int i = 0; i < arrayDato.length; i++) {
            erroresList list = new erroresList(arrayDato[i]);
            ponderacion.add(list);
            traePonderacion(arrayDato[i]);
        }
    }

    public void addCuerpo(String cadena) {
        String[] arrayDato = cadena.split("¡");
        for (int i = 0; i < arrayDato.length; i++) {
            erroresList list = new erroresList(arrayDato[i]);
            cuerpo.add(list);
            addCuerpoAtt(arrayDato[i]);
        }
    }

    public void addCuerpoAtt(String cadena) {
        String[] arrayDato = cadena.split("!");
        for (int i = 0; i < arrayDato.length; i++) {
            erroresList list = new erroresList(arrayDato[i]);
            cuerpoAtt.add(list);

        }
    }

    public void addEstiloAtt(String cadena) {
        String[] arrayDato = cadena.split("!");
        for (int i = 0; i < arrayDato.length; i++) {
            erroresList list = new erroresList(arrayDato[i]);
            estiloAtt.add(list);

        }
    }
}
