/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import Listas.coloresList;
import Listas.erroresList;
import Listas.estudianteList;
import Listas.estudianteTList;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import static ejemplo1.Open.lista;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacky Montenegro
 */
public class generadorPDF {

    public static ArrayList<coloresList> colo = new ArrayList<coloresList>();
    public static ArrayList<coloresList> coloT = new ArrayList<coloresList>();
    public static ArrayList<coloresList> coloC = new ArrayList<coloresList>();
    public static ArrayList<coloresList> Edatos = new ArrayList<coloresList>();
    public static ArrayList<estudianteList> estudiante = new ArrayList<estudianteList>();

    public static ArrayList<estudianteTList> estudianteDES = new ArrayList<estudianteTList>();

    public static ArrayList<estudianteList> tarea = new ArrayList<estudianteList>();

    public static ArrayList<estudianteList> hoja = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> corto = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> practica = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> proyecto = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> examen = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> total = new ArrayList<estudianteList>();

    public static ArrayList<estudianteList> tareaP = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> hojaP = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> cortoP = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> proyectoP = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> practicaP = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> examenP = new ArrayList<estudianteList>();

    public static ArrayList<estudianteList> Pontarea = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> Ponhoja = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> Poncorto = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> Ponproyecto = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> Ponpractica = new ArrayList<estudianteList>();
    public static ArrayList<estudianteList> Ponexamen = new ArrayList<estudianteList>();

    public static ArrayList<estudianteList> totalP = new ArrayList<estudianteList>();

    private Font ColorT = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL);
    private Font ColorV = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
    private Font ColorC = new Font(Font.FontFamily.TIMES_ROMAN, 11, Font.NORMAL);
    private Font ColorNA = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
    private Font ColorNR = new Font(Font.FontFamily.COURIER, 11, Font.NORMAL);
    private Font ColorTITULO = new Font(Font.FontFamily.TIMES_ROMAN, 26, Font.NORMAL);
    private Font ColorENCABEZADOS = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.GREEN);

    Font colorRojo = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.RED);
    Font colorAzul = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.BLUE);
    Font colorVerde = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.GREEN);
    Font colorAmarillo = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.YELLOW);

    Paragraph pEncabezadoSI = new Paragraph();
    Paragraph pEncabezadoSD = new Paragraph();
    Paragraph pEncabezadoCI = new Paragraph();
    Paragraph pEncabezadoCD = new Paragraph();
    Paragraph pEncabezadoID = new Paragraph();
    Paragraph pEncabezadoII = new Paragraph();

    Chunk cCarne = new Chunk();

    Boolean banderita = false;
    Boolean banderitaNA = false;
    Boolean banderitaNR = false;
    Boolean banderitaB = false;
    String ruta;

    int cont = 0;
    int contR = 0;

    int posicion = 2;

    String nombreE;
    String apellidoE;
    int carneE;

    public void creaPDF() {
        colo.clear();
        coloC.clear();
        coloT.clear();
        Edatos.clear();
        estudiante.clear();
        tarea.clear();
        hoja.clear();
        corto.clear();
        practica.clear();
        proyecto.clear();
        examen.clear();
        total.clear();
        tareaP.clear();
        hojaP.clear();
        cortoP.clear();
        proyectoP.clear();
        practicaP.clear();
        examenP.clear();
        Pontarea.clear();
        Ponhoja.clear();
        Poncorto.clear();
        Ponproyecto.clear();
        Ponpractica.clear();
        Ponexamen.clear();
        totalP.clear();
        getColoresEstilo();

        infoEncabezado();

        datosPonderacion();
        generaTablaA();

        /// ultimo();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        for (int j = 0; j < estudianteDES.size(); j++) {
            System.out.println(estudianteDES.get(j).getT());
        }
        if(!colo.isEmpty() && 
                !Edatos.isEmpty() && 
                !coloT.isEmpty() && 
                !coloC.isEmpty() && 
                !estudiante.isEmpty() &&
                !Pontarea.isEmpty() && 
                !Ponhoja.isEmpty() 
                && !Poncorto.isEmpty() && 
                !Ponproyecto.isEmpty() && 
                !Ponpractica.isEmpty() 
                && !Ponexamen.isEmpty()
                ){
            escogeReporte();
        }else{
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN GENERAR REPORTES SI POSEE ERRORES O:");
            
        }
        
        
        

        ruta = " ";
        colo.clear();
        coloT.clear();
        coloC.clear();
        banderita = false;
        banderitaB = false;
        banderitaNA = false;
        banderitaNR = false;

        cont++;

    }
    
    public void escogeReporte(){
                for (int i = 0; i < Open.reporte.size(); i++) {
            System.out.println("ENTRO AL FOR DE REPORTES");
            String cadena = Open.reporte.get(i).getLexema();
            String minusculas = cadena.toLowerCase();
            String[] arrayDato = minusculas.split(",");
            if (null == arrayDato[0]) {
                System.out.println("ENTRO AL IF DE REPORTES");
            } else {
                switch (arrayDato[0]) {

                    case "reportes":
                        System.out.println("ENTRO A REPORTES");
                        if (null == arrayDato[1]) {

                        } else {

                            switch (arrayDato[1]) {

                                case "ra":
                                    System.out.println("RREPORTE 1 TRUE");
                                    if ("true".equals(arrayDato[2])) {
                                        creacionPDFaprobados();
                                    } else {

                                    }
                                    break;
                                case "rr":
                                    System.out.println("*-----------------------------------------------------------------REPORTE 2222222222222222222222");
                                    if ("true".equals(arrayDato[2])) {
                                        creacionPDFreprobados();
                                    } else {

                                    }
                                    break;
                                case "rp":
                                    System.out.println("REPOOOOOOOOORTE 3333333333333333333333333333333333333333333333333333333");
                                    if ("true".equals(arrayDato[2])) {
                                        creacionPDFpublica();
                                    } else {

                                    }
                                    break;
                                case "re":
                                    System.out.println("REPORTE 444444444444444444444444444444444444444444444444444444");
                                    if ("true".equals(arrayDato[2])) {
                                        PDFmejores();
                                    } else {

                                    }
                                    break;
                                default:
                                    erroresList listas = new erroresList("SINTACTICO", arrayDato[1], "li", "h", "NO ESTA DENTRO DE LOS PERMITIDOS");
                                    lista.add(listas);
                                    break;
                            }
                        }
                        break;
                    case "ra":
                        if ("true".equals(arrayDato[1])) {
                            creacionPDFaprobados();
                        } else {

                        }
                        break;
                    case "rr":
                        if ("true".equals(arrayDato[1])) {
                            // 
                            System.out.println("*-----------------------------------------------------------------REPORTE 2222222222222222222222");
                            creacionPDFreprobados();
                        } else {

                        }
                        break;
                    case "rp":
                        
                        System.out.println("REPOOOOOOOOORTE 3333333333333333333333333333333333333333333333333333333");
                        if ("true".equals(arrayDato[1])) {
                            creacionPDFpublica();
                        } else {

                        }
                        break;
                    case "re":
                        System.out.println("REPORTE 444444444444444444444444444444444444444444444444444444");
                        if ("true".equals(arrayDato[1])) {
                            PDFmejores();

                        } else {

                        }
                        break;
                    default:
                        erroresList listas = new erroresList("SINTACTICO", arrayDato[0], "li", "h", "NO ESTA DENTRO DE LOS PERMITIDOS");
                        lista.add(listas);
                        break;
                }
            }
        }
    }

    public void PDFmejores() {

        Collections.sort(estudiante, (estudianteList o1, estudianteList o2) -> new Integer(o1.getTotal()).compareTo(o2.getTotal()));
        for (int j = 0; j < estudiante.size(); j++) {
            System.out.println(estudiante.get(j).getTotal());
        }
        pEncabezadoSI.clear();
        pEncabezadoSD.clear();
        pEncabezadoCI.clear();
        pEncabezadoCD.clear();
        pEncabezadoID.clear();
        pEncabezadoII.clear();
        System.out.println("ENTRO EN LA CREACION DE PDF");
        for (int a = 0; a < Edatos.size(); a++) {
            System.out.println(Edatos.get(a).getLetrasV());
        }
        try {
            Document doc = new Document(PageSize.A1, 47, 36, 36, 10);
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Jacky Montenegro\\Desktop\\reporteExcelencia" + cont + ".pdf"));

            doc.open();

            Paragraph TITU = new Paragraph("REPORTE EXCELENCIA", ColorTITULO);
            doc.add(TITU);

            cCarne.setFont(coloC.get(0).getFont());

            Image imagen;
            try {

                if (banderita == true) {
                    imagen = Image.getInstance(ruta);
                    imagen.scaleAbsolute(95, 95);
                    imagen.setAlignment(Element.ALIGN_RIGHT);
                    doc.add(imagen);
                }

            } catch (BadElementException | IOException ex) {
                Logger.getLogger(generadorPDF.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < Edatos.size(); i++) {

                switch (Edatos.get(i).getPosicion()) {
                    case 0:

                        pEncabezadoSI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoSI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSI);

                        break;
                    case 1:

                        pEncabezadoSD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoSD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSD);
                        break;
                    case 2:

                        pEncabezadoCI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoCI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCI);
                        break;
                    case 3:

                        pEncabezadoCD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoCD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCD);
                        break;
                    case 4:

                        pEncabezadoII.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoII.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoII.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoII);
                        break;
                    case 5:

                        pEncabezadoID.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoID.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoID.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoID);
                        break;
                    default:
                        break;
                }
            }

            // Este codigo genera una tabla de 3 columnas
            PdfPTable table = new PdfPTable(10);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell("CARNE");
            table.addCell("NOMBRE");
            table.addCell("APELLIDO");

            table.addCell("TAREA");
            table.addCell("HT");
            table.addCell("EC");

            table.addCell("PRACTICA");
            table.addCell("PROYECTO");
            table.addCell("EF");
            table.addCell("TOTAL");

            table.setHeaderRows(1);
            PdfPCell[] cells = table.getRow(0).getCells();

            for (int j = 0; j < cells.length; j++) {

                if (banderitaB == true) {
                    cells[j].setBorderColor(BaseColor.WHITE);
                } else {

                }
                cells[j].setBackgroundColor(BaseColor.LIGHT_GRAY);

            }
            String c1, c2, c3, c4, c5, c6, c7, c9;
            for (int i = (estudiante.size() - 10); i < estudiante.size(); i++) {

                c1 = Integer.toString(estudiante.get(i).getCarne());
                c2 = Integer.toString(estudiante.get(i).getTarea());
                c3 = Integer.toString(estudiante.get(i).getHoja());
                c4 = Integer.toString(estudiante.get(i).getCorto());
                c5 = Integer.toString(estudiante.get(i).getPractica());
                c6 = Integer.toString(estudiante.get(i).getProyecto());
                c7 = Integer.toString(estudiante.get(i).getExamen());

                c9 = Integer.toString(estudiante.get(i).getTotal());
                table.addCell(getC(c1));
                table.addCell(getBorder1(estudiante.get(i).getNombre()));
                table.addCell(getBorder1(estudiante.get(i).getApellido()));

                table.addCell(getBorder(c2));
                table.addCell(getBorder(c3));
                table.addCell(getBorder(c4));
                table.addCell(getBorder(c5));
                table.addCell(getBorder(c6));
                table.addCell(getBorder(c7));
                if (estudiante.get(i).getTotal() > 61) {
                    if (banderitaNA == true) {
                        table.addCell(getNA(c9));
                    } else {
                        table.addCell(c9);
                    }
                } else {
                    if (banderitaNR == true) {
                        table.addCell(colorRojoAAAAA(c9));
                    } else {
                        table.addCell(c9);
                    }
                }

            }
            // Agregamos la tabla al documento            
            doc.add(table);

            doc.close();
            JOptionPane.showMessageDialog(null, "PDF EXCELENCIA GENERADO CORRECTAMENTE");

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }

  public void getColoresEstilo() {
        System.out.println("LLEGO A GET ENCABEZADO");
        for (int i = 0; i < Open.estiloAtt.size(); i++) {
            String cadena = Open.estiloAtt.get(i).getLexema();
            String minusculas = cadena.toLowerCase();
            String[] arrayDato = minusculas.split(",");
            if (null == arrayDato[0]) {
                System.out.println("    ENTRO AL ARRAY 0");
            } else {
                switch (arrayDato[0]) {
                    case "estilo":
                        System.out.println("ENTRO AL ESTILO");
                        if ("color-t".equals(arrayDato[1])) {
                            System.out.println("ENTRO QUE COLOR _T");
                            if (null == arrayDato[2]) {
                                JOptionPane.showMessageDialog(null, "El color " + arrayDato[2] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                            } else {
                                switch (arrayDato[2]) {
                                    case "\"rojo\"":
                                        System.out.println("ENTRO ACAAAA**************************************************");
                                        addColores1(colorRojo);
                                        break;
                                    case "\"azul\"":
                                        addColores1(colorAzul);
                                        break;
                                    case "\"verde\"":
                                        addColores1(colorVerde);
                                        break;
                                    case "\"amarillo\"":
                                        addColores1(colorAmarillo);
                                        break;
                                    default:
                                        erroresList nuevo = new erroresList("SINTACTICO",arrayDato[2],"LINEA","COLUMNA","COLOR NO PERMITIDO");
                                        Open.lista.add(nuevo);
                                        JOptionPane.showMessageDialog(null, "El color " + arrayDato[2] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                                        break;
                                }
                            }
                        } else if ("logo".equals(arrayDato[1])) {
                            System.out.println("ENTRO EN LOGO");
                            banderita = true;
                            System.out.println("TRUE" + arrayDato[2]);

                            ruta = arrayDato[2].substring(1, arrayDato[2].length() - 1);
                            System.out.println("HIZO SPLIT" + ruta);
                            File ru = new File(ruta);
                            if (!ru.exists()) {
                                System.out.println("NO EXISTE RUTA");
                                JOptionPane.showMessageDialog(null, "NO EXISTE LA IMAGEN" + ruta);
                                erroresList nuevo = new erroresList("SINTACTICO",ruta,"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE");
                                        Open.lista.add(nuevo);
                            }else{
                            
                        }

                        } else if ("color-v".equals(arrayDato[1])) {
                            if (null == arrayDato[2]) {
                                JOptionPane.showMessageDialog(null, "El color " + arrayDato[2] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                            } else {
                                switch (arrayDato[2]) {
                                    case "\"rojo\"":

                                        addColores2(colorRojo);
                                        break;
                                    case "\"azul\"":
                                        addColores2(colorAzul);
                                        break;
                                    case "\"verde\"":
                                        addColores2(colorVerde);
                                        break;
                                    case "\"amarillo\"":
                                        addColores2(colorAmarillo);
                                        break;
                                    default:
                                        erroresList nuevo = new erroresList("SINTACTICO",arrayDato[2],"LINEA","COLUMNA","COLOR NO PERMITIDO");
                                        Open.lista.add(nuevo);
                                        JOptionPane.showMessageDialog(null, "El color " + arrayDato[2] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                                        break;
                                }
                            }
                        } else if ("color-c".equals(arrayDato[1])) {
                            if (null == arrayDato[2]) {
                                JOptionPane.showMessageDialog(null, "El color " + arrayDato[2] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                            } else {
                                switch (arrayDato[2]) {
                                    case "\"rojo\"":

                                        addColores3(colorRojo);
                                        break;
                                    case "\"azul\"":
                                        addColores3(colorAzul);
                                        break;
                                    case "\"verde\"":
                                        addColores3(colorVerde);
                                        break;
                                    case "\"amarillo\"":
                                        addColores3(colorAmarillo);
                                        break;
                                    default:
                                        erroresList nuevo = new erroresList("SINTACTICO",arrayDato[2],"LINEA","COLUMNA","COLOR NO PERMITIDO");
                                        Open.lista.add(nuevo);
                                        JOptionPane.showMessageDialog(null, "El color " + arrayDato[2] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                                        break;
                                }
                            }
                        } else if ("color-na".equals(arrayDato[1])) {
                            if ("true".equals(arrayDato[2])) {
                                banderitaNA = true;
                            } else {
                                erroresList nuevo = new erroresList("SINTACTICO",arrayDato[2],"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE");
                                        Open.lista.add(nuevo);

                            }
                        } else if ("color-nr".equals(arrayDato[1])) {
                            if ("true".equals(arrayDato[2])) {
                                banderitaNR = true;
                            } else {
                                erroresList nuevo = new erroresList("SINTACTICO",arrayDato[2],"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE");
                                        Open.lista.add(nuevo);

                            }
                        } else if ("bordes".equals(arrayDato[1])) {
                            if ("true".equals(arrayDato[2])) {
                                banderitaB = true;
                            } else {
                                erroresList nuevo = new erroresList("SINTACTICO",arrayDato[2],"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE");
                                        Open.lista.add(nuevo);

                            }
                        }
                        break;
                    case "logo":
                        System.out.println("ENTRO EN LOGO");
                        banderita = true;
                        System.out.println("TRUE" + arrayDato[1]);

                        ruta = arrayDato[1].substring(1, arrayDato[1].length() - 1);
                        System.out.println("HIZO SPLIT" + ruta);
                        File ru = new File(ruta);
                        if (!ru.exists()) {
                            System.out.println("NO EXISTE RUTA");
                            JOptionPane.showMessageDialog(null, "NO EXISTE LA IMAGEN" + ruta);
                            erroresList nuevo = new erroresList("SINTACTICO",ruta,"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE/ VERIFICAR RUTA");
                                        Open.lista.add(nuevo);
                        }else{
                            
                        }
                        break;
                    case "color-na":
                        if ("true".equals(arrayDato[1])) {
                            banderitaNA = true;
                        } else {
                            erroresList nuevo = new erroresList("SINTACTICO",arrayDato[1],"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE");
                                        Open.lista.add(nuevo);

                        }
                        break;
                    case "color-nr":
                        if ("true".equals(arrayDato[1])) {
                            banderitaNR = true;
                        } else {
                            erroresList nuevo = new erroresList("SINTACTICO",arrayDato[1],"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE");
                                        Open.lista.add(nuevo);
                        }
                        break;
                    case "bordes":
                        if ("true".equals(arrayDato[1])) {
                            banderitaB = true;
                        } else {
erroresList nuevo = new erroresList("SINTACTICO",arrayDato[1],"LINEA","COLUMNA","VALOR BOOLEANO: FALSE O TRUE");
                                        Open.lista.add(nuevo);
                        }
                        break;
                    case "color-t":
                        if (null == arrayDato[1]) {
                            JOptionPane.showMessageDialog(null, "El color " + arrayDato[1] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                        } else {
                            switch (arrayDato[1]) {
                                case "\"rojo\"":
                                    System.out.println("ENTRO ACAAAA**************************************************");
                                    addColores1(colorRojo);
                                    break;
                                case "\"azul\"":
                                    addColores1(colorAzul);
                                    break;
                                case "\"verde\"":
                                    addColores1(colorVerde);
                                    break;
                                case "\"amarillo\"":
                                    addColores1(colorAmarillo);
                                    break;
                                default:
                                    erroresList nuevo = new erroresList("SINTACTICO",arrayDato[1],"LINEA","COLUMNA","COLOR NO PERMITIDO");
                                        Open.lista.add(nuevo);
                                    JOptionPane.showMessageDialog(null, "El color " + arrayDato[1] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                                    break;
                            }
                        }
                        break;

                    case "color-v":
                        if (null == arrayDato[1]) {
                            JOptionPane.showMessageDialog(null, "El color " + arrayDato[1] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                        } else {
                            switch (arrayDato[1]) {
                                case "\"rojo\"":
                                    addColores2(colorRojo);
                                    break;
                                case "\"azul\"":
                                    addColores2(colorAzul);
                                    break;
                                case "\"verde\"":
                                    addColores2(colorVerde);
                                    break;
                                case "\"amarillo\"":
                                    addColores2(colorAmarillo);
                                    break;
                                default:
                                    erroresList nuevo = new erroresList("SINTACTICO",arrayDato[1],"LINEA","COLUMNA","COLOR NO PERMITIDO");
                                        Open.lista.add(nuevo);
                                    JOptionPane.showMessageDialog(null, "El color " + arrayDato[1] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                                    break;
                            }
                        }
                        break;
                    case "color-c":
                        if (null == arrayDato[1]) {
                            JOptionPane.showMessageDialog(null, "El color " + arrayDato[1] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                        } else {
                            switch (arrayDato[1]) {
                                case "\"rojo\"":
                                    addColores3(colorRojo);
                                    break;
                                case "\"azul\"":
                                    addColores3(colorAzul);
                                    break;
                                case "\"verde\"":
                                    addColores3(colorVerde);
                                    break;
                                case "\"amarillo\"":
                                    addColores3(colorAmarillo);
                                    break;
                                default:
                                    erroresList nuevo = new erroresList("SINTACTICO",arrayDato[1],"LINEA","COLUMNA","COLOR NO PERMITIDO");
                                        Open.lista.add(nuevo);
                                    JOptionPane.showMessageDialog(null, "El color " + arrayDato[1] + "no esta dentro de los permitidos: " + "\n" + "ROJO" + "\n" + "VERDE" + "\n" + "AZUL" + "\n" + "AMARILLO");
                                    break;
                            }
                        }
                        break;

                    default:
                        break;
                }
            }

        }

    }

    public void addColores1(Font coTilulo) {
        coloresList titulo = new coloresList(coTilulo);
        coloT.add(titulo);
    }

    public void addColores2(Font colorvalor) {

        coloresList valor = new coloresList(colorvalor);

        colo.add(valor);
    }

    public void addColores3(Font colorvalor) {

        coloresList valor = new coloresList(colorvalor);

        coloC.add(valor);
    }

    private void creacionPDFaprobados() {
        pEncabezadoSI.clear();
        pEncabezadoSD.clear();
        pEncabezadoCI.clear();
        pEncabezadoCD.clear();
        pEncabezadoID.clear();
        pEncabezadoII.clear();
        System.out.println("ENTRO EN LA CREACION DE PDF");
        for (int a = 0; a < Edatos.size(); a++) {
            System.out.println(Edatos.get(a).getLetrasV());
        }
        try {
            Document doc = new Document(PageSize.A1, 47, 36, 36, 10);
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Jacky Montenegro\\Desktop\\reporteAprobados" + cont + ".pdf"));

            doc.open();
            Paragraph TITU = new Paragraph("REPORTE APROBADOS", ColorTITULO);
            doc.add(TITU);

            cCarne.setFont(coloC.get(0).getFont());

            Image imagen;
            try {

                if (banderita == true) {
                    imagen = Image.getInstance(ruta);
                    imagen.scaleAbsolute(95, 95);
                    imagen.setAlignment(Element.ALIGN_RIGHT);
                    doc.add(imagen);
                }

            } catch (BadElementException | IOException ex) {
                Logger.getLogger(generadorPDF.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < Edatos.size(); i++) {

                switch (Edatos.get(i).getPosicion()) {
                    case 0:

                        pEncabezadoSI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoSI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSI);

                        break;
                    case 1:

                        pEncabezadoSD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoSD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSD);
                        break;
                    case 2:

                        pEncabezadoCI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoCI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCI);
                        break;
                    case 3:

                        pEncabezadoCD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoCD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCD);
                        break;
                    case 4:

                        pEncabezadoII.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoII.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoII.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoII);
                        break;
                    case 5:

                        pEncabezadoID.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoID.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoID.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoID);
                        break;
                    default:
                        break;
                }
            }

            // Este codigo genera una tabla de 3 columnas
            PdfPTable table = new PdfPTable(10);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell("CARNE");
            table.addCell("NOMBRE");
            table.addCell("APELLIDO");

            table.addCell("TAREA");
            table.addCell("HT");
            table.addCell("EC");

            table.addCell("PRACTICA");
            table.addCell("PROYECTO");
            table.addCell("EF");
            table.addCell("TOTAL");

            table.setHeaderRows(1);
            PdfPCell[] cells = table.getRow(0).getCells();

            for (int j = 0; j < cells.length; j++) {

                if (banderitaB == true) {
                    cells[j].setBorderColor(BaseColor.WHITE);
                } else {

                }
                cells[j].setBackgroundColor(BaseColor.LIGHT_GRAY);

            }
            String c1, c2, c3, c4, c5, c6, c7, c8;
            for (int i = 0; i < estudiante.size(); i++) {

                if (estudiante.get(i).getTotal() > 61) {

                    c1 = Integer.toString(estudiante.get(i).getCarne());
                    c2 = Integer.toString(estudiante.get(i).getTarea());
                    c3 = Integer.toString(estudiante.get(i).getHoja());
                    c4 = Integer.toString(estudiante.get(i).getCorto());
                    c5 = Integer.toString(estudiante.get(i).getPractica());
                    c6 = Integer.toString(estudiante.get(i).getProyecto());
                    c7 = Integer.toString(estudiante.get(i).getExamen());
                    c8 = Integer.toString(estudiante.get(i).getTotal());
                    table.addCell(getC(c1));
                    table.addCell(getBorder1(estudiante.get(i).getNombre()));
                    table.addCell(getBorder1(estudiante.get(i).getApellido()));

                    table.addCell(getBorder(c2));
                    table.addCell(getBorder(c3));
                    table.addCell(getBorder(c4));
                    table.addCell(getBorder(c5));
                    table.addCell(getBorder(c6));
                    table.addCell(getBorder(c7));
                    if (banderitaNA == true) {
                        table.addCell(getNA(c8));
                    } else {
                        table.addCell(c8);
                    }

                } else {

                }

            }
            // Agregamos la tabla al documento            
            doc.add(table);

            doc.close();
            JOptionPane.showMessageDialog(null, "PDF APROBADOS GENERADO CORRECTAMENTE");

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }

    }

    private void infoEncabezado() {

        for (int i = 0; i < Open.encabezado.size(); i++) {
            String cadena = Open.encabezado.get(i).getLexema();
            String minusculas = cadena.toLowerCase();
            String[] arrayDato = minusculas.split(",");
            if (null == arrayDato[0]) {
                System.out.println("    ENTRO AL ARRAY 0");
            } else {
                switch (arrayDato[0]) {
                    case "encabezado":
                        System.out.println("ENTRO AL ESTILO");
                        if ("superior-izq".equals(arrayDato[1])) {
                            coloresList Edat1 = new coloresList(0, arrayDato[2], arrayDato[3]);
                            Edatos.add(Edat1);

                        } else if ("superior-der".equals(arrayDato[1])) {
                            coloresList Edat1 = new coloresList(1, arrayDato[2], arrayDato[3]);
                            Edatos.add(Edat1);

                        } else if ("centro-izq".equals(arrayDato[1])) {
                            coloresList Edat1 = new coloresList(2, arrayDato[2], arrayDato[3]);
                            Edatos.add(Edat1);
                        } else if ("centro-der".equals(arrayDato[1])) {
                            coloresList Edat1 = new coloresList(3, arrayDato[2], arrayDato[3]);
                            Edatos.add(Edat1);
                        } else if ("inferior-izq".equals(arrayDato[1])) {
                            coloresList Edat1 = new coloresList(4, arrayDato[2], arrayDato[3]);
                            Edatos.add(Edat1);
                        } else if ("inferior-der".equals(arrayDato[1])) {
                            coloresList Edat1 = new coloresList(5, arrayDato[2], arrayDato[3]);
                            Edatos.add(Edat1);
                        } else {
                            erroresList listas = new erroresList("SINTACTICO", arrayDato[1], "li", "h", "NO ESTA DENTRO DE LOS PERMITIDOS");
                            lista.add(listas);
                        }
                        break;
                    case "superior-izq":
                        coloresList Edat1 = new coloresList(0, arrayDato[1], arrayDato[2]);
                        Edatos.add(Edat1);
                        break;
                    case "superior-der":
                        coloresList Edat2 = new coloresList(1, arrayDato[1], arrayDato[2]);
                        Edatos.add(Edat2);
                        break;

                    case "centro-izq":
                        coloresList Edat3 = new coloresList(2, arrayDato[1], arrayDato[2]);
                        Edatos.add(Edat3);
                        break;
                    case "centro-der":
                        coloresList Edat4 = new coloresList(3, arrayDato[1], arrayDato[2]);
                        Edatos.add(Edat4);
                        break;
                    case "inferior-izq":
                        coloresList Edat5 = new coloresList(4, arrayDato[1], arrayDato[2]);
                        Edatos.add(Edat5);
                        break;
                    case "inferior-der":
                        coloresList Edat6 = new coloresList(5, arrayDato[1], arrayDato[2]);
                        Edatos.add(Edat6);
                        break;
                    default:
                        erroresList listas = new erroresList("SINTACTICO", arrayDato[0], "li", "h", "NO ESTA DENTRO DE LOS PERMITIDOS");
                        lista.add(listas);
                        break;
                }
            }

        }
    }

    private void generaTablaA() {
        System.out.println("ENTRA ACA....................................");
        for (int i = 0; i < Open.cuerpo.size(); i++) {

            tarea.clear();
            hoja.clear();
            corto.clear();
            practica.clear();
            proyecto.clear();
            examen.clear();
            total.clear();
            tareaP.clear();
            hojaP.clear();
            cortoP.clear();
            proyectoP.clear();
            practicaP.clear();
            examenP.clear();
//            Pontarea.clear();
//            Ponhoja.clear();
//            Poncorto.clear();
//            Ponproyecto.clear();
//            Ponpractica.clear();
//            Ponexamen.clear();
            totalP.clear();

            String cadena = Open.cuerpo.get(i).getLexema();
            String minusculas = cadena.toLowerCase();
            String[] arrayDato = minusculas.split("!");

            for (int j = 0; j < arrayDato.length; j++) {
                System.out.println(arrayDato[j]);
                String y = Character.toString(arrayDato[j].charAt(0));
                String z = Character.toString(arrayDato[j].charAt(1));
                String w = Character.toString(arrayDato[j].charAt(2));

                //  System.out.println(y+z+w);
                switch (y) {
                    case "a":
                        String[] cagadales001 = arrayDato[j].split(",");

                        System.out.println(cagadales001[1]);
                        apellidoE = cagadales001[1];

                        break;
                    case "c":

                        switch (z) {
                            case "u":
                                String[] cagadales002 = arrayDato[j].split(",");

                                System.out.println(cagadales002[1]);
                                carneE = Integer.parseInt(cagadales002[2]);
                                break;
                            case "a":
                                String[] cagadales0022 = arrayDato[j].split(",");

                                System.out.println(cagadales0022[0]);
                                carneE = Integer.parseInt(cagadales0022[1]);
                                break;
                            default:
                                break;
                        }

                        break;
                    case "n":
                        String[] cagadales003 = arrayDato[j].split(",");

                        System.out.println(cagadales003[1]);
                        nombreE = cagadales003[1];

                        break;
                    case "t":
                        String[] cagadales = arrayDato[j].split(",");

                        System.out.println(cagadales[1]);
                        estudianteList a0 = new estudianteList(Integer.parseInt(cagadales[1]));
                        tarea.add(a0);

                        break;
                    case "h":
                        String[] cagadales1 = arrayDato[j].split(",");

                        System.out.println(cagadales1[1]);
                        estudianteList a1 = new estudianteList(Integer.parseInt(cagadales1[1]));
                        hoja.add(a1);

                        break;
                    case "e":
                        switch (z) {
                            case "c":
                                String[] cagadales2 = arrayDato[j].split(",");

                                System.out.println(cagadales2[1]);
                                estudianteList a2 = new estudianteList(Integer.parseInt(cagadales2[1]));
                                corto.add(a2);
                                break;
                            case "f":
                                String[] cagadales3 = arrayDato[j].split(",");

                                System.out.println(cagadales3[1]);
                                estudianteList a3 = new estudianteList(Integer.parseInt(cagadales3[1]));
                                examen.add(a3);

                                break;
                            default:
                                break;
                        }

                        break;
                    case "p":
                        switch (w) {
                            case "a":
                                String[] cagadales4 = arrayDato[j].split(",");

                                System.out.println(cagadales4[1]);
                                estudianteList a4 = new estudianteList(Integer.parseInt(cagadales4[1]));
                                practica.add(a4);

                                break;
                            case "o":
                                String[] cagadales5 = arrayDato[j].split(",");

                                System.out.println(cagadales5[1]);
                                estudianteList a5 = new estudianteList(Integer.parseInt(cagadales5[1]));
                                proyecto.add(a5);

                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
            }
            obtenerTotales();
            System.out.println(nombreE + apellidoE + carneE);
            int p1, p2, p3, p4, p5, p6;
            int t1, t2, t3, t4, t5, t6;
            int notaFinal;
            p1 = tareaP.get(tareaP.size() - 1).getCarne();
            t1 = (p1 * (Pontarea.get(0).getCarne())) / 100;
            p2 = hojaP.get(hojaP.size() - 1).getCarne();
            t2 = (p2 * (Ponhoja.get(0).getCarne())) / 100;
            p3 = cortoP.get(cortoP.size() - 1).getCarne();
            t3 = (p3 * (Poncorto.get(0).getCarne())) / 100;
            p4 = practicaP.get(practicaP.size() - 1).getCarne();
            t4 = (p4 * (Ponpractica.get(0).getCarne())) / 100;
            p5 = proyectoP.get(proyectoP.size() - 1).getCarne();
            t5 = (p5 * (Ponproyecto.get(0).getCarne())) / 100;
            p6 = examenP.get(examenP.size() - 1).getCarne();
            t6 = (p6 * (Ponexamen.get(0).getCarne())) / 100;
            System.out.println(p1 + " " + t1);
            System.out.println(p2 + " " + t2);
            System.out.println(p3 + " " + t3);
            System.out.println(p4 + " " + t4);
            System.out.println(p5 + " " + t5);
            System.out.println(p6 + " " + t6);
            notaFinal = t1 + t2 + t3 + t4 + t5 + t6;
            System.out.println(notaFinal);
            estudianteList porfin = new estudianteList(carneE, nombreE, apellidoE, t1, t2, t3, t4, t5, t6, notaFinal);
            estudiante.add(porfin);

        }
    }

    private void obtenerTotales() {
        int div;
        int totalT = 0;
        for (int contador = 0; contador < tarea.size(); contador++) {
            totalT = totalT + tarea.get(contador).getCarne();
            div = totalT / (contador + 1);
            System.out.println(totalT + "<----------- SUMA");
            System.out.println(div + "<----------- DIV");
            estudianteList a0 = new estudianteList(div);
            tareaP.add(a0);
        }

        totalT = 0;
        for (int contador = 0; contador < hoja.size(); contador++) {
            totalT = totalT + hoja.get(contador).getCarne();
            div = totalT / (contador + 1);
            System.out.println(totalT + "<----------- SUMA");
            System.out.println(div + "<----------- DIV");
            estudianteList a0 = new estudianteList(div);
            hojaP.add(a0);
        }
        totalT = 0;
        for (int contador = 0; contador < practica.size(); contador++) {
            totalT = totalT + practica.get(contador).getCarne();
            div = totalT / (contador + 1);
            System.out.println(totalT + "<----------- SUMA");
            System.out.println(div + "<----------- DIV");
            estudianteList a0 = new estudianteList(div);
            practicaP.add(a0);
        }
        totalT = 0;
        for (int contador = 0; contador < proyecto.size(); contador++) {
            totalT = totalT + proyecto.get(contador).getCarne();
            div = totalT / (contador + 1);
            System.out.println(totalT + "<----------- SUMA");
            System.out.println(div + "<----------- DIV");
            estudianteList a0 = new estudianteList(div);
            proyectoP.add(a0);
        }
        totalT = 0;
        for (int contador = 0; contador < examen.size(); contador++) {
            totalT = totalT + examen.get(contador).getCarne();
            div = totalT / (contador + 1);
            System.out.println(totalT + "<----------- SUMA");
            System.out.println(div + "<----------- DIV");
            estudianteList a0 = new estudianteList(div);
            examenP.add(a0);
        }
        totalT = 0;
        for (int contador = 0; contador < corto.size(); contador++) {
            totalT = totalT + corto.get(contador).getCarne();
            div = totalT / (contador + 1);
            System.out.println(totalT + "<----------- SUMA");
            System.out.println(div + "<----------- DIV");
            estudianteList a0 = new estudianteList(div);
            cortoP.add(a0);
        }
    }

    private void datosPonderacion() {
        for (int i = 0; i < Open.ponderacion.size(); i++) {

            String cadena = Open.ponderacion.get(i).getLexema();
            String minusculas = cadena.toLowerCase();
            String[] arrayDato = minusculas.split(",");

            if (null == arrayDato[0]) {

            } else {
                switch (arrayDato[0]) {
                    case "ponderacion":
                        if (null == arrayDato[1]) {

                        } else {
                            switch (arrayDato[1]) {
                                case "tareas":
                                    String q1;
                                    q1 = arrayDato[3].substring(0, arrayDato[3].length() - 1);
                                    addtareas(Integer.parseInt(q1));
                                    break;
                                case "hojas_de_trabajo":
                                    String q2;
                                    q2 = arrayDato[3].substring(0, arrayDato[3].length() - 1);
                                    addhojas(Integer.parseInt(q2));
                                    break;
                                case "examenes_cortos":
                                    String q3;
                                    q3 = arrayDato[3].substring(0, arrayDato[3].length() - 1);
                                    addcortos(Integer.parseInt(q3));
                                    break;
                                case "practicas":
                                    String q4;
                                    q4 = arrayDato[3].substring(0, arrayDato[3].length() - 1);
                                    addprac(Integer.parseInt(q4));
                                    break;
                                case "proyectos":
                                    String q5;
                                    q5 = arrayDato[3].substring(0, arrayDato[3].length() - 1);
                                    addpro(Integer.parseInt(q5));
                                    break;
                                case "examen_final":
                                    String q6;
                                    q6 = arrayDato[3].substring(0, arrayDato[3].length() - 1);
                                    addfina(Integer.parseInt(q6));
                                    break;
                                default:
                                    erroresList listas = new erroresList("SINTACTICO", arrayDato[3], "li", "h", "NO ESTA DENTRO DE LOS PERMITIDOS");
                                    lista.add(listas);
                                    break;
                            }
                        }
                        break;
                    case "tareas":
                        String q1;
                        q1 = arrayDato[2].substring(0, arrayDato[2].length() - 1);
                        addtareas(Integer.parseInt(q1));
                        break;
                    case "hojas_de_trabajo":
                        String q2;
                        q2 = arrayDato[2].substring(0, arrayDato[2].length() - 1);
                        addhojas(Integer.parseInt(q2));
                        break;
                    case "examenes_cortos":
                        String q3;
                        q3 = arrayDato[2].substring(0, arrayDato[2].length() - 1);
                        addcortos(Integer.parseInt(q3));
                        break;
                    case "practicas":
                        String q4;
                        q4 = arrayDato[2].substring(0, arrayDato[2].length() - 1);
                        addprac(Integer.parseInt(q4));
                        break;
                    case "proyectos":
                        String q5;
                        q5 = arrayDato[2].substring(0, arrayDato[2].length() - 1);
                        addpro(Integer.parseInt(q5));
                        break;
                    case "examen_final":
                        String q6;
                        q6 = arrayDato[2].substring(0, arrayDato[2].length() - 1);
                        addfina(Integer.parseInt(q6));
                        break;
                    default:
                        erroresList listas = new erroresList("SINTACTICO", arrayDato[2], "li", "h", "NO ESTA DENTRO DE LOS PERMITIDOS");
                        lista.add(listas);
                        break;
                }
            }
        }
    }

    private void addtareas(int parseInt) {
        System.out.println(parseInt);
        estudianteList nuevo = new estudianteList(parseInt);
        Pontarea.add(nuevo);
        System.out.println(Pontarea.get(0).getCarne());
    }

    private void addhojas(int parseInt) {
        System.out.println(parseInt);
        estudianteList nuevo = new estudianteList(parseInt);
        Ponhoja.add(nuevo);
    }

    private void addcortos(int parseInt) {
        System.out.println(parseInt);
        estudianteList nuevo = new estudianteList(parseInt);
        Poncorto.add(nuevo);
    }

    private void addprac(int parseInt) {
        System.out.println(parseInt);
        estudianteList nuevo = new estudianteList(parseInt);
        Ponpractica.add(nuevo);
    }

    private void addpro(int parseInt) {
        System.out.println(parseInt);
        estudianteList nuevo = new estudianteList(parseInt);
        Ponproyecto.add(nuevo);
    }

    private void addfina(int parseInt) {
        System.out.println(parseInt);
        estudianteList nuevo = new estudianteList(parseInt);
        Ponexamen.add(nuevo);
    }

    private PdfPCell getNA(String c8) {

        PdfPCell cell = new PdfPCell(new Phrase(c8, colorVerde));

        if (banderitaB == true) {
            cell.setBorderColor(BaseColor.WHITE);
        } else {

        }
        return cell;

    }

    private PdfPCell getNR(String c8) {
        return null;
    }

    private PdfPCell getC(String c1) {

        PdfPCell cell = new PdfPCell(new Phrase(c1, coloC.get(0).getFont()));
        if (banderitaB == true) {
            cell.setBorderColor(BaseColor.WHITE);
        } else {

        }
        return cell;
    }

    private PdfPCell getBorder(String c2) {
        PdfPCell cell = new PdfPCell(new Phrase(c2, ColorT));
        if (banderitaB == true) {
            cell.setBorderColor(BaseColor.WHITE);
        } else {

        }
        return cell;
    }

    private PdfPCell getBorder1(String nombre) {
        PdfPCell cell = new PdfPCell(new Phrase(nombre, ColorT));
        if (banderitaB == true) {
            cell.setBorderColor(BaseColor.WHITE);
        } else {

        }
        return cell;
    }

    private Chunk addColor(int i, Font font) {
        Chunk nuevo = new Chunk(Edatos.get(i).getLetrasT(), font);
        return nuevo;
    }

    private Chunk addValor(int i, Font font) {
        Chunk nuevo = new Chunk(Edatos.get(i).getLetrasV(), font);
        return nuevo;
    }

    private void creacionPDFreprobados() {
        pEncabezadoSI.clear();
        pEncabezadoSD.clear();
        pEncabezadoCI.clear();
        pEncabezadoCD.clear();
        pEncabezadoID.clear();
        pEncabezadoII.clear();
        System.out.println("ENTRO EN LA CREACION DE PDF");
        for (int a = 0; a < Edatos.size(); a++) {
            System.out.println(Edatos.get(a).getLetrasV());
        }
        try {
            Document doc = new Document(PageSize.A1, 47, 36, 36, 10);
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Jacky Montenegro\\Desktop\\reporteReprobados" + cont + ".pdf"));

            doc.open();
            Paragraph TITU = new Paragraph("REPORTE REPROBADOS", ColorTITULO);
            doc.add(TITU);

            cCarne.setFont(coloC.get(0).getFont());

            Image imagen;
            try {

                if (banderita == true) {
                    imagen = Image.getInstance(ruta);
                    imagen.scaleAbsolute(95, 95);
                    imagen.setAlignment(Element.ALIGN_RIGHT);
                    doc.add(imagen);
                }

            } catch (BadElementException | IOException ex) {
                Logger.getLogger(generadorPDF.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < Edatos.size(); i++) {

                switch (Edatos.get(i).getPosicion()) {
                    case 0:

                        pEncabezadoSI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoSI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSI);

                        break;
                    case 1:

                        pEncabezadoSD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoSD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSD);
                        break;
                    case 2:

                        pEncabezadoCI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoCI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCI);
                        break;
                    case 3:

                        pEncabezadoCD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoCD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCD);
                        break;
                    case 4:

                        pEncabezadoII.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoII.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoII.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoII);
                        break;
                    case 5:

                        pEncabezadoID.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoID.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoID.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoID);
                        break;
                    default:
                        break;
                }
            }

            // Este codigo genera una tabla de 3 columnas
            PdfPTable table = new PdfPTable(10);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell("CARNE");
            table.addCell("NOMBRE");
            table.addCell("APELLIDO");

            table.addCell("TAREA");
            table.addCell("HT");
            table.addCell("EC");

            table.addCell("PRACTICA");
            table.addCell("PROYECTO");
            table.addCell("EF");
            table.addCell("TOTAL");

            table.setHeaderRows(1);
            PdfPCell[] cells = table.getRow(0).getCells();

            for (int j = 0; j < cells.length; j++) {

                if (banderitaB == true) {
                    cells[j].setBorderColor(BaseColor.WHITE);
                } else {

                }
                cells[j].setBackgroundColor(BaseColor.LIGHT_GRAY);

            }
            String c1, c2, c3, c4, c5, c6, c7, c9;
            for (int i = 0; i < estudiante.size(); i++) {

                if (estudiante.get(i).getTotal() < 61) {

                    c1 = Integer.toString(estudiante.get(i).getCarne());
                    c2 = Integer.toString(estudiante.get(i).getTarea());
                    c3 = Integer.toString(estudiante.get(i).getHoja());
                    c4 = Integer.toString(estudiante.get(i).getCorto());
                    c5 = Integer.toString(estudiante.get(i).getPractica());
                    c6 = Integer.toString(estudiante.get(i).getProyecto());
                    c7 = Integer.toString(estudiante.get(i).getExamen());

                    c9 = Integer.toString(estudiante.get(i).getTotal());
                    table.addCell(getC(c1));
                    table.addCell(getBorder1(estudiante.get(i).getNombre()));
                    table.addCell(getBorder1(estudiante.get(i).getApellido()));

                    table.addCell(getBorder(c2));
                    table.addCell(getBorder(c3));
                    table.addCell(getBorder(c4));
                    table.addCell(getBorder(c5));
                    table.addCell(getBorder(c6));
                    table.addCell(getBorder(c7));
                    if (banderitaNR == true) {
                        table.addCell(colorRojoAAAAA(c9));
                    } else {
                        table.addCell(c9);
                    }

                } else {

                }

            }
            // Agregamos la tabla al documento            
            doc.add(table);

            doc.close();
            JOptionPane.showMessageDialog(null, "PDF REPROBADOS GENERADO CORRECTAMENTE");

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }

    }

    private PdfPCell colorRojoAAAAA(String c8) {
        PdfPCell cell = new PdfPCell(new Phrase(c8, colorRojo));

        if (banderitaB == true) {
            cell.setBorderColor(BaseColor.WHITE);
        } else {

        }
        return cell;
    }

    private void creacionPDFpublica() {
        pEncabezadoSI.clear();
        pEncabezadoSD.clear();
        pEncabezadoCI.clear();
        pEncabezadoCD.clear();
        pEncabezadoID.clear();
        pEncabezadoII.clear();
        System.out.println("ENTRO EN LA CREACION DE PDF");
        for (int a = 0; a < Edatos.size(); a++) {
            System.out.println(Edatos.get(a).getLetrasV());
        }
        try {
            Document doc = new Document(PageSize.A1, 47, 36, 36, 10);
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Jacky Montenegro\\Desktop\\reportePublicacion" + cont + ".pdf"));

            doc.open();

            Paragraph TITU = new Paragraph("REPORTE PUBLICACION", ColorTITULO);
            doc.add(TITU);

            cCarne.setFont(coloC.get(0).getFont());

            Image imagen;
            try {

                if (banderita == true) {
                    imagen = Image.getInstance(ruta);
                    imagen.scaleAbsolute(95, 95);
                    imagen.setAlignment(Element.ALIGN_RIGHT);
                    doc.add(imagen);
                }

            } catch (BadElementException | IOException ex) {
                Logger.getLogger(generadorPDF.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < Edatos.size(); i++) {

                switch (Edatos.get(i).getPosicion()) {
                    case 0:

                        pEncabezadoSI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoSI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSI);

                        break;
                    case 1:

                        pEncabezadoSD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoSD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoSD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoSD);
                        break;
                    case 2:

                        pEncabezadoCI.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoCI.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCI.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCI);
                        break;
                    case 3:

                        pEncabezadoCD.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoCD.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoCD.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoCD);
                        break;
                    case 4:

                        pEncabezadoII.setAlignment(Element.ALIGN_LEFT);
                        pEncabezadoII.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoII.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoII);
                        break;
                    case 5:

                        pEncabezadoID.setAlignment(Element.ALIGN_RIGHT);
                        pEncabezadoID.add(addColor(i, coloT.get(0).getFont()));
                        pEncabezadoID.add(addValor(i, colo.get(0).getFont()));
                        doc.add(pEncabezadoID);
                        break;
                    default:
                        break;
                }
            }

            // Este codigo genera una tabla de 3 columnas
            PdfPTable table = new PdfPTable(10);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell("CARNE");
            table.addCell("NOMBRE");
            table.addCell("APELLIDO");

            table.addCell("TAREA");
            table.addCell("HT");
            table.addCell("EC");

            table.addCell("PRACTICA");
            table.addCell("PROYECTO");
            table.addCell("EF");
            table.addCell("TOTAL");

            table.setHeaderRows(1);
            PdfPCell[] cells = table.getRow(0).getCells();

            for (int j = 0; j < cells.length; j++) {

                if (banderitaB == true) {
                    cells[j].setBorderColor(BaseColor.WHITE);
                } else {

                }
                cells[j].setBackgroundColor(BaseColor.LIGHT_GRAY);

            }
            String c1, c2, c3, c4, c5, c6, c7, c9;
            for (int i = 0; i < estudiante.size(); i++) {

                c1 = Integer.toString(estudiante.get(i).getCarne());
                c2 = Integer.toString(estudiante.get(i).getTarea());
                c3 = Integer.toString(estudiante.get(i).getHoja());
                c4 = Integer.toString(estudiante.get(i).getCorto());
                c5 = Integer.toString(estudiante.get(i).getPractica());
                c6 = Integer.toString(estudiante.get(i).getProyecto());
                c7 = Integer.toString(estudiante.get(i).getExamen());

                c9 = Integer.toString(estudiante.get(i).getTotal());
                table.addCell(getC(c1));
                table.addCell(getBorder1(estudiante.get(i).getNombre()));
                table.addCell(getBorder1(estudiante.get(i).getApellido()));

                table.addCell(getBorder(c2));
                table.addCell(getBorder(c3));
                table.addCell(getBorder(c4));
                table.addCell(getBorder(c5));
                table.addCell(getBorder(c6));
                table.addCell(getBorder(c7));
                if (estudiante.get(i).getTotal() > 61) {
                    if (banderitaNA == true) {
                        table.addCell(getNA(c9));
                    } else {
                        table.addCell(c9);
                    }
                } else {
                    if (banderitaNR == true) {
                        table.addCell(colorRojoAAAAA(c9));
                    } else {
                        table.addCell(c9);
                    }
                }

            }
            // Agregamos la tabla al documento            
            doc.add(table);

            doc.close();
            JOptionPane.showMessageDialog(null, "PDF PUBLICACION GENERADO CORRECTAMENTE");

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }

    private void ultimo() {

        String s1 = " ";
        String s2 = " ";
        String s3 = " ";
        String s4 = " ";
        String s5 = " ";
        String s6 = " ";

        for (int i = 0; i < Open.cuerpo.size(); i++) {

            tarea.clear();
            hoja.clear();
            corto.clear();
            practica.clear();
            proyecto.clear();
            examen.clear();
            total.clear();
            tareaP.clear();
            hojaP.clear();
            cortoP.clear();
            proyectoP.clear();
            practicaP.clear();
            examenP.clear();
//            Pontarea.clear();
//            Ponhoja.clear();
//            Poncorto.clear();
//            Ponproyecto.clear();
//            Ponpractica.clear();
//            Ponexamen.clear();
            totalP.clear();

            String cadena = Open.cuerpo.get(i).getLexema();
            String minusculas = cadena.toLowerCase();
            String[] arrayDato = minusculas.split("!");

            for (int j = 0; j < arrayDato.length; j++) {
                System.out.println(arrayDato[j]);
                String y = Character.toString(arrayDato[j].charAt(0));
                String z = Character.toString(arrayDato[j].charAt(1));
                String w = Character.toString(arrayDato[j].charAt(2));

                s1 = " ";
                s2 = " ";
                s3 = " ";
                s4 = " ";
                s5 = " ";
                s6 = " ";

                //  System.out.println(y+z+w);
                switch (y) {
                    case "a":
                        String[] cagadales001 = arrayDato[j].split(",");

                        System.out.println(cagadales001[1]);
                        apellidoE = cagadales001[1];

                        break;
                    case "c":

                        switch (z) {
                            case "u":
                                String[] cagadales002 = arrayDato[j].split(",");

                                System.out.println(cagadales002[1]);
                                carneE = Integer.parseInt(cagadales002[2]);
                                break;
                            case "a":
                                String[] cagadales0022 = arrayDato[j].split(",");

                                System.out.println(cagadales0022[0]);
                                carneE = Integer.parseInt(cagadales0022[1]);
                                break;
                            default:
                                break;
                        }

                        break;
                    case "n":
                        String[] cagadales003 = arrayDato[j].split(",");

                        System.out.println(cagadales003[1]);
                        nombreE = cagadales003[1];

                        break;
                    case "t":
                        String[] cagadales = arrayDato[j].split(",");

                        System.out.println(cagadales[1]);
                        estudianteList a0 = new estudianteList(Integer.parseInt(cagadales[1]));
                        tarea.add(a0);

                        s1 += cagadales[1];
                        System.out.println(s1 + "jsdkfjsdklfjslkdfjsñkdjfsldjfañslkdfjasñojflskdjfoskjflsdjfc");
                        break;
                    case "h":
                        String[] cagadales1 = arrayDato[j].split(",");

                        System.out.println(cagadales1[1]);
                        estudianteList a1 = new estudianteList(Integer.parseInt(cagadales1[1]));
                        hoja.add(a1);
                        s2 = s2 + " " + cagadales1[1];
                        break;
                    case "e":
                        switch (z) {
                            case "c":
                                String[] cagadales2 = arrayDato[j].split(",");

                                System.out.println(cagadales2[1]);
                                estudianteList a2 = new estudianteList(Integer.parseInt(cagadales2[1]));
                                corto.add(a2);
                                s3 = s3 + " " + cagadales2[1];
                                break;
                            case "f":
                                String[] cagadales3 = arrayDato[j].split(",");

                                System.out.println(cagadales3[1]);
                                estudianteList a3 = new estudianteList(Integer.parseInt(cagadales3[1]));
                                examen.add(a3);

                                break;
                            default:
                                break;
                        }

                        break;
                    case "p":
                        switch (w) {
                            case "a":
                                String[] cagadales4 = arrayDato[j].split(",");

                                System.out.println(cagadales4[1]);
                                estudianteList a4 = new estudianteList(Integer.parseInt(cagadales4[1]));
                                practica.add(a4);
                                s4 = s4 + " " + cagadales4[1];
                                break;
                            case "o":
                                String[] cagadales5 = arrayDato[j].split(",");

                                System.out.println(cagadales5[1]);
                                estudianteList a5 = new estudianteList(Integer.parseInt(cagadales5[1]));
                                proyecto.add(a5);
                                s5 = s5 + " " + cagadales5[1];
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
            }
            obtenerTotales();
            System.out.println(nombreE + apellidoE + carneE);
            int p1, p2, p3, p4, p5, p6;
            int t1, t2, t3, t4, t5, t6;
            int notaFinal;
            p1 = tareaP.get(tareaP.size() - 1).getCarne();
            t1 = (p1 * (Pontarea.get(0).getCarne())) / 100;
            p2 = hojaP.get(hojaP.size() - 1).getCarne();
            t2 = (p2 * (Ponhoja.get(0).getCarne())) / 100;
            p3 = cortoP.get(cortoP.size() - 1).getCarne();
            t3 = (p3 * (Poncorto.get(0).getCarne())) / 100;
            p4 = practicaP.get(practicaP.size() - 1).getCarne();
            t4 = (p4 * (Ponpractica.get(0).getCarne())) / 100;
            p5 = proyectoP.get(proyectoP.size() - 1).getCarne();
            t5 = (p5 * (Ponproyecto.get(0).getCarne())) / 100;
            p6 = examenP.get(examenP.size() - 1).getCarne();
            t6 = (p6 * (Ponexamen.get(0).getCarne())) / 100;
            System.out.println(p1 + " " + t1);
            System.out.println(p2 + " " + t2);
            System.out.println(p3 + " " + t3);
            System.out.println(p4 + " " + t4);
            System.out.println(p5 + " " + t5);
            System.out.println(p6 + " " + t6);
            notaFinal = t1 + t2 + t3 + t4 + t5 + t6;
            System.out.println(notaFinal);
            estudianteList porfin = new estudianteList(carneE, nombreE, apellidoE, t1, t2, t3, t4, t5, t6, notaFinal);
            estudiante.add(porfin);
            System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5);
            estudianteTList wawa = new estudianteTList(carneE, nombreE, apellidoE, t1, s1, t2, s2, t3, s3, t4, s4, t5, s5, t6, notaFinal);
            estudianteDES.add(wawa);

        }
    }
}
