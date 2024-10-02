import java.util.Scanner;

public class IT24100151Lab7Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int NUM_CUSTOMERS = 5;
        double discountRate = 0.05;
        
        for (int i = 1; i <= NUM_CUSTOMERS; i++) {
            System.out.print("Enter total amount for customer " + i + ": ");  
            double totalBill = scanner.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * discountRate;
                double discountedBill = totalBill - discount;
                System.out.printf("Discount applied: %.2f\n", discount);
                System.out.printf("Amount to be paid: %.2f\n", discountedBill);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.printf("Amount to be paid: %.2f\n", totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            
            System.out.println(); 
        }
        
        scanner.close();
    }
}
