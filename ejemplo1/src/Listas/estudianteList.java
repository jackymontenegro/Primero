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
public class estudianteList {
    private int carne;
    private String nombre;
    private String apellido;
    private int tarea;
    private int hoja;
    private int corto;
    private int practica;
    private int proyecto;
    private int examen;
    private int total;

    public estudianteList(int carne, String nombre, String apellido, int tarea, int hoja, int corto, int practica, int proyecto, int examen, int total) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarea = tarea;
        this.hoja = hoja;
        this.corto = corto;
        this.practica = practica;
        this.proyecto = proyecto;
        this.examen = examen;
        this.total = total;
    }

    public estudianteList(int carne) {
        this.carne = carne;
    }
    

    /**
     * @return the carne
     */
    public int getCarne() {
        return carne;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarne(int carne) {
        this.carne = carne;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the tarea
     */
    public int getTarea() {
        return tarea;
    }

    /**
     * @param tarea the tarea to set
     */
    public void setTarea(int tarea) {
        this.tarea = tarea;
    }

    /**
     * @return the hoja
     */
    public int getHoja() {
        return hoja;
    }

    /**
     * @param hoja the hoja to set
     */
    public void setHoja(int hoja) {
        this.hoja = hoja;
    }

    /**
     * @return the corto
     */
    public int getCorto() {
        return corto;
    }

    /**
     * @param corto the corto to set
     */
    public void setCorto(int corto) {
        this.corto = corto;
    }

    /**
     * @return the practica
     */
    public int getPractica() {
        return practica;
    }

    /**
     * @param practica the practica to set
     */
    public void setPractica(int practica) {
        this.practica = practica;
    }

    /**
     * @return the proyecto
     */
    public int getProyecto() {
        return proyecto;
    }

    /**
     * @param proyecto the proyecto to set
     */
    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    /**
     * @return the examen
     */
    public int getExamen() {
        return examen;
    }

    /**
     * @param examen the examen to set
     */
    public void setExamen(int examen) {
        this.examen = examen;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
}
