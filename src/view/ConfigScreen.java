package view;

import java.awt.Dimension;

import javax.swing.*;

import control.SensorControl;

public class ConfigScreen extends JFrame {
        private JButton jcomp1;
        private JButton jcomp2;
        private JTextArea jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
        private JLabel jcomp7;
        private JLabel jcomp8;
        private JLabel jcomp14;
        private JTextField jcomp9;
        private JTextField jcomp10;
        private JTextField jcomp11;
        private JTextField jcomp12;
        private JTextField jcomp13;
        ScreenBridge screenbridge;
        SensorControl sensorcontrol;
        String type;
        int pos;

        public ConfigScreen() {
                sensorcontrol = new SensorControl();
                initComponents();
        }

        public void setBridge(ScreenBridge bridge) {
                screenbridge = bridge;
        }

        public void setType(String type, int pos) {
                this.type = type;
                this.pos = pos;
        }

        public void changeVisible(boolean opt) {
                setVisible(opt);
        }

        private void initComponents() {
                // construct components
                jcomp1 = new JButton("<-");
                jcomp2 = new JButton("Confirmar");
                jcomp3 = new JTextArea(5, 5);
                jcomp4 = new JLabel("Atraso Inicial: (M)");
                jcomp5 = new JLabel("Quantidade de Produção:");
                jcomp6 = new JLabel("Intervalo de Produção: (M)");
                jcomp7 = new JLabel("Variação de Atraso: (M)");
                jcomp8 = new JLabel("Quantidade de Paradas:");
                jcomp14 = new JLabel("Os parametros devem conter números!");
                jcomp9 = new JTextField(5);
                jcomp10 = new JTextField(5);
                jcomp11 = new JTextField(5);
                jcomp12 = new JTextField(5);
                jcomp13 = new JTextField(5);
                // adjust size and set layout

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Meta_MInA");
                setBackground(new java.awt.Color(204, 204, 204));
                setResizable(false);
                setSize(new java.awt.Dimension(336, 367));

                setPreferredSize(new Dimension(336, 367));
                setLayout(null);
                setVisible(false);

                // add components
                add(jcomp1);
                add(jcomp2);
                add(jcomp3);
                add(jcomp4);
                add(jcomp5);
                add(jcomp6);
                add(jcomp7);
                add(jcomp8);
                add(jcomp9);
                add(jcomp10);
                add(jcomp11);
                add(jcomp12);
                add(jcomp13);
                add(jcomp14);

                // set component bounds (only needed by Absolute Positioning)
                jcomp1.setBounds(5, 5, 65, 55);
                jcomp2.setBounds(85, 260, 140, 20);
                jcomp3.setBounds(75, 5, 245, 55);
                jcomp4.setBounds(40, 95, 115, 25);
                jcomp5.setBounds(40, 125, 150, 25);
                jcomp6.setBounds(40, 155, 155, 25);
                jcomp7.setBounds(40, 185, 135, 25);
                jcomp8.setBounds(40, 215, 145, 25);
                jcomp9.setBounds(195, 95, 100, 25);
                jcomp10.setBounds(195, 125, 100, 25);
                jcomp11.setBounds(195, 155, 100, 25);
                jcomp12.setBounds(195, 185, 100, 25);
                jcomp13.setBounds(195, 215, 100, 25);
                jcomp14.setBounds(40, 280, 245, 20);

                jcomp14.setVisible(false);

                //
                jcomp3.setEditable(false);
                jcomp3.setFont(new java.awt.Font("Segoe UI", 0, 22));
                jcomp3.setText("Configurar Sensor");

                jcomp1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jcomp1ActionPerformed(evt);
                        }
                });
                jcomp2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jcomp2ActionPerformed(evt);
                        }
                });

        }

        // Botão voltar
        private void jcomp1ActionPerformed(java.awt.event.ActionEvent evt) {
                screenbridge.ConfigtoSelect();
        }

        // Botão confirmar
        private void jcomp2ActionPerformed(java.awt.event.ActionEvent evt) {
                boolean check;
                check = sensorcontrol.buildSensor(jcomp9.getText(), jcomp11.getText(), jcomp10.getText(),
                                jcomp12.getText(),
                                jcomp13.getText(), type);
                if (check == true) {
                        screenbridge.ConfigtoHome(pos, type);
                } else {
                        jcomp14.setVisible(true);
                }
        }
}