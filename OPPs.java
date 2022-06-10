class laptop {
    String name;
    int gen;
    laptop(String name,int gen) {
       this.name=name;this.gen=gen;
       System.out.println(name);

       System.out.println(gen);

    }
    laptop(laptop l1){
        this.name=l1.name;this.gen=l1.gen;
    }
    laptop(){
        System.out.println(name);

        System.out.println(gen);
    } 
    public void name1() {
        System.out.println(name);
    }
}

class song{
    static int num;
}


// Inheritance 
class Computer{
    String name;
    int ram;
    int memory;
}                         // this is single 

class Mobile extends Computer{
 String model;
    public void call(){
     System.out.println(name + " "+ram+" "+memory+" "+model);
 }

class watch extends Mobile{                // multiple

}






class tablet extends Computer{           // hararycal.
    String companyName;
}


}

// Packages we place related codes here.
//Builtin packages and user defined.
// 1. Builtin packages
// Import java.util.*; This package has many classes.


























public class OPPs {

    public static void main(String[] args) {
        laptop la = new laptop();
       laptop la1 = new laptop("DELL",5);

        la1.name = "hhp";

        la.name = "HP";
        la.gen = 6;
        laptop la2 = new laptop(la);

//  bank.acount b=new bank.account();
//  b.name="Samsung";
//  System.out.println("Bank "+b.name);
        // int s=la.gen;
        la.name1();
la2.name1();
Computer c1=new Computer();
c1.name = "Samsung";

Mobile m=new Mobile();
m.name="Samsung";
m.call();
System.out.println(c1.name);

//polymorphism.
// 1. COmpile time --> function overloading 




// // ACCESS Modifiers
// 1.	Public  it is accessible everywhere.
// 2.	Default  it is accessible everywhere in the same package but not outside .
// 3.	Protected  it is accessible everywhere in the same package but only accessible by sub package from outside.
// 4.	Private only accessible by one class in which it is written.

// Private thing can be accessible by getters and setters.


// Encapsulation 
// Combining  data and its functions just like class




// Abstraction
//not used by usser just a concept. 
//keyword abstract;

song.num=10;
System.out.println(song.num);
























    }
}
