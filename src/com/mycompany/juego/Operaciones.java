package com.mycompany.juego;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

public class Operaciones {
    public static void main(String[] args) {
        generarOperacion();
    }

    public static void generarOperacion() {
        int num1 = generarNumeroAleatorio(1, 10); // Genera un número aleatorio entre 1 y 10
        int num2 = generarNumeroAleatorio(1, 10);
        String operador = generarOperadorAleatorio();
        int resultadoEsperado = calcularResultado(num1, num2, operador);
        
        String pregunta = num1 + " " + operador + " " + num2 + " = ?";
        String respuesta = JOptionPane.showInputDialog(null, pregunta, "Ecuación", JOptionPane.QUESTION_MESSAGE);
        
        while (!esRespuestaCorrecta(respuesta, resultadoEsperado)) {
            int opcion = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta. ¿Deseas volver a intentarlo?", "Ecuación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                respuesta = JOptionPane.showInputDialog(null, pregunta, "Ecuación", JOptionPane.QUESTION_MESSAGE);
            } else {
                generarOperacion();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "¡Respuesta correcta!", "Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static String generarOperadorAleatorio() {
        String[] operadores = {"+", "-", "*", "/"};
        int indice = generarNumeroAleatorio(0, operadores.length - 1);
        return operadores[indice];
    }

    public static int calcularResultado(int num1, int num2, String operador) {
        int resultado = 0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }

    public static boolean esRespuestaCorrecta(String respuesta, int resultadoEsperado) {
        try {
            int respuestaInt = Integer.parseInt(respuesta);
            return respuestaInt == resultadoEsperado;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
