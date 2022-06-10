package view;

import java.awt.Dimension;

import javax.swing.*;

public class ConfigScreen extends JFrame {
        private JButton jcomp1;
        private JButton jcomp2;
        private JTextArea jcomp3;
        private JLabel jcomp4;
        private JLabel jcomp5;
        private JLabel jcomp6;
        private JLabel jcomp7;
        private JLabel jcomp8;
        private JTextField jcomp9;
        private JTextField jcomp10;
        private JTextField jcomp11;
        private JTextField jcomp12;
        private JTextField jcomp13;

        public ConfigScreen() {
                initComponents();
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
                setVisible(true);

                setPreferredSize(new Dimension(336, 367));
                setLayout(null);
                setVisible(true);

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

                //
                jcomp3.setEditable(false);
                jcomp3.setFont(new java.awt.Font("Segoe UI", 0, 22));
                jcomp3.setText("Configurar Sensor");
        }
}