public class Stringbuilde {
  public static void main(String[] args) {

    StringBuilder sb=new StringBuilder("FAISAL");

    System.out.println(sb);  

//character at index.
System.out.println(sb.charAt(1)) ;

// set character
sb.setCharAt(0, 'Z');



//StringBuilder sb1;//=new StringBuilder("dd");
StringBuilder sb1=sb;

System.out.println(sb);


// inserting in a string.
sb.insert(0,'f');
System.out.println(sb);

//deleting from a string.
sb.delete(1,2);
System.out.println(sb);
String f="faisal";
f=f+" ali";
System.out.println(f.length()) ;
//append function adding a string into a StringBuilder.
sb.append(f);
System.out.println(sb);


}  
}
