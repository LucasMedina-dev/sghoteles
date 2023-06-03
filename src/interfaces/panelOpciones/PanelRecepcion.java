/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces.panelOpciones;

import com.clases.SystemManager;
import interfaces.recepcion.ConsultaReserva;

/**
 *
 * @author Lucas
 */
public class PanelRecepcion extends javax.swing.JPanel {

    /**
     * Creates new form panelRecepcion
     */
    public PanelRecepcion() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRecepcion = new javax.swing.JPanel();
        recepcionIngresarPax = new javax.swing.JButton();
        recepcionEgresarPax = new javax.swing.JButton();
        recepcionIngresarAdicional = new javax.swing.JButton();
        recepcionCambiarHab = new javax.swing.JButton();
        recepcionModEgreso = new javax.swing.JButton();
        recepcionModHab = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRecepcion.setBackground(new java.awt.Color(80, 105, 140));

        recepcionIngresarPax.setText("CHECK - IN");
        recepcionIngresarPax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepcionIngresarPaxActionPerformed(evt);
            }
        });

        recepcionEgresarPax.setText("CHECK - OUT");
        recepcionEgresarPax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepcionEgresarPaxActionPerformed(evt);
            }
        });

        recepcionIngresarAdicional.setText("Ingresar pax adicional");

        recepcionCambiarHab.setText("Cambiar de habitacion");

        recepcionModEgreso.setText("Modificar egreso");
        recepcionModEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepcionModEgresoActionPerformed(evt);
            }
        });

        recepcionModHab.setText("Modificar habitacion");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECEPCION");

        javax.swing.GroupLayout panelRecepcionLayout = new javax.swing.GroupLayout(panelRecepcion);
        panelRecepcion.setLayout(panelRecepcionLayout);
        panelRecepcionLayout.setHorizontalGroup(
            panelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recepcionModEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recepcionModHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recepcionCambiarHab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(recepcionIngresarAdicional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recepcionIngresarPax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recepcionEgresarPax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRecepcionLayout.setVerticalGroup(
            panelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecepcionLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recepcionIngresarPax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recepcionEgresarPax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recepcionIngresarAdicional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recepcionCambiarHab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recepcionModEgreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recepcionModHab)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        add(panelRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void recepcionIngresarPaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepcionIngresarPaxActionPerformed
        ConsultaReserva res= new ConsultaReserva();
        res.dispose();
        
        res.setVisible(true);
    }//GEN-LAST:event_recepcionIngresarPaxActionPerformed

    private void recepcionEgresarPaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepcionEgresarPaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recepcionEgresarPaxActionPerformed

    private void recepcionModEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepcionModEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recepcionModEgresoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelRecepcion;
    private javax.swing.JButton recepcionCambiarHab;
    private javax.swing.JButton recepcionEgresarPax;
    private javax.swing.JButton recepcionIngresarAdicional;
    private javax.swing.JButton recepcionIngresarPax;
    private javax.swing.JButton recepcionModEgreso;
    private javax.swing.JButton recepcionModHab;
    // End of variables declaration//GEN-END:variables
}
