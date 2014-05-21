/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Controlador;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Form_Reporte_Por_Barrio extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIGestionIncidente
     */
    public Form_Reporte_Por_Barrio(Controlador cont) {
        this.controlador=cont;
        cargarSelect();
        initComponents();
    }

    private  Controlador controlador;

    public Controlador getControlador() {
        return controlador;
    }

    public void cargarSelect() {
        System.out.println("numero " + getControlador().getListabarrios().size());

       combo_barrios_reporte.removeAllItems();
       combo_barrios_reporte.addItem("Seleccione");
        for (int i = 0; i < getControlador().getListacomunas().size(); i++) {
            combo_barrios_reporte.addItem(getControlador().getListacomunas().get(i).getCom_nombre());
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaIncidente = new javax.swing.JTable();
        jBListarIncidentes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        combo_barrios_reporte = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Incidente");

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
        if (tableListaIncidente.getColumnModel().getColumnCount() > 0) {
            tableListaIncidente.getColumnModel().getColumn(0).setResizable(false);
            tableListaIncidente.getColumnModel().getColumn(1).setResizable(false);
            tableListaIncidente.getColumnModel().getColumn(2).setResizable(false);
            tableListaIncidente.getColumnModel().getColumn(3).setResizable(false);
            tableListaIncidente.getColumnModel().getColumn(4).setResizable(false);
            tableListaIncidente.getColumnModel().getColumn(5).setResizable(false);
        }

        jBListarIncidentes.setText("Cargar Incidentes");
        jBListarIncidentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarIncidentesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("REPORTES");

        label1.setText("Seleccione el reporte que desea consultar");

        combo_barrios_reporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_barrios_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_barrios_reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jBListarIncidentes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(combo_barrios_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_barrios_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBListarIncidentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBListarIncidentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarIncidentesActionPerformed
        // TODO add your handling code here:
         if (!getControlador().getListaIncidentes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se tienen " + getControlador().getListaIncidentes().size() + " Incidentes Registrados");
            tableListaIncidente.removeAll();
            System.out.println("selecciono " + combo_barrios_reporte.toString());
            DefaultTableModel lstIncidente = (DefaultTableModel) tableListaIncidente.getModel();

            int rowCount = lstIncidente.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                lstIncidente.removeRow(i);
            }
            for (int i = 0; i < getControlador().getListaIncidentes().size(); i++) {
                lstIncidente.addRow(new Object[]{getControlador().getListaIncidentes().get(i).getInc_codigoIncidente(), getControlador().getListaIncidentes().get(i).getInc_descripcionIncidente(), getControlador().getListaIncidentes().get(i).getInc_fechaIncidente(), getControlador().getListaIncidentes().get(i).getUsuario().getTelefono(), getControlador().getListaIncidentes().get(i).getTipo_incidente().getTipinc_descripcion(), getControlador().getListaIncidentes().get(i).getBarrio().getBar_nombre()});
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tiene Se Tienen Incidentes");
        }
    }//GEN-LAST:event_jBListarIncidentesActionPerformed

    private void combo_barrios_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_barrios_reporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_barrios_reporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_barrios_reporte;
    private javax.swing.JButton jBListarIncidentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    public static javax.swing.JTable tableListaIncidente;
    // End of variables declaration//GEN-END:variables
}
