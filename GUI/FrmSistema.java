/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Fernando
 */
public class FrmSistema extends javax.swing.JFrame {

    /**
     * Creates new form FrmSistema
     */
    public FrmSistema() {
        initComponents();
        ajustarImagenes();
        centrar();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskMenu = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnPaquetes = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnRutas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnEnvios = new javax.swing.JButton();
        txtCamion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Administrar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa Logistica");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 538));
        jPanel1.setLayout(null);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnPaquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paquete.png"))); // NOI18N
        btnPaquetes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPaquetes.setFocusable(false);
        btnPaquetes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaquetes.setPreferredSize(new java.awt.Dimension(30, 50));
        btnPaquetes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaquetesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPaquetes);

        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rutas.png"))); // NOI18N
        btnEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmpleados.setFocusable(false);
        btnEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpleados.setPreferredSize(new java.awt.Dimension(30, 50));
        btnEmpleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEmpleados);

        btnRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rutas.png"))); // NOI18N
        btnRutas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRutas.setFocusable(false);
        btnRutas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRutas.setPreferredSize(new java.awt.Dimension(30, 50));
        btnRutas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRutas);

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        btnClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClientes.setFocusable(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setPreferredSize(new java.awt.Dimension(30, 50));
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClientes);

        btnEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/envio.png"))); // NOI18N
        btnEnvios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnvios.setFocusable(false);
        btnEnvios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnvios.setPreferredSize(new java.awt.Dimension(30, 50));
        btnEnvios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnvios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEnvios);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 2648, 33);

        txtCamion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camion.png"))); // NOI18N
        jPanel1.add(txtCamion);
        txtCamion.setBounds(210, 110, 570, 310);

        deskMenu.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskMenuLayout = new javax.swing.GroupLayout(deskMenu);
        deskMenu.setLayout(deskMenuLayout);
        deskMenuLayout.setHorizontalGroup(
            deskMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        deskMenuLayout.setVerticalGroup(
            deskMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 102));
        jMenuBar1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(136, 32771));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(136, 27));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(136, 27));

        Administrar.setText("Administrar");
        Administrar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Administrar.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jMenuItem2.setText("Empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Administrar.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jMenuItem3.setText("Paquetes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Administrar.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jMenuItem4.setText("Rutas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Administrar.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jMenuItem5.setText("Envios");
        Administrar.add(jMenuItem5);

        jMenuBar1.add(Administrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmRutasEntrega frm = new FrmRutasEntrega();
        this.deskMenu.add(frm);
        frm.setLocation((this.deskMenu.getWidth()-frm.getWidth())/2, (this.deskMenu.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrmPaquetes frm = new FrmPaquetes();
        this.deskMenu.add(frm);
         frm.setLocation((this.deskMenu.getWidth()-frm.getWidth())/2, (this.deskMenu.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaquetesActionPerformed
        FrmPaquetes frm = new FrmPaquetes();
        this.deskMenu.add(frm);
         frm.setLocation((this.deskMenu.getWidth()-frm.getWidth())/2, (this.deskMenu.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnPaquetesActionPerformed

    private void btnEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutasActionPerformed
        FrmRutasEntrega frm = new FrmRutasEntrega();
        this.deskMenu.add(frm);
        frm.setLocation((this.deskMenu.getWidth()-frm.getWidth())/2, (this.deskMenu.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnRutasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administrar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEnvios;
    private javax.swing.JButton btnPaquetes;
    private javax.swing.JButton btnRutas;
    private javax.swing.JDesktopPane deskMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel txtCamion;
    // End of variables declaration//GEN-END:variables

    private void centrar() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
    }
     public void ajustarTxt(String ubicacion, javax.swing.JLabel cosa) {
        ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_DEFAULT));
        cosa.setIcon(icon);
    }
     
    public void ajustarBtn(String ubicacion, javax.swing.JButton cosa) {
        ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_DEFAULT));
        cosa.setIcon(icon);
    }
    
     public void ajustarImagenes() {
        ajustarTxt("/Imagenes/camion.png", txtCamion);
        ajustarBtn("/Imagenes/rutas.png", btnRutas);
        ajustarBtn("/Imagenes/cliente.png", btnClientes);
        ajustarBtn("/Imagenes/empleado.png", btnEmpleados);
        ajustarBtn("/Imagenes/envio.png", btnEnvios);
        ajustarBtn("/Imagenes/paquete.png", btnPaquetes);
     }
}
