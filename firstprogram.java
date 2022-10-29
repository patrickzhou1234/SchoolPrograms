import java.util.Scanner;
 
public class firstprogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, my name is Patrick, I am 14 years old and I do web development.");
        System.out.println("What is your name?");
        String name = in.next();
        System.out.println("Hi "+name+"! What grade are you in?");
        int grade = in.nextInt();
        System.out.println("Ok, what letter grade do you want to achieve?");
        char lettergrade = in.next().charAt(0);
        System.out.print("Name: "+name+"\n"+"Grade: "+grade+"\n"+"Grade Achieved: "+lettergrade);
    }
}