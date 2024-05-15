package com.mycompany.activididad;
import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter social stratum (1, 2, or 3): ");
        int socialStratum = scanner.nextInt();

      
        System.out.print("Enter marital status (single, married, separated, widowed): ");
        String maritalStatus = scanner.next();

    
        System.out.print("Enter number of courses: ");
        int numberOfCourses = scanner.nextInt();

        double baseFee = 0;
        switch (socialStratum) {
            case 1:
                baseFee = 150000;
                break;
            case 2:
                baseFee = 250000;
                break;
            case 3:
                baseFee = 400000;
                break;
            default:
                System.out.println("Invalid social stratum.");
                return;
        }

        double additionalFee = 0;
        switch (maritalStatus) {
            case "single":
                additionalFee = 0;
                break;
            case "married":
                additionalFee = 10000;
                break;
            case "separated":
                additionalFee = 20000;
                break;
            case "widowed":
                additionalFee = 30000;
                break;
            default:
                System.out.println("Invalid marital status.");
                return;
        }

        double courseFee = 10000 * numberOfCourses;
        double totalTuitionFee = baseFee + additionalFee + courseFee;
        System.out.println("Total tuition fee: " + totalTuitionFee);
    }
}

