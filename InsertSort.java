import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args){

        int IS[]={1,2,4,2,3,2};
    for(int i=1;i<IS.length;i++){
     int current=IS[i];
     int j=i-1;
while(j>=0 && current<IS[j]){
    IS[j+1]=IS[j];
    j--;

}
IS[j+1]=current;    }  
System.out.println(Arrays.toString(IS));









    }
    
}
