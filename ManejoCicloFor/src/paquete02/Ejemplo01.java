/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
           int operacion;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d\n", i);

            for (int j = 1; j <= 3; j++) {
                operacion = i* j;
                System.out.printf("%d ", operacion);
            }
            System.out.printf("\n-------------\n");
        }
    }
}
