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
public class Pez extends Mascota{
    
    private double tamañoM;
    private String tipoPez;
    private String colorEscamas;
    
    public Pez(String nombre, String genero, int edad, String raza, double tamaño, String tipoPez, String colorEscamas ){
        this.setNombre(nombre);
        this.setGenero(genero);
        this.setEdadMeses(edad);
        this.setRaza(raza);
        this.setTamañoM(tamaño);
        this.setTipoPez(tipoPez);
        this.setColorEscamas(colorEscamas);
    }
    
    public void nadar(){
        JOptionPane.showMessageDialog(null, this.getNombre() + " comienza a nadar");
    }
    public void jugar(){
        JOptionPane.showMessageDialog(null, this.getNombre() + " está jugando");
    }
    public void sonido(){
        JOptionPane.showMessageDialog(null, this.getNombre() + ": oOOo° oOOo° oOOo°");
    }
    
    @Override
    public void comer(double g, String alimento) {
        JOptionPane.showMessageDialog(null, this.getNombre() +" está comiendo "+ g + "g de "+ alimento);
    }

    @Override
    public void dormir() {
        JOptionPane.showMessageDialog(null, this.getNombre() + " está durmiendo");
    }

    /**
     * @return the tamaño
     */
    public double getTamañoM() {
        return tamañoM;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamañoM(double tamaño) {
        this.tamañoM = tamaño;
    }

    /**
     * @return the tipoPez
     */
    public String getTipoPez() {
        return tipoPez;
    }

    /**
     * @param tipoPez the tipoPez to set
     */
    public void setTipoPez(String tipoPez) {
        this.tipoPez = tipoPez;
    }

    /**
     * @return the colorEscamas
     */
    public String getColorEscamas() {
        return colorEscamas;
    }

    /**
     * @param colorEscamas the colorEscamas to set
     */
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    
}
