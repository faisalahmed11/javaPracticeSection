import java.util.Scanner;

public class sumOfNatural {
    public static void main(String[] a) {

        int num,sum=0;
    System.out.print("Input: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    for(int i=1;i<=num;i++){
sum+=i;

    }
       System.out.println(sum); 

    }

}