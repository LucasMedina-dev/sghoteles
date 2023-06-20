/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces.panelOpciones;

/**
 *
 * @author Lucas
 */
public class PanelFacturacion extends javax.swing.JPanel {

    /**
     * Creates new form panelFacturacion
     */
    public PanelFacturacion() {
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

        panelFacturacion = new javax.swing.JPanel();
        reservasCobrarHab = new javax.swing.JButton();
        reservasAniadirCargo = new javax.swing.JButton();
        reservasQuitarCargo = new javax.swing.JButton();
        reservasCobroParcial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(200, 300));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFacturacion.setBackground(new java.awt.Color(80, 105, 140));

        reservasCobrarHab.setText("Cobrar habitacion");
        reservasCobrarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasCobrarHabActionPerformed(evt);
            }
        });

        reservasAniadirCargo.setText("Añadir cargos");
        reservasAniadirCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasAniadirCargoActionPerformed(evt);
            }
        });

        reservasQuitarCargo.setText("Quitar cargos");
        reservasQuitarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasQuitarCargoActionPerformed(evt);
            }
        });

        reservasCobroParcial.setText("Cobro parcial");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACTURACION");

        javax.swing.GroupLayout panelFacturacionLayout = new javax.swing.GroupLayout(panelFacturacion);
        panelFacturacion.setLayout(panelFacturacionLayout);
        panelFacturacionLayout.setHorizontalGroup(
            panelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservasCobroParcial, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(reservasQuitarCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reservasAniadirCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reservasCobrarHab, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFacturacionLayout.setVerticalGroup(
            panelFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturacionLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservasCobrarHab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasAniadirCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasQuitarCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasCobroParcial)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        add(panelFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void reservasCobrarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasCobrarHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservasCobrarHabActionPerformed

    private void reservasAniadirCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasAniadirCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservasAniadirCargoActionPerformed

    private void reservasQuitarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasQuitarCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservasQuitarCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFacturacion;
    private javax.swing.JButton reservasAniadirCargo;
    private javax.swing.JButton reservasCobrarHab;
    private javax.swing.JButton reservasCobroParcial;
    private javax.swing.JButton reservasQuitarCargo;
    // End of variables declaration//GEN-END:variables
}
