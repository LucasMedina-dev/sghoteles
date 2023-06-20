package interfaces;

import com.clases.SystemManager;
import com.clases.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public String userTextEntered;
    public String userPassEntered;
    
    public Login() {
        initComponents();
        Dimension screenData=Toolkit.getDefaultToolkit().getScreenSize();
        int centerX=(int)screenData.getWidth()/2-(this.getWidth()/2);
        int centerY=(int)screenData.getHeight()/2-(this.getHeight()/2);
        this.setLocation(centerX, centerY);
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LoginDiv = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        passText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        setType(java.awt.Window.Type.POPUP);

        background.setBackground(new java.awt.Color(248, 249, 249));
        background.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        background.setMinimumSize(new java.awt.Dimension(600, 400));
        background.setPreferredSize(new java.awt.Dimension(600, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(174, 214, 241));

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SG Hoteles");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(174, 214, 241));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Argibel Franco\nAlvarez Facundo\nMedina Lucas\nLeoz Mauricio\nVera Nicolas");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        LoginDiv.setBackground(new java.awt.Color(248, 249, 249));

        LoginTitle.setBackground(new java.awt.Color(248, 249, 249));
        LoginTitle.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        LoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTitle.setText("LOGIN");
        LoginTitle.setAlignmentX(1.0F);
        LoginTitle.setAlignmentY(1.0F);

        userText.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(153, 153, 153));
        userText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userText.setText("Ingrese usuario");
        userText.setDisabledTextColor(new java.awt.Color(213, 213, 213));
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextMousePressed(evt);
            }
        });
        userText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userTextKeyTyped(evt);
            }
        });

        enter.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        enter.setText("Ingresar");
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMouseClicked(evt);
            }
        });

        passText.setForeground(java.awt.Color.gray);
        passText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passText.setText("********");
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTextMousePressed(evt);
            }
        });

        javax.swing.GroupLayout LoginDivLayout = new javax.swing.GroupLayout(LoginDiv);
        LoginDiv.setLayout(LoginDivLayout);
        LoginDivLayout.setHorizontalGroup(
            LoginDivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginDivLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LoginDivLayout.createSequentialGroup()
                .addGroup(LoginDivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(passText))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LoginDivLayout.setVerticalGroup(
            LoginDivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginDivLayout.createSequentialGroup()
                .addComponent(LoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText)
                .addGap(18, 18, 18)
                .addComponent(passText)
                .addGap(19, 19, 19)
                .addComponent(enter)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(LoginDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 250, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMousePressed
        if(userText.getText().equals("Ingrese usuario")){
            userText.setText("");
            userText.setForeground(Color.black);
        }
        if(String.valueOf(passText.getPassword()).equals("")){
            passText.setForeground(Color.gray);
            passText.setText("********");
        }
        
        
    }//GEN-LAST:event_userTextMousePressed

    private void passTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMousePressed
        if(String.valueOf(passText.getPassword()).equals("********")){
            passText.setForeground(Color.black);
            passText.setText("");
        }
        if(userText.getText().equals("")){
            userText.setForeground(Color.gray);
            userText.setText("Ingrese usuario");
        }
    }//GEN-LAST:event_passTextMousePressed

    private void enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseClicked
        userTextEntered=userText.getText();
        userPassEntered=String.valueOf(passText.getPassword());
        boolean validacion=false;
        Usuario usuarioIngresado= new Usuario(userTextEntered, userPassEntered);
        if(userTextEntered!=null && userPassEntered!=null){
            try {
                validacion= SystemManager.loguear(usuarioIngresado);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "Compruebe datos ingresados", ex);
            }
        }else{
            System.out.println("tirar pantalla de error, a crear");
        }
        if(validacion){
            this.setVisible(false);
            try {
                SystemManager.openApplication();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_enterMouseClicked

    private void userTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyTyped
        if(userText.getText().equals("Ingrese usuario")){
            userText.setText("");
            userText.setForeground(Color.black);
        }
    }//GEN-LAST:event_userTextKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginDiv;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JPanel background;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
