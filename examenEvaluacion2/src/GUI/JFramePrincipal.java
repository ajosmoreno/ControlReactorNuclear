package GUI;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author José Manuel Moreno Córdoba
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private ControladorPrincipal controladorPrincipal;
    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        //Inicializamos el controlador y desactivamos los botones que no podemos usar aún
        controladorPrincipal = new ControladorPrincipal(this);   
        jButtonSube.setEnabled(false);
        jButtonBaja.setEnabled(false);
        jButtonEmergencia.setEnabled(false);
        jTableBarras.setEnabled(false);
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
        jTextFieldBarras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLog = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jButtonSube = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBarras = new javax.swing.JTable();
        jButtonEmergencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control del reactor");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Barras");

        jTextFieldBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBarrasActionPerformed(evt);
            }
        });
        jTextFieldBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBarrasKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("log");

        jButtonIniciar.setText("INICIAR");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonSube.setText("SUBE");
        jButtonSube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubeActionPerformed(evt);
            }
        });

        jButtonBaja.setText("BAJA");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        jTableBarras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableBarras);

        jButtonEmergencia.setText("EMERGENCIA");
        jButtonEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmergenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonSube))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBaja)
                            .addComponent(jButtonIniciar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEmergencia, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButtonIniciar)
                        .addComponent(jTextFieldLog))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldBarras)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSube)
                    .addComponent(jButtonBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEmergencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBarrasActionPerformed

    /**
     * Método para comprobar que solo se escriben números en el campo de texto de las barras
     * @param evt Evento de escribir una tecla
     */
    private void jTextFieldBarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBarrasKeyTyped
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();
    }//GEN-LAST:event_jTextFieldBarrasKeyTyped

    /**
     * Método que inicializa la tabla
     * @param evt Evento al pulsar el botón Iniciar
     */
    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        controladorPrincipal.iniciar();
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    /**
     * Método para subir una barra
     * @param evt Evento al pulsar el botón SUBE 
     */
    private void jButtonSubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubeActionPerformed
        controladorPrincipal.subirBarra();
    }//GEN-LAST:event_jButtonSubeActionPerformed

    /**
     * Método para bajar una barra
     * @param evt Evento al pulsar el botón BAJA
     */
    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        controladorPrincipal.bajarBarra();
    }//GEN-LAST:event_jButtonBajaActionPerformed

    /**
     * Método para poner estado de emergencia
     * @param evt Evento al pusar botón EMERGENCIA
     */
    private void jButtonEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmergenciaActionPerformed
        controladorPrincipal.emergencia();
    }//GEN-LAST:event_jButtonEmergenciaActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonEmergencia;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonSube;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBarras;
    private javax.swing.JTextField jTextFieldBarras;
    private javax.swing.JTextField jTextFieldLog;
    // End of variables declaration//GEN-END:variables

    /**
     * Devuelve la tabla donde se almacenarán los datos
     * @return Tabla de los datos
     */
    public JTable getjTableBarras() {
        return jTableBarras;
    }

    /**
     * Devuelve el campo de texto de las barras
     * @return Campo de texto de las barras
     */
    public JTextField getjTextFieldBarras() {
        return jTextFieldBarras;
    }

    /**
     * Devuelve el campo de texto del archivo del log
     * @return Campo de texto del log
     */
    public JTextField getjTextFieldLog() {
        return jTextFieldLog;
    }

    /**
     * Muestra un error por pantalla
     * @param mensaje Mensaje de error que queremos mostrar
     */
    public void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "¡Ha ocurrido un error!", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra un mensaje por pantalla
     * @param mensaje Mensaje que queremos mostrar
     */
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Información", JOptionPane.DEFAULT_OPTION);
    }

    /**
     * Devuelve el botón de bajar una barra
     * @return Botón para bajar barra
     */
    public JButton getjButtonBaja() {
        return jButtonBaja;
    }

    /**
     * Devuelve el botón de emergencia
     * @return Botón para emergencia
     */
    public JButton getjButtonEmergencia() {
        return jButtonEmergencia;
    }

    /**
     * Devuelve el botón para iniciar la tabla
     * @return Botón para iniciar la tabla
     */
    public JButton getjButtonIniciar() {
        return jButtonIniciar;
    }

    /**
     * Devuelve el botón de subir una barra
     * @return Botón para subir barra
     */
    public JButton getjButtonSube() {
        return jButtonSube;
    }    
}
