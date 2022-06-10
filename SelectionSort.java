import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int SS[]={1,5,10,4,5,34,34,3242,32,32};
        int si;
for(int i=0; i<SS.length-1; i++){
    si = i;
    for(int j=i+1;j<SS.length;j++){
        if(SS[si]>SS[j]){
            si=j;
        }
    } 
    int temp;
    temp = SS[si];
    SS[si]=SS[i];
    SS[i]=temp;          
        }
    System.out.println(Arrays.toString(SS));
    }
}