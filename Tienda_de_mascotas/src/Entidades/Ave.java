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
public class Ave extends Mascota{

    private double envergadura;
    private String categoria;
    private String colorPlumaje;
    
    public Ave(String nombre, String genero, int edad, String raza, double envergadura, String categoria, String colorPlumaje ){
        this.setNombre(nombre);
        this.setGenero(genero);
        this.setEdadMeses(edad);
        this.setRaza(raza);
        this.setEnvergadura(envergadura);
        this.setCategoria(categoria);
        this.setColorPlumaje(colorPlumaje);
    }
    
    public void volar(){
        JOptionPane.showMessageDialog(null, this.getNombre() + " está volando");
    }
    
    public void sonido(){
        JOptionPane.showMessageDialog(null, this.getNombre() + " está emitiendo un dulce sonido");
    }
    
    public void migrar(){
        JOptionPane.showMessageDialog(null, this.getNombre() + " está empezando a migrar");
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
     * @return the envergadura
     */
    public double getEnvergadura() {
        return envergadura;
    }

    /**
     * @param envergadura the envergadura to set
     */
    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the colorPlumaje
     */
    public String getColorPlumaje() {
        return colorPlumaje;
    }

    /**
     * @param colorPlumaje the colorPlumaje to set
     */
    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }
    
}
