
package Vista;

import Modelo.TablaHas;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Configuracion extends javax.swing.JFrame {

    private JMenuItem mniDescuento;
    private JMenuItem mniObsequio;
    private CardLayout cardLayout; 
    
    public Configuracion() {
        initComponents();
        cargarValoresActuales();
        crearMenu();
        configuracionInicial();
        configurarPaneles();
        
    }
    //Metodos
    private void configuracionInicial() {
        setIconImage(new ImageIcon(getClass().getResource("/img/icono2.png")).getImage());
        setTitle("Configuración");
        setLocationRelativeTo(null);
    }
    private void configurarPaneles() {
        cardLayout = new CardLayout();
        Panelp.setLayout(cardLayout);
        Panelp.add(ConfiDescuento, "Descuentos");
        Panelp.add(ConfiObsequio, "Obsequios");
    }
    private void crearMenu() {
        final Color mcolor = new Color(87, 90, 95);
        final Color colorHover = new Color(57, 145, 167); // Un gris más claro para el hover
        mniDescuento = new JMenuItem(" Configurar Descuentos ", getIcono("/img/descuento.png"));
        mniObsequio = new JMenuItem(" Configurar Obsequios ", getIcono("/img/obsequio.png"));        
        // Reutilización de código para dar estilo
        configurarEstiloMenu(mniDescuento, mcolor, colorHover);
        configurarEstiloMenu(mniObsequio, mcolor, colorHover);
        Menup.add(mniDescuento);
        Menup.add(mniObsequio);
        // Uso de CardLayout para cambiar vistas de forma eficiente
        mniDescuento.addActionListener(e -> cardLayout.show(Panelp, "Descuentos"));
        mniObsequio.addActionListener(e -> cardLayout.show(Panelp, "Obsequios"));
    }
     private void configurarEstiloMenu(JMenuItem item, Color mcolor, Color colorHover) {
        item.setOpaque(true);
        item.setBackground(mcolor);
        item.setForeground(Color.white);
         item.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            item.setBackground(colorHover);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            item.setBackground(mcolor);
        }
    });
    }
    //Definicion de el ancho y alto de las imagenes
    private Icon getIcono(String ruta){
    return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
    .getImage().getScaledInstance(30, 30, 0));}
    private void cargarValoresActuales() {
    // Carga los valores actuales de los descuentos
    txt1.setText(String.valueOf(TablaHas.porcentaje1));
    txt2.setText(String.valueOf(TablaHas.porcentaje2));
    txt3.setText(String.valueOf(TablaHas.porcentaje3));
    txt4.setText(String.valueOf(TablaHas.porcentaje4));
    
    // Carga los valores actuales de los obsequios
    txto1.setText(TablaHas.obsequio1);
    txto2.setText(TablaHas.obsequio2);
    txto3.setText(TablaHas.obsequio3);
}

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelp = new javax.swing.JPanel();
        ConfiDescuento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        btnd1 = new javax.swing.JButton();
        btnd2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        ConfiObsequio = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txto1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txto2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txto3 = new javax.swing.JTextField();
        btno1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        Menup = new javax.swing.JMenuBar();

        setResizable(false);

        ConfiDescuento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1 a 5 unidades");
        ConfiDescuento.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, 30));
        ConfiDescuento.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("11 a 15 unidades");
        ConfiDescuento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 30));
        ConfiDescuento.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("6 a 10 unidades");
        ConfiDescuento.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 120, 20));
        ConfiDescuento.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mas de 15 unidades");
        ConfiDescuento.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 30));
        ConfiDescuento.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 130, 30));

        btnd1.setBackground(new java.awt.Color(57, 145, 167));
        btnd1.setText("Aceptar");
        btnd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnd1ActionPerformed(evt);
            }
        });
        ConfiDescuento.add(btnd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 160, 30));

        btnd2.setBackground(new java.awt.Color(57, 145, 167));
        btnd2.setText("Cancelar");
        btnd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnd2ActionPerformed(evt);
            }
        });
        ConfiDescuento.add(btnd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("%");
        ConfiDescuento.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 20, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("%");
        ConfiDescuento.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 20, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("%");
        ConfiDescuento.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 20, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("%");
        ConfiDescuento.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 20, 30));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo12.png"))); // NOI18N
        ConfiDescuento.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 50));

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventanas.png"))); // NOI18N
        ConfiDescuento.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ConfiObsequio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("1 unidad");
        ConfiObsequio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 30));
        ConfiObsequio.add(txto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 240, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("2 a 5 unidades");
        ConfiObsequio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 30));
        ConfiObsequio.add(txto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 240, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("6 a mas unidades");
        ConfiObsequio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 30));
        ConfiObsequio.add(txto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 240, 30));

        btno1.setBackground(new java.awt.Color(57, 145, 167));
        btno1.setText("Aceptar");
        btno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btno1ActionPerformed(evt);
            }
        });
        ConfiObsequio.add(btno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, 30));

        jButton2.setBackground(new java.awt.Color(57, 145, 167));
        jButton2.setText("Cancelar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ConfiObsequio.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 140, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo12.png"))); // NOI18N
        ConfiObsequio.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventanas.png"))); // NOI18N
        ConfiObsequio.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout PanelpLayout = new javax.swing.GroupLayout(Panelp);
        Panelp.setLayout(PanelpLayout);
        PanelpLayout.setHorizontalGroup(
            PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfiDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConfiObsequio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelpLayout.setVerticalGroup(
            PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfiDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConfiObsequio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(Menup);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnd2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnd2ActionPerformed

    private void btno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btno1ActionPerformed
    // 1. Leer los nombres de los obsequios de los campos de texto
    String obs1 = txto1.getText();
    String obs2 = txto2.getText();
    String obs3 = txto3.getText();

    // 2. Validar que los campos no estén vacíos
    if (obs1.trim().isEmpty() || obs2.trim().isEmpty() || obs3.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Error: Ningún campo de obsequio puede estar vacío.", "Error de validación", JOptionPane.ERROR_MESSAGE);
        return; // Detiene la ejecución si algún campo está vacío
    }

    // 3. Guardar los nuevos nombres en las variables estáticas
    TablaHas.obsequio1 = obs1;
    TablaHas.obsequio2 = obs2;
    TablaHas.obsequio3 = obs3;

    // 4. Informar al usuario y cerrar la ventana
    JOptionPane.showMessageDialog(this, "Obsequios actualizados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    dispose(); // Cierra la ventana de configuración
    }//GEN-LAST:event_btno1ActionPerformed

    private void btnd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnd1ActionPerformed
        try {
        // 1. Leer los valores de los campos de texto
        double p1 = Double.parseDouble(txt1.getText());
        double p2 = Double.parseDouble(txt2.getText());
        double p3 = Double.parseDouble(txt3.getText());
        double p4 = Double.parseDouble(txt4.getText());

        // 2. Guardar los nuevos valores en las variables estáticas
        // Se divide entre 100 si el usuario ingresa "5" para 5%
        // Si el usuario ya ingresa "0.05", puedes quitar la división / 100.0
        // Por tu imagen, parece que el usuario ingresa el decimal directamente.
        
        TablaHas.porcentaje1 = p1;
        TablaHas.porcentaje2 = p2;
        TablaHas.porcentaje3 = p3;
        TablaHas.porcentaje4 = p4;

        // 3. Informar al usuario y cerrar la ventana
        JOptionPane.showMessageDialog(this, "Descuentos actualizados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        dispose(); // Cierra la ventana de configuración

    } catch (NumberFormatException e) {
        // Si el usuario escribe texto en lugar de números, muestra un error
        JOptionPane.showMessageDialog(this, "Error: Ingrese solo valores numéricos para los porcentajes.", "Error de formato", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnd1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfiDescuento;
    private javax.swing.JPanel ConfiObsequio;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuBar Menup;
    private javax.swing.JPanel Panelp;
    private javax.swing.JButton btnd1;
    private javax.swing.JButton btnd2;
    private javax.swing.JButton btno1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo2;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txto1;
    private javax.swing.JTextField txto2;
    private javax.swing.JTextField txto3;
    // End of variables declaration//GEN-END:variables
}
