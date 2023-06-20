package interfaces.panelHabitaciones;

import com.clases.Cliente;
import com.clases.Estado;
import com.clases.Habitacion;
import java.awt.Color;

public class ElementoHabitacion extends javax.swing.JPanel {

    public ElementoHabitacion(Habitacion hab) {
        initComponents();
        habNumber.setText(hab.getNumHab());
        setBackgroundStatus(hab);
        setChecks(hab);
    }
    private void setBackgroundStatus(Habitacion hab){
        if(hab.getEstado()==Estado.ocupada){
            habBackground.setBackground(Color.red);
        }else if(hab.getEstado()==Estado.mantenimiento){
            habBackground.setBackground(Color.gray);
        }else{
            habBackground.setBackground(Color.green);
        }
    }
    private void setChecks(Habitacion hab){
        String nextIn=hab.getNextIn();
        if(nextIn!=null){
            
            inData.setText("In: "+nextIn.toString());
        }
        
        if(hab.getEstadia()!=null){
            Cliente cliente= hab.getEstadia().getCliente();
            String nombreCompleto = cliente.getNombre() + " " + cliente.getApellido();
            nombrePax.setText(nombreCompleto);
            outData.setText("Out: "+String.valueOf(hab.getEstadia().getCheckOut()));
        }else{
            outData.setText("Out: ");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        habBackground = new javax.swing.JPanel();
        habNumber = new javax.swing.JLabel();
        inData = new javax.swing.JLabel();
        nombrePax = new javax.swing.JLabel();
        outData = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(85, 100));
        setPreferredSize(new java.awt.Dimension(85, 100));

        habBackground.setBackground(java.awt.Color.white);
        habBackground.setMinimumSize(new java.awt.Dimension(85, 100));
        habBackground.setPreferredSize(new java.awt.Dimension(85, 100));
        habBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        habNumber.setText("Hab");
        habBackground.add(habNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        inData.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        inData.setText("CheckIn");
        habBackground.add(inData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        nombrePax.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        nombrePax.setText("nombrePax");
        habBackground.add(nombrePax, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        outData.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        outData.setText("CheckOut");
        habBackground.add(outData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(habBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(habBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel habBackground;
    private javax.swing.JLabel habNumber;
    private javax.swing.JLabel inData;
    private javax.swing.JLabel nombrePax;
    private javax.swing.JLabel outData;
    // End of variables declaration//GEN-END:variables
}
