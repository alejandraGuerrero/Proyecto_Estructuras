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
public class Form_reporte_comuna_tipo_y_barrio extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIPrincipal
     */
    public Form_reporte_comuna_tipo_y_barrio(Controlador cont) {
        initComponents();
        this.controlador = cont;
        cargarSelect();

    }
    private Controlador controlador;

    public Controlador getControlador() {
        return controlador;
    }

    public void cargarSelect() {
        combo_comuna_reportetriple.removeAllItems();
        combo_comuna_reportetriple.addItem("Seleccione");
        for (int i = 0; i < getControlador().getListacomunas().size(); i++) {
            combo_comuna_reportetriple.addItem(getControlador().getListacomunas().get(i).getCom_nombre());
        }
        combo_tipo_reportetriple.removeAllItems();
        combo_tipo_reportetriple.addItem("Seleccione");
        for (int i = 0; i < getControlador().getListaTipoInscidentes().size(); i++) {
            combo_tipo_reportetriple.addItem(getControlador().getListaTipoInscidentes().get(i).getTipinc_descripcion());
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
        combo_tipo_reportetriple = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaIncidente = new javax.swing.JTable();
        jBListarIncidentes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        combo_comuna_reportetriple = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        combo_barrio_reportetriple = new javax.swing.JComboBox();

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
        jLabel3.setText("Reporte Por Comuna y Tipo de Incidente");

        jLabel4.setText("Seleccione La Comuna");

        combo_tipo_reportetriple.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_tipo_reportetriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipo_reportetripleActionPerformed(evt);
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

        jLabel5.setText("Seleccione el Tipo de Incidente");

        combo_comuna_reportetriple.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_comuna_reportetriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_comuna_reportetripleActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione El Barrio");

        combo_barrio_reportetriple.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_barrio_reportetriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_barrio_reportetripleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_comuna_reportetriple, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_tipo_reportetriple, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_barrio_reportetriple, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jBListarIncidentes)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_comuna_reportetriple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo_barrio_reportetriple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_tipo_reportetriple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBListarIncidentes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Iniciar_Resgis");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_tipo_reportetripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipo_reportetripleActionPerformed

        int incidente = combo_tipo_reportetriple.getSelectedIndex();
        getControlador().cargarIncidentesPorBarrio(incidente);
        System.out.println("deded " + getControlador().getListaInci().size());
//        for (int i = 0; i < getControlador().getLstbarrio().size(); i++) {
//            combo_barrio_reporte.addItem(getControlador().getLstbarrio().get(i).getBar_nombre());
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipo_reportetripleActionPerformed

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
        int comuna = combo_comuna_reportetriple.getSelectedIndex();
        int tipo = combo_tipo_reportetriple.getSelectedIndex();
        int barrio = combo_barrio_reportetriple.getSelectedIndex();

        if (comuna != 0 && tipo != 0 && barrio != 0) {

            Comuna codigocomuna = controlador.buscarComuna(combo_comuna_reportetriple.getSelectedItem().toString());
            TipoInscidente codigotipo = controlador.buscarTipoIncidente(combo_tipo_reportetriple.getSelectedItem().toString());
            Barrio codigobarrio = controlador.buscarBarrio(combo_barrio_reportetriple.getSelectedItem().toString());
            getControlador().cargarIncidentesPorComunaTipoYBarrio(codigocomuna.getCom_codigo(), codigotipo.getTipinc_codigo(), codigobarrio.getBar_codigo());
            DefaultTableModel lstIncidente = (DefaultTableModel) tableListaIncidente.getModel();

            if (!getControlador().getListaIncicomunatipoybarrio().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Se tienen " + getControlador().getListaIncicomunatipoybarrio().size()
                        + " Incidentes Registrados en el barrio " + codigobarrio.getBar_nombre() + " de la Comuna " + codigocomuna.getCom_nombre() + " Y con el tipo de incidente "
                        + codigotipo.getTipinc_descripcion());
                tableListaIncidente.removeAll();

                int rowCount = lstIncidente.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    lstIncidente.removeRow(i);
                }
                for (int i = 0; i < getControlador().getListaIncicomunatipoybarrio().size(); i++) {
                    lstIncidente.addRow(new Object[]{getControlador().getListaIncicomunatipoybarrio().get(i).getInc_codigoIncidente(), getControlador().getListaIncicomunatipoybarrio().get(i).getInc_descripcionIncidente(), getControlador().getListaIncicomunatipoybarrio().get(i).getInc_fechaIncidente(), getControlador().getListaIncicomunatipoybarrio().get(i).getUsuario().getTelefono(), getControlador().getListaIncicomunatipoybarrio().get(i).getTipo_incidente().getTipinc_descripcion(), getControlador().getListaIncicomunatipoybarrio().get(i).getBarrio().getBar_nombre()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "No tiene Se Tienen Incidentes en el barrio " + codigobarrio.getBar_nombre() + " de la Comuna " + codigocomuna.getCom_nombre() + " Y con el tipo de incidente "
                        + codigotipo.getTipinc_descripcion());
                int rowCount = lstIncidente.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    lstIncidente.removeRow(i);
                }
                if (lstIncidente.getRowCount() > 0) {
                    lstIncidente.removeRow(tableListaIncidente.getSelectedRow());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Una Comuna, un Barrio y un Tipo de Incidente");
        }
    }//GEN-LAST:event_jBListarIncidentesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_comuna_reportetripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_comuna_reportetripleActionPerformed
        int comuna = combo_comuna_reportetriple.getSelectedIndex();
        getControlador().cargarBarrio(comuna);
        combo_barrio_reportetriple.removeAllItems();
        combo_barrio_reportetriple.addItem("Seleccione");
        for (int i = 0; i < getControlador().getLstbarrio().size(); i++) {
            combo_barrio_reportetriple.addItem(getControlador().getLstbarrio().get(i).getBar_nombre());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_comuna_reportetripleActionPerformed

    private void combo_barrio_reportetripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_barrio_reportetripleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_barrio_reportetripleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_barrio_reportetriple;
    private javax.swing.JComboBox combo_comuna_reportetriple;
    private javax.swing.JComboBox combo_tipo_reportetriple;
    private javax.swing.JButton jBListarIncidentes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableListaIncidente;
    // End of variables declaration//GEN-END:variables
}
