// javiershaka
package Vistas;

import static Vistas.formSelectCelular._detalleVenta;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleVentas;



public class formVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Venta
     */
    DefaultTableModel _tablaventas;
    DefaultTableModel _tbventas;
    DefaultTableModel _tbventasDetalle;
    DefaultTableModel _registroVenta;
    
    public static double SubTotal;
    public static double IVA;
    public static double Total;
    public formVenta() {
        initComponents();
        btneliminarProdcto.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNoVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtxID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbVenta = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDetalleVenta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btneliminarProdcto = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Venta");

        txtNoVenta.setEditable(false);
        txtNoVenta.setText("1");

        jLabel1.setText("No. Venta");

        jLabel2.setText("Cliente");

        jLabel3.setText("ID");

        txtxID.setEditable(false);

        jLabel4.setText("Nombre");

        txtNombre.setEditable(false);

        jButton2.setText("Agregar Cliente ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Nombre", "Precio Unitario", "total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbVenta);

        txtTotal.setEditable(false);

        jLabel7.setText("Total:");

        jButton3.setText("Realizar Venta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Quitar cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtxID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(170, 170, 170)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jButton3))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Venta", jPanel1);

        tbDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Precio Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbDetalleVenta);

        jButton1.setText("Agregar Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("IVA");

        txtIVA.setEditable(false);
        txtIVA.setText("0.0");

        jLabel6.setText("SubTotal");

        txtSubtotal.setEditable(false);
        txtSubtotal.setText("0.0");

        btneliminarProdcto.setText("Eliminar Producto");
        btneliminarProdcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarProdctoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btneliminarProdcto)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btneliminarProdcto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jTabbedPane5.addTab("Detalle de venta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        formSelectCelular _productoagregador = new formSelectCelular();
        formVentaCelulares.dskEscritorio.add(_productoagregador);
        if(formCelular._listaCelular.isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay productos registrados", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int x = (int) (formVentaCelulares.dskEscritorio.getWidth() / 2) - (int) (_productoagregador.getWidth() / 2);
            int y = (int) (formVentaCelulares.dskEscritorio.getHeight() / 2) - (int) (_productoagregador.getHeight() / 2);

            _productoagregador.setLocation(x, y);
            _productoagregador.setVisible(true);
            DefaultComboBoxModel _cbProducto = (DefaultComboBoxModel) formSelectCelular.cbProductos.getModel();
            _cbProducto.removeAllElements();
        
        for(modelo.Celulares _prodProdu : formCelular._listaCelular){
            _cbProducto.addElement(_prodProdu.getNombreProducto());
        }
        formSelectCelular.cbProductos.setModel(_cbProducto);  
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
            formSelectCliente _clienteDistinguido = new formSelectCliente();
            formVentaCelulares.dskEscritorio.add(_clienteDistinguido);
            if(formCliente._clientesLista.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay clientes registrados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                int x = (int) (formVentaCelulares.dskEscritorio.getWidth() / 2) - (int) (_clienteDistinguido.getWidth() / 2);
                int y = (int) (formVentaCelulares.dskEscritorio.getHeight() / 2) - (int) (_clienteDistinguido.getHeight() / 2);

                _clienteDistinguido.setLocation(x, y);
                _clienteDistinguido.setVisible(true);
            }
           
         
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        if(txtNombre.getText().isEmpty()||txtTotal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La venta no se puede realizar ya que no esta la informacion necesaria", "avisa", JOptionPane.INFORMATION_MESSAGE);
        }
        if(!(txtNombre.getText().isEmpty()||txtTotal.getText().isEmpty())){
                
                _tbventas = (DefaultTableModel) tbVenta.getModel(); 
                 _registroVenta = (DefaultTableModel) formRegistroVentas.jTable1.getModel();
                 
                int filas = formVenta.tbVenta.getRowCount();
                for (int i = 0;filas>i; i++) {
                _tbventas.removeRow(0);
        }
        tbDetalleVenta.setModel(_tbventas);
        
        _tbventasDetalle = (DefaultTableModel) formVenta.tbDetalleVenta.getModel(); 
                int filas2 = formVenta.tbVenta.getRowCount();
                for (int i = 0;filas2>i; i++) {
                _tbventasDetalle.removeRow(0);
        }
        tbDetalleVenta.setModel(_tbventasDetalle);
        
        _registroVenta.addRow(new Object[]{txtNoVenta.getText(),txtNombre.getText(),txtTotal.getText()});
        formRegistroVentas.jTable1.setModel(_registroVenta);
        JOptionPane.showMessageDialog(null,"Venta realizada", "Aviso" , JOptionPane.INFORMATION_MESSAGE); 
        txtNoVenta.setText(""+(Integer.parseInt(txtNoVenta.getText()) + 1));
        txtTotal.setText("");
        txtNombre.setText("");
        txtxID.setText("");
        txtIVA.setText("");
        txtSubtotal.setText("");
        }
        
        
              
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btneliminarProdctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarProdctoActionPerformed
        // TODO add your handling code here:
        String Nombre;
        DefaultTableModel _tabla = (DefaultTableModel) tbDetalleVenta.getModel();
        try {
        int seleccte = tbDetalleVenta.getSelectedRow();
        if(tbDetalleVenta.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null,"Favor de seleccionar un producto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        if(tbDetalleVenta.getSelectedRow()>=0){
            Nombre = _tabla.getValueAt(seleccte, 1).toString();
           
            _tabla.removeRow(seleccte);
            tbDetalleVenta.setModel(_tabla); 
            _detalleVenta.sort(Comparator.comparing(DetalleVentas::getNombre));
                for(DetalleVentas _deta : _detalleVenta){
                    
                _tablaventas.addRow(new Object[]{_deta.getCantidad()+"",_deta.getNombre()+"",_deta.getImporteUnitario()+"",_deta.getTotal()+""});
                formVenta.tbVenta.setModel(_tablaventas);
                }
                
                formVenta.SubTotal =0;
                for (int i = 0; i < formVenta.tbDetalleVenta.getRowCount(); i++) {
                formVenta.SubTotal =formVenta.SubTotal + Double.parseDouble(formVenta.tbDetalleVenta.getValueAt(i, 4)+"") ;
                    }
                
                formVenta.IVA = formVenta.SubTotal * 0.15;
                formVenta.txtSubtotal.setText(formVenta.SubTotal+"");
                formVenta.txtIVA.setText(""+formVenta.IVA);
                formVenta.Total = formVenta.SubTotal + formVenta.IVA;
                formVenta.txtTotal.setText(formVenta.Total+""); 
        }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btneliminarProdctoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtxID.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminarProdcto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable tbDetalleVenta;
    public static javax.swing.JTable tbVenta;
    public static javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNoVenta;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtSubtotal;
    public static javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtxID;
    // End of variables declaration//GEN-END:variables
}
