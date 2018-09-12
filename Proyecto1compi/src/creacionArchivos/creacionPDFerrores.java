/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionArchivos;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static proyecto1compi.ventanaPrincipal.*;

/**
 *
 * @author Jacky Montenegro
 */
public class creacionPDFerrores {

    private final Font ColorTITULO = new Font(Font.FontFamily.TIMES_ROMAN,13 , Font.NORMAL);

    public void crearPDFL() {

        try {
            Document doc = new Document(PageSize.A3, 47, 36, 36, 10);
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Jacky Montenegro\\Desktop\\ErroresLex.pdf"));

            doc.open();

            Paragraph TITU = new Paragraph("REPORTE ERRORES", ColorTITULO);
            Paragraph TITU2 = new Paragraph("  ", ColorTITULO);
            doc.add(TITU);
            doc.add(TITU2);

            try {

                PdfPTable table = new PdfPTable(5);
                table.addCell("DESCRIPCION");
                table.addCell("LEXEMA");
                table.addCell("LINEA");
                table.addCell("COLUMNA");
                table.addCell("DESCRIPCION");

                String c0,c1, c2, c3, c4;
                

                  for (int i = 0; i < errorLex.size(); i++) {
                    c0 = errorLex.get(i).getTipo();
                    c1 = errorLex.get(i).getLexema();
                    c2 = errorLex.get(i).getLinea();
                    c3 = errorLex.get(i).getColumna();
                    c4 = errorLex.get(i).getDescripcion();

                    table.addCell(c0);
                    table.addCell(c1);
                    table.addCell(c2);
                    table.addCell(c3);
                    table.addCell(c4);

                
                }
               
                // Agregamos la tabla al documento            
                doc.add(table);
                doc.close();
                JOptionPane.showMessageDialog(null, "PDF ERRORES GENERADO CORRECTAMENTE");

            } catch (DocumentException ex) {
                Logger.getLogger(creacionPDFerrores.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(creacionPDFerrores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
