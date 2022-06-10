import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class java_2nd_project {
    public static void main(String[] ar){

int input;
System.out.print("Number: ");
Scanner sn= new Scanner(System.in);
input=sn.nextInt();

if(input%5==0 && input%3==0)
System.out.println("FizzBuzz");
else if (input%5==0)
System.out.println("Fizz");
else if(input%3==0)
System.out.println("Buzz");
else
System.out.println(input);
    }
    
}
