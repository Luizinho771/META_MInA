
import javax.swing.*;

public class ConfigScreen extends JFrame {

        public ConfigScreen() {
                initComponents();
        }

        private void initComponents() {
                jButton5 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextPane1 = new javax.swing.JTextPane();
                jScrollPane3 = new javax.swing.JScrollPane();
                jTextPane2 = new javax.swing.JTextPane();
                jScrollPane4 = new javax.swing.JScrollPane();
                jTextPane3 = new javax.swing.JTextPane();
                jScrollPane5 = new javax.swing.JScrollPane();
                jTextPane4 = new javax.swing.JTextPane();
                jScrollPane6 = new javax.swing.JScrollPane();
                jTextPane5 = new javax.swing.JTextPane();
                jScrollPane7 = new javax.swing.JScrollPane();
                jTextPane6 = new javax.swing.JTextPane();
                jScrollPane8 = new javax.swing.JScrollPane();
                jTextPane7 = new javax.swing.JTextPane();
                jScrollPane9 = new javax.swing.JScrollPane();
                jTextPane8 = new javax.swing.JTextPane();
                jScrollPane10 = new javax.swing.JScrollPane();
                jTextPane9 = new javax.swing.JTextPane();
                jScrollPane11 = new javax.swing.JScrollPane();
                jTextPane10 = new javax.swing.JTextPane();
                jScrollPane12 = new javax.swing.JScrollPane();
                jTextPane11 = new javax.swing.JTextPane();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);

                jButton5.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
                jButton5.setText("<-");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jTextPane1.setEditable(false);
                jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
                jTextPane1.setText("Configurar Sensor");
                jScrollPane1.setViewportView(jTextPane1);

                jTextPane2.setEditable(false);
                jTextPane2.setText("Atraso Inicial:");
                jScrollPane3.setViewportView(jTextPane2);

                jTextPane3.setEditable(false);
                jTextPane3.setText("Quantidade de Produção:");
                jScrollPane4.setViewportView(jTextPane3);

                jTextPane4.setEditable(false);
                jTextPane4.setText("Intervalo de Produção:");
                jScrollPane5.setViewportView(jTextPane4);

                jTextPane5.setEditable(false);
                jTextPane5.setText("Variação de Atraso:");
                jScrollPane6.setViewportView(jTextPane5);

                jTextPane6.setEditable(false);
                jTextPane6.setText("Quantidade de Paradas:");
                jScrollPane7.setViewportView(jTextPane6);

                jTextPane7.setText("00:00:00");
                jScrollPane8.setViewportView(jTextPane7);

                jScrollPane9.setViewportView(jTextPane8);

                jTextPane9.setText("00:00:00");
                jScrollPane10.setViewportView(jTextPane9);

                jTextPane10.setText("00:00:00");
                jScrollPane11.setViewportView(jTextPane10);

                jScrollPane12.setViewportView(jTextPane11);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jButton5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(21, 21, 21)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jScrollPane4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jScrollPane11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane9,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane12,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jScrollPane8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(36, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                40,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                39,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jScrollPane3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                .addComponent(jScrollPane8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane4,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane9,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jScrollPane5,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jScrollPane10,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jScrollPane6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jScrollPane11,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jScrollPane7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane12,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(31, 31, 31)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
                new SelectSensorScreen();
                setVisible(false);
        }// GEN-LAST:event_jButton4ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton5;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane10;
        private javax.swing.JScrollPane jScrollPane11;
        private javax.swing.JScrollPane jScrollPane12;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JScrollPane jScrollPane6;
        private javax.swing.JScrollPane jScrollPane7;
        private javax.swing.JScrollPane jScrollPane8;
        private javax.swing.JScrollPane jScrollPane9;
        private javax.swing.JTextPane jTextPane1;
        private javax.swing.JTextPane jTextPane10;
        private javax.swing.JTextPane jTextPane11;
        private javax.swing.JTextPane jTextPane2;
        private javax.swing.JTextPane jTextPane3;
        private javax.swing.JTextPane jTextPane4;
        private javax.swing.JTextPane jTextPane5;
        private javax.swing.JTextPane jTextPane6;
        private javax.swing.JTextPane jTextPane7;
        private javax.swing.JTextPane jTextPane8;
        private javax.swing.JTextPane jTextPane9;
        // End of variables declaration//GEN-END:variables
}
