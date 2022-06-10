import java.text.NumberFormat;
import java.util.Scanner;

public class Java_F_Project {
    public static void main(String[] args) {

        System.out.println("Enter Principle the amount ");
        Scanner sn = new Scanner(System.in);
        int p = sn.nextInt();

        System.out.println("Enter Annual Interest rate ");
        float r = sn.nextFloat();
        r = r / (100 * 12);
        System.out.println("Enter Period in Years ");
        int n = sn.nextInt();
        n = n * 12;

        double M;
        M = p * (r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);
        String m1 = NumberFormat.getCurrencyInstance().format(M);

        System.out.println(m1);

        // System.out.println(M);

    }

}
