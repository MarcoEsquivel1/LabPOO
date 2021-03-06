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
public class Felino extends Mascota{
    
    private double tamañoM;
    private String tipoPelaje;
    private String colorPelaje;
    
    public Felino(String nombre, String genero, int edad, String raza, double tamaño, String tipoPelaje, String colorPelaje ){
        this.setNombre(nombre);
        this.setGenero(genero);
        this.setEdadMeses(edad);
        this.setRaza(raza);
        this.setTamañoM(tamaño);
        this.setTipoPelaje(tipoPelaje);
        this.setColorPelaje(colorPelaje);
    }
    
    public void ronronear(){
        JOptionPane.showMessageDialog(null, this.getNombre() +" está ronroneando"); 
    }
    public void estirarse(){
        JOptionPane.showMessageDialog(null, this.getNombre() +" está estirando sus patas"); 
    }
    public void sonido(){
        JOptionPane.showMessageDialog(null, this.getNombre() +" está maullando"); 
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
     * @return the tipoPelaje
     */
    public String getTipoPelaje() {
        return tipoPelaje;
    }

    /**
     * @param tipoPelaje the tipoPelaje to set
     */
    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    /**
     * @return the colorPelaje
     */
    public String getColorPelaje() {
        return colorPelaje;
    }

    /**
     * @param colorPelaje the colorPelaje to set
     */
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    
}
