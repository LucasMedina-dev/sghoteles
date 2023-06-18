/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.reservas;

import com.clases.Cliente;
import com.clases.Reserva;
import com.clases.SystemManager;
import interfaces.alertas.Alerta;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author Lucas
 */
public class CrearReservaFrame extends javax.swing.JFrame {

    /**
     * Creates new form crearReservaFrame
     */
    public CrearReservaFrame() {
        initComponents();
        SystemManager.centerApp(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Operacion para cerrar   
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        habNum = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ddin = new javax.swing.JTextField();
        mmin = new javax.swing.JTextField();
        aaaain = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ddout = new javax.swing.JTextField();
        mmout = new javax.swing.JTextField();
        aaaaout = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tipoHab = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        nombre = new javax.swing.JFormattedTextField();
        apellido = new javax.swing.JFormattedTextField();
        nroRes = new javax.swing.JFormattedTextField();
        telefono = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        documento = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Habitacion");

        habNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "114", "115", "116", "117", "118", "119", "120" }));
        habNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habNumActionPerformed(evt);
            }
        });

        jLabel11.setText("CheckIn");

        ddin.setText("DD");
        ddin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ddinFocusGained(evt);
            }
        });

        mmin.setText("MM");
        mmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mminFocusGained(evt);
            }
        });

        aaaain.setText("AAAA");
        aaaain.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aaaainFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(habNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ddin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mmin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aaaain, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(habNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)
                .addComponent(ddin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(aaaain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, -1));

        ddout.setText("DD");
        ddout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ddoutFocusGained(evt);
            }
        });

        mmout.setText("MM");
        mmout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mmoutFocusGained(evt);
            }
        });

        aaaaout.setText("AAAA");
        aaaaout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aaaaoutFocusGained(evt);
            }
        });

        jLabel12.setText("CheckOut");

        jLabel9.setText("Tipo hab");

        tipoHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTANDAR", "ESPECIAL" }));
        tipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoHabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ddout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mmout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aaaaout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(ddout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mmout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(aaaaout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, -1));

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        jPanel5.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 150, -1));

        nroRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroResActionPerformed(evt);
            }
        });
        jPanel5.add(nroRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));
        jPanel5.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 150, -1));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 210));

        jLabel5.setText("Nombre");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

        jLabel6.setText("Apellido");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, 20));

        jLabel7.setText("NRO RES");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 20));

        jLabel8.setText("Telefono");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, 20));

        jLabel10.setText("Nro Doc");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 70, 20));
        jPanel5.add(documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 110, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 110));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 10));

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(aceptar)
                .addGap(48, 48, 48)
                .addComponent(cancelar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void habNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habNumActionPerformed
        System.out.println("camio");
    }//GEN-LAST:event_habNumActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void nroResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroResActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        Reserva res=null;
        Integer id= Integer.parseInt(nroRes.getText());
        String nroHab= (String) habNum.getSelectedItem();
        String tipoHabi= (String) tipoHab.getSelectedItem();
        LocalDate fechaEntrada= LocalDate.of(Integer.parseInt(aaaain.getText()), Integer.parseInt(mmin.getText()), Integer.parseInt(ddin.getText()));
        LocalDate fechaSalida= LocalDate.of(Integer.parseInt(aaaaout.getText()), Integer.parseInt(mmout.getText()), Integer.parseInt(ddout.getText()));
        String nom= nombre.getText();
        String ape= apellido.getText();
        String tel=telefono.getText();
        res=new Reserva(id, nroHab, tipoHabi, fechaEntrada.toString(), fechaSalida.toString(), nom, ape, tel);
        try {
            SystemManager.crearReserva(res);
            SystemManager.crearCliente(new Cliente(nom, ape, tel, documento.getText()));
            
        }catch(IOException e){
            Alerta alerta= new Alerta("Error al crear reserva, verifique las fechas");
            alerta.setVisible(true);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void tipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoHabActionPerformed

    private void ddinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ddinFocusGained
        if(ddin.getText().equals("DD")){
            ddin.setText("");
        }
    }//GEN-LAST:event_ddinFocusGained

    private void mminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mminFocusGained
        if(mmin.getText().equals("MM")){
            mmin.setText("");
        }
    }//GEN-LAST:event_mminFocusGained

    private void aaaainFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aaaainFocusGained
        if(aaaain.getText().equals("AAAA")){
            aaaain.setText("");
        }
    }//GEN-LAST:event_aaaainFocusGained

    private void ddoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ddoutFocusGained
        if(ddout.getText().equals("DD")){
            ddout.setText("");
        }
    }//GEN-LAST:event_ddoutFocusGained

    private void mmoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mmoutFocusGained
        if(mmout.getText().equals("MM")){
            mmout.setText("");
        }
    }//GEN-LAST:event_mmoutFocusGained

    private void aaaaoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aaaaoutFocusGained
        if(aaaaout.getText().equals("AAAA")){
            aaaaout.setText("");
        }
    }//GEN-LAST:event_aaaaoutFocusGained

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
            java.util.logging.Logger.getLogger(CrearReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearReservaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearReservaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aaaain;
    private javax.swing.JTextField aaaaout;
    private javax.swing.JButton aceptar;
    private javax.swing.JFormattedTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField ddin;
    private javax.swing.JTextField ddout;
    private javax.swing.JFormattedTextField documento;
    private javax.swing.JComboBox<String> habNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mmin;
    private javax.swing.JTextField mmout;
    private javax.swing.JFormattedTextField nombre;
    private javax.swing.JFormattedTextField nroRes;
    private javax.swing.JFormattedTextField telefono;
    private javax.swing.JComboBox<String> tipoHab;
    // End of variables declaration//GEN-END:variables
}
