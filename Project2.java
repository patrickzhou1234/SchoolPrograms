/**
 * This is a project to print a ticket and a transaction for the Pentagon Parking Lot
 *
 * @author Patrick Zhou
 * @version v1.0.0
 */

// import scanner
import java.util.Scanner;

public class Project2 {
    // declare and initialize global scanner
    static Scanner in = new Scanner(System.in);
    // Method to print the ticket with values passed in from main.
    public static void printTicket(String timein, String timeout, int hrdiff, double cost) {
        System.out.println("PENTAGON PARKING LOT");
        System.out.println("--------------------");
        System.out.println("Time In: " + timein);
        System.out.println("Time Out: " + timeout);
        System.out.println("You were parked in the lot for " + hrdiff + " hours");
        System.out.println("Your parking fees is $" + cost + "0");
        System.out.println("We thank you for your business");
    }
    // Method to compute the cost from the type and hours stayed in lot (passed in from main).
    public static double computeCost(char type, int hrdiff) {
        // initialize variable cost
        double cost = 0.0;
        // check types first
        if (type == 'C') {
            // calculating cost from hours stayed in lot based off of the sign directions (if type is car).
            if (hrdiff >= 5) {
                cost += (hrdiff - 5) * 5;
                cost += 24.0;
            } else if (hrdiff >= 2) {
                cost += (hrdiff - 2) * 8;
            }
        } else if (type == 'T') {
            // calculating cost from hours stayed in lot based off of the sign directions (if type is truck).
            if (hrdiff >= 3) {
                cost += (hrdiff - 3) * 12;
                cost += 32;
            } else if (hrdiff >= 1) {
                cost += (hrdiff - 1) * 16;
            }
        } else if (type == 'S') {
            // calculating cost from hours stayed in lot based off of the sign directions (if type is senior).
            cost = 0.0;
        }
        // return cost back to main method.
        return cost;
    }
    // Method to print summary report (printf for alignment and centering the ticket)
    public static void printSummaryReport(int cars, int trucks, int seniors) {
        System.out.printf("%60s%s", "", "PENTAGON PARKING LOT SUMMARY REPORT\n");
        System.out.printf("%60s%s", "", "-----------------------------------\n");
        System.out.printf("%65s%s", "", "Total Hours Total Billed\n\n");
        System.out.printf("%60s%s", "", "Cars");
        System.out.printf("%13s%s", "", cars);
        System.out.printf("%8s%s", "", "$34.00\n");
        System.out.printf("%60s%s", "", "Trucks");
        System.out.printf("%11s%s", "", trucks);
        System.out.printf("%8s%s", "", "$32.00\n");
        System.out.printf("%60s%s", "", "Senior Citizens");
        System.out.printf("%2s%s", "", seniors);
        System.out.printf("%9s%s", "", "$0.00");
    }
    // new customer method
    public static char newCustomer() {
        // declare variables.
        char type;
        String timein, timeout;
        int timeinhrs, timeinmin, timeouthrs, timeoutmin, mindiff, hrdiff;
        // initialize cost. 
        double cost = 0.0;
        // prompt to input customer type, entrance time and exit time. 
        System.out.print("What type of customer are you, what time did you enter the lot and what time did you exit the lot?");
        // input code
        type = in.next().charAt(0);
        timein = in.next();
        timeout = in.next();
        // input validation
        if (timeout.length()!=4 || timein.length()!=4 || type!='C' && type!='T' && type!='S') {
            System.out.print("Wrong input! Program stopped. ");
            System.exit(0);
        }
        // initializing necessary variables to compute hours in lot. 
        timeinhrs = Integer.parseInt(timein.substring(0, 2));
        timeinmin = Integer.parseInt(timein.substring(2));
        timeouthrs = Integer.parseInt(timeout.substring(0, 2));
        timeoutmin = Integer.parseInt(timeout.substring(2));
        // computing minutes and hours in lot. 
        mindiff = (timeouthrs*60+timeoutmin)-(timeinhrs*60+timeinmin);
        hrdiff = (int) Math.ceil((double) mindiff / 60);
        // initialize cost by calling method to compute cost. 
        cost = computeCost(type, hrdiff);
        // print the ticket with information provided. 
        printTicket(timein, timeout, hrdiff, cost);
        // Add a newline in between the two ticket and summary report
        System.out.println();
        return type;
    }
    // main method
    public static void main(String[] args) {
        // declare and initialize variables for counting
        int cars=0, trucks=0, seniors=0;
        // declare type variable
        char type;
        // loop new customers method until there are no more customers (print prompt and input response to check)
        while(true) {
            type = newCustomer();
            if (type == 'C') {
                cars++;
            } else if (type == 'T') {
                trucks++;
            } else if (type == 'S') {
                seniors++;
            }
            System.out.print("Any more vehicles? (yes/no)");
            if (!(in.next().equals("yes"))) {
                break;
            }
        }
        // closing scanner for good practice
        in.close();
        // print summary report
        printSummaryReport(cars, trucks, seniors);
    }
}