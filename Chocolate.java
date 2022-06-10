import java.util.Scanner;

public class Chocolate {
    public static int CNC(){

        Scanner sn = new Scanner(System.in);

        System.out.print("Amount: ");
        int totalAmount = sn.nextInt();

        System.out.print("Chocolate price: ");
        int chocolatePrice = sn.nextInt();
       

        int NC = totalAmount / chocolatePrice;
        int extra = NC / 3;

        NC += extra;
        extra += (NC - extra) % 3;

        
        while (extra >= 3) {
            NC += extra / 3;
            extra = (extra / 3) + (extra % 3);
        }

        return NC;
        
    }
    public static void main(String[] args){

System.out.println("Chocolate count: "+CNC());
    }
    
}
