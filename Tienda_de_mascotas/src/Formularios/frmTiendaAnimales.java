/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Entidades.*;
import javax.swing.JOptionPane;
/**
 *
 * @author MARCO RENÉ ESQUIVEL JUÁREZ
 */
public class frmTiendaAnimales extends javax.swing.JFrame {
    ArrayList<Canino> lCan;
    ArrayList<Ave> lAve;
    ArrayList<Felino> lFel;
    ArrayList<Pez> lPez;
    ArrayList<Serpiente> lSer;
    DefaultTableModel mdlTablaCan;
    DefaultTableModel mdlTablaAve;
    DefaultTableModel mdlTablaSer;
    DefaultTableModel mdlTablaFel;
    DefaultTableModel mdlTablaPez;
    public frmTiendaAnimales() {
        initComponents();
        this.mdlTablaCan= (DefaultTableModel) this.jTable1.getModel();
        this.mdlTablaAve= (DefaultTableModel) this.jTable3.getModel();
        this.mdlTablaSer= (DefaultTableModel) this.jTable5.getModel();
        this.mdlTablaFel= (DefaultTableModel) this.jTable2.getModel();
        this.mdlTablaPez= (DefaultTableModel) this.jTable4.getModel();
        this.lAve = new ArrayList<>();
        this.lCan = new ArrayList<>();
        this.lFel = new ArrayList<>();
        this.lPez = new ArrayList<>();
        this.lSer = new ArrayList<>();
        this.simDatos();
        this.cargarAves();
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarPeces();
        this.cargarSerpientes();
    }
    
    private void simDatos(){
        this.lCan.add(new Canino("Daster", "Macho", 5, "Pastor Aleman", 0.45, "Corto", "Negro, Marron y Blanco"));
        this.lCan.add(new Canino("Pluto", "Macho", 9, "Pomerania", 0.25, "Mediano", "Blanco"));
        this.lCan.add(new Canino("Skiper", "Macho", 4, "Chihuahua", 0.15, "Corto", "Marron"));
        this.lCan.add(new Canino("Tara", "Hembra", 3, "Poodle", 0.95, "Liso", "Negro, Marron y Blanco"));
        
        this.lFel.add(new Felino("Nara", "Hembra", 2, "Siberiano", 0.20, "Largo", "Negro"));
        this.lFel.add(new Felino("Tuerca", "Hembra", 4, "Angora", 0.40, "Largo", "Marron"));
        this.lFel.add(new Felino("Tornillo", "Macho", 5, "Angora", 0.35, "Corto", "Gris"));
        this.lFel.add(new Felino("Lu", "Hembra", 3, "Sphynx", 0.35, "Sin pelo", "----"));
        
        this.lAve.add(new Ave("Phoenix", "Macho", 5, "Halcon", 0.50, "Falconiforme", "Marron"));
        this.lAve.add(new Ave("Lolo", "Macho", 4, "Loro", 0.40, "Psittaciforme", "Verde"));
        this.lAve.add(new Ave("Tania", "Hembra", 5, "Guacamaya", 0.35, "Psittaciforme", "Rojo"));
        this.lAve.add(new Ave("Zyra", "Hembra", 3, "Loro", 0.35, "Psittaciforme", "Verde"));
        
        this.lPez.add(new Pez("Blue", "Macho", 1, "Pez cirujano", 0.20, "Actinopterygii", "Azul"));
        this.lPez.add(new Pez("Nemo", "Macho", 2, "Pez payaso", 0.15, "Actinopterygii", "Rojo"));
        this.lPez.add(new Pez("Goldeen", "Hembra", 3, "Pez dorado", 0.25, "Actinopterygii", "Amarillo"));
        this.lPez.add(new Pez("Vi", "Hembra", 6, "Pez Gato", 0.50, "Pangasianodon", "Gris oscuro"));
        
        this.lSer.add(new Serpiente("Zeus", "Macho", 9, "Pitón de la India", 1.20, "Sauropsida", "Docil"));
        this.lSer.add(new Serpiente("Rey", "Macho", 5, "Pitón real", 0.90, "Sauropsida", "Semi docil"));
        this.lSer.add(new Serpiente("Lia", "Hembra", 10, "Falsa coral", 1.09, "Lampropeltis", "Agitada"));
        this.lSer.add(new Serpiente("Beatris", "Hembra", 6, "Pitón de la India", 0.85, "Sauropsida", "Docil"));
    } 
    
    private void cargarCaninos(){
        this.mdlTablaCan.setRowCount(0);
        for(int j=0; j<this.lCan.size(); j++)
        {
            String[] registro = { 
                this.lCan.get(j).getNombre(),
                this.lCan.get(j).getGenero(),
                Double.toString(this.lCan.get(j).getEdadMeses()),
                this.lCan.get(j).getRaza(),
                Double.toString(this.lCan.get(j).getTamañoM()),
                this.lCan.get(j).getColorPelaje()
            };
            this.mdlTablaCan.addRow(registro);
        }
    }
    private void cargarFelinos(){
        this.mdlTablaFel.setRowCount(0);
        for(int j=0; j<this.lFel.size(); j++)
        {
            String[] registro = { 
                this.lFel.get(j).getNombre(),
                this.lFel.get(j).getGenero(),
                Double.toString(this.lCan.get(j).getEdadMeses()),
                this.lFel.get(j).getRaza(),
                Double.toString(this.lFel.get(j).getTamañoM()),
                this.lFel.get(j).getColorPelaje()
            };
            this.mdlTablaFel.addRow(registro);
        }
    }
    private void cargarAves(){
        this.mdlTablaAve.setRowCount(0);
        for(int j=0; j<this.lAve.size(); j++)
        {
            String[] registro = { 
                this.lAve.get(j).getNombre(),
                this.lAve.get(j).getGenero(),
                Double.toString(this.lAve.get(j).getEdadMeses()),
                this.lAve.get(j).getRaza(),
                Double.toString(this.lAve.get(j).getEnvergadura()),
                this.lAve.get(j).getColorPlumaje()
            };
            this.mdlTablaAve.addRow(registro);
        }
    }
    private void cargarPeces(){
        this.mdlTablaPez.setRowCount(0);
        for(int j=0; j<this.lPez.size(); j++)
        {
            String[] registro = { 
                this.lPez.get(j).getNombre(),
                this.lPez.get(j).getGenero(),
                Double.toString(this.lPez.get(j).getEdadMeses()),
                this.lPez.get(j).getRaza(),
                Double.toString(this.lPez.get(j).getTamañoM()),
                this.lPez.get(j).getColorEscamas()
            };
            this.mdlTablaPez.addRow(registro);
        }
    }
    private void cargarSerpientes(){
        this.mdlTablaSer.setRowCount(0);
        for(int j=0; j<this.lSer.size(); j++)
        {
            String[] registro = { 
                this.lSer.get(j).getNombre(),
                this.lSer.get(j).getGenero(),
                Double.toString(this.lSer.get(j).getEdadMeses()),
                this.lSer.get(j).getRaza(),
                Double.toString(this.lSer.get(j).getTamañoM()),
                this.lSer.get(j).getConducta()
            };
            this.mdlTablaSer.addRow(registro);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnCorrerC = new javax.swing.JButton();
        btnJugarC = new javax.swing.JButton();
        btnLadrarC = new javax.swing.JButton();
        btnComerC = new javax.swing.JButton();
        btnDormirC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnEstirarseF = new javax.swing.JButton();
        btnMaullarF = new javax.swing.JButton();
        btnComerF = new javax.swing.JButton();
        btnDormirF = new javax.swing.JButton();
        btnRonronearF = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnVolarA = new javax.swing.JButton();
        btnMigrarA = new javax.swing.JButton();
        btnCantarA = new javax.swing.JButton();
        btnComerA = new javax.swing.JButton();
        btnDormirA = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnNadarP = new javax.swing.JButton();
        btnJugarP = new javax.swing.JButton();
        btnBurbujasP = new javax.swing.JButton();
        btnComerP = new javax.swing.JButton();
        btnDormirP = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnReptarS = new javax.swing.JButton();
        btnMorderS = new javax.swing.JButton();
        btnSisearS = new javax.swing.JButton();
        btnComerS = new javax.swing.JButton();
        btnDormirS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(1286, 757));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 3, 177));
        jLabel1.setText("Animalistic´s Fanatics");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(229, 184, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(626, 210));
        jPanel2.setMinimumSize(new java.awt.Dimension(626, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(626, 210));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Genero", "Edad", "Raza", "Tamaño", "Color Pelaje"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(442, 140));
        jTable1.setMinimumSize(new java.awt.Dimension(442, 140));
        jTable1.setPreferredSize(new java.awt.Dimension(442, 140));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Caninos");

        btnCorrerC.setText("Correr");
        btnCorrerC.setMaximumSize(new java.awt.Dimension(150, 23));
        btnCorrerC.setMinimumSize(new java.awt.Dimension(150, 23));
        btnCorrerC.setPreferredSize(new java.awt.Dimension(150, 23));
        btnCorrerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrerCActionPerformed(evt);
            }
        });

        btnJugarC.setText("Jugar");
        btnJugarC.setMaximumSize(new java.awt.Dimension(150, 23));
        btnJugarC.setMinimumSize(new java.awt.Dimension(150, 23));
        btnJugarC.setPreferredSize(new java.awt.Dimension(150, 23));
        btnJugarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarCActionPerformed(evt);
            }
        });

        btnLadrarC.setText("Ladrar");
        btnLadrarC.setMaximumSize(new java.awt.Dimension(150, 23));
        btnLadrarC.setMinimumSize(new java.awt.Dimension(150, 23));
        btnLadrarC.setPreferredSize(new java.awt.Dimension(150, 23));
        btnLadrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLadrarCActionPerformed(evt);
            }
        });

        btnComerC.setText("Comer");
        btnComerC.setMaximumSize(new java.awt.Dimension(150, 23));
        btnComerC.setMinimumSize(new java.awt.Dimension(150, 23));
        btnComerC.setPreferredSize(new java.awt.Dimension(150, 23));
        btnComerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerCActionPerformed(evt);
            }
        });

        btnDormirC.setText("Dormir");
        btnDormirC.setMaximumSize(new java.awt.Dimension(150, 23));
        btnDormirC.setMinimumSize(new java.awt.Dimension(150, 23));
        btnDormirC.setPreferredSize(new java.awt.Dimension(150, 23));
        btnDormirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLadrarC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDormirC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJugarC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCorrerC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComerC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCorrerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnJugarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLadrarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDormirC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        jPanel3.setBackground(new java.awt.Color(255, 252, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(626, 210));
        jPanel3.setMinimumSize(new java.awt.Dimension(626, 210));
        jPanel3.setPreferredSize(new java.awt.Dimension(626, 210));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Genero", "Edad", "Raza", "Tamaño", "Color Pelaje"
            }
        ));
        jTable2.setMaximumSize(new java.awt.Dimension(442, 140));
        jTable2.setMinimumSize(new java.awt.Dimension(442, 140));
        jTable2.setPreferredSize(new java.awt.Dimension(442, 140));
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Felinos");

        btnEstirarseF.setText("Estirarse");
        btnEstirarseF.setMaximumSize(new java.awt.Dimension(150, 23));
        btnEstirarseF.setMinimumSize(new java.awt.Dimension(150, 23));
        btnEstirarseF.setPreferredSize(new java.awt.Dimension(150, 23));
        btnEstirarseF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstirarseFActionPerformed(evt);
            }
        });

        btnMaullarF.setText("Maullar");
        btnMaullarF.setMaximumSize(new java.awt.Dimension(150, 23));
        btnMaullarF.setMinimumSize(new java.awt.Dimension(150, 23));
        btnMaullarF.setPreferredSize(new java.awt.Dimension(150, 23));
        btnMaullarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaullarFActionPerformed(evt);
            }
        });

        btnComerF.setText("Comer");
        btnComerF.setMaximumSize(new java.awt.Dimension(150, 23));
        btnComerF.setMinimumSize(new java.awt.Dimension(150, 23));
        btnComerF.setPreferredSize(new java.awt.Dimension(150, 23));
        btnComerF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerFActionPerformed(evt);
            }
        });

        btnDormirF.setText("Dormir");
        btnDormirF.setMaximumSize(new java.awt.Dimension(150, 23));
        btnDormirF.setMinimumSize(new java.awt.Dimension(150, 23));
        btnDormirF.setPreferredSize(new java.awt.Dimension(150, 23));
        btnDormirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirFActionPerformed(evt);
            }
        });

        btnRonronearF.setText("Ronronear");
        btnRonronearF.setMaximumSize(new java.awt.Dimension(150, 23));
        btnRonronearF.setMinimumSize(new java.awt.Dimension(150, 23));
        btnRonronearF.setPreferredSize(new java.awt.Dimension(150, 23));
        btnRonronearF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRonronearFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMaullarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEstirarseF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRonronearF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComerF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDormirF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRonronearF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEstirarseF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaullarF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComerF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDormirF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        jPanel4.setBackground(new java.awt.Color(252, 198, 193));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMaximumSize(new java.awt.Dimension(626, 210));
        jPanel4.setMinimumSize(new java.awt.Dimension(626, 210));
        jPanel4.setPreferredSize(new java.awt.Dimension(626, 210));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setVerifyInputWhenFocusTarget(false);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Genero", "Edad", "Raza", "Envergadura", "Color Plumaje"
            }
        ));
        jTable3.setMaximumSize(new java.awt.Dimension(442, 140));
        jTable3.setMinimumSize(new java.awt.Dimension(442, 140));
        jTable3.setPreferredSize(new java.awt.Dimension(442, 140));
        jScrollPane3.setViewportView(jTable3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Aves");

        btnVolarA.setText("Volar");
        btnVolarA.setMaximumSize(new java.awt.Dimension(150, 23));
        btnVolarA.setMinimumSize(new java.awt.Dimension(150, 23));
        btnVolarA.setPreferredSize(new java.awt.Dimension(150, 23));
        btnVolarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolarAActionPerformed(evt);
            }
        });

        btnMigrarA.setText("Migrar");
        btnMigrarA.setMaximumSize(new java.awt.Dimension(150, 23));
        btnMigrarA.setMinimumSize(new java.awt.Dimension(150, 23));
        btnMigrarA.setPreferredSize(new java.awt.Dimension(150, 23));
        btnMigrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMigrarAActionPerformed(evt);
            }
        });

        btnCantarA.setText("Cantar");
        btnCantarA.setMaximumSize(new java.awt.Dimension(150, 23));
        btnCantarA.setMinimumSize(new java.awt.Dimension(150, 23));
        btnCantarA.setPreferredSize(new java.awt.Dimension(150, 23));
        btnCantarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantarAActionPerformed(evt);
            }
        });

        btnComerA.setText("Comer");
        btnComerA.setMaximumSize(new java.awt.Dimension(150, 23));
        btnComerA.setMinimumSize(new java.awt.Dimension(150, 23));
        btnComerA.setPreferredSize(new java.awt.Dimension(150, 23));
        btnComerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerAActionPerformed(evt);
            }
        });

        btnDormirA.setText("Dormir");
        btnDormirA.setMaximumSize(new java.awt.Dimension(150, 23));
        btnDormirA.setMinimumSize(new java.awt.Dimension(150, 23));
        btnDormirA.setPreferredSize(new java.awt.Dimension(150, 23));
        btnDormirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(419, 419, 419))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMigrarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComerA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCantarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDormirA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnVolarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMigrarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCantarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnDormirA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel5.setBackground(new java.awt.Color(200, 242, 252));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setMaximumSize(new java.awt.Dimension(626, 210));
        jPanel5.setMinimumSize(new java.awt.Dimension(626, 210));
        jPanel5.setPreferredSize(new java.awt.Dimension(626, 210));
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setVerifyInputWhenFocusTarget(false);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Genero", "Edad", "Raza", "Tamaño", "Color Escamas"
            }
        ));
        jTable4.setMaximumSize(new java.awt.Dimension(442, 140));
        jTable4.setMinimumSize(new java.awt.Dimension(442, 140));
        jTable4.setPreferredSize(new java.awt.Dimension(442, 140));
        jScrollPane4.setViewportView(jTable4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Peces");

        btnNadarP.setText("Nadar");
        btnNadarP.setMaximumSize(new java.awt.Dimension(150, 23));
        btnNadarP.setMinimumSize(new java.awt.Dimension(150, 23));
        btnNadarP.setPreferredSize(new java.awt.Dimension(150, 23));
        btnNadarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNadarPActionPerformed(evt);
            }
        });

        btnJugarP.setText("Jugar");
        btnJugarP.setMaximumSize(new java.awt.Dimension(150, 23));
        btnJugarP.setMinimumSize(new java.awt.Dimension(150, 23));
        btnJugarP.setPreferredSize(new java.awt.Dimension(150, 23));
        btnJugarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarPActionPerformed(evt);
            }
        });

        btnBurbujasP.setText("Hacer burbujas");
        btnBurbujasP.setMaximumSize(new java.awt.Dimension(150, 23));
        btnBurbujasP.setMinimumSize(new java.awt.Dimension(150, 23));
        btnBurbujasP.setPreferredSize(new java.awt.Dimension(150, 23));
        btnBurbujasP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurbujasPActionPerformed(evt);
            }
        });

        btnComerP.setText("Comer");
        btnComerP.setMaximumSize(new java.awt.Dimension(150, 23));
        btnComerP.setMinimumSize(new java.awt.Dimension(150, 23));
        btnComerP.setPreferredSize(new java.awt.Dimension(150, 23));
        btnComerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerPActionPerformed(evt);
            }
        });

        btnDormirP.setText("Dormir");
        btnDormirP.setMaximumSize(new java.awt.Dimension(150, 23));
        btnDormirP.setMinimumSize(new java.awt.Dimension(150, 23));
        btnDormirP.setPreferredSize(new java.awt.Dimension(150, 23));
        btnDormirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNadarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnJugarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBurbujasP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnComerP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDormirP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnNadarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJugarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBurbujasP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComerP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDormirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(210, 255, 176));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setMaximumSize(new java.awt.Dimension(626, 210));
        jPanel6.setMinimumSize(new java.awt.Dimension(626, 210));
        jPanel6.setPreferredSize(new java.awt.Dimension(626, 210));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setVerifyInputWhenFocusTarget(false);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Genero", "Edad", "Raza", "Tamaño", "Conducta"
            }
        ));
        jTable5.setMaximumSize(new java.awt.Dimension(442, 140));
        jTable5.setMinimumSize(new java.awt.Dimension(442, 140));
        jTable5.setPreferredSize(new java.awt.Dimension(442, 140));
        jScrollPane5.setViewportView(jTable5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Serpientes");

        btnReptarS.setText("Reptar");
        btnReptarS.setMaximumSize(new java.awt.Dimension(150, 23));
        btnReptarS.setMinimumSize(new java.awt.Dimension(150, 23));
        btnReptarS.setPreferredSize(new java.awt.Dimension(150, 23));
        btnReptarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReptarSActionPerformed(evt);
            }
        });

        btnMorderS.setText("Morder");
        btnMorderS.setMaximumSize(new java.awt.Dimension(150, 23));
        btnMorderS.setMinimumSize(new java.awt.Dimension(150, 23));
        btnMorderS.setPreferredSize(new java.awt.Dimension(150, 23));
        btnMorderS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMorderSActionPerformed(evt);
            }
        });

        btnSisearS.setText("Sisear");
        btnSisearS.setMaximumSize(new java.awt.Dimension(150, 23));
        btnSisearS.setMinimumSize(new java.awt.Dimension(150, 23));
        btnSisearS.setPreferredSize(new java.awt.Dimension(150, 23));
        btnSisearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisearSActionPerformed(evt);
            }
        });

        btnComerS.setText("Comer");
        btnComerS.setMaximumSize(new java.awt.Dimension(150, 23));
        btnComerS.setMinimumSize(new java.awt.Dimension(150, 23));
        btnComerS.setPreferredSize(new java.awt.Dimension(150, 23));
        btnComerS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerSActionPerformed(evt);
            }
        });

        btnDormirS.setText("Dormir");
        btnDormirS.setMaximumSize(new java.awt.Dimension(150, 23));
        btnDormirS.setMinimumSize(new java.awt.Dimension(150, 23));
        btnDormirS.setPreferredSize(new java.awt.Dimension(150, 23));
        btnDormirS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReptarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMorderS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnSisearS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnComerS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDormirS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnReptarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMorderS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSisearS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComerS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDormirS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorrerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrerCActionPerformed
        if (this.jTable1.getSelectedRow() >=0 && this.jTable1.getSelectedRow()<=this.jTable1.getRowCount()) {
            int selec = this.jTable1.getSelectedRow();
            this.lCan.get(selec).correr(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el perro con el que desea que corra");
        }  
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnCorrerCActionPerformed

    private void btnJugarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarCActionPerformed
        if (this.jTable1.getSelectedRow() >=0 && this.jTable1.getSelectedRow()<=this.jTable1.getRowCount()) {
            int selec = this.jTable1.getSelectedRow();
            this.lCan.get(selec).jugar(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el perro con el que quieres jugar");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnJugarCActionPerformed

    private void btnLadrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLadrarCActionPerformed
        if (this.jTable1.getSelectedRow() >=0 && this.jTable1.getSelectedRow()<=this.jTable1.getRowCount()) {
            int selec = this.jTable1.getSelectedRow();
            this.lCan.get(selec).sonido(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el perro que quieres que ladre");
        }  
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnLadrarCActionPerformed

    private void btnComerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerCActionPerformed
        if (this.jTable1.getSelectedRow() >=0 && this.jTable1.getSelectedRow()<=this.jTable1.getRowCount()) {
            int selec = this.jTable1.getSelectedRow();
            this.lCan.get(selec).comer(9, "concentrado de perro"); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el perro que quieres que coma");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnComerCActionPerformed

    private void btnDormirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirCActionPerformed
        if (this.jTable1.getSelectedRow() >=0 && this.jTable1.getSelectedRow()<=this.jTable1.getRowCount()) {
            int selec = this.jTable1.getSelectedRow();
            this.lCan.get(selec).dormir(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el perro que quieres que duerma");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnDormirCActionPerformed

    private void btnRonronearFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRonronearFActionPerformed
        if (this.jTable2.getSelectedRow() >=0 && this.jTable2.getSelectedRow()<=this.jTable2.getRowCount()) {
            int selec = this.jTable2.getSelectedRow();
            this.lFel.get(selec).ronronear(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el gato que quieres que ronronee");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnRonronearFActionPerformed

    private void btnEstirarseFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstirarseFActionPerformed
        if (this.jTable2.getSelectedRow() >=0 && this.jTable2.getSelectedRow()<=this.jTable2.getRowCount()) {
            int selec = this.jTable2.getSelectedRow();
            this.lFel.get(selec).estirarse(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el gato que quieres que se estire");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnEstirarseFActionPerformed

    private void btnMaullarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaullarFActionPerformed
        if (this.jTable2.getSelectedRow() >=0 && this.jTable2.getSelectedRow()<=this.jTable2.getRowCount()) {
            int selec = this.jTable2.getSelectedRow();
            this.lFel.get(selec).sonido(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el gato que quieres que maulle");
        }
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnMaullarFActionPerformed

    private void btnComerFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerFActionPerformed
        if (this.jTable2.getSelectedRow() >=0 && this.jTable2.getSelectedRow()<=this.jTable2.getRowCount()) {
            int selec = this.jTable2.getSelectedRow();
            this.lFel.get(selec).comer(5, "concentrado de gato."); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el gato que quieres que coma");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnComerFActionPerformed

    private void btnDormirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirFActionPerformed
        if (this.jTable2.getSelectedRow() >=0 && this.jTable2.getSelectedRow()<=this.jTable2.getRowCount()) {
            int selec = this.jTable2.getSelectedRow();
            this.lFel.get(selec).dormir();
        }else{
            JOptionPane.showMessageDialog(null, "Elija el gato que quieres que duerma");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnDormirFActionPerformed

    private void btnVolarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolarAActionPerformed
        if (this.jTable3.getSelectedRow() >=0 && this.jTable3.getSelectedRow()<=this.jTable3.getRowCount()) {
            int selec = this.jTable3.getSelectedRow();
            this.lAve.get(selec).volar(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el ave que quieres que vuele");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnVolarAActionPerformed

    private void btnMigrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMigrarAActionPerformed
        if (this.jTable3.getSelectedRow() >=0 && this.jTable3.getSelectedRow()<=this.jTable3.getRowCount()) {
            int selec = this.jTable3.getSelectedRow();
            this.lAve.get(selec).migrar(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el ave que quieres que migre");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnMigrarAActionPerformed

    private void btnCantarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantarAActionPerformed
        if (this.jTable3.getSelectedRow() >=0 && this.jTable3.getSelectedRow()<=this.jTable3.getRowCount()) {
            int selec = this.jTable3.getSelectedRow();
            this.lAve.get(selec).sonido(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el ave que quieres que cante");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnCantarAActionPerformed

    private void btnComerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerAActionPerformed
        if (this.jTable3.getSelectedRow() >=0 && this.jTable3.getSelectedRow()<=this.jTable3.getRowCount()) {
            int selec = this.jTable3.getSelectedRow();
            this.lAve.get(selec).comer(3, "alpiste"); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el ave que quieres que coma");
        } this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnComerAActionPerformed

    private void btnDormirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirAActionPerformed
        if (this.jTable3.getSelectedRow() >=0 && this.jTable3.getSelectedRow()<=this.jTable3.getRowCount()) {
            int selec = this.jTable3.getSelectedRow();
            this.lAve.get(selec).dormir();
        }else{
            JOptionPane.showMessageDialog(null, "Elija el ave que quieres que duerma");
        } this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnDormirAActionPerformed

    private void btnNadarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNadarPActionPerformed
        if (this.jTable4.getSelectedRow() >=0 && this.jTable4.getSelectedRow()<=this.jTable4.getRowCount()) {
            int selec = this.jTable4.getSelectedRow();
            this.lPez.get(selec).nadar(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el pez que quieres que nade");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnNadarPActionPerformed

    private void btnJugarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarPActionPerformed
        if (this.jTable4.getSelectedRow() >=0 && this.jTable4.getSelectedRow()<=this.jTable4.getRowCount()) {
            int selec = this.jTable4.getSelectedRow();
            this.lPez.get(selec).jugar();
        }else{
            JOptionPane.showMessageDialog(null, "Elija el pez que quieres que juegue");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnJugarPActionPerformed

    private void btnBurbujasPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurbujasPActionPerformed
        if (this.jTable4.getSelectedRow() >=0 && this.jTable4.getSelectedRow()<=this.jTable4.getRowCount()) {
            int selec = this.jTable4.getSelectedRow();
            this.lPez.get(selec).sonido();
        }else{
            JOptionPane.showMessageDialog(null, "Elija el pez que quieres que haga burbujas");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnBurbujasPActionPerformed

    private void btnComerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerPActionPerformed
        if (this.jTable4.getSelectedRow() >=0 && this.jTable4.getSelectedRow()<=this.jTable4.getRowCount()) {
            int selec = this.jTable4.getSelectedRow();
            this.lPez.get(selec).comer(2, "concentrado de pez");
        }else{
            JOptionPane.showMessageDialog(null, "Elija el pez que quieres que coma");
        }
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnComerPActionPerformed

    private void btnDormirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirPActionPerformed
        if (this.jTable4.getSelectedRow() >=0 && this.jTable4.getSelectedRow()<=this.jTable4.getRowCount()) {
            int selec = this.jTable4.getSelectedRow();
            this.lPez.get(selec).dormir(); 
        }else{
            JOptionPane.showMessageDialog(null, "Elija el pez que quieres que duerma");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnDormirPActionPerformed

    private void btnReptarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReptarSActionPerformed
        if (this.jTable5.getSelectedRow() >=0 && this.jTable5.getSelectedRow()<=this.jTable5.getRowCount()) {
            int selec = this.jTable5.getSelectedRow();
            this.lSer.get(selec).reptar();
        }else{
            JOptionPane.showMessageDialog(null, "Elija la sepiente que quieres que repte");
        } 
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnReptarSActionPerformed

    private void btnMorderSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMorderSActionPerformed
        if (this.jTable5.getSelectedRow() >=0 && this.jTable5.getSelectedRow()<=this.jTable5.getRowCount()) {
            int selec = this.jTable5.getSelectedRow();
            this.lSer.get(selec).morder();
        }else{
            JOptionPane.showMessageDialog(null, "Elija la sepiente que quieres que muerda");
        }
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnMorderSActionPerformed

    private void btnSisearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisearSActionPerformed
        if (this.jTable5.getSelectedRow() >=0 && this.jTable5.getSelectedRow()<=this.jTable5.getRowCount()) {
            int selec = this.jTable5.getSelectedRow();
            this.lSer.get(selec).sonido();
        }else{
            JOptionPane.showMessageDialog(null, "Elija la sepiente que quieres que sisee");
        }
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnSisearSActionPerformed

    private void btnComerSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerSActionPerformed
        if (this.jTable5.getSelectedRow() >=0 && this.jTable5.getSelectedRow()<=this.jTable5.getRowCount()) {
            int selec = this.jTable5.getSelectedRow();
            this.lSer.get(selec).comer(25, "carne de ratón");
        }else{
            JOptionPane.showMessageDialog(null, "Elija la sepiente que quieres que coma");
        }
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnComerSActionPerformed

    private void btnDormirSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirSActionPerformed
        if (this.jTable5.getSelectedRow() >=0 && this.jTable5.getSelectedRow()<=this.jTable5.getRowCount()) {
            int selec = this.jTable5.getSelectedRow();
            this.lSer.get(selec).dormir();
        }else{
            JOptionPane.showMessageDialog(null, "Elija la sepiente que quieres que duerma");
        }
        this.cargarCaninos();
        this.cargarFelinos();
        this.cargarAves();
        this.cargarPeces();
        this.cargarSerpientes();
    }//GEN-LAST:event_btnDormirSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTiendaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTiendaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTiendaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTiendaAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTiendaAnimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBurbujasP;
    private javax.swing.JButton btnCantarA;
    private javax.swing.JButton btnComerA;
    private javax.swing.JButton btnComerC;
    private javax.swing.JButton btnComerF;
    private javax.swing.JButton btnComerP;
    private javax.swing.JButton btnComerS;
    private javax.swing.JButton btnCorrerC;
    private javax.swing.JButton btnDormirA;
    private javax.swing.JButton btnDormirC;
    private javax.swing.JButton btnDormirF;
    private javax.swing.JButton btnDormirP;
    private javax.swing.JButton btnDormirS;
    private javax.swing.JButton btnEstirarseF;
    private javax.swing.JButton btnJugarC;
    private javax.swing.JButton btnJugarP;
    private javax.swing.JButton btnLadrarC;
    private javax.swing.JButton btnMaullarF;
    private javax.swing.JButton btnMigrarA;
    private javax.swing.JButton btnMorderS;
    private javax.swing.JButton btnNadarP;
    private javax.swing.JButton btnReptarS;
    private javax.swing.JButton btnRonronearF;
    private javax.swing.JButton btnSisearS;
    private javax.swing.JButton btnVolarA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
