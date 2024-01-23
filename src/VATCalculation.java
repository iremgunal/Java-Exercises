import java.util.Scanner;

public class VATCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        double VATRate = 0.2;
        double VATAmount;
        double totalPrice;

        System.out.print("Base price: "  );
         price = sc.nextDouble();

        if (price < 0) {
            System.out.println("Invalid input. Price cannot be negative.");
            return;
        }

        totalPrice = calculatePrice(price,VATRate);
        VATAmount = calculateVATAmount(price,VATRate);

        System.out.println("VAT Amount: " + VATAmount );
        System.out.println("Total Price: " + totalPrice);


    }

    static double calculatePrice(double price, double VATRate){
       double VATAmount=  calculateVATAmount(price,VATRate);
        double totalPrice = price + VATAmount;
        return totalPrice;
    }
    static double calculateVATAmount(double price, double VATRate) {
        return price * VATRate;
    }
}
