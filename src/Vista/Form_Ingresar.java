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
public class Form_Ingresar extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIPrincipal
     */
    public Form_Ingresar(Controlador cont) {
        this.controlador=cont;
        initComponents();
    }
    private Controlador controlador;

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
        txt_telefono_ingre = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_contra_ingre = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jPasswordField1.setText("jPasswordField1");

        setForeground(new java.awt.Color(240, 240, 240));
        setIconifiable(true);
        setResizable(true);
        setTitle("Menu");

        labelnombre.setBackground(new java.awt.Color(255, 204, 255));
        labelnombre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelnombre.setText("Telefono:");

        labeltelefono.setBackground(new java.awt.Color(255, 204, 255));
        labeltelefono.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labeltelefono.setText("Contraseña:");

        txt_telefono_ingre.setBackground(new java.awt.Color(255, 204, 255));
        txt_telefono_ingre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_telefono_ingre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_ingreActionPerformed(evt);
            }
        });

        btn_ingresar.setBackground(new java.awt.Color(255, 204, 255));
        btn_ingresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 204, 255));
        btn_cancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_contra_ingre.setBackground(new java.awt.Color(255, 204, 255));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("INGRESO DE USUARIOS");

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
                            .addComponent(labeltelefono))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_telefono_ingre, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txt_contra_ingre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_ingresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(txt_telefono_ingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltelefono)
                    .addComponent(txt_contra_ingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Iniciar_Resgis");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

        if (getControlador().validarUsuario(txt_telefono_ingre.getText(), txt_contra_ingre.getText())) {
            MDIAinicio md=new MDIAinicio();
            md.getOptmenu_incidente().setEnabled(true);
            md.getOptmenu_repo().setEnabled(true);
            md.getOptmenu_actualizar_incidente().setEnabled(false);
            
            JOptionPane.showMessageDialog(this, "Bienvenido");
            this.dispose();

        } else {
            if (txt_telefono_ingre.getText().equals("") || txt_contra_ingre.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Debe diligencias todos los campos");
            } else {
                JOptionPane.showMessageDialog(this, "El usuario ingresado no existe");
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_telefono_ingreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_ingreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_ingreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JPasswordField txt_contra_ingre;
    public static javax.swing.JTextField txt_telefono_ingre;
    // End of variables declaration//GEN-END:variables
}
