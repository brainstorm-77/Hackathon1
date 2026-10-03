import java.util.Scanner;
public class H1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int n = sc.nextInt();
        System.out.print("Enter number of liters of water consumed: ");
        double liters = sc.nextDouble();
        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();
        System.out.print("Enter water usage status (G for Good, H for High): ");
        char waterStatus = sc.next().charAt(0);

        System.out.println("\n--- Household Details ---");
        System.out.println("Number of family members: " + n);
        System.out.println("Water consumed: " + liters + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterStatus);

        sc.close();
    }
}