public class GreatestestCommonDiviser {
    public static  int gcd(int num1,int num2){
        int max,min;
    if(num1>=num2) 
    {max=num1;
        min=num2;}
    else
    {max=num2;
    min=num1;}

while (true){   
if(max % min==0)
return min;

else
{
    int temp = min;   
    min = max % min;
    max=temp;
}
}   
}       
    
    public static void main(String[] args){
 

        System.out.println(gcd(8,12));

    }
    
}
