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
public class Atributos {//atributo si es usuario, nombre, apellido, codigo ete y si es tienda nombre , direccion etc .....
    
    private String titulo;
    private String contenido;

    public Atributos(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
    
}
