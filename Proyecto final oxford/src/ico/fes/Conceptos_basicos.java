/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

/**
 *
 * @author Miguel
 */
public class Conceptos_basicos extends javax.swing.JFrame {

    /**
     * Creates new form Conceptos_basicos
     */
    public Conceptos_basicos() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(42,42,42));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(69, 69, 69));
        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(42, 42, 42));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conceptos basicos");

        jTextArea1.setBackground(new java.awt.Color(42, 42, 42));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("¿Qué es la ingeniería de software?\n\nLa Ingeniería del Software es la rama de la ingeniería que crea y mantiene las aplicaciones de software usando\ntecnologías y prácticas de las ciencias de la computación, manejo de proyectos, ingeniería, el ámbito de la aplicación,\ny otros campos.\n\n\nCiclo de vida del Software\n\nEl propósito de estos ciclos es definir las distintas fases intermedias que son requeridas para dar validación al\ndesarrollo de la aplicación y de ese modo garantizar que el software cumpla con los requisitos esperados así como\ndar verificación de los procedimientos de desarrollo.\n\n\nEl Proceso\n\nEn la Ingeniería de Software se le llama así a un conjunto estructurado de actividades requeridas para desarrollar un\nsistema de software, el cual debe involucrar distintas tareas que emplean distintas técnicas y herramientas.\n\n\nMétodos\n\nSon las formas organizadas con las que se es capaz de producir software y que pueden incluir varios modelos ya\nestablecidos así como ciertos diseños.\n\n\nMetodologías\n\nUna metodología se encarga de elaborar estrategias de desarrollo de software que promueven prácticas adaptadas\nen vez de predictivas, y que se centran en las personas o los equipos, pero que están orientados hacia la funcionalidad\ny la entrega, además de requerir comunicación intensiva ya que hay siempre una implicación directa con el cliente.\n\n\nHerramientas\n\nPermiten que una organización o equipo de software defina un modelo completo del proceso (actividades, acciones,\ntareas, etc) y proporcionan un mapa conforme se va realizando el trabajo para las personas encargadas de darle\nseguimiento y control al proceso del software.\n\n\nParadigma\n\nSon modelos que nos ayudan a comprender la realidad y que permiten relacionarnos con el mundo, en el caso de la\nIngeniería de Software, los paradigmas definen un desarrollo estructurado como base a seguir en un proyecto de software");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(286, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        Ventana vent = new Ventana();
        vent.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Conceptos_basicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conceptos_basicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conceptos_basicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conceptos_basicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conceptos_basicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}