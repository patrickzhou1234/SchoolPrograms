import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        // code goes here
        Scanner in = new Scanner(System.in);
        int percentage;
        System.out.print("What is your grade percentage?");
        percentage = in.nextInt();
        in.close();
        if (percentage>=90) {
            System.out.print("A");
        } else if (percentage >= 80) {
            System.out.print("B");
        } else if (percentage >= 70) {
            System.out.print("C");
        } else if (percentage>=60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}