package interfaces.recepcion;

import com.clases.Cliente;
import com.clases.Estadia;
import com.clases.Estado;
import com.clases.Habitacion;
import com.clases.Reserva;
import com.clases.SystemManager;
import interfaces.alertas.Alerta;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form crearReserva
     */
    private Reserva res;
    public CheckIn(Integer nroRes) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Operacion para cerrar        
        SystemManager.centerApp(this);
        Reserva res=SystemManager.buscarReserva(nroRes);
        setReserva(res);
        this.setRes(res);
        Alerta alerta= new Alerta();
        alerta.setVisible(true);
    }
    public CheckIn() {
        initComponents();
        SystemManager.centerApp(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Operacion para cerrar        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        habNumber = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ddin = new javax.swing.JTextField();
        mmin = new javax.swing.JTextField();
        aaaain = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        modelHab = new javax.swing.JComboBox<>();
        ddout = new javax.swing.JTextField();
        mmout = new javax.swing.JTextField();
        aaaaout = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        nombre = new javax.swing.JFormattedTextField();
        apellido = new javax.swing.JFormattedTextField();
        documento = new javax.swing.JFormattedTextField();
        telefono = new javax.swing.JFormattedTextField();
        domicilio = new javax.swing.JFormattedTextField();
        email = new javax.swing.JFormattedTextField();
        ciudad = new javax.swing.JFormattedTextField();
        nacionalidad = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Habitacion");

        habNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "114", "115", "116", "117", "118", "119", "120" }));
        habNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habNumberActionPerformed(evt);
            }
        });

        jLabel11.setText("CheckIn");

        ddin.setText("DD");

        mmin.setText("MM");

        aaaain.setText("AAAA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(habNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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
                .addComponent(habNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)
                .addComponent(ddin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(aaaain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, -1));

        jLabel2.setText("Tipo hab");

        modelHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTANDAR", "ESPECIAL" }));

        ddout.setText("DD");

        mmout.setText("MM");

        aaaaout.setText("AAAA");

        jLabel12.setText("CheckOut");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(modelHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
                .addComponent(jLabel2)
                .addComponent(modelHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, -1));
        jPanel5.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 150, -1));
        jPanel5.add(documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 110, -1));
        jPanel5.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 150, -1));
        jPanel5.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 320, -1));
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 320, -1));
        jPanel5.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 150, -1));
        jPanel5.add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, -1));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 210));

        jLabel3.setText("Ciudad");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 80, 50, 20));

        jLabel4.setText("Email");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 60, 20));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 10));

        jLabel5.setText("Nombre");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

        jLabel6.setText("Apellido");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, 20));

        jLabel7.setText("Nro doc");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 60, 20));

        jLabel8.setText("Telefono");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, 20));

        jLabel9.setText("Nacionalidad");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 20));

        jLabel10.setText("Domicilio");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 60, 20));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel5.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel5.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 220));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setReserva(Reserva res){
        LocalDate fechaIn= LocalDate.parse(res.getFechaEntrada());
        LocalDate fechaOut= LocalDate.parse(res.getFechaSalida());
        habNumber.setSelectedItem(res.getHabitacion());
        //modelHab.setSelectedItem(res.getTipoHab().toUpperCase());
        nombre.setText(res.getNombre());
        apellido.setText(res.getApellido());
        ddin.setText(String.valueOf(fechaIn.getDayOfMonth()));
        ddout.setText(String.valueOf(fechaOut.getDayOfMonth()));
        mmin.setText(String.valueOf(fechaIn.getMonthValue()));
        mmout.setText(String.valueOf(fechaOut.getMonthValue()));
        aaaain.setText(String.valueOf(fechaIn.getYear()));
        aaaaout.setText(String.valueOf(fechaOut.getYear()));
    }
    
    private void habNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habNumberActionPerformed

    }//GEN-LAST:event_habNumberActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
       Cliente cliente= new Cliente(nombre.getText(), apellido.getText(), documento.getText(), telefono.getText(), email.getText(), domicilio.getText(), ciudad.getText(), nacionalidad.getText());
        SystemManager.crearCliente(cliente);
        LocalDate fechaEntrada= LocalDate.of(Integer.parseInt(aaaain.getText()), Integer.parseInt(mmin.getText()), Integer.parseInt(ddin.getText()));
        LocalDate fechaSalida= LocalDate.of(Integer.parseInt(aaaaout.getText()), Integer.parseInt(mmout.getText()), Integer.parseInt(ddout.getText()));
        int montoDiario=0;
        try {
            ArrayList<Habitacion> habitaciones= SystemManager.leerJson("src/json/habitaciones.json", Habitacion.class);
            for(Habitacion h : habitaciones){
                if(habNumber.getSelectedItem().toString().equals(h.getNumHab()) && h.getEstado().equals(Estado.libre)){
                    montoDiario=h.getMontoDiario();
                    break;
                    
                }else{
                    Alerta alert = new Alerta("La habitacion NO existe o NO esta disponible");
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        Estadia estadia= new Estadia(cliente, fechaEntrada.toString(), fechaSalida.toString(), "usuario",montoDiario );
        SystemManager.ocuparHabitacion(estadia, habNumber.getSelectedItem().toString());
        if(res!=null){
            SystemManager.usarReserva(res);
        }
    }//GEN-LAST:event_aceptarActionPerformed
    
    public Reserva getRes() {
        return res;
    }

    public void setRes(Reserva res) {
        this.res = res;
    }

    
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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aaaain;
    private javax.swing.JTextField aaaaout;
    private javax.swing.JButton aceptar;
    private javax.swing.JFormattedTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JFormattedTextField ciudad;
    private javax.swing.JTextField ddin;
    private javax.swing.JTextField ddout;
    private javax.swing.JFormattedTextField documento;
    private javax.swing.JFormattedTextField domicilio;
    private javax.swing.JFormattedTextField email;
    private javax.swing.JComboBox<String> habNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JComboBox<String> modelHab;
    private javax.swing.JFormattedTextField nacionalidad;
    private javax.swing.JFormattedTextField nombre;
    private javax.swing.JFormattedTextField telefono;
    // End of variables declaration//GEN-END:variables
}
