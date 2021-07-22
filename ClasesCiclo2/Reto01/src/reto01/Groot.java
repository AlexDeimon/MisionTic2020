/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto01;
import java.util.Scanner;

/**
 *
 * @author ldben
 */
public class Groot {

    public static void main(String[] args) {
        Scanner cosita = new Scanner(System.in);
        int n = Integer.parseInt(cosita.nextLine());

        System.out.println(emociones(n));
    }

    public static String emociones(int b) {
        String c = "";
        String vector[] = {"I am", "I groot"};
        int contador = 1;
        while (contador <= b) {
            if (contador % 2 == 0) {
                c += vector[0];
                if (contador < b) {
                    c += "that";
                } else {
                    c += "it";
                }

            } else {
                c += vector[1];
                if (contador < b) {
                    c += "that";
                } else {
                    c += "it";
                }
            }

        }
        return c;

    }

}