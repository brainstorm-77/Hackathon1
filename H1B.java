import java.util.Scanner;
public class H1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Water consumption in litres: ");
        double consumption = sc.nextDouble();
        int bill;
        if (consumption <= 500) {
            bill = 100;
        } else{
            bill = 200;
        }
        System.out.println("Water bill = Rs " + bill);
        sc.close();
    }
}
