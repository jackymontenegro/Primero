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


/**
 *
 * @author Jacky Montenegro
 */
public class Open extends javax.swing.JFrame {
    
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    //FileInputStream entrada;
    //FileOutputStream salida;
    BufferedReader entrada;
    Writer salidaArchivo = null;
    String path;
    String nombreArchivo;
    File nombreArchivoJava;
    
    ArrayList <String> textos = new ArrayList<String>();
    JTextArea AreaT[]= new JTextArea[50];
    
    int linea;
    int p=0;
    int pestañaIndex=0;
    
    int numeroReporte=0;
    
    

    /**
     * Creates new form Open
     */
    //---------------------------------------------------------------ABRIR
    
    public String abrirArchivo (File archivo) throws UnsupportedEncodingException,FileNotFoundException, IOException{
        
        String documento = " ";
        
        pestaña();
        
        try{
            new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true),"UTF8"));
            entrada = new BufferedReader (new InputStreamReader(new FileInputStream(archivo),"utf-8"));
            String linea;
            while((linea = entrada.readLine())!=null){
                documento += linea +'\n';
               AreaT[pestañaIndex].setText(documento);
            }
            
        }catch (IOException e){
            
        }
        finally{
            entrada.close();
        }
        return documento;
        
    }
    public void abrir(){
        try{
            
            
            if(seleccionar.showDialog (null,"Abrir")==JFileChooser.APPROVE_OPTION){
                archivo = seleccionar.getSelectedFile();
                abrirArchivo(archivo);
            }

        }catch(HeadlessException r){
            System.out.println("Error"+r);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void  AreaLugar(CaretEvent e,JTextArea a) throws BadLocationException{
        int cLine = 1;
        int cColumn = 1;
        
        try{
            int posicion = a.getCaretPosition();
            cLine = a.getLineOfOffset(posicion);
            cColumn = posicion-a.getLineStartOffset(cLine);
            
        String fila = String.valueOf(cLine+1);
        String columna = String.valueOf(cColumn+1);
        
        lblLinea.setText(fila);
        lblColumna.setText(columna);
        
        }
        catch (Exception ex){
            String fila = String.valueOf(cLine+1);
        String columna = String.valueOf(cColumn+1);
        lblLinea.setText(fila);
        lblColumna.setText(columna);
        
        }
    }
    public Open() {
        FileNameExtensionFilter Filter = new FileNameExtensionFilter("Archivo de Entrada","txt");
       seleccionar.setFileFilter(Filter);

        initComponents();
         txtprincipal.setLineWrap(true); 
         linea = this.txtprincipal.getLineCount();
        txtprincipal.setWrapStyleWord(true); 
     txtprincipal.setSelectedTextColor(Color.GREEN);
        
        TextLineNumber tln = new TextLineNumber(txtprincipal);
        jScrollPane1.setRowHeaderView(tln);
        this.setLocationRelativeTo(null);
    }
//    public String abrir(File archivo) {
//        String documento = " ";
//        try {
//            entrada = new FileInputStream(archivo);
//            int num;
//            while((num = entrada.read())!=-1){
//                char caracter = (char)num;
//                documento+= caracter;
//                
//            }
//            
//        }catch(Exception e){
//            
//        }
//        return documento;
//        
//    }
    
    public void parrafo (String parrafo){
        System.out.println(parrafo);
    }
    
//    public void abrirMetodo (){
//         // TODO add your handling code here:
//        if(seleccion.showDialog(null, "Abrir")== JFileChooser.APPROVE_OPTION){
//            archivo = seleccion.getSelectedFile();
//            if(archivo.canRead()){
//                String documento = abrir(archivo);
//                txtPrincipal.setText(documento);
//                parrafo(documento);
//            }else{
//                
//            }
//        } 
//    }

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
        jTextArea1 = new javax.swing.JTextArea();
        tp1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtprincipal = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("archivo");

        jLabel1.setText("Archivos Cargados");

        jLabel2.setText("Reportes Creados");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\logoPDF.png")); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(139, 115));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jacky Montenegro\\Desktop\\moshocompi\\Primero\\ejemplo1\\logoPDF.png")); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(139, 115));
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
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jLabel3.setText("Consola de Errores");

        jLabel4.setText("Linea:");

        lblLinea.setText("0");

        jLabel6.setText("Columna:");

        lblColumna.setText("0");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

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

        txtprincipal.setColumns(20);
        txtprincipal.setRows(5);
        jScrollPane1.setViewportView(txtprincipal);

        tp1.addTab("Nuevo", jScrollPane1);

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
                                .addComponent(tp1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tp1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        generaPDF(numeroReporte);
        generadorPDF g = new generadorPDF();
        g.generarDocumento("TITULO", "REPORTE DE PUBLICACION", numeroReporte,"C:\\Users\\Jacky Montenegro\\Desktop\\imagen.jpg",true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        numeroReporte = 4;
        generaPDF(numeroReporte);
        generadorPDF g = new generadorPDF();
        g.generarDocumento("TITULO", "REPORTE DE EXCELENCIA", numeroReporte,"C:\\Users\\Jacky Montenegro\\Desktop\\imagen.jpg",true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        abrir();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        numeroReporte = 1;
        generaPDF(numeroReporte);
        generadorPDF g = new generadorPDF();
        g.generarDocumento("TITULO", "REPORTE DE APROBADOS", numeroReporte,"C:\\Users\\Jacky Montenegro\\Desktop\\imagen.jpg",true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        numeroReporte = 2;
        generaPDF(numeroReporte);
        generadorPDF g = new generadorPDF();
        g.generarDocumento("TITULO", "REPORTE DE REPROBADOS", numeroReporte,"C:\\Users\\Jacky Montenegro\\Desktop\\imagen.jpg",true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JTabbedPane tp1;
    private javax.swing.JTextArea txtprincipal;
    // End of variables declaration//GEN-END:variables

    private void pestaña() {
        JTextArea AreaT = new JTextArea();
        JScrollPane sc = new JScrollPane();
        sc.setViewportView(AreaT);
      
        TextLineNumber tl = new TextLineNumber(AreaT);
        sc.setRowHeaderView(tl);
        this.AreaT[p]=AreaT;
        
        tp1.addTab(archivo.getName(),sc);
        pestañaIndex = p;
        p++;
        
        AreaT.addCaretListener(new javax.swing.event.CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                try {
                    AreaLugar(e,AreaT);
                } catch (BadLocationException ex) {
                    Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
                }
    public void generaPDF(int reporte){
//       String ruta = "C:\\Users\\Jacky Montenegro\\Desktop\\Reporte";
//        String contenido = txtprincipal.getText();
//        
//        String num = String.valueOf(reporte);
//        
//        try {
//            FileOutputStream archivo = new FileOutputStream(ruta+num+".pdf");
//            Document documento = new Document();
//            PdfWriter.getInstance(documento,archivo);
//            documento.open();
//            documento.add(new Paragraph(contenido));
//            documento.close();
//            
//            JOptionPane.showMessageDialog(null, "Correcto");
//            
//        } catch (Exception e) {
//            System.out.println("LAURASAD :'c");
//        }
   }
}

    

