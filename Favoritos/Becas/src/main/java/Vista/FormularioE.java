

package Vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FormularioE extends javax.swing.JFrame {
    
    public ArrayList<Logica.Usuario> usuarios;

    public FormularioE() {
        initComponents();
        usuarios = new ArrayList<>();
        this.setLocationRelativeTo(null);

    }

    public void listar() {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < usuarios.size(); i++) {
            modelo.addElement(usuarios.get(i).getId() + ", " + usuarios.get(i).getNombreC() + ", " + usuarios.get(i).getRut() + ", " + usuarios.get(i).getEdad() + ", "
                    + usuarios.get(i).getGenero() + ", " + usuarios.get(i).getCorreo() + ", " + usuarios.get(i).getDireccion()
                    + ", " + usuarios.get(i).getSituacion() + ", " + usuarios.get(i).getExamen()
                    + ", " + usuarios.get(i).getPorcentaje());
        }
        infolista.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        grupog = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hombreRadioButton = new javax.swing.JRadioButton();
        MujerRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tituloFormulario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NuevoRadioButton = new javax.swing.JRadioButton();
        AntiguoRadioButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        porcentajeComboBox = new javax.swing.JComboBox<>();
        rutField = new javax.swing.JTextField();
        edadField = new javax.swing.JTextField();
        correoTextField = new javax.swing.JTextField();
        dirrecionTextField = new javax.swing.JTextField();
        examenField = new javax.swing.JTextField();
        enviarButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        mostrarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        infolista = new javax.swing.JList<>();
        eliminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre completo:");

        jLabel2.setText("RUT:");

        jLabel3.setText("Edad:");

        grupog.add(hombreRadioButton);
        hombreRadioButton.setText("Hombre");
        hombreRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombreRadioButtonActionPerformed(evt);
            }
        });

        grupog.add(MujerRadioButton);
        MujerRadioButton.setText("Mujer");
        MujerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MujerRadioButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Género:");

        tituloFormulario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tituloFormulario.setText("Bienvenidos al formulario para la beca Universitaria 2024");

        jLabel6.setText("Correo:");

        jLabel7.setText("Dirreción");

        jLabel8.setText("¿Que procentaje tienes en tu registro social?");

        jLabel9.setText("¿Cual es tu situación en la universidad?");

        buttonGroup1.add(NuevoRadioButton);
        NuevoRadioButton.setText("Nuevo");

        buttonGroup1.add(AntiguoRadioButton);
        AntiguoRadioButton.setText("Antiguo");
        AntiguoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntiguoRadioButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("¿Cual fue tu resultado del examen de admisión?");

        porcentajeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        porcentajeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeComboBoxActionPerformed(evt);
            }
        });

        dirrecionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirrecionTextFieldActionPerformed(evt);
            }
        });

        examenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examenFieldActionPerformed(evt);
            }
        });

        enviarButton.setText("Enviar formulario");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        limpiarButton.setText("Limpiar");
        limpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarButtonActionPerformed(evt);
            }
        });

        mostrarButton.setText("Mostrar");
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Id:");

        idField.setEditable(false);
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(infolista);

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(hombreRadioButton)
                        .addGap(26, 26, 26)
                        .addComponent(MujerRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(porcentajeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addComponent(rutField))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(edadField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dirrecionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(42, 42, 42)
                                                    .addComponent(NuevoRadioButton)
                                                    .addGap(31, 31, 31)
                                                    .addComponent(AntiguoRadioButton)
                                                    .addGap(27, 27, 27)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(jLabel5)
                                        .addGap(39, 39, 39)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(examenField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enviarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpiarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(mostrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
                        .addGap(0, 84, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(tituloFormulario)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NuevoRadioButton)
                            .addComponent(AntiguoRadioButton))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(edadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(hombreRadioButton)
                            .addComponent(MujerRadioButton))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dirrecionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(porcentajeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(examenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarButton)
                    .addComponent(limpiarButton)
                    .addComponent(mostrarButton)
                    .addComponent(salirButton)
                    .addComponent(eliminarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hombreRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombreRadioButtonActionPerformed
    }//GEN-LAST:event_hombreRadioButtonActionPerformed

    private void MujerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MujerRadioButtonActionPerformed
    }//GEN-LAST:event_MujerRadioButtonActionPerformed

    private void AntiguoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntiguoRadioButtonActionPerformed
    }//GEN-LAST:event_AntiguoRadioButtonActionPerformed

    private void porcentajeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeComboBoxActionPerformed
    }//GEN-LAST:event_porcentajeComboBoxActionPerformed

    private void examenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examenFieldActionPerformed
    }//GEN-LAST:event_examenFieldActionPerformed

    private void dirrecionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirrecionTextFieldActionPerformed
    }//GEN-LAST:event_dirrecionTextFieldActionPerformed

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        Logica.Usuario usuario = new Logica.Usuario();
        String idS, nombreC, rut, genero, correo, direccion, situacion, edadS, porcentajeS, examenS;
        int id = 0, edad = 0, porcentaje = 0;
        float examen = 0.0f;

        idS = idField.getText();
        try {
            id = Integer.parseInt(idS);
            id=id+1;
            idS =String.valueOf(id);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }

        nombreC = nombreField.getText();
        porcentajeS = porcentajeComboBox.getSelectedItem().toString();
        try {
            porcentaje = Integer.parseInt(porcentajeS);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }
        edadS = edadField.getText();
        try {
            edad = Integer.parseInt(edadS);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }

        rut = rutField.getText();
        correo = correoTextField.getText();
        direccion = dirrecionTextField.getText();
        examenS = examenField.getText();
        try {
            examen = Float.parseFloat(examenS);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El dato debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (hombreRadioButton.isSelected()) {
            genero = "Hombre";
        } else {
            genero = "Mujer";
        }
        if (NuevoRadioButton.isSelected()) {
            situacion = "Nuevo";
        } else {
            situacion = "Antiguo";
        }

        usuario.setId(id);
        usuario.setNombreC(nombreC);
        usuario.setRut(rut);
        usuario.setGenero(genero);
        usuario.setCorreo(correo);
        usuario.setDireccion(direccion);
        usuario.setEdad(edad);
        usuario.setSituacion(situacion);
        usuario.setPorcentaje(porcentaje);
        usuario.setExamen(examen);
        usuarios.add(usuario);
        listar();
        JOptionPane.showMessageDialog(null, "Se envio correctamente su formulario", "ENVIAR", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_enviarButtonActionPerformed

    private void limpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButtonActionPerformed
        idField.setText(null);
        nombreField.setText(null);
        correoTextField.setText(null);
        rutField.setText(null);
        grupog.clearSelection();
        dirrecionTextField.setText(null);
        buttonGroup1.clearSelection();
        porcentajeComboBox.setSelectedIndex(0);
        edadField.setText(null);
        examenField.setText(null);
        idField.requestFocus();


    }//GEN-LAST:event_limpiarButtonActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        int row = infolista.getAnchorSelectionIndex();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la lista", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, usuarios.get(row).getDatos(), "Mostrar", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_mostrarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AntiguoRadioButton;
    private javax.swing.JRadioButton MujerRadioButton;
    private javax.swing.JRadioButton NuevoRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField correoTextField;
    private javax.swing.JTextField dirrecionTextField;
    private javax.swing.JTextField edadField;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton enviarButton;
    private javax.swing.JTextField examenField;
    private javax.swing.ButtonGroup grupog;
    private javax.swing.JRadioButton hombreRadioButton;
    private javax.swing.JTextField idField;
    private javax.swing.JList<String> infolista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JComboBox<String> porcentajeComboBox;
    private javax.swing.JTextField rutField;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel tituloFormulario;
    // End of variables declaration//GEN-END:variables


}
