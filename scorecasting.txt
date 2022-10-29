import java.util.Scanner;

public class scorecasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c, sum;
        double avg, avg2;
        System.out.print("Input three scores separated by space: ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        sum = a+b+c;
        avg = (double) sum/3;
        avg2 = new Double(sum/3);
        System.out.print(avg+" "+avg2);
        in.close();
    }
}