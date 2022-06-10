import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args){

int sort[]={20,10,1,6,3,5};
for(int j=0; j<sort.length-1; j++){
for(int i=0;i<(sort.length)-1-j;i++){
if(sort[i]>sort[i+1]){
    int temp=sort[i+1];
    sort[i+1]=sort[i];
    sort[i]=temp;

}
}
}
System.out.println(Arrays.toString(sort));

}
    
}
