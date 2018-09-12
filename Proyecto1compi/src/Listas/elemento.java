/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.ArrayList;

/**
 *
 * @author Jacky Montenegro
 */
public class elemento {//elemento es usuario, tienda y producto
    
    private int codigo;
    private ArrayList< Atributos> listaAtribu; 

    public elemento(int codigo,ArrayList<Atributos> atributo) {
        this.codigo = codigo;
        listaAtribu = atributo;
        
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the listaAtribu
     */
    public ArrayList< Atributos> getListaAtribu() {
        return listaAtribu;
    }

    /**
     * @param listaAtribu the listaAtribu to set
     */
    public void setListaAtribu(ArrayList< Atributos> listaAtribu) {
        this.listaAtribu = listaAtribu;
    }
    
    
 
 
}
