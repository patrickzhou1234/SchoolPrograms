import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class gradeprogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter desired grade: %20s", "");
        char desgrade = in.next().charAt(0);
        System.out.printf("\nEnter minimum average required: %9s", "");
        double minavg = in.nextDouble();
        System.out.printf("\nEnter current average in course: %8s", "");
        double curavg = in.nextDouble();
        System.out.printf("\nEnter how much the final counts as a percentage of the course grade: %7s", "");
        double finalpercentage = in.nextDouble();
        double finalcount;
        finalcount = (minavg-(curavg*((100-finalpercentage)/100)))/(finalpercentage/100);
        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.print(df.format(finalcount));
    }
}