/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Conexion;
import controlador.GestorTablaCurso;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Curso;

/**
 *
 * @author Mario
 */
public class PnModificarCurso extends javax.swing.JPanel {

    private Conexion bd;
    DefaultComboBoxModel modelo;
    Curso miCurso;
    String codCurso;
    String denominacionActual = "";
    int nPlazasActual = 0;
    String denominacionAntiguo = "";
    int nPlazasAntiguo = 0;

    /**
     * Creates new form PnModificarCurso
     */
    public PnModificarCurso() {
        initComponents();
        initComponents();
        bd = new Conexion();
        modelo = new DefaultComboBoxModel();
        cmbCurso.setModel(modelo);
        int resultado = bd.establecer("jdbc:mysql://localhost:3306/programacion");// lo último es el nombre de la base de datos
        if (resultado != 0) {
            JOptionPane.showMessageDialog(this, "CONEXIÓN INCORRECTA");
            System.exit(0);
        }
        cargarCursos();
    }

    private void cargarCursos() {
        GestorTablaCurso c = new GestorTablaCurso(bd);
        ArrayList<Curso> cursos;
        //lo hago así por un comboBox no es compatible con la clase GestorTablaAcademia
        cursos = c.consultaTodosCursos();
        for (int i = 0; i < cursos.size(); i++) {
            modelo.addElement(cursos.get(i));
        }
        //cmbCurso.setSelectedIndex(0);//así le digo que empieze en la posicion 0
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDenominacionActual = new javax.swing.JTextField();
        txtNPlazasActual = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDenominacionNuevo = new javax.swing.JTextField();
        txtNPlazasNuevo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jLabel2.setText("DENOMINACIÓN ACTUAL");

        jLabel3.setText("Nº PLAZAS ACTUAL");

        txtDenominacionActual.setEditable(false);

        txtNPlazasActual.setEditable(false);

        jLabel1.setText("ALTA DE ACADEMIAS");

        jLabel4.setText("DENOMINACIÓN NUEVA");

        jLabel5.setText("Nº PLAZAS NUEVO");

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        jLabel6.setText("NOMBRE DEL CURSO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDenominacionNuevo)
                                        .addComponent(txtNPlazasNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNPlazasActual, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDenominacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnAceptar)
                                .addGap(62, 62, 62)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDenominacionActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNPlazasActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDenominacionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNPlazasNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        comboBoxCurso();
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        miCurso = (Curso) modelo.getSelectedItem();
        codCurso = miCurso.getCodCurso();
        Curso c;
        String DenominacionNuevo;
        int nPlazasNuevo = -1;
        DenominacionNuevo = txtDenominacionNuevo.getText();
        if (txtNPlazasNuevo.getText().compareToIgnoreCase("") == 0 /*|| Integer.valueOf(txtNPlazasNuevo.getText())==0*/) {
            nPlazasNuevo = -1;
        } else {
            try {
                nPlazasNuevo = Integer.valueOf(txtNPlazasNuevo.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "NO ES UN NÚMERO");
                txtNPlazasNuevo.setText("");
            }
        }
        denominacionAntiguo = miCurso.getDenominacion();//ME DA LA DENOMINACIÓN ANTES DE MODIFICARLO
        nPlazasAntiguo = miCurso.getnPlazasDisp();//ME DA EL Nª DE PLAZAS ANTES DE MODIFICARLO

        if (DenominacionNuevo.length() != 0 && nPlazasNuevo != -1) {
            denominacionActual = DenominacionNuevo;//ME DA LA DENOMINACIÓN YA MODIFICADO
            nPlazasActual = nPlazasNuevo;//ME DA EL Nº DE PLAZAS YA MODIFICADO
            if (denominacionAntiguo.compareToIgnoreCase(denominacionActual) == 0
                    || nPlazasAntiguo == nPlazasActual) {
                JOptionPane.showMessageDialog(this, "LA DENOMINACIÓN O EL Nº DE PLAZAS NUEVAS COINCIDEN CON LOS ANTIGUOS");
                limpiar();
            } else {
                c = new Curso(codCurso, DenominacionNuevo, nPlazasNuevo);
                GestorTablaCurso migestor = new GestorTablaCurso(bd);
                int registros = migestor.actualizarRegistros(c);
                if (registros != 0) {
                    JOptionPane.showMessageDialog(this, "CURSO MODIFICADO");
                    limpiar();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "HAY CAMPOS VACIOS");
            limpiar();
        }
        cmbCurso.setSelectedIndex(0);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void comboBoxCurso() {
        if (denominacionAntiguo.compareToIgnoreCase(denominacionActual) != 0
                && nPlazasAntiguo != nPlazasActual) {
            modelo.removeAllElements();
            cargarCursos();
            denominacionActual = "";
            nPlazasActual = 0;
            denominacionAntiguo = "";
            nPlazasAntiguo = 0;
        }

        miCurso = (Curso) modelo.getSelectedItem();

        txtDenominacionActual.setText(miCurso.getDenominacion());
        txtNPlazasActual.setText(Integer.toString(miCurso.getnPlazasDisp()));
    }

    public void limpiar() {
        txtDenominacionNuevo.setText("");
        txtNPlazasNuevo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDenominacionActual;
    private javax.swing.JTextField txtDenominacionNuevo;
    private javax.swing.JTextField txtNPlazasActual;
    private javax.swing.JTextField txtNPlazasNuevo;
    // End of variables declaration//GEN-END:variables
}