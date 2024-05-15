package com.mycompany.activididad;
import javax.swing.JOptionPane;

public class Actividad {

    final int AÑO_ACTUAL = 2024;
    int modelo = 0;
    double valorLavado = 0;
    double valorTotal = 0;
    int caracteristica = 0;
    int cantAutomovil = 0, cantCampero = 0, cantCamioneta = 0, cantIncremento = 0;

    public static void main(String[] args) {
        String menu = "MENÚ AUTOLAVADO\n";
        menu += "1. Automóvil\n";
        menu += "2. Campero\n";
        menu += "3. Camioneta\n";
        menu += "Ingrese el tipo:\n";

        String menuAutomovil = "MENÚ AUTOMÓVIL\n";
        menuAutomovil += "1. Pequeño\n";
        menuAutomovil += "2. Mediano\n";
        menuAutomovil += "3. De lujo\n";
        menuAutomovil += "Ingrese la característica:\n";

        String menuCampero = "MENÚ CAMPERO\n";
        menuCampero += "1. Sencillo\n";
        menuCampero += "2. De lujo\n";
        menuCampero += "Ingrese la característica:\n";

        String menuCamioneta = "MENÚ CAMIONETA\n";
        menuCamioneta += "1. Cabina Sencilla\n";
        menuCamioneta += "2. Doble Cabina\n";
        menuCamioneta += "Ingrese la característica:\n";

        int veces = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehículos a lavar: "));
        int i = 0;

        do {
            modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehículo: "));

            if (modelo < 1900 || modelo > AÑO_ACTUAL) {
                System.out.println("El modelo de vehículo no es válido. Ingrese un año entre 1900 y " + AÑO_ACTUAL);
                continue;
            }

            int tipo;
            do {
                tipo = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } while (tipo < 1 || tipo > 3);

            switch (tipo) {
                case 1:
                    cantAutomovil++;
                    caracteristica = Integer.parseInt(JOptionPane.showInputDialog(menuAutomovil));

                    switch (caracteristica) {
                        case 1:
                            System.out.println("La lavada cuesta $4000");
                            valorLavado = 4000;
                            break;
                        case 2:
                            System.out.println("La lavada cuesta $5000");
                            valorLavado = 5000;
                            break;
                        case 3:
                            System.out.println("La lavada cuesta $6000");
                            valorLavado = 6000;
                            break;
                        default:
                            System.out.println("No existe esa característica");
                            valorLavado = 0;
                            break;
                    }
                    break;
                case 2:
                    cantCampero++;
                    caracteristica = Integer.parseInt(JOptionPane.showInputDialog(menuCampero));

                    switch (caracteristica) {
                        case 1:
                            System.out.println("La lavada cuesta $5000");
                            valorLavado = 5000;
                            break;
                        case 2:
                            System.out.println("La lavada cuesta $8000");
                            valorLavado = 8000;
                            break;
                        default:
                            System.out.println("No existe esa característica");
                            valorLavado = 0;
                            break;
                    }
                    break;
                case 3:
                    cantCamioneta++;
                    caracteristica = Integer.parseInt(JOptionPane.showInputDialog(menuCamioneta));

                    switch (caracteristica) {
                        case 1:
                            System.out.println("La lavada cuesta $6000");
                            valorLavado = 6000;
                            break;
                        case 2:
                            System.out.println("La lavada cuesta $8000");
                            valorLavado = 8000;
                            break;
                        default:
