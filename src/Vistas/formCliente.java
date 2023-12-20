// javiershaka
package Vistas;
import modelo.Clientes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Clientes;
import javax.swing.JOptionPane;
public class formCliente extends javax.swing.JInternalFrame {
    public static List<Clientes> _clientesLista = new ArrayList<Clientes>();
   
    public formCliente() {
        initComponents();
        _clientesLista.add(new Clientes("Juan Perez", "5465465", "calle 84 col. centro", "GWQ4564QWE465", "622222285", "juanperez@gmail.com"));
        _clientesLista.add(new Clientes("Benito Sanchez", "554465", "calle juarez col. centro", "REQ4872", "8165572", "BenitoSnz@gmail.com"));
        _clientesLista.add(new Clientes("Alejandro Altamirano", "88646", "calle periferico col. colinas", "QW5644QWE465", "622234285", "alteales@gmail.com"));
        _clientesLista.add(new Clientes("Pedro Valedor", "8794656", "calle cochori col. fatima", "ASD46556SDA564SAD", "622222285", "pedritovale@gmail.com"));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ftxtID = new javax.swing.JFormattedTextField();
        ftxtTelefono = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        setTitle("Datos del cliente");

        jLabel1.setText("Nombre");

        jLabel2.setText("ID");

        jLabel3.setText("Domicilio");

        jLabel4.setText("RFC");

        jLabel5.setText("telefono");

        jLabel6.setText("correo");

        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });

        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ftxtID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        ftxtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ftxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(txtDomicilio)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRFC, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(txtCorreo))
                                    .addComponent(ftxtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ftxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ftxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean Identicos = false;
        if(txtNombre.getText().isEmpty() || txtDomicilio.getText().isEmpty() || txtRFC.getText().isEmpty() || txtCorreo.getText().isEmpty() || ftxtID.getText().isEmpty() || ftxtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Favor de llenar todos los campos", "Mensae", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            DefaultTableModel _tablaClientes = (DefaultTableModel) Vistas.formListaClientes.jTable1.getModel();
            
            if(!_clientesLista.isEmpty()){
                for(int i = 0; i < _clientesLista.size();i++){
                    
                    if(!_clientesLista.get(i).getID().equals(ftxtID.getText())){
                        Identicos = true;   //use una variable booleana por va el ciclo recorriendo del 0 ansta que se acabe el agreglo pero si agregas uno y el primero es diferente que el segunto lo agrega pero al final te sale que no hay repetidos
                    
                    }
                    
                    else{
                    JOptionPane.showMessageDialog(null, "Ya hay un cliente con el mismo ID o nombre", "Aviso", JOptionPane.PLAIN_MESSAGE);
                        Identicos = false;
                    break;
                
                    }
                
                }
                if(Identicos == true){
                        _clientesLista.add(new Clientes(txtNombre.getText(), ftxtID.getText(), txtDomicilio.getText(), txtRFC.getText(), ftxtTelefono.getText(),txtCorreo.getText()) );
                        _tablaClientes.addRow(new Object[]{ftxtID.getText(),txtNombre.getText(),txtDomicilio.getText(),txtRFC.getText(),ftxtTelefono.getText(),txtCorreo.getText()});
                        Vistas.formListaClientes.jTable1.setModel(_tablaClientes);
                        JOptionPane.showMessageDialog(null, "Se a agregado un nuevo cliente","Aviso"  , JOptionPane.INFORMATION_MESSAGE);
                        Identicos = false;
                        hide();
                        txtNombre.setText("");
                        txtCorreo.setText("");
                        txtDomicilio.setText("");
                        txtRFC.setText("");
                        ftxtID.setText("");
                        ftxtTelefono.setText("");
                      
                   
                        
                    }
            }
            if(_clientesLista.isEmpty()){
                
                
                _clientesLista.add(new Clientes(txtNombre.getText(), ftxtID.getText(), txtDomicilio.getText(), txtRFC.getText(), ftxtTelefono.getText(),txtCorreo.getText()) );
                _tablaClientes.addRow(new Object[]{ftxtID.getText(),txtNombre.getText(),txtDomicilio.getText(),txtRFC.getText(),ftxtTelefono.getText(),txtCorreo.getText()});
                Vistas.formListaClientes.jTable1.setModel(_tablaClientes);
                JOptionPane.showMessageDialog(null, "Se a agregado un nuevo cliente","Aviso"  , JOptionPane.INFORMATION_MESSAGE);
                
                hide();
                txtNombre.setText("");
                txtCorreo.setText("");
                txtDomicilio.setText("");
                txtRFC.setText("");
                ftxtID.setText("");
                ftxtTelefono.setText("");
            }
            //
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hide();
        txtNombre.setText("");
        txtCorreo.setText("");
        txtDomicilio.setText("");
        txtRFC.setText("");
        ftxtID.setText("");
        ftxtTelefono.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftxtID;
    private javax.swing.JFormattedTextField ftxtTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
