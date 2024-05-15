package com.mycompany.actividad2;

import java.util.Scanner;

public class Actividad2 {

    
    private static int platosProcesados = 0;
    private static int platosTipicos = 0;
    private static int platosCarta = 0;
    private static int platosInternacionales = 0;

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int opcionMenuPrincipal;
        String nombreUsuario;

        do {
            System.out.println("\nMENÚ RESTAURANTE");
            System.out.print("Ingrese su nombre: ");
            nombreUsuario = sc.nextLine();

            System.out.println("\n1. Plato Típico");
            System.out.println("2. Plato a la Carta");
            System.out.println("3. Plato Internacional");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcionMenuPrincipal = sc.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    mostrarMenuTipico(sc, nombreUsuario);
                    break;
                case 2:
                    mostrarMenuCarta(sc, nombreUsuario);
                    break;
                case 3:
                    mostrarMenuInternacional(sc, nombreUsuario);
                    break;
                case 4:
                    System.out.println("¡Gracias por su visita, " + nombreUsuario + "!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionMenuPrincipal != 4);

       
        imprimirFactura(nombreUsuario);
    }

    
    private static void mostrarMenuTipico(Scanner sc, String nombreUsuario) {
        System.out.println("\nMENÚ PLATO TÍPICO");
        System.out.println("1. Bandeja paisa - $15.000");
        System.out.println("2. Ajiaco - $12.000");
        System.out.println("3. Lechona - $18.000");
        System.out.println("4. Regresar al menú principal");
        System.out.print("Ingrese una opción: ");

        int opcionMenuTipico = sc.nextInt();
        switch (opcionMenuTipico) {
            case 1:
                procesarPedido(nombreUsuario, "Bandeja paisa", 15000);
                break;
            case 2:
                procesarPedido(nombreUsuario, "Ajiaco", 12000);
                break;
            case 3:
                procesarPedido(nombreUsuario, "Lechona", 18000);
                break;
            case 4:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    
    private static void mostrarMenuCarta(Scanner sc, String nombreUsuario) {
        System.out.println("\nMENÚ PLATO A LA CARTA");
        System.out.println("1. Pollo a la plancha - $10.000");
        System.out.println("2. Salmón al horno - $14.000");
        System.out.println("3. Pasta Alfredo - $12.000");
        System.out.println("4. Regresar al menú principal");
        System.out.print("Ingrese una opción: ");

        int opcionMenuCarta = sc.nextInt();
        switch (opcionMenuCarta) {
            case 1:
                procesarPedido(nombreUsuario, "Pollo a la plancha", 10000);
                break;
            case 2:
                procesarPedido(nombreUsuario, "Salmón al horno", 14000);
                break;
            case 3:
                procesarPedido(nombreUsuario, "Pasta Alfredo", 12000);
                break;
            case 4:
                break;
            default:
                System.out.println("Opción no válida.");
        }   
    }

    private static void procesarPedido(String nombreUsuario, String pasta_Alfredo, int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void imprimirFactura(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void mostrarMenuInternacional(Scanner sc, String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}   
