/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.log.algorit.aulareforsosthomas;

/**
 *
 * @author gda_a
 */
public class vetor4 {

    public static void main(String[] args) {
        int vetor[][] = {
            {0, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        };
        vetor[0][0] = 9;
        vetor[3][3] = 9;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(vetor[i][j]);
            }
            System.out.println();

        }
    }

}
