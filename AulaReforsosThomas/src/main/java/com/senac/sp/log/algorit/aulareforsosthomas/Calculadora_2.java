/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.log.algorit.aulareforsosthomas;

import java.util.Scanner;

/**
 *
 * @author gda_a
 */
public class Calculadora_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor para somar");
        double soma1 = sc.nextDouble();

        System.out.println("Digite o segundo valor para soma ");
        double soma2 = sc.nextDouble();

        double resultado = somar(soma1, soma2);
        System.out.println("Resultado da soma:" + resultado);
        sc.close();
    }

    public static double somar(double x, double y) {
        double resultado = x + y;
        return resultado;
    }  

}
