/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacky Montenegro
 */
public class generadorPDF {

    private Font ColorT = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL);
    private Font ColorV = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
    private Font ColorC = new Font(Font.FontFamily.TIMES_ROMAN, 11, Font.NORMAL);
    private Font ColorNA = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
    private Font ColorNR = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
    private Font ColorTITULO = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.NORMAL);
    private Font ColorENCABEZADOS = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL,BaseColor.GREEN);

    public void generarDocumento(String encabezado, String cuerpo, int numero, String logo, boolean linea) {
        try {

            Document documento = new Document(PageSize.A1, 47, 36, 36, 10);

            PdfWriter pw = PdfWriter.getInstance(documento, new FileOutputStream("C:\\Users\\Jacky Montenegro\\Desktop\\reporte" + numero + ".pdf"));
            Image imagen = Image.getInstance(logo);
            imagen.scaleAbsolute(85, 85);
            imagen.setAlignment(Element.ALIGN_RIGHT);
            Image divisor = Image.getInstance("C:\\Users\\Jacky Montenegro\\Desktop\\linea.png");
            divisor.scaleAbsolute(2350, 50);
            divisor.setAlignment(Element.ALIGN_CENTER);

            documento.open();
            documento.add(imagen);
            // documento.add(getEncabezado(encabezado));
            documento.add(getCuerpo(cuerpo));
            if (linea == true) {
                documento.add(divisor);
            }

            if (numero == 1) {
                documento.add(getTabla(201612120, "Jacky", "Montenegro", 9, 4, 15, 15, 35, 4, 82));
            } else if (numero == 2) {
                documento.add(getTabla(201612120, "Jacky", "Montenegro", 9, 4, 15, 15, 35, 4, 82));
            } else if (numero == 3) {
                documento.add(getTabla(201612120, "Jacky", "Montenegro", 9, 4, 15, 15, 35, 4, 82));
            } else if (numero == 4) {
                documento.add(getTabla(201612120, "Jacky", "Montenegro", 9, 4, 15, 15, 35, 4, 82));
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF GENERADO CORRECTAMENTE");

            if (numero == 1) {
                File objetofile = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reporte" + numero + ".pdf");
                Desktop.getDesktop().open(objetofile);
            } else if (numero == 2) {
                File objetofile = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reporte" + numero + ".pdf");
                Desktop.getDesktop().open(objetofile);
            } else if (numero == 3) {
                File objetofile = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reporte" + numero + ".pdf");
                Desktop.getDesktop().open(objetofile);
            } else if (numero == 4) {
                File objetofile = new File("C:\\Users\\Jacky Montenegro\\Desktop\\reporte" + numero + ".pdf");
                Desktop.getDesktop().open(objetofile);
            }

        } catch (Exception e) {
        }
    }

    private Paragraph getEncabezado(String encabezado) {
        Paragraph nuevo = new Paragraph();
        Chunk c = new Chunk();
        nuevo.setAlignment(Element.ALIGN_LEFT);
        c.append(encabezado);
        c.setFont(ColorT);
        nuevo.add(c);
        return nuevo;

    }

    private Paragraph getCuerpo(String encabezado) {
        Paragraph nuevo = new Paragraph();
        Chunk c = new Chunk();
        nuevo.setAlignment(Element.ALIGN_CENTER);
        c.append(encabezado);
        c.setFont(ColorTITULO);
        nuevo.add(c);
        return nuevo;

    }

    private PdfPTable getTabla(int d1, String d2, String d3, int d4, int d5, int d6,
            int d7, int d8, int d9, int d10) {

        PdfPTable tablita = new PdfPTable(10);
        tablita.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

        String carne = String.valueOf(d1);
        String tareas = String.valueOf(d4);
        String ht = String.valueOf(d5);
        String ec = String.valueOf(d6);
        String practica = String.valueOf(d7);
        String proyecto = String.valueOf(d8);
        String ef = String.valueOf(d9);
        String total = String.valueOf(d10);

        Paragraph p1 = new Paragraph("CARNE", ColorENCABEZADOS);
        Paragraph p2 = new Paragraph("NOMBRES", ColorENCABEZADOS);
        Paragraph p3 = new Paragraph("APELLIDOS", ColorENCABEZADOS);
        Paragraph p4 = new Paragraph("TAREAS", ColorENCABEZADOS);
        Paragraph p5 = new Paragraph("HT", ColorENCABEZADOS);
        Paragraph p6 = new Paragraph("EC", ColorENCABEZADOS);
        Paragraph p7 = new Paragraph("PRACTICAS", ColorENCABEZADOS);
        Paragraph p8 = new Paragraph("PROYECTOS", ColorENCABEZADOS);
        Paragraph p9 = new Paragraph("EF", ColorENCABEZADOS);
        Paragraph p10 = new Paragraph("TOTAL", ColorENCABEZADOS);

        PdfPCell cllcarne = new PdfPCell(new Paragraph(p1));
        PdfPCell cllnombre = new PdfPCell(new Paragraph(p2));
        PdfPCell cllapellido = new PdfPCell(new Paragraph(p3));
        PdfPCell clltarea = new PdfPCell(new Paragraph(p4));
        PdfPCell cllht = new PdfPCell(new Paragraph(p5));
        PdfPCell cllec = new PdfPCell(new Paragraph(p6));
        PdfPCell cllpractica = new PdfPCell(new Paragraph(p7));
        PdfPCell cllproyecto = new PdfPCell(new Paragraph(p8));
        PdfPCell cllef = new PdfPCell(new Paragraph(p9));
        PdfPCell clltotal = new PdfPCell(new Paragraph(p10));

        tablita.addCell(cllcarne);
        tablita.addCell(cllnombre);
        tablita.addCell(cllapellido);
        tablita.addCell(clltarea);
        tablita.addCell(cllht);
        tablita.addCell(cllec);
        tablita.addCell(cllpractica);
        tablita.addCell(cllproyecto);
        tablita.addCell(cllef);
        tablita.addCell(clltotal);

        tablita.setHeaderRows(1);
        PdfPCell[] cells = tablita.getRow(0).getCells();
        for (int j = 0; j < cells.length; j++) {
            cells[j].setBackgroundColor(BaseColor.LIGHT_GRAY);
            cells[j].setBorderColor(BaseColor.YELLOW);
            cells[j].setBorderColorBottom(BaseColor.ORANGE);
        }

        tablita.addCell(carne);
        tablita.addCell(d2);
        tablita.addCell(d3);
        tablita.addCell(tareas);
        tablita.addCell(ht);
        tablita.addCell(ec);
        tablita.addCell(practica);
        tablita.addCell(proyecto);
        tablita.addCell(ef);
        tablita.addCell(total);

        return tablita;

    }
}
