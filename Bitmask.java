public class Bitmask {
 public static void main(String[] args){


    // Get Bit
    int n=5;// 1010
    int p=2;
    int BitMask=1<<p;
    if((BitMask & n)==0)
    System.out.println("bit was zero");
    else
    System.out.println("bit was one");
 
    //SetBit 
int newNumber =BitMask | n;
System.out.println(newNumber);

//ClearBit
int cbn = ~BitMask & n;
System.out.println(cbn);




}   

}
