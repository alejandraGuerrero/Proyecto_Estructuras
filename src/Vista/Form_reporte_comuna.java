/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Barrio;
import Modelo.Comuna;
import Modelo.Incidente;
import Modelo.TipoIngresoInsidente;
import Modelo.TipoInscidente;
import Modelo.Usuario;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Form_reporte_comuna extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIPrincipal
     */
    public Form_reporte_comuna(Controlador cont) {
        initComponents();
        this.controlador = cont;
        cargarSelect();

    }
    private Controlador controlador;

    public Controlador getControlador() {
        return controlador;
    }

    public void cargarSelect() {
        combo_comuna_reporte.removeAllItems();
        combo_comuna_reporte.addItem("Seleccione");
        for (int i = 0; i < getControlador().getListacomunas().size(); i++) {
            combo_comuna_reporte.addItem(getControlador().getListacomunas().get(i).getCom_nombre());
        }
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo_comuna_reporte = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaIncidente = new javax.swing.JTable();
        jBListarIncidentes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jPasswordField1.setText("jPasswordField1");

        setIconifiable(true);
        setResizable(true);
        setTitle("Menu");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("Reporte Por Comuna");

        jLabel4.setText("Seleccione La Comuna");

        combo_comuna_reporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_comuna_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_comuna_reporteActionPerformed(evt);
            }
        });

        tableListaIncidente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Fecha", "Usuario", "Tipo Incidente", "Barrio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableListaIncidente);

        jBListarIncidentes.setText("Cargar Incidentes");
        jBListarIncidentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarIncidentesActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar Reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(67, 67, 67)
                .addComponent(combo_comuna_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jButton2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jBListarIncidentes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_comuna_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBListarIncidentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Iniciar_Resgis");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_comuna_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_comuna_reporteActionPerformed

        int incidente = combo_comuna_reporte.getSelectedIndex();
        getControlador().cargarIncidentesPorBarrio(incidente);
        System.out.println("deded " + getControlador().getListaInci().size());
//        for (int i = 0; i < getControlador().getLstbarrio().size(); i++) {
//            combo_barrio_reporte.addItem(getControlador().getLstbarrio().get(i).getBar_nombre());
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_comuna_reporteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

//        combo_tipoingreso_incidente.removeAllItems();
//        combo_tipoingreso_incidente.removeAllItems();  
//        
//         
//        for(int i=0; i<getControlador().getListatipoingresoincidente().size(); i++){
//            combo_tipoingreso_incidente.addItem(getControlador().getListatipoingresoincidente().get(i).getTii_descripcion());
//            System.out.println("getControlador().getListabarrios().get(i).getInc_descripcionIncidente() = " + getControlador().getListabarrios().get(i).getBar_nombre());
//        }
//         combo_tipo_incidente.removeAllItems();
//         for(int i=0; i<getControlador().getListaTipoInscidentes().size(); i++){
//            combo_tipoingreso_incidente.addItem(getControlador().getListaTipoInscidentes().get(i).getTipinc_descripcion());
//            System.out.println("getControlador().getListabarrios().get(i).getInc_descripcionIncidente() = " + getControlador().getListabarrios().get(i).getBar_nombre());
//        }

    }//GEN-LAST:event_formInternalFrameOpened

    private void jBListarIncidentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarIncidentesActionPerformed
        // TODO add your handling code here:
        int tipo = combo_comuna_reporte.getSelectedIndex();

        if (tipo != 0) {

            Comuna codigocomuna = controlador.buscarComuna(combo_comuna_reporte.getSelectedItem().toString());
            getControlador().cargarIncidentesPorComuna(codigocomuna.getCom_codigo());

            if (!getControlador().getListaIncicomuna().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Se tienen " + getControlador().getListaIncicomuna().size() + " Incidentes Registrados en la comuna " + codigocomuna.getCom_nombre());
                tableListaIncidente.removeAll();
                DefaultTableModel lstIncidente = (DefaultTableModel) tableListaIncidente.getModel();

                int rowCount = lstIncidente.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    lstIncidente.removeRow(i);
                }
                for (int i = 0; i < getControlador().getListaIncicomuna().size(); i++) {
                    lstIncidente.addRow(new Object[]{getControlador().getListaIncicomuna().get(i).getInc_codigoIncidente(), getControlador().getListaIncidentes().get(i).getInc_descripcionIncidente(), getControlador().getListaIncidentes().get(i).getInc_fechaIncidente(), getControlador().getListaIncidentes().get(i).getUsuario().getTelefono(), getControlador().getListaIncidentes().get(i).getTipo_incidente().getTipinc_descripcion(), getControlador().getListaIncidentes().get(i).getBarrio().getBar_nombre()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "No tiene Se Tienen Incidentes en la comuna " + codigocomuna.getCom_nombre());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Una Comuna");
        }
    }//GEN-LAST:event_jBListarIncidentesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_comuna_reporte;
    private javax.swing.JButton jBListarIncidentes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableListaIncidente;
    // End of variables declaration//GEN-END:variables
}
