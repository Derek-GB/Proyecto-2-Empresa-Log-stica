/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Paquetes.Estado;
import Paquetes.ListaPaquetes;
import Paquetes.Paquete;
import Personas.Persona;
import java.awt.Image;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Tony
 */
public class FrmPaquetes extends javax.swing.JInternalFrame {

    private Paquete paquete;
    private ListaPaquetes lista;
    private Persona destinatario;
    private Persona remitente;

    /**
     * Creates new form GUIPaquetes
     * @param lista
     */
    public FrmPaquetes(ListaPaquetes lista) {
        initComponents();
        ajustarImagenes();
        this.lista = lista;
        btnAlmacen.setSelected(true);
        btnAlmacen.setEnabled(false);
        btnCancelado.setEnabled(false);
        btnDespachado.setEnabled(false);
        btnEntregado.setEnabled(false);

    }

    private void Limpiar() {
        this.txtCodigo.setText("");
        this.txtDescripcion.setText("");
        this.txtPeso.setText("");
        this.txtIdRemitente.setText("");
        this.txtIdDestinatario.setText("");
        this.txtDestinatario.setText("");
        this.txtRemitente.setText("");
        this.buttonGroup1.clearSelection();
    }

    private void deshabilitar() {
        this.txtDescripcion.setEditable(false);
        this.txtDestinatario.setEditable(false);
        this.txtIdDestinatario.setEditable(false);
        this.txtIdRemitente.setEditable(false);
        this.txtPeso.setEditable(false);
        this.txtRemitente.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdRemitente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdDestinatario = new javax.swing.JTextField();
        txtDestinatario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRemitente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAlmacen = new javax.swing.JRadioButton();
        btnCancelado = new javax.swing.JRadioButton();
        btnEntregado = new javax.swing.JRadioButton();
        btnDespachado = new javax.swing.JRadioButton();
        BtnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administrador de Paquetes");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Paquetes");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Remitente");

        txtIdRemitente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdRemitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRemitenteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Codigo");

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Peso");

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Id Destinatario");

        txtIdDestinatario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDestinatarioActionPerformed(evt);
            }
        });

        txtDestinatario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinatarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nombre Destinatario");

        txtRemitente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRemitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemitenteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Id Remitente");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Estado");

        buttonGroup1.add(btnAlmacen);
        btnAlmacen.setText("En Almacen");
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnCancelado);
        btnCancelado.setText("Cancelado");

        buttonGroup1.add(btnEntregado);
        btnEntregado.setText("Entregado");

        buttonGroup1.add(btnDespachado);
        btnDespachado.setText("Despachado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRemitente)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(107, 107, 107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDespachado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEntregado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAlmacen)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelado)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlmacen)
                        .addComponent(btnCancelado))
                    .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDespachado)
                            .addComponent(btnEntregado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        BtnBuscar.setToolTipText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setToolTipText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        BtnEliminar.setToolTipText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnAgregar.setToolTipText("Nuevo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnLista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdRemitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRemitenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRemitenteActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtIdDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDestinatarioActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String codigo = txtCodigo.getText();
        Paquete paquete = lista.buscar(codigo);
        if (paquete != null) {
            txtCodigo.setText(paquete.getCodigo());
            txtDescripcion.setText(paquete.getDescripcion());
            txtRemitente.setText(String.valueOf(paquete.getDestinatario().getNombre()));
            txtIdRemitente.setText(String.valueOf(paquete.getDestinatario().getIdentificacion()));
            txtPeso.setText(String.valueOf(paquete.getPeso()));
            txtDestinatario.setText(String.valueOf(paquete.getRemitente().getNombre()));
            txtIdDestinatario.setText(String.valueOf(paquete.getRemitente().getIdentificacion()));

            Estado estado = paquete.getEstado();

            switch (estado) {
                case ALMACEN ->
                    btnAlmacen.setSelected(true);
                case CANCELADO ->
                    btnCancelado.setSelected(true);
                case DESPACHADO ->
                    btnDespachado.setSelected(true);
                case ENTREGADO ->
                    btnEntregado.setSelected(true);

            }

            deshabilitar();

        } else {
            JOptionPane.showMessageDialog(this, "El paquete con el código " + codigo + " no existe");
        }

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        FrmActuPaquetes frm = new FrmActuPaquetes(null, true, lista);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        String codigo = txtCodigo.getText();
        try {
            lista.eliminar(codigo);
            JOptionPane.showMessageDialog(this, "El paquete con el código " + codigo + " fue eliminado");
            Limpiar();
        } catch (IllegalArgumentException nombre) {
            JOptionPane.showMessageDialog(this, "El paquete no existe");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtRemitente.getText().isEmpty()
                || txtIdRemitente.getText().isEmpty() || txtPeso.getText().isEmpty()
                || txtDestinatario.getText().isEmpty() || txtIdDestinatario.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Faltan campos por llenar, por favor completarlos.");
        } else {

            String codigo = txtCodigo.getText();
            String descripcion = txtDescripcion.getText();
            String destinatari = txtDestinatario.getText();
            String idDestinatario = txtIdDestinatario.getText();
            String remitent = txtRemitente.getText();
            String idRemitente = txtIdRemitente.getText();
            Double peso = Double.valueOf(txtPeso.getText());
            if (lista.buscar(codigo) != null) {
                JOptionPane.showMessageDialog(this, "No es posible modificarlo. El código " + codigo + " ya existe.");
               Limpiar();
                return;
                
            }
            destinatario = new Persona(idDestinatario, destinatari);
            remitente = new Persona(idRemitente, remitent);
            paquete = new Paquete(codigo, descripcion, peso, destinatario, remitente);
            lista.agregar(codigo, paquete);
            JOptionPane.showMessageDialog(this, "Paquete agregado correctamente");
            Limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinatarioActionPerformed

    private void txtRemitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemitenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemitenteActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        FrmListaPaquetes frm = new FrmListaPaquetes(null, true, lista);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_btnListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnAlmacen;
    private javax.swing.JRadioButton btnCancelado;
    private javax.swing.JRadioButton btnDespachado;
    private javax.swing.JRadioButton btnEntregado;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtIdDestinatario;
    private javax.swing.JTextField txtIdRemitente;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRemitente;
    // End of variables declaration//GEN-END:variables

    public void ajustarBtn(final javax.swing.JButton cosa, final String ubicacion) {
        final ImageIcon image = new ImageIcon(getClass().getResource(ubicacion));

        cosa.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                if ((e.getChangeFlags() & HierarchyEvent.SHOWING_CHANGED) != 0 && cosa.isShowing()) {
                    Icon icon = new ImageIcon(image.getImage().getScaledInstance(cosa.getWidth(), cosa.getHeight(), Image.SCALE_DEFAULT));
                    cosa.setIcon(icon);

                    cosa.removeHierarchyListener(this);
                }
            }
        });
    }

    private void ajustarImagenes() {
        ajustarBtn(BtnEliminar, "/Imagenes/Eliminar.png");
        ajustarBtn(btnAgregar, "/Imagenes/guardar.png");
        ajustarBtn(BtnBuscar, "/Imagenes/Buscar.png");
        ajustarBtn(btnLimpiar, "/Imagenes/Limpiar.png");
        ajustarBtn(btnActualizar, "/Imagenes/Actualizar.png");
        ajustarBtn(btnLista, "/Imagenes/Lista.png");

    }

}
