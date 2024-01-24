import java.util.Scanner;

public class HypotenuseCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first edge: ");
        int edge1 = sc.nextInt();
        System.out.print("Enter second edge: ");
        int edge2 = sc.nextInt();

        double hypo = hypotenuse(edge1,edge2);
        System.out.println("Hypotenuse: " + hypo);

    }

    static double hypotenuse(int edge1 , int edge2){
        return Math.sqrt(Math.pow(edge1,2)+Math.pow(edge2,2));

    }
}
