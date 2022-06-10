 abstract class model{
    public String catagery;
model(){
    System.out.println("Calling model ");
}
    public void display (){
        System.out.println("i'm an animal");
    }
} 
 class man extends model {
    man(){
        System.out.println("Calling man");
    }
    public void set(String s){
        catagery=s;
        System.out.println(s);

    }

}





public class Abstract {
    public static void main(String[] args){
//model m1=new model();
man m =new man();
m.set("funny");
//m.display();
    }
 
    

    //Constructer chaning;
    // if derived class object created base class constructer called first.
}
