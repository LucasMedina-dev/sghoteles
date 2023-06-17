/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaces.panelOpciones;

import com.clases.Reserva;
import com.clases.SystemManager;
import interfaces.recepcion.CheckIn;
import interfaces.reservas.BorrarReserva;
import interfaces.reservas.CrearReservaFrame;
import interfaces.reservas.LimpiarReservas;
import interfaces.reservas.ModificarRerservaFrame;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Lucas
 */
public class PanelReservas extends javax.swing.JPanel {

    /**
     * Creates new form panelReservas
     */
    public PanelReservas() {
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

        panelReservas = new javax.swing.JPanel();
        reservasCrear = new javax.swing.JButton();
        reservasModificar = new javax.swing.JButton();
        reservasCancelar = new javax.swing.JButton();
        reservasNoShow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reservasListado1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelReservas.setBackground(new java.awt.Color(80, 105, 140));

        reservasCrear.setText("Crear reserva");
        reservasCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasCrearActionPerformed(evt);
            }
        });

        reservasModificar.setText("Modificar reserva");
        reservasModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasModificarActionPerformed(evt);
            }
        });

        reservasCancelar.setText("Cancelar reserva");
        reservasCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasCancelarActionPerformed(evt);
            }
        });

        reservasNoShow.setText("Limpiar reservas No-Show");
        reservasNoShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasNoShowActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVAS");

        reservasListado1.setText("Listado de reservas");
        reservasListado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasListado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReservasLayout = new javax.swing.GroupLayout(panelReservas);
        panelReservas.setLayout(panelReservasLayout);
        panelReservasLayout.setHorizontalGroup(
            panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasLayout.createSequentialGroup()
                .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(reservasNoShow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(reservasCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservasModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservasCrear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservasListado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(0, 116, Short.MAX_VALUE))
        );
        panelReservasLayout.setVerticalGroup(
            panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservasCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasNoShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasListado1)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        add(panelReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void reservasCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasCrearActionPerformed
        CrearReservaFrame frame= new CrearReservaFrame();
        frame.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_reservasCrearActionPerformed

    private void reservasModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasModificarActionPerformed
        ModificarRerservaFrame frame= new ModificarRerservaFrame();
        frame.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_reservasModificarActionPerformed

    private void reservasNoShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasNoShowActionPerformed
        LimpiarReservas frame= new LimpiarReservas();
        frame.setVisible(true);
    }//GEN-LAST:event_reservasNoShowActionPerformed
    
    
    
    private void reservasCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasCancelarActionPerformed
        BorrarReserva frame= new BorrarReserva();
        frame.setVisible(true);
    }//GEN-LAST:event_reservasCancelarActionPerformed

    private void reservasListado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasListado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservasListado1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelReservas;
    private javax.swing.JButton reservasCancelar;
    private javax.swing.JButton reservasCrear;
    private javax.swing.JButton reservasListado1;
    private javax.swing.JButton reservasModificar;
    private javax.swing.JButton reservasNoShow;
    // End of variables declaration//GEN-END:variables
}
