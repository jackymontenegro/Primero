/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Jacky Montenegro
 */
public class estudianteTList {
    
    private int carne;
    private String nombre;
    private String apellido;
    private int tarea;
    private String t;
    private int hoja;
    private String h;
    private int corto;
    private String c;
    private int practica;
    private String pra;
    private int proyecto;
    private String pro;
    private int examen;
    
    private int total;

    public estudianteTList(int carne, String nombre, String apellido, int tarea, String t, int hoja, String h, int corto, String c, int practica, String pra, int proyecto, String pro, int examen, int total) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarea = tarea;
        this.t = t;
        this.hoja = hoja;
        this.h = h;
        this.corto = corto;
        this.c = c;
        this.practica = practica;
        this.pra = pra;
        this.proyecto = proyecto;
        this.pro = pro;
        this.examen = examen;
        this.total = total;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getPra() {
        return pra;
    }

    public void setPra(String pra) {
        this.pra = pra;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTarea() {
        return tarea;
    }

    public void setTarea(int tarea) {
        this.tarea = tarea;
    }

    public int getHoja() {
        return hoja;
    }

    public void setHoja(int hoja) {
        this.hoja = hoja;
    }

    public int getCorto() {
        return corto;
    }

    public void setCorto(int corto) {
        this.corto = corto;
    }

    public int getPractica() {
        return practica;
    }

    public void setPractica(int practica) {
        this.practica = practica;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
