// javiershaka
package Vistas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleVentas;
import javax.swing.JOptionPane;




public class formSelectCelular extends javax.swing.JInternalFrame {

   
    DefaultTableModel _tablaDetalleVenta;
    DefaultTableModel _tablaventas;
    public static List<DetalleVentas> _detalleVenta = new ArrayList<DetalleVentas>();
    public formSelectCelular() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        ftxtCantidad = new javax.swing.JFormattedTextField();
        cbProductos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadDisponible = new javax.swing.JTextField();

        setTitle("Agregar Celular");

        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Celular");

        jLabel2.setText("precio");

        jTextField2.setEditable(false);

        jLabel3.setText("Cantidad");

        jLabel4.setText("importe");

        jTextField4.setEditable(false);

        ftxtCantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0"))));
        ftxtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtCantidadFocusLost(evt);
            }
        });

        cbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductosItemStateChanged(evt);
            }
        });

        jLabel5.setText("Cantidad Disponible");

        txtCantidadDisponible.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(ftxtCantidad)
                    .addComponent(jTextField4)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadDisponible))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtCantidadFocusLost
        // TODO add your handling code here:
        try {
            int elementoSeleccionado = cbProductos.getSelectedIndex();
            double _total;
            double _precioUnitario = formCelular._listaCelular.get(elementoSeleccionado).getPrecio();
            jTextField2.setText(_precioUnitario+"");
            _total = Integer.parseInt(ftxtCantidad.getText()) * _precioUnitario;
            jTextField4.setText(_total+"");
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ftxtCantidadFocusLost

    private void cbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductosItemStateChanged
        // TODO add your handling code here:
        try {
            
            int elementoSeleccionado = cbProductos.getSelectedIndex();
            Double precioUnitario_ = formCelular._listaCelular.get(elementoSeleccionado).getPrecio();
            jTextField2.setText(precioUnitario_+"");
            txtCantidadDisponible.setText(formCelular._listaCelular.get(elementoSeleccionado).getStock()+"");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbProductosItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        _tablaDetalleVenta = (DefaultTableModel) formVenta.tbDetalleVenta.getModel();
        try {
            int elementoSeleccionado = cbProductos.getSelectedIndex();
            Double _precioUnitario = formCelular._listaCelular.get(elementoSeleccionado).getPrecio();
            double _total = _precioUnitario * Integer.parseInt(ftxtCantidad.getText());
            jTextField2.setText(_precioUnitario+"");
            jTextField4.setText(_total+"");
            if(Integer.parseInt(ftxtCantidad.getText())<= formCelular._listaCelular.get(elementoSeleccionado).getStock()){
                _tablaDetalleVenta.addRow(new Object[]{formCelular._listaCelular.get(elementoSeleccionado).getID()+"",formCelular._listaCelular.get(elementoSeleccionado).getNombreProducto(),ftxtCantidad.getText(),_precioUnitario+"",_total+""});
                formCelular._listaCelular.get(elementoSeleccionado).setStock(formCelular._listaCelular.get(elementoSeleccionado).getStock() - Integer.parseInt(ftxtCantidad.getText()));
                formVenta.tbDetalleVenta.setModel(_tablaDetalleVenta);
                _detalleVenta.add(new DetalleVentas(formCelular._listaCelular.get(elementoSeleccionado).getNombreProducto(), Integer.parseInt(ftxtCantidad.getText()), Vistas.formCelular._listaCelular.get(elementoSeleccionado), _precioUnitario, _total));
                JOptionPane.showMessageDialog(null,"Se ha añadido un celular", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                hide();
                
                jTextField2.setText("");
                jTextField4.setText("");
                ftxtCantidad.setText("");
                
                
                
                _tablaventas = (DefaultTableModel) formVenta.tbVenta.getModel(); 
                int filas = formVenta.tbVenta.getRowCount();
                for (int i = 0;filas>i; i++) {
                _tablaventas.removeRow(0);
                }
                
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
            else{
                JOptionPane.showMessageDialog(null, "La cantidad que ingreso no es correcta", "Error", JOptionPane.ERROR_MESSAGE);
            }
                
                
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hide();
        ftxtCantidad.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbProductos;
    public static javax.swing.JFormattedTextField ftxtCantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtCantidadDisponible;
    // End of variables declaration//GEN-END:variables
}
