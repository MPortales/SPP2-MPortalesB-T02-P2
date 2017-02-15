/*Maythe Portales Barrios
A01411461 IIS
Tarea 2
problema 2
 
 */
package spp2.mportalesb.t02.p2;

import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalesBT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int valinf, valsup, numeros;
        System.out.println("Introduce tu valor superior");
        valsup = teclado.nextInt();
        System.out.println("Introduce tu valor inferior");
        valinf = teclado.nextInt();
        numeros = valinf;

        System.out.println("Numeros entre valinf y valsup");
        for (numeros = valinf + 1; numeros < valsup; numeros++) {
            System.out.println(numeros);

            if (numeros % 2 == 0) {
                System.out.println("Es un numero par");
            } else {
                System.out.println("No es un numero par");
            }

            if (numeros % 3 == 0) {
                System.out.println("Es un numero divisible entre 3");
            } else {
                System.out.println("NO es un numero divisible entre 3");
            }

            if (numeros % 5 == 0) {
                System.out.println("Es un numero divisible entre 5");
            } else {
                System.out.println("NO es un numero divisible entre 5");
            }
        }

    }

}
