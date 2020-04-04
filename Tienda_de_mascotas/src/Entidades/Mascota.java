/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author MARCO RENÉ ESQUIVEL JUÁREZ
 */
public abstract class Mascota {
    private String nombre;
    private int edadMeses;
    private String raza;
    private String genero;
    
    public void sonido(){
        JOptionPane.showMessageDialog(null, this.getNombre() + " está emitiendo un dulce sonido");
    }
    public abstract void comer(double g, String alimento);
    public abstract void dormir();

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
     * @return the edadAños
     */
    public int getEdadMeses() {
        return edadMeses;
    }

    /**
     * @param edadAños the edadAños to set
     */
    public void setEdadMeses(int edadAños) {
        this.edadMeses = edadAños;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
