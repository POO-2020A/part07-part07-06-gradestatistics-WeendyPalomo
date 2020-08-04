
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumAll = 0, counterAll = 0;
        int sumPassing = 0, counterPassing = 0;
        int grade = 0, grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0;

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }

            if ((point >= 0) && (point <= 100)) {
                counterAll++;
                sumAll = sumAll + point;

                if (point >= 50) {
                    sumPassing = sumPassing + point;
                    counterPassing++;
                }
                if (point < 50) {
                    grade++;
                }
                else if (point < 60) {
                    grade1++;
                }
                else if (point < 70) {
                    grade2++;
                }
                else if (point < 80) {
                    grade3++;
                }
                else if (point < 90) {
                    grade4++;
                }
                else if (point >= 90) {
                    grade5++;
                }
            }

        }

        if (counterAll > 0) {
            System.out.println("Point average (all): " + (double) sumAll / counterAll);
        }
        if (counterPassing == 0) {
            System.out.println("Point average (passing): -");
        }
        if (counterPassing > 0) {
            System.out.println("Point average (passing): " + (double) sumPassing / counterPassing);
        }
        if(counterAll>0&&sumAll>0){
            System.out.println("Pass percentage: " + (double)100 * counterPassing / counterAll); 
        } 
        if(counterPassing == 0){
            System.out.println("Pass percentage: 0.0");
        }
        
         System.out.println("Grade distribution: ");

        System.out.println();
        System.out.print("5:");
        for(int i=1; i<=grade5; i++){
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("4:");
        for(int i=1; i<=grade4; i++){
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("3:");
        for(int i=1; i<=grade3; i++){
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("2:");
        for(int i=1; i<=grade2; i++){
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("1:");
        for(int i=1; i<=grade1; i++){
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("0:");
        for(int i=1; i<=grade; i++){
            System.out.print("*");
        }
        System.out.println();
        
    }
}
