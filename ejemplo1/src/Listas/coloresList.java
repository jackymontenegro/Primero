/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
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
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

/**
 *
 * @author Jacky Montenegro
 */
public class coloresList {
    
    private Font font;
    int posicion;
    String letrasT;
    String letrasV;

    public coloresList(int posicion,String letrasT, String letrasV) {
        this.posicion = posicion;
        this.letrasT = letrasT;
        this.letrasV = letrasV;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getLetrasT() {
        return letrasT;
    }

    public void setLetrasT(String letrasT) {
        this.letrasT = letrasT;
    }

    public String getLetrasV() {
        return letrasV;
    }

    public void setLetrasV(String letrasV) {
        this.letrasV = letrasV;
    }

    public coloresList(Font font) {
        this.font = font;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
    
    
    
    
    
}
