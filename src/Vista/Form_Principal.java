/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Form_Principal extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIPrincipal
     */
    public Form_Principal() {
        initComponents();
    }
    private Controlador controlador = new Controlador();

    public Controlador getControlador() {
        return controlador;
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
        labelnombre = new javax.swing.JLabel();
        labeltelefono = new javax.swing.JLabel();
        labeldireccion = new javax.swing.JLabel();
        labelcontraseña = new javax.swing.JLabel();
        labelcontraseña1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_contraseña1 = new javax.swing.JPasswordField();
        txt_contraseña2 = new javax.swing.JPasswordField();
        btn_inscribirme = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jPasswordField1.setText("jPasswordField1");

        setIconifiable(true);
        setResizable(true);
        setTitle("Menu");

        labelnombre.setText("Nombre:");

        labeltelefono.setText("Telefono:");

        labeldireccion.setText("Direcciòn:");

        labelcontraseña.setText("Contraseña:");

        labelcontraseña1.setText("Repetir Contraseña:");

        txt_contraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseña1ActionPerformed(evt);
            }
        });

        txt_contraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseña2ActionPerformed(evt);
            }
        });

        btn_inscribirme.setText("Inscribirme");
        btn_inscribirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscribirmeActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelnombre)
                            .addComponent(labeltelefono)
                            .addComponent(labeldireccion)
                            .addComponent(labelcontraseña)
                            .addComponent(labelcontraseña1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txt_nombre)
                            .addComponent(txt_contraseña1)
                            .addComponent(txt_contraseña2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_inscribirme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelnombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labeltelefono))
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldireccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcontraseña)
                    .addComponent(txt_contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelcontraseña1)
                    .addComponent(txt_contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inscribirme)
                    .addComponent(btn_cancelar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Iniciar_Resgis");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_contraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseña1ActionPerformed

    private void txt_contraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseña2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseña2ActionPerformed

    private void btn_inscribirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscribirmeActionPerformed

        if (getControlador().RegistrarUsuario(txt_nombre.getText(), txt_telefono.getText(), txt_direccion.getText(), txt_contraseña1.getText(), txt_contraseña2.getText())) {
            if (txt_nombre.getText().equals("") || txt_telefono.getText().equals("")
                    || txt_direccion.getText().equals("") || txt_contraseña1.getText().equals("")
                    || txt_contraseña2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Debe diligenciar todos los campos");
            } else {
                JOptionPane.showMessageDialog(this, "El usuario ha sido registrado");
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(this, "las contraseñas no son las mismas");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btn_inscribirmeActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_inscribirme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelcontraseña;
    private javax.swing.JLabel labelcontraseña1;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JPasswordField txt_contraseña1;
    private javax.swing.JPasswordField txt_contraseña2;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
