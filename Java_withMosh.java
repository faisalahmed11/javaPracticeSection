import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date; // we must to import java.util.date    this is a library.

import java.util.Scanner;

class Java_withMosh {

    public static void main(String[] a) {

        // primitive data types.
        byte age = 21;
        long viewCount = 3_100_100_100L;
        float price = 10.55F;
        char abc = 'A';
        System.out.println("FAISAL");
        System.out.println(viewCount / age);
        System.out.println(price);
        System.out.println(abc);

        // Date
        // Date as a reference data type.
        Date now = new Date(); // in case of reference data types new need to allocate new memory and free it
                               // but here java automatically free it.
        System.out.println(now);// here current date of the machine is stored in it.
                                // object is an instance of the class.

        // Points
        // Point as a reference data type. // here value of x and y are passed by
        // reference;

        Point point1 = new Point(1, 2);
        point1.x = 10;
        Point point2 = point1;
        point2.y = 29;

        System.out.println(point1);

        // Strings
        // now using String reference data type. but here we don't need to allocate new
        // memory.
        String message = "  \n Hello \t " + "\"How \\are you";
        System.out.println(message.equals("Hello \"How are you\""));
        System.out.println(message.length());

        System.out.println(message.replace("o", "you"));// in java string are immutable can't be modified just copy can
                                                        // be get.
        System.out.println(message.toUpperCase()); // to changes the current states to the Upper cases.
        System.out.println(message.trim()); // removes the first or last extra spaces.

        // ARRAYS
        // arrays are reference data types here so he have to allocate memory for them.

        // int[] numbers=new int[5];
        // int numbers[5]; here it is not valid.
        int numbers[] = { 1, 2, 3, 4, 5 }; // we can do like this.
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.toString());
        System.out.println(numbers.length); // arrays have fixed length.

        // sorting of arrays.
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Multi dimensional arrays
        // int[][] Numbers=new int[3][3]; // ToString for single array
        // deepToString // deep_string for multiline arrays.
        // Numbers[0][0]=10;
        // OR
        int Numbers[][] = { { 1, 2, 4, 3 }, { 5, 5, 6 } };

        System.out.println(Arrays.deepToString(Numbers));

        // using constant here as final.
        final float pi = 3.14F;

        // ALL arithmetic operations are same as in c++;
        // like +,-,/,*,+=,-+,*=,/=,num++,++num,>,<,<=,>=;
        int x = 1, y;
        y = x++; // here x is first copied in y then x value is incremented.

        System.out.println(y);
        System.out.println(x);

        // addition of short into the int;

        // Implicit casting or automatic casting.
        // byte>>short>>int>>long>>float>>double
        short A = 10;
        int B = A;
        // System.out.println((char)2);
        for (int i = 0; i < 10; i++) {
            // System.out.print(i);
            System.out.println(i + "" + (char) i); // casting integer to character.

        }

        // Explicit casting.
        double x1 = 10.229;
        int x2 = (int) x1;
        System.out.println(x2);

        // Casting String to Integer.
        String a1 = "123";
        int x3 = Integer.parseInt(a1);
        System.out.println(x3);
        double x4 = Double.parseDouble(a1); // string into double.
        // using math class.
        System.out.println(Math.round(4.8));
        System.out.println(Math.ceil(4.0001F));
        System.out.println(Math.addExact(40, 3));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.ceilDiv(30, 4));
        System.out.println(Math.floor(4.999));
        // System.out.println(Math.(4.8));
        // random function of math class.
        int ran = (int) (Math.random() * 10); // it produces random numbers between 0 and 10;
        System.out.println(ran);

        // Number Format it changes numbers into strings.
        // Class java.text.NumberFormat
        NumberFormat Currency = NumberFormat.getPercentInstance();

        String result = Currency.format(.9);
        System.out.println(result);

        // chain calling
        String result1 = NumberFormat.getCurrencyInstance().format(100000);
        System.out.println(result1);

        // Inputting in Java program.
        Scanner scn = new Scanner(System.in);
        // int age1 = scn.nextInt();
        // System.out.println("your " + age1 + age1 + " years old");

        // Inputting String in java.
        // String name1=scn.next(); // nextLine(); for inputting whole line of text;
        // String name = scn.nextLine();

        // System.out.println("you are " + name);

        // mathematical Operators;
        // == , != , += , -= , a++ , ++a , a-- , --a , && , || , < , > , <= , >=
        int temperature = 40;
        boolean isWarm = temperature >= 20 && temperature <= 30;
        System.out.println(isWarm);

        // if else if and else statements.
        if (temperature > 30)
            System.out.println("Today is Hot ");
        else if (temperature > 20) {
            System.out.println("Today is Nice day");
        } else {
            System.out.println("Today is Cold day");
        }

        int Income = 1200000;
        boolean hasHighIncome = Income > 1000000;
        System.out.println(hasHighIncome);

        // Turnery operators in java.
        int Talent = 10;
        String Talented = Talent > 100 ? "Talented" : "Untalented";
        // Condition if true rn this else rn this.
        int ten = Income > 1000 ? 10 : 20;
        System.out.println(ten);
        System.out.println(Talented);

        // switch statements.
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("you're on the top of the list");
                break;
            case 2:
                System.out.println("you're on the 2nd position");
                break;
            default:
                System.out.println("you're not in the list");

        }

        // For loop in java
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,Dunia" + (i + 1));
        }

        // While loop
        int i = 0;
        while (i < 10) {
            System.out.println("Faisal" + i);
            i++;
        }
        String str = "";
        while (!(str.equals("quit"))) {
            System.out.print("Input: ");
            str = (scn.nextLine()).toLowerCase();
            if (str.equals("1"))
                continue;
        }
        // While loop once again.
        while (true) {
            str = scn.nextLine();
            System.out.println("Faisal");
            if (str.equals("q"))
                break;

        }

        // For each loop.
        // it can run only in forward direction .

        String[] fruits = { "bananna ", "apple", "mango" };

        for (String fruit : fruits)
            System.out.println(fruit);

    }

}
