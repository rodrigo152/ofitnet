/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.Menu1;
import Modelo.Usuario;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    private final JFXPanel jfxPanel = new JFXPanel();
    private MediaPlayer currentMediaPlayer;
    
    public Login() {
        initComponents();
        createScene();
        configuracionInicial();
        
        Placeholder(txta, "Ingrese su nombre de usuario");
        Placeholder(Password, "********");
        
         
        // Inicio del video
        video.setLayout(new BorderLayout());
        video.add(jfxPanel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        
    }
    
    //Metodos 
    //Inicio
    private void configuracionInicial() {
        setIconImage(new ImageIcon(getClass().getResource("/img/icono2.png")).getImage());
        setLocationRelativeTo(null);
    }
    
    //Estilos
    private void Placeholder(javax.swing.text.JTextComponent component, String placeholder) {
    // Color para el placeholder
    component.setForeground(Color.GRAY);
    // Lógica especial para JPasswordField
    if (component instanceof javax.swing.JPasswordField) {
        javax.swing.JPasswordField passwordField = (javax.swing.JPasswordField) component;
        passwordField.setEchoChar((char) 0); // Muestra el texto del placeholder
    }
    component.setText(placeholder);
    component.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            String currentValue = (component instanceof javax.swing.JPasswordField) ? 
                                    String.valueOf(((javax.swing.JPasswordField) component).getPassword()) : 
                                    component.getText();
            if (currentValue.equals(placeholder)) {
                component.setText("");
                component.setForeground(Color.BLACK);
                if (component instanceof javax.swing.JPasswordField) {
                    ((javax.swing.JPasswordField) component).setEchoChar('•');
                }
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            String currentValue = (component instanceof javax.swing.JPasswordField) ? 
                                    String.valueOf(((javax.swing.JPasswordField) component).getPassword()) : 
                                    component.getText();
            if (currentValue.isEmpty()) {
                component.setForeground(Color.GRAY);
                if (component instanceof javax.swing.JPasswordField) {
                    ((javax.swing.JPasswordField) component).setEchoChar((char) 0);
                }
                component.setText(placeholder);
            }
        }
    });
}
   
    // Video
    private void createScene() {
    Platform.runLater(() -> {
        try {
            String mediaPath = getClass().getResource("/Video/login1.mp4").toExternalForm();
            Media media = new Media(mediaPath);
            
            // Asigna el nuevo reproductor a la variable de la clase
            currentMediaPlayer = new MediaPlayer(media);

            MediaView mediaView = new MediaView(currentMediaPlayer); // Usa la variable de clase
            jfxPanel.setScene(new Scene(new Group(mediaView)));
            
            currentMediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            currentMediaPlayer.play();

        } catch (Exception e) {
            System.out.println("Error al cargar el video: " + e.getMessage());
        }
    });
}
    // Detener video y pasar a la siguiente hoja
    public void stopVideo() {
    if (currentMediaPlayer != null) {
        Platform.runLater(() -> currentMediaPlayer.stop());
    }
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        video = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btn1 = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        txta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        salida1 = new javax.swing.JPanel();
        salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(720, 516));
        setResizable(false);

        Principal.setPreferredSize(new java.awt.Dimension(720, 480));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        video.setPreferredSize(new java.awt.Dimension(720, 517));

        javax.swing.GroupLayout videoLayout = new javax.swing.GroupLayout(video);
        video.setLayout(videoLayout);
        videoLayout.setHorizontalGroup(
            videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        videoLayout.setVerticalGroup(
            videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        Principal.add(video, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 517));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Principal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 240, 10));

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Entrar");
        btn1.setAlignmentX(0.5F);
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setPreferredSize(new java.awt.Dimension(33, 50));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        Principal.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 240, 30));

        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setBorder(null);
        Password.setSelectionColor(new java.awt.Color(57, 145, 167));
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordMousePressed(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Principal.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 190, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Principal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 240, 13));

        txta.setForeground(new java.awt.Color(204, 204, 204));
        txta.setBorder(null);
        txta.setPreferredSize(new java.awt.Dimension(64, 14));
        txta.setSelectionColor(new java.awt.Color(57, 145, 167));
        txta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtaMousePressed(evt);
            }
        });
        txta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaActionPerformed(evt);
            }
        });
        Principal.add(txta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login5.png"))); // NOI18N
        Principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 520));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.setPreferredSize(new java.awt.Dimension(720, 18));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        salida1.setBackground(new java.awt.Color(255, 255, 255));
        salida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salida1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salida1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salida1MouseEntered(evt);
            }
        });

        salida.setBackground(new java.awt.Color(255, 255, 255));
        salida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salida.setText("   X");
        salida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salidaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salidaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salidaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout salida1Layout = new javax.swing.GroupLayout(salida1);
        salida1.setLayout(salida1Layout);
        salida1Layout.setHorizontalGroup(
            salida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salida1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        salida1Layout.setVerticalGroup(
            salida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 695, Short.MAX_VALUE)
                .addComponent(salida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Principal.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
       
    }//GEN-LAST:event_btn1MouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salidaMouseClicked

    private void salidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseEntered
        salida1.setBackground(Color.red);
        salida1.setForeground(Color.black);
    }//GEN-LAST:event_salidaMouseEntered

    private void salidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseExited
        salida1.setBackground(Color.white);
        salida1.setForeground(Color.black);
    }//GEN-LAST:event_salidaMouseExited

    private void salida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salida1MouseClicked
        
    }//GEN-LAST:event_salida1MouseClicked

    private void salida1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salida1MouseEntered
        
    }//GEN-LAST:event_salida1MouseEntered

    private void salida1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salida1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salida1MouseExited

    private void txtaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaMousePressed
        
        
    }//GEN-LAST:event_txtaMousePressed

    private void PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMousePressed
        
    }//GEN-LAST:event_PasswordMousePressed

    private void txtaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaMouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       String usuarioIngresado = txta.getText().trim();
        String passIngresado = new String(Password.getPassword()).trim(); 

        // Validamos que no intenten entrar con los campos vacíos o con el texto del placeholder
        if (usuarioIngresado.isEmpty() || usuarioIngresado.equals("Ingrese su nombre de usuario") || passIngresado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese sus datos.", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // --- INICIO DE VALIDACIÓN LOCAL (SIN BASE DE DATOS) ---
        boolean encontrado = false;
        String rol = "";

        // Credenciales estáticas para Administrador
        if ((usuarioIngresado.equals("admin") || usuarioIngresado.equals("admin@softkey.com")) && passIngresado.equals("12345678")) {
            encontrado = true;
            rol = "ADMIN";
        } 
        // Credenciales estáticas para Cliente
        else if (usuarioIngresado.equals("cliente") && passIngresado.equals("12345678")) {
            encontrado = true;
            rol = "CLIENTE";
        }
        // --- FIN DE VALIDACIÓN LOCAL ---

        if (encontrado) {
            stopVideo();
            Vista.Menu1 menu = new Vista.Menu1(); 
            
            // Asignamos el rol según la validación local
            menu.asignarRol(rol);
            
            menu.setVisible(true);
            dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta", "Error de Acceso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btn1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel salida;
    private javax.swing.JPanel salida1;
    private javax.swing.JTextField txta;
    private javax.swing.JPanel video;
    // End of variables declaration//GEN-END:variables
}
