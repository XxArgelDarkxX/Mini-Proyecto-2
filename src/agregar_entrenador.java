

import java.awt.Color;
import java.util.ArrayList;

public class agregar_entrenador extends javax.swing.JFrame {

    public agregar_entrenador() {
        initComponents();
    }

    ArrayList<String> empezar_entrenador = new ArrayList<>(2);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        cuadro_entrenador_1 = new javax.swing.JTextField();
        entrenador_1 = new javax.swing.JLabel();
        entrenador_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Agrege los nombre de los entrenadores");
        titulo.setToolTipText("");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setToolTipText("your name");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 113, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("2094425.png"))); // NOI18N
        imagen.setText("jLabel2");

        botonAgregar.setBackground(new java.awt.Color(224, 255, 255));
        botonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        botonAgregar.setText("Agregar");
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarMouseExited(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        cuadro_entrenador_1.setForeground(new java.awt.Color(153, 153, 153));
        cuadro_entrenador_1.setToolTipText("your name");
        cuadro_entrenador_1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cuadro_entrenador_1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cuadro_entrenador_1FocusLost(evt);
            }
        });
        cuadro_entrenador_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro_entrenador_1ActionPerformed(evt);
            }
        });

        entrenador_1.setText("Entrenador 1°");

        entrenador_2.setText("Entrenador 2°");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(titulo))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(48, 48, 48)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(entrenador_2)
                                                                        .addComponent(entrenador_1))
                                                                .addGap(48, 48, 48)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(175, 175, 175)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cuadro_entrenador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imagen)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(titulo)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(entrenador_1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(entrenador_2)
                                        .addComponent(cuadro_entrenador_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(botonAgregar)
                                .addGap(27, 27, 27))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {



    }

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {
        if(!jTextField1.getText().equals("")){
            empezar_entrenador.add(jTextField1.getText());
        }
    }

    private void cuadro_entrenador_1FocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void cuadro_entrenador_1FocusLost(java.awt.event.FocusEvent evt) {
        if(!cuadro_entrenador_1.getText().equals("")){
            empezar_entrenador.add(cuadro_entrenador_1.getText());
        }
    }

    private void cuadro_entrenador_1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(!jTextField1.getText().isEmpty() && !cuadro_entrenador_1.getText().isEmpty()) {
            this.dispose();
            Pokemon pokemon = new Pokemon();
            pokemon.setVisible(true);
        }
    }

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        botonAgregar.setBackground(new Color (135, 206, 250));
    }

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        botonAgregar.setBackground(new Color (224, 255, 255));
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
            java.util.logging.Logger.getLogger(agregar_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_entrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton botonAgregar;
    private javax.swing.JTextField cuadro_entrenador_1;
    private javax.swing.JLabel entrenador_1;
    private javax.swing.JLabel entrenador_2;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel titulo;
    // End of variables declaration
}
