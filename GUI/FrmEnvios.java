/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Envios.Envio;
import Envios.ListaEnvios;
import Paquetes.ListaPaquetes;
import Paquetes.Paquete;
import Personas.Cliente;
import Personas.ListaCliente;
import RutasEntrega.ListaRutaEntrega;
import RutasEntrega.RutaEntrega;
import java.awt.Image;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author d2tod
 */
public final class FrmEnvios extends javax.swing.JInternalFrame {

    private ListaEnvios lista;
    private ListaPaquetes paquetes;
    private ListaCliente clientes;
    private ListaRutaEntrega rutas;
    private boolean bloqueo;
    private int indiceBloqueoCliente, indiceBloqueoPaquete, indiceBloqueoRuta;

    /**
     * Creates new form FrmEnvios
     *
     * @param lista
     * @param clientes
     * @param paquetes
     * @param rutas
     */
    public FrmEnvios(ListaEnvios lista, ListaCliente clientes, ListaPaquetes paquetes, ListaRutaEntrega rutas) {
        initComponents();
        this.lista = lista;
        this.clientes = clientes;
        this.paquetes = paquetes;
        this.rutas = rutas;
        this.bloqueo = false;
        actualizarComboBoxs();
        ajustarBotones();
    }

    private void mostrarFechas(boolean permitir) {
        txtFechaEnvio.setEnabled(permitir);
        txtFechaEntrega.setEnabled(permitir);
        labelEnvio.setEnabled(permitir);
        labelEntrega.setEnabled(permitir);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNuevo = new javax.swing.JLabel();
        txtCliente = new javax.swing.JComboBox<>();
        txtPaquete = new javax.swing.JComboBox<>();
        txtNumero = new javax.swing.JFormattedTextField();
        txtRuta = new javax.swing.JComboBox<>();
        labelEnvio = new javax.swing.JLabel();
        labelEntrega = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JFormattedTextField();
        txtFechaEnvio = new javax.swing.JFormattedTextField();
        btnAgregarRuta = new javax.swing.JButton();
        btnAgregarPaquete = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        txtPrecio = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEntregar = new javax.swing.JButton();
        btnDespachar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnEnlistar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administracion Envios");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Numero");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Ruta");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Paquete");

        txtNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtClienteMouseClicked(evt);
            }
        });
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPaqueteMouseClicked(evt);
            }
        });
        txtPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaqueteActionPerformed(evt);
            }
        });

        txtNumero.setEditable(false);
        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumero.setText("0");
        txtNumero.setToolTipText("Nuemero de envio es autogestionado");
        txtNumero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        labelEnvio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelEnvio.setText("Fecha Envio");
        labelEnvio.setEnabled(false);

        labelEntrega.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelEntrega.setText("Fecha Entrega");
        labelEntrega.setEnabled(false);

        txtFechaEntrega.setEditable(false);
        txtFechaEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtFechaEntrega.setToolTipText("No se puede editar la fecha");
        txtFechaEntrega.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtFechaEnvio.setEditable(false);
        txtFechaEnvio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        txtFechaEnvio.setToolTipText("No se puede editar la fecha");
        txtFechaEnvio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnAgregarRuta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarRuta.setText("+");
        btnAgregarRuta.setToolTipText("Nueva Ruta");
        btnAgregarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRutaActionPerformed(evt);
            }
        });

        btnAgregarPaquete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarPaquete.setText("+");
        btnAgregarPaquete.setToolTipText("Nuevo Paquete");
        btnAgregarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPaqueteActionPerformed(evt);
            }
        });

        btnAgregarCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarCliente.setText("+");
        btnAgregarCliente.setToolTipText("Nuevo Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        txtPrecio.setEditable(false);
        txtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtPrecio.setText("0");
        txtPrecio.setToolTipText("Numero de envio es autogestionado");
        txtPrecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCliente, 0, 157, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(txtNuevo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarPaquete)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRuta, javax.swing.GroupLayout.Alignment.LEADING, 0, 181, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarRuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaEnvio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero)
                            .addComponent(btnAgregarCliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarPaquete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregarRuta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelEnvio)
                                .addComponent(labelEntrega))
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio)))
                .addContainerGap())
        );

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(56, 48));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregar.setToolTipText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(56, 48));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEntregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEntregar.setToolTipText("Entregar");
        btnEntregar.setPreferredSize(new java.awt.Dimension(58, 48));
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        btnDespachar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDespachar.setToolTipText("Despachar");
        btnDespachar.setPreferredSize(new java.awt.Dimension(56, 48));
        btnDespachar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespacharActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(56, 48));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Envios");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEnlistar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEnlistar.setToolTipText("Listar");
        btnEnlistar.setPreferredSize(new java.awt.Dimension(56, 48));
        btnEnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnlistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDespachar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDespachar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        if (bloqueo) {
            txtCliente.setSelectedIndex(indiceBloqueoCliente);
        }
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaqueteActionPerformed
        if (bloqueo) {
            txtPaquete.setSelectedIndex(indiceBloqueoPaquete);
            return;
        }

        if (txtPaquete.getSelectedIndex() == -1) {
            txtPrecio.setText("0");
            return;
        }

        Paquete paquete = (Paquete) txtPaquete.getSelectedItem();
        if (paquete != null) {
            txtPrecio.setText(String.valueOf(900 + (paquete.getPeso() * 1200)));
        } else {
            txtPrecio.setText("0");
        }
    }//GEN-LAST:event_txtPaqueteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        bloquearComboBoxs(false);
        limpiarCampos();
        txtNumero.setText(String.valueOf(lista.getContador()));
        mostrarFechas(false);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Cliente cliente = (Cliente) txtCliente.getSelectedItem();
        Paquete paquete = (Paquete) txtPaquete.getSelectedItem();
        RutaEntrega ruta = (RutaEntrega) txtRuta.getSelectedItem();

        if (cliente == null || paquete == null || ruta == null) {
            JOptionPane.showMessageDialog(this, "Se han dejado campos en blanco");
            return;
        }

        double pesoKg = paquete.getPeso();
        try {
            lista.registrarEnvio(cliente, paquete, ruta, pesoKg);
            JOptionPane.showMessageDialog(this, "Envio registrado correctamente");
        } catch (IllegalArgumentException i) {
            JOptionPane.showMessageDialog(this, i.getMessage());
            return;
        }
        limpiarCampos();
        txtNumero.setText(String.valueOf(lista.getContador()));
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (lista.getContador() == 0) {
            JOptionPane.showMessageDialog(this, "No hay envios");
            return;
        }

        FrmBuscarEnvio frm = new FrmBuscarEnvio(FrmSistema.getInstance(), true, lista.getContador());
        frm.setLocation((this.getParent().getWidth() - frm.getWidth()), (this.getParent().getHeight() - frm.getHeight()));
        frm.setVisible(true);

        int numero = frm.getNumeroEnvio();
        if (numero == -1) {
            return;
        }

        btnAgregar.setEnabled(false);
        
        if (bloqueo) {
            bloquearComboBoxs(false);
        }

        Envio envio = lista.buscar(numero);

        txtNumero.setText(String.valueOf(envio.getNumeroEnvio()));
        txtCliente.setSelectedIndex(BuscarEnComboBox(txtCliente, envio.getCliente()));
        txtPaquete.setSelectedIndex(BuscarEnComboBox(txtPaquete, envio.getPaquete()));
        txtRuta.setSelectedIndex(BuscarEnComboBox(txtRuta, envio.getRuta()));
        txtFechaEnvio.setText(envio.getFechaEnvio().toString());
        if (envio.getFechaEntrega() != null) {
            txtFechaEntrega.setText(envio.getFechaEntrega().toString());
        } else {
            txtFechaEntrega.setText("null");
        }
        txtPrecio.setText(String.valueOf(envio.getPrecio()));
        mostrarFechas(true);
        bloquearComboBoxs(true);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        Envio envio = lista.buscar(Integer.parseInt(txtNumero.getText()));
        if (envio == null) {
            JOptionPane.showMessageDialog(this, "El numero de envio es invalido");
            return;
        }
        if (envio.finalizar()) {
            JOptionPane.showMessageDialog(this, "El paquete ha sido registrado como entregado");
        } else {
            JOptionPane.showMessageDialog(this, "Error: El estado del paquete no es despachado");
        }
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed

    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        if (bloqueo) {
            txtRuta.setSelectedIndex(indiceBloqueoRuta);
        }
    }//GEN-LAST:event_txtRutaActionPerformed

    private void btnDespacharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespacharActionPerformed
        Envio envio = lista.buscar(Integer.parseInt(txtNumero.getText()));
        if (envio == null) {
            JOptionPane.showMessageDialog(this, "El numero de envio es invalido");
            return;
        }
        if (envio.getPaquete().despachar()) {
            JOptionPane.showMessageDialog(this, "El paquete ha sido despachado");
        } else {
            JOptionPane.showMessageDialog(this, "Error: El paquete ya no está en el almacen o fue cancelado");
        }
    }//GEN-LAST:event_btnDespacharActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Envio envio = lista.buscar(Integer.parseInt(txtNumero.getText()));
        if (envio == null) {
            JOptionPane.showMessageDialog(this, "El numero de envio es invalido");
            return;
        }
        if (envio.getPaquete().cancelar()) {
            JOptionPane.showMessageDialog(this, "El paquete ha sido cancelado");
        } else {
            JOptionPane.showMessageDialog(this, "Error: El paquete ya no está en el almacen o fue cancelado");
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnlistarActionPerformed
        FrmListaEnvios frm = new FrmListaEnvios(null, true, lista);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_btnEnlistarActionPerformed

    private void btnAgregarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRutaActionPerformed
        FrmRutasEntrega frm = new FrmRutasEntrega(rutas);
        this.getParent().add(frm);
        frm.setLocation((this.getParent().getWidth() - frm.getWidth()) / 2, (this.getParent().getHeight() - frm.getHeight()) / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnAgregarRutaActionPerformed

    private void btnAgregarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPaqueteActionPerformed
        FrmPaquetes frm = new FrmPaquetes(paquetes);
        this.getParent().add(frm);
        frm.setLocation((this.getParent().getWidth() - frm.getWidth()) / 2, (this.getParent().getHeight() - frm.getHeight()) / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnAgregarPaqueteActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        FrmCliente frm = new FrmCliente(clientes);
        this.getParent().add(frm);
        frm.setLocation((this.getParent().getWidth() - frm.getWidth()) / 2, (this.getParent().getHeight() - frm.getHeight()) / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        //inicializarComboBoxs();
    }//GEN-LAST:event_formFocusGained

    private void txtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClienteMouseClicked
        //cargarComboBox(txtCliente, clientes.getClientes());
    }//GEN-LAST:event_txtClienteMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        actualizarComboBoxs();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaqueteMouseClicked

    }//GEN-LAST:event_txtPaqueteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarPaquete;
    private javax.swing.JButton btnAgregarRuta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDespachar;
    private javax.swing.JButton btnEnlistar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEntrega;
    private javax.swing.JLabel labelEnvio;
    private javax.swing.JComboBox<String> txtCliente;
    private javax.swing.JFormattedTextField txtFechaEntrega;
    private javax.swing.JFormattedTextField txtFechaEnvio;
    private javax.swing.JLabel txtNuevo;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JComboBox<String> txtPaquete;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JComboBox<String> txtRuta;
    // End of variables declaration//GEN-END:variables

    private void actualizarComboBoxs() {
        cargarComboBox(txtCliente, clientes.getClientes());
        cargarComboBox(txtPaquete, paquetes.getPaquetes());
        cargarComboBox(txtRuta, rutas.getRutas());
    }

    private void cargarComboBox(javax.swing.JComboBox comboBox, Iterator iterator) {
        int indice = comboBox.getSelectedIndex();
        while (iterator.hasNext()) {
            Object objeto = iterator.next();
            if (!determinarExistenciaEnComboBox(comboBox, objeto)) {
                comboBox.addItem(objeto);
            }
        }
        comboBox.setSelectedIndex(indice);
    }

    private boolean determinarExistenciaEnComboBox(javax.swing.JComboBox comboBox, Object objeto) {
        return BuscarEnComboBox(comboBox, objeto) != -1;
    }

    private int BuscarEnComboBox(javax.swing.JComboBox comboBox, Object objeto) {
        int cont = comboBox.getItemCount();
        for (int i = 0; i < cont; i++) {
            if (comboBox.getItemAt(i).equals(objeto)) {
                return i;
            }
        }
        return -1;
    }

    private void bloquearComboBoxs(boolean bloqueo) {
        this.bloqueo = bloqueo;
        if (bloqueo) {
            indiceBloqueoCliente = txtCliente.getSelectedIndex();
            indiceBloqueoPaquete = txtPaquete.getSelectedIndex();
            indiceBloqueoRuta = txtRuta.getSelectedIndex();
        }
    }

    private void iterarBotones(boolean agregar, boolean listar, boolean nuevo, boolean atender, boolean cancelar) {
        btnAgregar.setEnabled(agregar);
        btnDespachar.setEnabled(listar);
        btnLimpiar.setEnabled(nuevo);
        btnBuscar.setEnabled(atender);
        btnEntregar.setEnabled(cancelar);
    }

    private void limpiarCampos() {
        txtNumero.setText("");
        txtCliente.setSelectedIndex(-1);
        txtPaquete.setSelectedIndex(-1);
        txtRuta.setSelectedIndex(-1);
        txtFechaEnvio.setText("");
        txtFechaEntrega.setText("");
    }

    private void ajustarBotones() {
        ajustarBtn("/Imagenes/buscar.png", btnBuscar);
        ajustarBtn("/Imagenes/guardar.png", btnAgregar);
        ajustarBtn("/Imagenes/limpiar.png", btnLimpiar);
        ajustarBtn("/Imagenes/Lista.png", btnEnlistar);
        ajustarBtn("/Imagenes/entregar.png", btnEntregar);
        ajustarBtn("/Imagenes/despachar.png", btnDespachar);
        ajustarBtn("/Imagenes/cancelar.png", btnCancelar);

    }

    private void ajustarBtn(String ubicacion, javax.swing.JButton cosa) {
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

}
