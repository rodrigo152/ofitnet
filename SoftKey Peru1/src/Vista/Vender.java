
package Vista;

import Modelo.TablaHas;
import Modelo.Licencia;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vender extends javax.swing.JFrame {

   TablaHas licencia = new TablaHas(101);
    public Vender() {
        initComponents();
        configuracionInicial();
        llenarComboBox();
    }
    //Metodos
    private void configuracionInicial() {
        setIconImage(new ImageIcon(getClass().getResource("/img/icono2.png")).getImage());
        setTitle("Ventas");
        setLocationRelativeTo(null);
    }
      // Tu método para llenar el ComboBox 
    private void llenarComboBox() {
        contenedor1.removeAllItems();
        // bucle
        for (Licencia lic : licencia.getTodasLasLicencias()) {
            contenedor1.addItem(lic.getCodigo());
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contenedor1 = new javax.swing.JComboBox<>();
        contenedor3 = new javax.swing.JPanel();
        respuesta3 = new javax.swing.JLabel();
        respuesta4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        imgP = new javax.swing.JLabel();
        btnr = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(595, 538));
        setResizable(false);

        Panelp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");
        Panelp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio(S/):");
        Panelp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Meses:");
        Panelp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, 30));

        contenedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contenedor1ActionPerformed(evt);
            }
        });
        Panelp.add(contenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, 30));

        respuesta3.setBackground(new java.awt.Color(255, 255, 255));
        respuesta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout contenedor3Layout = new javax.swing.GroupLayout(contenedor3);
        contenedor3.setLayout(contenedor3Layout);
        contenedor3Layout.setHorizontalGroup(
            contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        contenedor3Layout.setVerticalGroup(
            contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Panelp.add(contenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, 30));
        Panelp.add(respuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, 30));

        txta.setEditable(false);
        txta.setColumns(20);
        txta.setRows(5);
        jScrollPane1.setViewportView(txta);

        Panelp.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 520, 190));

        imgP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/licencias/c1.jpg"))); // NOI18N
        Panelp.add(imgP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 220, 130));

        btnr.setBackground(new java.awt.Color(57, 145, 167));
        btnr.setText("Vender");
        btnr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrActionPerformed(evt);
            }
        });
        Panelp.add(btnr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 210, -1));

        btnc.setBackground(new java.awt.Color(57, 145, 167));
        btnc.setText("Cerrar");
        btnc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        Panelp.add(btnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 210, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo12.png"))); // NOI18N
        Panelp.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventanas.png"))); // NOI18N
        Panelp.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

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

    private void contenedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contenedor1ActionPerformed
         // Asegurarse de que hay un ítem seleccionado
    if (contenedor1.getSelectedItem() == null) {
        return;
    }
    // Obtener el código de la licencia seleccionada
    String codigoSeleccionado = (String) contenedor1.getSelectedItem();
    // Usar el método 'buscar' para encontrar la licencia (¡Mucho más eficiente!)
    //    Asumo que tu variable se llama 'gestorLicencias' o 'li'
    Licencia l = licencia.buscar(codigoSeleccionado);
    // Si se encontró la licencia (no es null), actualizar la interfaz
    if (l != null) {
        // Rellenar los JLabels con los datos de la licencia encontrada
        respuesta3.setText("S/ " + String.format("%.2f", l.getPrecio())); // Formatear precio
        // Mostrar la imagen correspondiente usando el switch
        ImageIcon icono;
        String rutaImagen = "/img/licencias/default.jpg"; // Una imagen por defecto
        switch (l.getCodigo()) {
            case "OFF365-001":  rutaImagen = "/img/licencias/c1.jpg";  break;
            case "WIN11-002":   rutaImagen = "/img/licencias/c2.jpg";  break;
            case "KASP-003":    rutaImagen = "/img/licencias/c3.jpg";  break;
            case "ADOBE-004":   rutaImagen = "/img/licencias/c4.jpg";  break;
            case "AUTOCAD-005": rutaImagen = "/img/licencias/c5.png";  break;
            case "NORTON-006":  rutaImagen = "/img/licencias/c6.jpg";  break;
            case "VSPRO-007":   rutaImagen = "/img/licencias/c7.png";  break;
            case "COREL-008":   rutaImagen = "/img/licencias/c8.jpg";  break;
            case "MSPROJ-009":  rutaImagen = "/img/licencias/c9.png";  break;
            case "VMWARE-010":  rutaImagen = "/img/licencias/c10.png"; break;
        }
        icono = new ImageIcon(getClass().getResource(rutaImagen));
        // Escalar imagen para que se ajuste al JLabel
        Image imagen = icono.getImage().getScaledInstance(imgP.getWidth(), imgP.getHeight(), Image.SCALE_SMOOTH);
        imgP.setIcon(new ImageIcon(imagen));
    }
    }//GEN-LAST:event_contenedor1ActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        dispose();
    }//GEN-LAST:event_btncActionPerformed

    private void btnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrActionPerformed
   // 1. OBTENER EL CÓDIGO SELECCIONADO
    if (contenedor1.getSelectedItem() == null) {
        txta.setText("Error: Por favor, seleccione una licencia.");
        return;
    }
    String codigoSeleccionado = contenedor1.getSelectedItem().toString();
    Licencia reporte = licencia.buscar(codigoSeleccionado);
    // 2. VALIDAR LA CANTIDAD DE MESES Y REALIZAR CÁLCULOS
    try {
        int meses = Integer.parseInt(respuesta4.getText());
        if (meses <= 0) {
            txta.setText("Error: La cantidad de meses debe ser mayor a cero.");
            return;
        }
        // 3. REALIZAR TODOS LOS CÁLCULOS
        double precioUnitario = reporte.getPrecio();
        double importeCompra = precioUnitario * meses; // Usamos una sola variable para el total
        double importeDescuento = licencia.calcularImporteDescuento(meses, importeCompra);
        double importeAPagar = importeCompra - importeDescuento;
        String obsequioFinal = licencia.determinarObsequio(meses);
        // 4. MOSTRAR EL REPORTE DE LA VENTA EN EL JTEXTAREA
        txta.append("--- BOLETA DE VENTA ---\n");
        txta.append("Código: " + reporte.getCodigo() + "\n");
        txta.append("Producto: " + reporte.getNombre() + "\n");
        txta.append("Precio por Mes: S/ " + String.format("%.2f", precioUnitario) + "\n");
        txta.append("Meses Adquiridos: " + meses + "\n");
        txta.append("Soporte Técnico: " + reporte.getSoportetecnico() + "\n");
        txta.append("Actualizaciones: " + reporte.getActualizaciones() + "\n");
        txta.append("Importe de Compra: S/ " + String.format("%.2f", importeCompra) + "\n");
        txta.append("Importe Descuento: S/ " + String.format("%.2f", importeDescuento) + "\n");
        txta.append("Importe a Pagar: S/ " + String.format("%.2f", importeAPagar) + "\n");
        txta.append("Obsequio: " + obsequioFinal + "\n");
        txta.append("----------------------------------\n" );     
        //  LÓGICA PARA EL REPORTE CADA 5 VENTAS     
        // 1. Actualizar los contadores globales
        licencia.contadorDeVentas++;
        licencia.importeTotalAcumulado += importeAPagar;
        // 2. Comprobar si es la quinta venta (usando el operador módulo %)
        if (licencia.contadorDeVentas % 5 == 0) {        
            // 3. Calcular el porcentaje de la cuota diaria
            double porcentajeCuota = (licencia.importeTotalAcumulado / licencia.CUOTA_DIARIA) * 100;
            // 4. Construir el mensaje para la ventana emergente
            String mensaje = "--- REPORTE DE VENTAS ACUMULADAS ---\n\n" +
                             "Venta Actual N°: " + licencia.contadorDeVentas + "\n" +
                             "Importe Total Acumulado: S/ " + String.format("%.2f", licencia.importeTotalAcumulado) + "\n" +
                             "Porcentaje de Cuota Diaria: " + String.format("%.2f", porcentajeCuota) + "%\n\n" +
                             "---------------------------------";
            // 5. Mostrar el mensaje en la ventana
            JOptionPane.showMessageDialog(this, mensaje, "Reporte Acumulado", JOptionPane.INFORMATION_MESSAGE);
        }       
    } catch (NumberFormatException e) {
        // Muestra un error si lo que se escribió no es un número
        txta.setText("Error: Por favor, ingrese una cantidad de meses válida.");
    }
    }//GEN-LAST:event_btnrActionPerformed

   
    
    
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
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelp;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnr;
    private javax.swing.JComboBox<String> contenedor1;
    private javax.swing.JPanel contenedor3;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imgP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel respuesta3;
    private javax.swing.JTextField respuesta4;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables
}
