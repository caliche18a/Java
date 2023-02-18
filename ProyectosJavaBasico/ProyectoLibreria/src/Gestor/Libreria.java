package Gestor;

import java.sql.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Libreria extends javax.swing.JFrame {

    public static final String url = "jdbc:mysql://localhost:3306/libreria";
    public static final String user = "root";
    public static final String pass = "admin";

    DefaultTableModel modelo;
    
    public Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error de conexion: " + e);
        }
        return conexion;
    }

    public Libreria() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("titulo");
        modelo.addColumn("autor");
        modelo.addColumn("genero");
        
        mostrarDatos();
    }

    public void mostrarDatos(){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        modelo.setRowCount(0);
        try {
            con = DriverManager.getConnection(url, user, pass);
            
            String sql = "SELECT id,titulo,autor,genero FROM libro";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String genero = rs.getString("genero");
                
                modelo.addRow(new Object[]{id,titulo,autor,genero});
            }
            jtDatos.setModel(modelo);
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        vistaDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        vistaIngreso = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTGenero = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jTTitulo = new javax.swing.JTextField();
        jTAutor = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        vistaDatos.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Datos");

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Título", "Autor", "Genero"
            }
        ));
        jScrollPane1.setViewportView(jtDatos);

        javax.swing.GroupLayout vistaDatosLayout = new javax.swing.GroupLayout(vistaDatos);
        vistaDatos.setLayout(vistaDatosLayout);
        vistaDatosLayout.setHorizontalGroup(
            vistaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaDatosLayout.createSequentialGroup()
                .addGroup(vistaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vistaDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vistaDatosLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        vistaDatosLayout.setVerticalGroup(
            vistaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        vistaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        vistaIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 0, 0));
        titulo.setText("LIBRERÍA -CarlosJiménez");
        vistaIngreso.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 220, 20));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Id:");
        vistaIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Titulo:");
        vistaIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("Autor:");
        vistaIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("Genero:");
        vistaIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jTGenero.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        vistaIngreso.add(jTGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 110, -1));

        jTId.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jTId.setEnabled(false);
        vistaIngreso.add(jTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, -1));

        jTTitulo.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        vistaIngreso.add(jTTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, -1));

        jTAutor.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        vistaIngreso.add(jTAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, -1));

        btnEnviar.setBackground(new java.awt.Color(204, 153, 255));
        btnEnviar.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 18)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        vistaIngreso.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 80, 40));

        fondo.setBackground((new Color(255, 255, 255, 1)));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos.imagenes/fondo.jpg"))); // NOI18N
        vistaIngreso.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 410, 270));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(vistaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vistaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(vistaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        PreparedStatement ps = null;

        String sql = "insert into libro(titulo,autor,genero) value(?,?,?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, jTTitulo.getText());
            ps.setString(2, jTAutor.getText());
            ps.setString(3, jTGenero.getText());
            ps.executeUpdate();

            mostrarDatos();
            con.close();
            JOptionPane.showMessageDialog(null, "Libro Guardado");
        } catch (Exception e) {
            System.out.println(e);

    }//GEN-LAST:event_btnEnviarActionPerformed
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
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAutor;
    private javax.swing.JTextField jTGenero;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTTitulo;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel vistaDatos;
    private javax.swing.JPanel vistaIngreso;
    // End of variables declaration//GEN-END:variables
}
