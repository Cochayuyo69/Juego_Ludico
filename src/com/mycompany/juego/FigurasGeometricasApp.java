package com.mycompany.juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FigurasGeometricasApp extends JFrame {
    private JPanel figuraPanel;
    private JButton[] opcionesBotones;
    private String[] opcionesFiguras = {"Cuadrado", "Círculo", "Triángulo", "Rectángulo", "Pentágono", "Óvalo"};
    private String figuraCorrecta;

    public FigurasGeometricasApp() {
        setTitle("Figuras Geométricas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        

        figuraPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarFigura(g);
            }
        };
        figuraPanel.setPreferredSize(new Dimension(300, 300));
        add(figuraPanel, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new GridLayout(2, 2));
        opcionesBotones = new JButton[4];

        for (int i = 0; i < opcionesBotones.length; i++) {
            opcionesBotones[i] = new JButton();
            opcionesBotones[i].setFont(new Font("Arial", Font.PLAIN, 16));
            opcionesBotones[i].addActionListener(new BotonFiguraListener());
            panelBotones.add(opcionesBotones[i]);
        }
        //Botón de retroceso
        JButton btn_retro = new JButton("<<");
        btn_retro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prueba_1 Mprueba = new prueba_1();
                Mprueba.setVisible(true);
                dispose();
            }
        });
        panelBotones.add(btn_retro);
        
        add(panelBotones, BorderLayout.SOUTH);

        generarFiguraAleatoria();
          setIconImage(getIconImage());
    }
    //Imagen de ícono
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/geometricas.jpg"));
        return retValue;
    }
    //Generar Figuras aleatorias
    private void generarFiguraAleatoria() {
        Random random = new Random();
        int indiceFigura = random.nextInt(opcionesFiguras.length);
        figuraCorrecta = opcionesFiguras[indiceFigura];

        String[] opcionesAleatorias = generarOpcionesAleatorias();
        for (int i = 0; i < opcionesBotones.length; i++) {
            opcionesBotones[i].setText(opcionesAleatorias[i]);
        }

        figuraPanel.repaint();
    }

    private void dibujarFigura(Graphics g) {
        int width = figuraPanel.getWidth();
        int height = figuraPanel.getHeight();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);

        if (figuraCorrecta.equals("Cuadrado")) {
            int size = Math.min(width, height) - 40;
            int x = (width - size) / 2;
            int y = (height - size) / 2;
            g.drawRect(x, y, size, size);
        } else if (figuraCorrecta.equals("Círculo")) {
            int diameter = Math.min(width, height) - 40;
            int x = (width - diameter) / 2;
            int y = (height - diameter) / 2;
            g.drawOval(x, y, diameter, diameter);
        } else if (figuraCorrecta.equals("Triángulo")) {
            int x1 = width / 2;
            int y1 = 30;
            int x2 = 30;
            int y2 = height - 30;
            int x3 = width - 30;
            int y3 = height - 30;
            int[] xPoints = {x1, x2, x3};
            int[] yPoints = {y1, y2, y3};
            g.drawPolygon(xPoints, yPoints, 3);
        } else if (figuraCorrecta.equals("Rectángulo")) {
            int widthRect = width - 40;
            int heightRect = height - 40;
            int x = (width - widthRect) / 2;
            int y = (height - heightRect) / 2;
            g.drawRect(x, y, widthRect, heightRect);
        } else if (figuraCorrecta.equals("Pentágono")) {
        int[] xPoints = {width / 2, width / 2 + 50, width / 2 + 30, width / 2 - 30, width / 2 - 50};
        int[] yPoints = {30, height / 2 - 30, height / 2 + 50, height / 2 + 50, height / 2 - 30};
        g.drawPolygon(xPoints, yPoints, 5);
        } else if (figuraCorrecta.equals("Óvalo")) {
        int widthOval = width - 40;
        int heightOval = height - 40;
        int x = (width - widthOval) / 2;
        int y = (height - heightOval) / 2;
        g.drawOval(x, y, widthOval, heightOval);
        }
    }

    private String[] generarOpcionesAleatorias() {
        Random random = new Random();
        String[] opciones = new String[opcionesBotones.length];
        opciones[0] = figuraCorrecta;

        for (int i = 1; i < opciones.length; i++) {
            int indiceFigura = random.nextInt(opcionesFiguras.length);
            opciones[i] = opcionesFiguras[indiceFigura];
        }

        // Barajar las opciones
        for (int i = 0; i < opciones.length; i++) {
            int indiceAleatorio = random.nextInt(opciones.length);
            String temp = opciones[i];
            opciones[i] = opciones[indiceAleatorio];
            opciones[indiceAleatorio] = temp;
        }

        return opciones;
    }

    private class BotonFiguraListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String figuraSeleccionada = boton.getText();

            if (figuraSeleccionada.equals(figuraCorrecta)) {
                JOptionPane.showMessageDialog(null, "¡Muy bien! Sigue así");
                generarFiguraAleatoria();
            } else {
                int opcion = JOptionPane.showConfirmDialog(null, "Incorrecto. ¿Volver a intentarlo?", "Figuras Geométricas", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.NO_OPTION) {
                    generarFiguraAleatoria();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FigurasGeometricasApp app = new FigurasGeometricasApp();
                app.setVisible(true);
            }
        });
    }
}
