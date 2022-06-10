import java.text.NumberFormat;
import java.util.Scanner;

public class J_3rd_p {
    public static void main(String[] args) {

        System.out.print("Principle amount: ");
        Scanner sn = new Scanner(System.in);
        int p = sn.nextInt();

        while(!(p>=1000 && p<=1000_000))
        { System.out.println("Enter a valid amount b/w 1k to 1M");
          System.out.print("Principle amount: ");
          p = sn.nextInt();
        }
        
        System.out.print(" Annual Interest rate: ");
        float r = sn.nextFloat();
        
        while(!(r>0 && r<=30))
        { System.out.println("Enter a valid number b/w 0 and 30");
          System.out.print("Annual Interest rate:");
         r = sn.nextFloat();
          
        }
        
        r = r / (100 * 12);
        
        System.out.println("Period (Years):  ");
        float n = sn.nextInt();
        
        while(!(n>0 && n<=30))
        { System.out.println("Enter a valid number b/w 0 and 30");
          System.out.print("Period (Years):  ");
         n = sn.nextFloat();
          
        }
        
        
        
        n = n * 12;

        double M;
        M = p * (r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);
        String m1 = NumberFormat.getCurrencyInstance().format(M);

        System.out.println(m1);

        // System.out.println(M);

    }

}
