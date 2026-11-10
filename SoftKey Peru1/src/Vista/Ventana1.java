package Vista;
import Modelo.Licencia;

import Modelo.TablaHas;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana1 extends javax.swing.JFrame {

    private JMenuItem mniListar;
     private JMenuItem mniConsultar;
     private JMenuItem mniModificar;
     private DefaultTableModel modelo;
     TablaHas li = new TablaHas(101);
     private CardLayout cardLayout;
     private String rolActual = "CLIENTE";
    public Ventana1() {
        initComponents();
        ta.setFillsViewportHeight(true);
        scroll.setViewportView(ta);
        modelo=new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Licencia");
        modelo.addColumn("Precio");
        modelo.addColumn("N° Usuarios");
        modelo.addColumn("Meses");
        modelo.addColumn("Servicios");
        modelo.addColumn("Updates");
        ta.setModel(modelo);
        crearMenu();
        configuracionInicial();
        configurarPaneles();
        llenarComboBox();
    }
    
    /**
     * Configura propiedades básicas de la ventana (título, ícono, etc.).
     */
    private void configuracionInicial() {
        setIconImage(new ImageIcon(getClass().getResource("/img/icono2.png")).getImage());
        setTitle("Mantenimiento de Licencias de Software");
        setLocationRelativeTo(null);
    }
    /**
     * Prepara el panel principal con CardLayout para vistas dinámicas.
     */
    private void configurarPaneles() {
        cardLayout = new CardLayout();
        Panelp.setLayout(cardLayout);
        Panelp.add(Listar, "LISTAR");
        Panelp.add(Consultar, "CONSULTAR");
        Panelp.add(Modificar, "MODIFICAR");
    }
    
    /**
     * Crea los ítems del menú, les da estilo y asigna sus acciones.
     */
    private void crearMenu() {
        final Color mcolor = new Color(87, 90, 95);
        final Color colorHover = new Color(57, 145, 167); // Un gris más claro para el hover
        
        mniListar = new JMenuItem(" Listar Software ", getIcono("/img/listar.png"));
        mniConsultar = new JMenuItem(" Consultar Software ", getIcono("/img/consulta.png"));
        mniModificar = new JMenuItem(" Modificar Software", getIcono("/img/modificar.png"));

        // Reutilización de código para dar estilo
        configurarEstiloMenu(mniListar, mcolor, colorHover);
        configurarEstiloMenu(mniConsultar, mcolor, colorHover);
        configurarEstiloMenu(mniModificar, mcolor, colorHover);

        Menup.add(mniListar);
        Menup.add(mniConsultar);
        Menup.add(mniModificar);

        // Uso de CardLayout para cambiar vistas de forma eficiente
        mniListar.addActionListener(e -> cardLayout.show(Panelp, "LISTAR"));
        mniConsultar.addActionListener(e -> cardLayout.show(Panelp, "CONSULTAR"));
        mniModificar.addActionListener(e -> cardLayout.show(Panelp, "MODIFICAR"));
    }
    
    /**
     * Método de ayuda para no repetir el código de estilo de los menús.
     */
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

    
    // Tu método para llenar el ComboBox
    private void llenarComboBox() {
        contenedor1.removeAllItems();
        
      
        for (Licencia lic : li.getTodasLasLicencias()) { 
            contenedor1.addItem(lic.getCodigo());
        }
    }
   // --- PEGA ESTO EN VENTANA1.JAVA ---
    
    public void asignarRol(String rol) {
        // Si el usuario es CLIENTE (Vendedor)
        if (rol.equals("CLIENTE")) {
            // Desactiva los botones de gestión
            // ¡IMPORTANTE!: Verifica que tus botones se llamen así (btna, btnc, etc.)
            // Si tienen otro nombre, cámbialo aquí.
            if (btna != null) btna.setEnabled(false);   
            if (btnac != null) btnac.setEnabled(false);  
            if (btnc != null) btnc.setEnabled(false);   
            if (btnda != null) btnda.setEnabled(false);  
            
            this.setTitle("SoftKey Peru - Modo Vendedor");
        } else {
            // Si es ADMIN, no hacemos nada (ve todo)
            this.setTitle("SoftKey Peru - Modo Administrador");
        }
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelp = new javax.swing.JPanel();
        Modificar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        ta = new javax.swing.JTable();
        btnl = new javax.swing.JButton();
        btna = new javax.swing.JButton();
        btnda = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        caja1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        caja2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        caja3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        caja4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        caja5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        caja6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        caja7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnac = new javax.swing.JButton();
        logo3 = new javax.swing.JLabel();
        fonod3 = new javax.swing.JLabel();
        Listar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Consultar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contenedor1 = new javax.swing.JComboBox<>();
        imgP = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        contenedor3 = new javax.swing.JPanel();
        respuesta3 = new javax.swing.JLabel();
        contenedor4 = new javax.swing.JPanel();
        respuesta4 = new javax.swing.JLabel();
        contenedor2 = new javax.swing.JPanel();
        respuesta2 = new javax.swing.JLabel();
        contenedor5 = new javax.swing.JPanel();
        respuesta5 = new javax.swing.JLabel();
        contenedor6 = new javax.swing.JPanel();
        respuesta6 = new javax.swing.JLabel();
        contenedor7 = new javax.swing.JPanel();
        respuesta7 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        Menup = new javax.swing.JMenuBar();

        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        Panelp.setPreferredSize(new java.awt.Dimension(580, 460));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scroll.setViewportView(ta);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 550, 210));

        btnl.setBackground(new java.awt.Color(57, 145, 167));
        btnl.setText("Listar");
        btnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlActionPerformed(evt);
            }
        });
        jPanel1.add(btnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, -1));

        btna.setBackground(new java.awt.Color(57, 145, 167));
        btna.setText("Añadir");
        btna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaActionPerformed(evt);
            }
        });
        jPanel1.add(btna, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 240, -1));

        btnda.setBackground(new java.awt.Color(57, 145, 167));
        btnda.setText("Delete All");
        btnda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaActionPerformed(evt);
            }
        });
        jPanel1.add(btnda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 240, -1));

        btnc.setBackground(new java.awt.Color(57, 145, 167));
        btnc.setText("Delete code");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        jPanel1.add(btnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 240, -1));
        jPanel1.add(caja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 160, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Código:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, -1));
        jPanel1.add(caja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 160, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Licencia:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, -1));
        jPanel1.add(caja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 160, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 40, -1));
        jPanel1.add(caja4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 160, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("N° Usuarios:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel1.add(caja5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 180, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Meses:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 50, 20));
        jPanel1.add(caja6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 180, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Servicios:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 310, 60, -1));
        jPanel1.add(caja7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 180, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Updates:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        btnac.setBackground(new java.awt.Color(57, 145, 167));
        btnac.setText("Actualizar");
        btnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacActionPerformed(evt);
            }
        });
        jPanel1.add(btnac, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 240, -1));

        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo12.png"))); // NOI18N
        jPanel1.add(logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        fonod3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventanas.png"))); // NOI18N
        jPanel1.add(fonod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar);
        Modificar.setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Listar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txta.setEditable(false);
        txta.setColumns(20);
        txta.setRows(5);
        txta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txta);

        Listar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 480, 330));

        btn2.setBackground(new java.awt.Color(57, 145, 167));
        btn2.setText("Listar");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        Listar.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 180, -1));

        btn1.setBackground(new java.awt.Color(57, 145, 167));
        btn1.setText("Cerrar");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        Listar.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo12.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Listar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventanas.png"))); // NOI18N
        Listar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Consultar.setPreferredSize(new java.awt.Dimension(580, 460));
        Consultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo:");
        Consultar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");
        Consultar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre del Software:");
        Consultar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Duración:");
        Consultar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("N° de Usuarios:");
        Consultar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        contenedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contenedor1ActionPerformed(evt);
            }
        });
        Consultar.add(contenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 250, -1));

        imgP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/licencias/c1.jpg"))); // NOI18N
        Consultar.add(imgP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 250, 150));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo12.png"))); // NOI18N
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consultar.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Soporte Tecnico:");
        Consultar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Actualizaciones:");
        Consultar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        respuesta3.setBackground(new java.awt.Color(255, 255, 255));
        respuesta3.setText(" ");
        respuesta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout contenedor3Layout = new javax.swing.GroupLayout(contenedor3);
        contenedor3.setLayout(contenedor3Layout);
        contenedor3Layout.setHorizontalGroup(
            contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        contenedor3Layout.setVerticalGroup(
            contenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor3Layout.createSequentialGroup()
                .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Consultar.add(contenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 250, 20));

        respuesta4.setBackground(new java.awt.Color(255, 255, 255));
        respuesta4.setText(" ");
        respuesta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout contenedor4Layout = new javax.swing.GroupLayout(contenedor4);
        contenedor4.setLayout(contenedor4Layout);
        contenedor4Layout.setHorizontalGroup(
            contenedor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        contenedor4Layout.setVerticalGroup(
            contenedor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor4Layout.createSequentialGroup()
                .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Consultar.add(contenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 250, 20));

        respuesta2.setBackground(new java.awt.Color(255, 255, 255));
        respuesta2.setText(" ");
        respuesta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout contenedor2Layout = new javax.swing.GroupLayout(contenedor2);
        contenedor2.setLayout(contenedor2Layout);
        contenedor2Layout.setHorizontalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        contenedor2Layout.setVerticalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Consultar.add(contenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 250, 20));

        respuesta5.setBackground(new java.awt.Color(255, 255, 255));
        respuesta5.setText(" ");
        respuesta5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout contenedor5Layout = new javax.swing.GroupLayout(contenedor5);
        contenedor5.setLayout(contenedor5Layout);
        contenedor5Layout.setHorizontalGroup(
            contenedor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        contenedor5Layout.setVerticalGroup(
            contenedor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor5Layout.createSequentialGroup()
                .addComponent(respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Consultar.add(contenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 250, 20));

        respuesta6.setBackground(new java.awt.Color(255, 255, 255));
        respuesta6.setText(" ");
        respuesta6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout contenedor6Layout = new javax.swing.GroupLayout(contenedor6);
        contenedor6.setLayout(contenedor6Layout);
        contenedor6Layout.setHorizontalGroup(
            contenedor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        contenedor6Layout.setVerticalGroup(
            contenedor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor6Layout.createSequentialGroup()
                .addComponent(respuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Consultar.add(contenedor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 250, 20));

        respuesta7.setBackground(new java.awt.Color(255, 255, 255));
        respuesta7.setText(" ");
        respuesta7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout contenedor7Layout = new javax.swing.GroupLayout(contenedor7);
        contenedor7.setLayout(contenedor7Layout);
        contenedor7Layout.setHorizontalGroup(
            contenedor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respuesta7, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        contenedor7Layout.setVerticalGroup(
            contenedor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor7Layout.createSequentialGroup()
                .addComponent(respuesta7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Consultar.add(contenedor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventanas.png"))); // NOI18N
        Consultar.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout PanelpLayout = new javax.swing.GroupLayout(Panelp);
        Panelp.setLayout(PanelpLayout);
        PanelpLayout.setHorizontalGroup(
            PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelpLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelpLayout.setVerticalGroup(
            PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelpLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Menup.setBackground(new java.awt.Color(87, 90, 95));
        Menup.setForeground(new java.awt.Color(255, 255, 255));
        setJMenuBar(Menup);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelp, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelp, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txta.setText(""); 

       
        
        for (Licencia a : li.getTodasLasLicencias()) {
            listado(a);           // imprimes sus datos
            imprimir("------------------------------------------");
        }
    }//GEN-LAST:event_btn2ActionPerformed
void listado (Licencia x){
    imprimir("Codigo: "+x.getCodigo());
    imprimir("Nombre del Producto: "+x.getNombre());
    imprimir("Duración:"+x.getDuracion());
    imprimir("Soporte Tecnico:"+x.getSoportetecnico());
    imprimir("Numero de Usuarios:"+x.getNusuarios());
    imprimir("Actualizaciones:"+x.getActualizaciones());
    imprimir("Precio:"+x.getPrecio());
    imprimir("Precio Total:"+x.PrecioTotal());
    }
    
    
    void imprimir(String s){
    txta.append(s+"\n");}
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void contenedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contenedor1ActionPerformed
     // Asegurarse de que hay un ítem seleccionado
    if (contenedor1.getSelectedItem() == null) {
        return;
    }
   
    String codigoSeleccionado = (String) contenedor1.getSelectedItem();
   
    Licencia l = li.buscar(codigoSeleccionado);
   
    if (l != null) {
   
        respuesta2.setText(l.getNombre());
        respuesta3.setText("S/ " + String.format("%.2f", l.getPrecio())); // Formatear precio
        respuesta4.setText(l.getDuracion() + " año(s)");
        respuesta5.setText(l.getNusuarios() + " usuario(s)");
        respuesta6.setText(l.getSoportetecnico());
        respuesta7.setText(l.getActualizaciones());
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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
            try {
            String codigo = leerCodigo();
            
            // 1. Busca en la nueva tabla 'lis' (en lugar de 'li')
            Licencia a = li.buscar(codigo); 
            
            if (a == null) {
                mensaje("el Código no existe");
            } else {
                // 2. Elimina usando el 'codigo' (la llave), 
                //    en lugar del objeto 'a'
                li.eliminar(codigo); 
                Listar();
            }
            caja1.setText("");
            caja1.requestFocus();
        } catch (Exception e1) {
            mensaje("");
            caja1.setText("");
            caja1.requestFocus();
        }
    }//GEN-LAST:event_btncActionPerformed

    private void btnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlActionPerformed
        Listar();
    }//GEN-LAST:event_btnlActionPerformed

    private void btndaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaActionPerformed
// Cambia 'li.tamaño()' por 'lis.getCantidad()'
        if (li.getCantidad() > 0) {
            // Cambia 'li' por 'lis'
            li.eliminarTodo();
            Listar();
        }
    }//GEN-LAST:event_btndaActionPerformed

    private void btnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed
       try {
            String codigo = leerCodigo();
            
            // CAMBIO 1: Usa 'lis' (TablaHash) en lugar de 'li'
            if (li.buscar(codigo) == null) {
                String nombre = leerNombre();
                if (nombre.length() > 0) {
                    try {
                        double precio = leerPrecio();
                        try {
                            int nusuarios = leerNusuarios();
                            try {
                                int duracion = leerDuracion();         
                                try {
                                    String soportetecnico = leerSoportetecnico();
                                    try {
                                        String actualizaciones = leerActualizaciones();      
                                        Licencia nuevo = new Licencia( nombre,  precio,  duracion,  nusuarios,  codigo,  soportetecnico,  actualizaciones);
                                        
                                        // CAMBIO 2: Usa 'insertar(llave, valor)' en lugar de 'adicionar'
                                        // La llave es el 'codigo', el valor es el objeto 'nuevo'
                                        li.insertar(codigo, nuevo);
                                        
                                        Listar();
                                        limpieza();       
                                    } catch (Exception e1) {
                                        mensaje("ingrese actualizacion Correcta");
                                        caja7.setText("");
                                        caja7.requestFocus();
                                    }       
                                } catch (Exception e1) {
                                    mensaje("ingrese Soporte valido");
                                    caja6.setText("");
                                    caja6.requestFocus();
                                }          
                            } catch (Exception e1) {
                                mensaje("ingrese Tiempo Correcta");
                                caja5.setText("");
                                caja5.requestFocus();
                            }           
                        } catch (Exception e1) {
                            mensaje("ingrese Usuarios Correcta");
                            caja4.setText("");
                            caja4.requestFocus();
                        }
                    } catch (Exception e1) {
                        mensaje("ingrese Precio Correcta");
                        caja3.setText("");
                        caja3.requestFocus();
                    }
                } else {
                    mensaje("ingrese Nombre correcto");
                    caja2.setText("");
                    caja2.requestFocus();
                }
            } else {
                mensaje("el Codigo ya existe");
                caja1.setText("");
                caja1.requestFocus();
            }
        } catch (Exception e1) {
            mensaje("ingrese Código correcto");
            caja1.setText("");
            caja1.requestFocus();
        }
    }//GEN-LAST:event_btnaActionPerformed

    private void btnacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacActionPerformed
        try {
    // 1. BUSCAR LA LICENCIA
    String codigo = caja1.getText();
    if (li.buscar(codigo) == null) {
        mensaje("El código que quieres actualizar no existe.");
        caja1.requestFocus();
        return;
    }
    // 2. LEER Y VALIDAR LOS NUEVOS DATOS
    String nombre = caja2.getText();
    // ... (validaciones para nombre, precio y n° de usuarios son las mismas) ...
    double precio;
    try {
        precio = Double.parseDouble(caja3.getText());
    } catch (NumberFormatException ex) {
        mensaje("El precio ingresado no es válido.");
        caja3.requestFocus();
        return;
    }
    int nusuarios;
    try {
        nusuarios = Integer.parseInt(caja4.getText());
    } catch (NumberFormatException ex) {
        mensaje("El N° de Usuarios no es válido.");
        caja4.requestFocus();
        return;
    }
    // --- CAMBIO AQUÍ ---
    int duracion;
    try {
        // Lee del campo de texto para la duración
        duracion = Integer.parseInt(caja5.getText());
    } catch (NumberFormatException ex) {
        mensaje("La duración ingresada no es válida.");
        caja5.requestFocus();
        return;
    }
    String soportetecnico = caja6.getText();
    String actualizaciones = caja7.getText();
    // 3. CREAR EL OBJETO LICENCIA CON LOS DATOS ACTUALIZADOS
    Licencia nuevo = new Licencia( nombre,  precio,  duracion,  nusuarios,  codigo,  soportetecnico,  actualizaciones);
                    
                    li.actualizar(codigo, nuevo);
                    Listar();
                    limpieza();
} catch (Exception ex) {
    mensaje("Ocurrió un error inesperado al actualizar.");
    ex.printStackTrace();
}
    }//GEN-LAST:event_btnacActionPerformed
void Listar() {
    modelo.setRowCount(0); // Limpia la tabla

    // 1. Obtenemos la lista completa de licencias desde la TablaHash 'lis'
    // 2. Usamos un "for-each" loop
    for (Licencia lic : li.getTodasLasLicencias()) {
        
        // 3. Usamos el objeto 'lic' directamente 
        //    (en lugar de li.obtener(i))
        Object fila[] = {
            lic.getCodigo(),
            lic.getNombre(),
            lic.getPrecio(),
            lic.getNusuarios(),
            lic.getDuracion(),
            lic.getSoportetecnico(),
            lic.getActualizaciones(),
        };
        modelo.addRow(fila);
    }
}
   
void limpieza(){
            caja1.setText("");
            caja2.setText("");
            caja3.setText("");
            caja4.setText("");
            caja5.setText("");
            caja6.setText("");
            caja7.setText("");
            caja1.requestFocus();
        }
        void mensaje(String s){
            JOptionPane.showMessageDialog(null, s);
    }
        String leerCodigo() {
    return caja1.getText().trim();
}

String leerNombre() {
    return caja2.getText().trim();
}

double leerPrecio() {
    return Integer.parseInt(caja3.getText().trim());
}

int leerNusuarios() {
    return Integer.parseInt(caja4.getText().trim());
}  
int leerDuracion() {
    return Integer.parseInt(caja5.getText().trim());
}  
String leerSoportetecnico() {
    return caja6.getText().trim();
}  
String leerActualizaciones() {
    return caja7.getText().trim();
}  
    
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consultar;
    private javax.swing.JPanel Listar;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuBar Menup;
    private javax.swing.JPanel Modificar;
    private javax.swing.JPanel Panelp;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btna;
    private javax.swing.JButton btnac;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnda;
    private javax.swing.JButton btnl;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JTextField caja5;
    private javax.swing.JTextField caja6;
    private javax.swing.JTextField caja7;
    private javax.swing.JComboBox<String> contenedor1;
    private javax.swing.JPanel contenedor2;
    private javax.swing.JPanel contenedor3;
    private javax.swing.JPanel contenedor4;
    private javax.swing.JPanel contenedor5;
    private javax.swing.JPanel contenedor6;
    private javax.swing.JPanel contenedor7;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fonod3;
    private javax.swing.JLabel imgP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel respuesta2;
    private javax.swing.JLabel respuesta3;
    private javax.swing.JLabel respuesta4;
    private javax.swing.JLabel respuesta5;
    private javax.swing.JLabel respuesta6;
    private javax.swing.JLabel respuesta7;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable ta;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables
}
