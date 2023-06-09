package interfaces.reservas;

import com.clases.Reserva;
import com.clases.SystemManager;
import java.time.LocalDate;
import java.util.ArrayList;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class BorrarReserva extends javax.swing.JFrame {

    /**
     * Creates new form borrarReserva
     */
    public Reserva reserva;
    public BorrarReserva() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Operacion para cerrar        
        SystemManager.centerApp(this);
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
        jLabel7 = new javax.swing.JLabel();
        nroRes = new javax.swing.JFormattedTextField();
        buscarReserva = new javax.swing.JButton();
        resExiste = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        habText = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        nombre = new javax.swing.JFormattedTextField();
        apellido = new javax.swing.JFormattedTextField();
        telefono = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ddin = new javax.swing.JTextField();
        mmin = new javax.swing.JTextField();
        aaaain = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ddout = new javax.swing.JTextField();
        mmout = new javax.swing.JTextField();
        aaaaout = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("NRO RES");

        nroRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroResActionPerformed(evt);
            }
        });

        buscarReserva.setText("Buscar reserva");
        buscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nroRes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarReserva)
                .addGap(18, 18, 18)
                .addComponent(resExiste, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nroRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(buscarReserva)
                .addComponent(resExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, -1));

        jLabel1.setText("Habitacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(habText)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(habText, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 20));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setEditable(false);
        jPanel5.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, -1));

        apellido.setEditable(false);
        jPanel5.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 110, -1));

        telefono.setEditable(false);
        jPanel5.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 10));

        jLabel5.setText("Nombre");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

        jLabel6.setText("Apellido");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 60, 20));

        jLabel8.setText("Telefono");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 20));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel5.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel5.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel11.setText("CheckIn");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 15, -1, -1));

        ddin.setEditable(false);
        ddin.setText("DD");
        jPanel5.add(ddin, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 12, 42, -1));

        mmin.setEditable(false);
        mmin.setText("MM");
        jPanel5.add(mmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 12, 42, -1));

        aaaain.setEditable(false);
        aaaain.setText("AAAA");
        jPanel5.add(aaaain, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 12, 57, -1));

        jLabel12.setText("CheckOut");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 43, -1, -1));

        ddout.setEditable(false);
        ddout.setText("DD");
        jPanel5.add(ddout, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 40, 42, -1));

        mmout.setEditable(false);
        mmout.setText("MM");
        jPanel5.add(mmout, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 40, 42, -1));

        aaaaout.setEditable(false);
        aaaaout.setText("AAAA");
        jPanel5.add(aaaaout, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 40, 57, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 140));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nroResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroResActionPerformed

    private void buscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReservaActionPerformed
        reserva= SystemManager.buscarReserva(Integer.parseInt(nroRes.getText()));
        if(reserva!=null){
            LocalDate fechaIn= LocalDate.parse(reserva.getFechaEntrada());
            LocalDate fechaOut= LocalDate.parse(reserva.getFechaSalida());
            resExiste.setText("Existe");
            habText.setText(reserva.getHabitacion());
            nombre.setText(reserva.getNombre());
            apellido.setText(reserva.getApellido());
            telefono.setText(reserva.getTelefono());
            ddin.setText(String.valueOf(fechaIn.getDayOfMonth()));
            ddout.setText(String.valueOf(fechaOut.getDayOfMonth()));
            mmin.setText(String.valueOf(fechaIn.getMonthValue()));
            mmout.setText(String.valueOf(fechaOut.getMonthValue()));
            aaaain.setText(String.valueOf(fechaIn.getYear()));
            aaaaout.setText(String.valueOf(fechaOut.getYear()));
            
        }else{
            resExiste.setText("No existe");
        }
    }//GEN-LAST:event_buscarReservaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

        ArrayList<Reserva> reservasEliminadas = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();
        try {
            reservas = SystemManager.leerJson("src/json/reserva.json", Reserva.class);
            borrarReserva(reservas, reserva); // Elimina la reserva del ArrayList original
            reservasEliminadas = SystemManager.leerJson("src/json/reservasEliminadas.json", Reserva.class);
            reservasEliminadas.add(reserva);
            SystemManager.persistirLista(reservas, "src/json/reserva.json"); // Actualizar el archivo JSON original
            SystemManager.persistirLista(reservasEliminadas, "src/json/reservasEliminadas.json");
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_borrarActionPerformed
    public static void borrarReserva(ArrayList<Reserva> reservas, Reserva reserva) {
        Reserva borrar=null;
        try{
            for(Reserva r : reservas){
                if(r.getId().equals(reserva.getId())){
                    borrar=r;
                }
            }
            reservas.remove(borrar);
        }catch(Exception e){
            e.printStackTrace();
        }
        
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
            java.util.logging.Logger.getLogger(BorrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aaaain;
    private javax.swing.JTextField aaaaout;
    private javax.swing.JFormattedTextField apellido;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscarReserva;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField ddin;
    private javax.swing.JTextField ddout;
    private javax.swing.JLabel habText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mmin;
    private javax.swing.JTextField mmout;
    private javax.swing.JFormattedTextField nombre;
    private javax.swing.JFormattedTextField nroRes;
    private javax.swing.JLabel resExiste;
    private javax.swing.JFormattedTextField telefono;
    // End of variables declaration//GEN-END:variables
}
