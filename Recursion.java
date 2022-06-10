import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class Recursion {

    // sum of n natural numbers.

    // public static int sum(int n){
    // if(n==0)
    // return 0;

    // return (n+sum(n-1));
    // }

    // Factorial
    public static int factorial(int n) {

        if (n == 1 || n == 0)
            return 1;

        return (n * factorial(n - 1));

    }

    // Fibonacci sequence
    public static void fibonacci(int a, int b, int n) {
        if (n == 0)
            return;

        int c = a + b;
        System.out.println(c);

        fibonacci(b, c, n - 1);

    }

    // print x power n here height of stack is n;
    public static int pow(int b, int p) {
        if (p == 1) {
            return b;
        }
        int r = b * pow(b, p - 1);
        System.out.println(r);
        return r;
    }

    // print x power n here height of stack is log(n);
    public static int pow1(int b, int p) {
        if (p == 0) {
            return 1;
        }

        if (p % 2 == 0)
            return pow1(b, p / 2) * pow1(b, p / 2);

        else
            return pow1(b, p / 2) * pow1(b, p / 2) * b;

    }

    // reverse a string
    public static void reverseString(String s, int i) {
        if (i > s.length())
            return;

        System.out.print(s.charAt(s.length() - i));
        reverseString(s, i + 1);

    }

    static int first = -1;
    static int last = -1;

    // find first and last occurrence of character in string
    public static void flc(String s, char c, int i) {
        if (i == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (s.charAt(i) == c) {
            if (first == -1) {
                first = i;
            } else
                last = i;
        }
        flc(s, c, i + 1);
    }

    static Boolean b;

    // check sort of an array.
    public static Boolean isSort(int[] a, int i) {
        if (i == a.length - 1) {
            return true;
        }

        if (a[i + 1] > a[i]) {
            return isSort(a, i + 1);
        } else
            return false;

    }

    public static void main(String[] as) {
        // System.out.println(sum(5));
        System.out.println(factorial(5));
        System.out.println(0);
        System.out.println(1);

        fibonacci(0, 1, 5);
        System.out.println();

        int x = pow(3, 3);

        // System.out.println(x);
        // System.out.println(pow(1,2));
        System.out.println();

        System.out.println(pow1(3, 3));

        reverseString("FAISAL", 1);

        flc("faisal", 'a', 0);

        int e[] = { 1, 3, 4, 23, 23 };

        System.out.println(isSort(e, 0));

        // in java we can String s="faisal"+'i';

        // String s= String +char;
    }
}