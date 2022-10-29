import java.lang.Math;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int initial;
        double interest, firstmo, secondmo, thirdmo;
        System.out.print("Initial balance:            ");
        initial = in.nextInt();
        System.out.print("Annual interest in percent: ");
        interest = in.nextDouble();
        firstmo = initial*Math.pow((1+(interest/100)/12), (12*1/12));
        secondmo = initial*Math.pow((1+(interest/100)/12), (12*2/12));
        thirdmo = initial*Math.pow((1+(interest/100)/12), (12*3/12));
        firstmo = Math.round(firstmo*100)/100D;
        secondmo = Math.round(secondmo*100)/100D;
        thirdmo = Math.round(thirdmo*100)/100D;
        System.out.println("After first month:          "+firstmo);
        System.out.println("After second month:         "+secondmo);
        System.out.println("After third month:          "+thirdmo);
        System.out.println("---------------------");
        System.out.print("Please enter the first time:     ");
        String firsttime, secondtime;
        firsttime = in.next();
        System.out.print("Please enter the second time:    ");
        secondtime = in.next();
        in.close();
        int firhour, sechour, firmin, secmin, firtime, sectime, diff, finalhr, finalmin;
        firhour = Integer.parseInt(firsttime.substring(0, 2));
        sechour = Integer.parseInt(secondtime.substring(0, 2));
        firmin = Integer.parseInt(firsttime.substring(2, 4));
        secmin = Integer.parseInt(secondtime.substring(2, 4));
        firtime = firhour*60+firmin;
        sectime = sechour*60+secmin;
        if (firtime>sectime) {
            diff = firtime-sectime;
        } else {
            diff = sectime-firtime;
        }
        finalhr = diff/60;
        finalmin = diff%60;
        System.out.print(finalhr+" hours "+finalmin+" minutes");
    }
}