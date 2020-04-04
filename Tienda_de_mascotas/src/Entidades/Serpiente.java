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
public class Serpiente extends Mascota{
    
    private double tamaño;
    private String tipoSerpiente;
    private String conducta;
    
    public Serpiente(String nombre, String genero, int edad, String raza, double tamaño, String tipoSerpiente, String conducta ){
        this.setNombre(nombre);
        this.setGenero(genero);
        this.setEdadMeses(edad);
        this.setRaza(raza);
        this.setTamañoM(tamaño);
        this.setTipoSerpiente(tipoSerpiente);
        this.setConducta(conducta);
    }
    
    public void reptar(){
        JOptionPane.showMessageDialog(null, this.getNombre() +" está desplazandose con movimientos reptantes");
    }
    public void morder(){
        JOptionPane.showMessageDialog(null, this.getNombre() +" ha mordido");
    }
    public void sonido(){
        JOptionPane.showMessageDialog(null, this.getNombre() + ": ssSssSs! sSsSSSss!");
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
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamañoM(double tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the tipoSerpiente
     */
    public String getTipoSerpiente() {
        return tipoSerpiente;
    }

    /**
     * @param tipoSerpiente the tipoSerpiente to set
     */
    public void setTipoSerpiente(String tipoSerpiente) {
        this.tipoSerpiente = tipoSerpiente;
    }

    /**
     * @return the conducta
     */
    public String getConducta() {
        return conducta;
    }

    /**
     * @param conducta the conducta to set
     */
    public void setConducta(String conducta) {
        this.conducta = conducta;
    }
    
}
