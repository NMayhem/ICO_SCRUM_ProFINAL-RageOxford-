/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Scrum extends javax.swing.JFrame {
    
    
     public Scrum() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(42,42,42));
    }


    /**
     * Creates new form Desarrolladores
     */
    
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        jButton1.setBackground(new java.awt.Color(69, 69, 69));
        jButton1.setActionCommand("<<");
        jButton1.setLabel("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(42, 42, 42));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Metodologías Ágiles");

        jTabbedPane1.setBackground(new java.awt.Color(69, 69, 69));

        jPanel3.setBackground(new java.awt.Color(69, 69, 69));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/fes/Pics/imag1.png"))); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(69, 69, 69));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea1.setRows(5);
        jTextArea1.setText("¿Qué es una metodología del desarrollo ágil?\n\nSon diferentes técnicas para la gestión de proyectos que surgen para ofrecer una alternativa\ncon mayor efectividad que los métodos tradicionales los cuales estaban caracterizados por\nel dominio de documentación; estas metodologías permiten minimizar el impacto de las\ntareas que no son completamente imprescindibles para el logro de objetivos del proyecto.\n\nLas metodologías ágiles valoran el recurso humano como el principal factor de éxito, es\ndecir reconocen que contar con recurso humano calificado y con las capacidades técnicas\nadecuadas, el trabajo en equipo e interactuar convenientemente con el usuario, da mayor\ngarantía de éxito que contar con herramientas y procesos rigurosos.\n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Metodologías", jPanel3);

        jPanel4.setBackground(new java.awt.Color(69, 69, 69));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/fes/Pics/imag2.png"))); // NOI18N

        jTextArea2.setBackground(new java.awt.Color(69, 69, 69));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea2.setRows(5);
        jTextArea2.setText("¿Qué es Scrum ?\n\nScrum es un marco de trabajo que equipos cross-funcionales pueden crear pro-\nductos o desarrollar proyectos de una forma iterativa e incremental estructurando\nsu forma de trabajo en ciclos llamados Sprints.\n");
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Scrum", jPanel4);

        jPanel1.setBackground(new java.awt.Color(69, 69, 69));

        jTextArea3.setBackground(new java.awt.Color(69, 69, 69));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea3.setRows(5);
        jTextArea3.setText("¿Cuáles son los roles que existen en Scrum?\n\nDueño del Producto\n\nEs el responsable de maximizar el retorno de inversión a base de identificar las funcionalidades de producto y\ntrasladarlas a una lista priorizada de la cual se hará cargo el Equipo de Desarrollo.\n\t\nEquipo de Desarrollo\n\nSe trata de un equipo de entre 2 y 7 personas que engloba toda la experiencia y conocimientos necesarios para\ndesarrollar un producto potencialmente entregable en cada Sprint; es además auto-organizado, lo que significa\nque debe tener un gran margen de autonomía y responsabilidad.\n\nEl Equipo decide cuántos elementos (de la lista o conjunto que ofrece el Dueño del Producto) va a desarrollar\ndurante cada Sprint y cuál es la mejor manera de lograr el objetivo.\n\t\nScrum Master\n\nEs el encargado de ayudar en el área del producto así como en la aplicación correcta de Scrum con el fin de\nayudar a eliminar impedimentos, proteger al Equipo de interferencias externas y facilitar la adopción de prácticas\nde desarrollo modernas. Se trata más de un coach que de un líder, cuya tarea es asegurarse de que todo el\nmundo comprende los principios y prácticas de Scrum, guiando a la organización a través de los repentinos\ncambios que son necesarios para lograr el éxito en el desarrollo ágil.");
        jScrollPane2.setViewportView(jTextArea3);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Roles");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/fes/Pics/scrumlogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Roles", jPanel1);

        jPanel2.setBackground(new java.awt.Color(69, 69, 69));

        jTextArea4.setBackground(new java.awt.Color(69, 69, 69));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea4.setRows(5);
        jTextArea4.setText("Dentro del universo de los métodos ágiles existen numerosas herramientas que pueden ayudar al equipo de\ndesarrollo a crear, construir, planificar, gestionar y monitorear el avance de User Stories (US) y además apoyan\nla organización y gestión de backlogs, sprints y la mayoría de los artefactos que son propios de la gestión ágil.\nUna gran mayoría de equipos que hacen Scrum usan algunas de estas herramientas:\n");
        jScrollPane1.setViewportView(jTextArea4);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/fes/Pics/imag3.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/fes/Pics/imag4.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/fes/Pics/imag5.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
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
                        .addGap(4, 4, 4)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Herramientas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("El mary");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         this.dispose();
        Ventana vent = new Ventana();
        vent.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Basecamp es una herramienta que permite un uso cómodo tanto en escritorio como en dispositivos móviles y es otro de los gestores de proyectos ágiles\nmejor valorados por la comunidad Scrum. El gestor se divide en varios apartados con distintas funcionalidades: backlog de tareas por hacer; foro para\nintercambio de opiniones; agregador de documentos y archivos; un calendario y todo lo relacionado a mensajes privados y notificaciones.", "Basecamp", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Este último es un gestor de proyectos en donde los miembros pueden generar columnas donde paquetizar procesos de trabajo como ideas, lista de tareas\npor hacer, tareas en progreso y tareas finalmente realizadas, en él se pueden cargar archivos desde el escritorio, y es capaz de integrarse con otras\nherramientas de trabajo colaborativo como son: Google Drive, Dropbox, Box y Microsoft OneDrive. Aunque no es un gestor con grandes\nrecursos, se maneja de una manera muy sencilla y contiene lo necesario para desempeñar una buena gestión de proyectos.", "Trello", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Jira es un software que se ha convertido en uno de los gestores de proyectos más utilizados del mercado y es una solución simple, con una curva de aprendizaje\nrelativamente pequeña pero sin perder la potencia necesaria para dirigir grandes proyectos de desarrollo de software. Jira dispone de notificaciones vía\ncorreo electrónico, posibilidad de adjuntar documentación , filtros, sistema de búsqueda basado en lenguaje natural, extensible y de fácil integración\ncon casi todos los sistemas o bases de datos.", "Jira", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton2MouseClicked
 
    
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
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scrum().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
