public class half_pyramid {
    public static void main(String[] args){


// Half pyramid 
        for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
System.out.print("*");



}
System.out.println();
}

System.out.println();

// half pyramid inverted by 180

for (int i = 1; i<= 4; i++) {

    for (int j = 1; j <= 4-i; j++) {
        System.out.print(" ");

    }
    for (int k= 1; k <= i ; k++) {
        System.out.print("*");

    }

    System.out.println();
}





System.out.println();

// inverted half pyramid 
for (int i = 1; i <= 4; i++) {
    for (int j = 4; j >=i ; j--) {
        System.out.print("*");

    }
    System.out.println();

}
// Half pyramid with numbers
System.out.println("Half pyramid with numbers");
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);

    }
    System.out.println();
}


System.out.println();

// inverted half pyramid with numbers
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);

    }
    System.out.println();

}

int num=0;
//Floyd's Triangle
System.out.println("Floyd's Triangle");
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        num++;
        System.out.print(num+" ");

    }
    System.out.println();
}


System.out.println();
int n=1;
// 1-0 triangle
System.out.println("1-0 Triangle");

for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        if((i%2==0 && j%2!=0) || (i % 2 != 0 && j%2 == 0))
        System.out.print(0+" ");
        else
        System.out.print(1+" ");
    
    }
    System.out.println();
}
    }
    
}
