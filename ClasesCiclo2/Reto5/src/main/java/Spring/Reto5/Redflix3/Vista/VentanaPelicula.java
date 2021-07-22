/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring.Reto5.Redflix3.Vista;

import Spring.Reto5.Redflix3.Modelos.Pelicula;
import Spring.Reto5.Redflix3.Redflix3Application;
import Spring.Reto5.Redflix3.Repositorios.RepositorioPelicula;
import Spring.Reto5.Redflix3.SpringContext;
import java.util.Optional;

/**
 *
 * @author Laura
 */
public class VentanaPelicula extends javax.swing.JFrame {
    
    RepositorioPelicula repositorioPelicula;
    /**
     * Creates new form VentanaPelicula
     */
    public VentanaPelicula() {
        initComponents();
        
        String [] args = {};
        Redflix3Application.runSpringServer(args);
        
        repositorioPelicula = SpringContext.getBean(RepositorioPelicula.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btCrear = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        tfAño = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDirector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResumen = new javax.swing.JTextArea();
        btGuardar = new javax.swing.JButton();
        lbNotificaciones = new javax.swing.JLabel();
        btLimpiar = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIEGO\\Pictures\\icono.png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btCrear.setBackground(new java.awt.Color(255, 0, 0));
        btCrear.setForeground(new java.awt.Color(255, 255, 0));
        btCrear.setText("Crear");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        btConsultar.setBackground(new java.awt.Color(255, 0, 0));
        btConsultar.setForeground(new java.awt.Color(255, 255, 0));
        btConsultar.setText("Consultar pelicula");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btEliminar.setForeground(new java.awt.Color(255, 255, 0));
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID de la pelicula:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCrear)
                    .addComponent(btEliminar)
                    .addComponent(btConsultar))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Titulo:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Año:");

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });

        tfAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAñoActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Director:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Resumen:");

        taResumen.setColumns(20);
        taResumen.setRows(5);
        jScrollPane1.setViewportView(taResumen);

        btGuardar.setBackground(new java.awt.Color(255, 0, 0));
        btGuardar.setForeground(new java.awt.Color(255, 255, 0));
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGuardar))
        );

        lbNotificaciones.setForeground(new java.awt.Color(255, 0, 0));

        btLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btLimpiar.setForeground(new java.awt.Color(255, 255, 0));
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(231, 231, 231))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNotificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpiar)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        if(!tfId.getText().equals("")){
            consultar();
            tfId.setEnabled(true);
        }
        else{
            lbNotificaciones.setText("Ud no ha digitado ningun id");
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        limpiarCamposParaCrear();
    }//GEN-LAST:event_btCrearActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        if(!tfId.getText().equals("")){
            eliminar();
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloActionPerformed

    private void tfAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAñoActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        crear();
    }//GEN-LAST:event_btGuardarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNotificaciones;
    private javax.swing.JTextArea taResumen;
    private javax.swing.JTextField tfAño;
    private javax.swing.JTextField tfDirector;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables

    private void consultar() {
        Long id = Long.parseLong(tfId.getText());
        Optional<Pelicula> optionalPelicula = repositorioPelicula.findById(id);
        if(optionalPelicula.isPresent()){
            Pelicula pelicula = optionalPelicula.get();
            tfTitulo.setText(pelicula.getTituloPelicula());
            taResumen.setText(pelicula.getResumenPelicula());
            tfAño.setText(pelicula.getAñoPelicula());
            tfDirector.setText(pelicula.getNombreDirector());
            
            lbNotificaciones.setText(
                    "Pelicula disponible: " + tfTitulo.getText()+", del Director "
                            +tfDirector.getText()+" estrenada en el año: "+tfAño.getText());
        }
        else{
            
            lbNotificaciones.setText(
                    "La pelicula que busca no fue encontrada");
        }
    }

    private void limpiarCamposParaCrear() {
        btCrear.setEnabled(false);
        tfTitulo.setText("");
        taResumen.setText("");
        tfAño.setText("");
        tfDirector.setText("");
        tfId.setText("");
        lbNotificaciones.setText("");
    }

    private void eliminar() {
        Long id = Long.parseLong(tfId.getText());
        
        try{
            repositorioPelicula.deleteById(id);
            lbNotificaciones.setText("Se eliminó exitosamente la pelicula");
        }
        catch(Exception e)
        {
            lbNotificaciones.setText("La pelicula que desea eliminar no se encuentra disponible");
        }
    }

    private void limpiarCampos() {
        btCrear.setEnabled(true);
        tfTitulo.setText("");
        tfAño.setText("");
        taResumen.setText("");
        tfDirector.setText("");
        tfId.setText("");
        lbNotificaciones.setText("");
    }

    private Pelicula obtenerDatosDeFormulario(){
        Pelicula pelicula = new Pelicula();
        pelicula.setIdPelicula(Long.parseLong(tfId.getText()));
        pelicula.setTituloPelicula(tfTitulo.getText());
        pelicula.setAñoPelicula(tfAño.getText());
        pelicula.setResumenPelicula(taResumen.getText());
        pelicula.setNombreDirector(tfDirector.getText());
        return pelicula;
    }
    
    private void crear() {
        Pelicula pelicula = obtenerDatosDeFormulario();
        
        Long id = Long.parseLong(tfId.getText());
        Optional<Pelicula> optionalPelicula = repositorioPelicula.findById(id);
        StringBuffer respuesta = new StringBuffer();
        if(optionalPelicula.isPresent()){
            respuesta.append("Se actualizó la siguiente Pelicula exitosamente: ");
        }
        else{
            respuesta.append("Se añadio la Pelicula: ");
        }
        pelicula.setIdPelicula(id);
                
        try{
            repositorioPelicula.save(pelicula); 
            respuesta.append(pelicula.getTituloPelicula()); 
            tfId.setText(pelicula.getIdPelicula().toString());
            lbNotificaciones.setText(respuesta.toString());
        }
        catch(Exception e)
        {
            lbNotificaciones.setText("Error al guardar");
        }
    }
    
}
