
package com.mycompany.activididad;
import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese la categoría del vendedor: ");
        int categoria = sc.nextInt();

        
        System.out.print("Ingrese las ventas del último mes: ");
        double ventas = sc.nextDouble();

       
        double pagoBasico = 0;
        switch (categoria) {
            case 1:
                pagoBasico = 100000;
                break;
            case 2:
                pagoBasico = 200000;
                break;
            case 3:
                pagoBasico = 300000;
                break;
            case 4:
                if (ventas <= 1000000) {
                    pagoBasico = ventas;
                } else {
                    pagoBasico = 1000000;
                }
                break;
            case 5:
                if (ventas <= 2000000) {
                    pagoBasico = 100000 + (ventas - 1000000) * 0.05;
                } else {
                    pagoBasico = 100000 + 100000 * 0.05 + (ventas - 2000000) * 0.1;
                }
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }

       
        double comision = 0;
        switch (categoria) {
            case 1:
                comision = ventas * 0.03;
                break;
            case 2:
                comision = ventas * 0.02;
                break;
            case 3:
                comision = ventas * 0.01;
                break;
            case 4:
            case 5:
           
                break;
        }

     
        double pagoTotal = pagoBasico + comision;
        System.out.println("Pago total: " + pagoTotal);
    }
}
