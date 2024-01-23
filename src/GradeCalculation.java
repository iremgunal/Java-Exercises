import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physic,math,english,music;

        System.out.print("Physic: ");
        physic = sc.nextInt();
        System.out.print("Math: ");
        math = sc.nextInt();
        System.out.print("English: ");
        english = sc.nextInt();
        System.out.print("Music: ");
        music = sc.nextInt();

        System.out.println("Physic grade: " + physic);
        System.out.println("Math grade: " + math);
        System.out.println("English grade: " + english);
        System.out.println("Music grade: " + music);

        double avg = averageGrade(physic, math, english, music);
        System.out.println("Your average grade: " + avg);

        result(avg);
    }
    static double averageGrade(double physic, double math, double english, double music){
        double average = (physic+math+english+music)/4;
        return average;
    }

    static void result(double average){
        while(average>=60){
            System.out.println("successful");
            break;
        }
        while(average<60){
            System.out.println("Unsuccessful");
            break;
        }
    }
}
