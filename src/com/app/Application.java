package com.app;

import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Application extends javax.swing.JFrame {

    /**
     * Creates new form application
     */
    private final int leftPanelWidth;
    public Application() {
        initComponents();
        Dimension screenData=Toolkit.getDefaultToolkit().getScreenSize();
        int centerX=(int)screenData.getWidth()/2-(this.getWidth()/2);
        int centerY=(int)screenData.getHeight()/2-(this.getHeight()/2);
        this.setLocation(centerX, centerY);
        this.leftPanelWidth=leftPanel.getWidth();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ReceptionButton = new javax.swing.JButton();
        paxPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        background.setBackground(java.awt.Color.white);
        background.setPreferredSize(new java.awt.Dimension(800, 600));

        leftPanel.setBackground(new java.awt.Color(174, 214, 241));
        leftPanel.setToolTipText("");
        leftPanel.setPreferredSize(new java.awt.Dimension(200, 600));
        leftPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftPanelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SG Hoteles");

        ReceptionButton.setText("Recepcion");
        ReceptionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceptionButtonMouseClicked(evt);
            }
        });
        ReceptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceptionButtonActionPerformed(evt);
            }
        });

        paxPanel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        paxPanel.setName(""); // NOI18N
        paxPanel.setPreferredSize(new java.awt.Dimension(100, 0));

        jLabel2.setText("Ingresar pax");

        jLabel3.setText("Checkout");

        javax.swing.GroupLayout paxPanelLayout = new javax.swing.GroupLayout(paxPanel);
        paxPanel.setLayout(paxPanelLayout);
        paxPanelLayout.setHorizontalGroup(
            paxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paxPanelLayout.createSequentialGroup()
                .addGroup(paxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paxPanelLayout.setVerticalGroup(
            paxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paxPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(paxPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(ReceptionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReceptionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 600, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceptionButtonActionPerformed
        
    }//GEN-LAST:event_ReceptionButtonActionPerformed

    private void ReceptionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceptionButtonMouseClicked
        if(paxPanel.getHeight()==0){
            paxPanel.setSize(paxPanel.getWidth(), 100);
        }else{
            paxPanel.setSize(paxPanel.getWidth(), 0);
        }
    }//GEN-LAST:event_ReceptionButtonMouseClicked
    private void closeAll(){
        paxPanel.setSize(leftPanelWidth, 0);
    }
    
    private void leftPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPanelMouseClicked

    }//GEN-LAST:event_leftPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReceptionButton;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel paxPanel;
    // End of variables declaration//GEN-END:variables
}
