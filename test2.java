import java.util.BitSet;
public class test2{
 public static void main (String args[]){
    
    BitSet bs = new BitSet();    // initialized BitSet
bs.set(1);    //set it true for index '1' and so on
bs.set(2);
bs.set(3);
BitSet bs1 = new BitSet();
bs1.set(0);
bs1.set(3);
bs1.set(4);
bs1.set(5);
bs1.set(6);
bs1.set(7);
bs1.set(8);
System.out.println("Index true in bs "+bs);
System.out.println("Index true in bs1 "+bs1);
System.out.println("Is it true for '6' index? "+bs.get(6));
System.out.println("Length of bitset "+bs.length());
System.out.println("Cardinality of bitset "+bs.cardinality());
bs.and(bs1);
System.out.println("Logical And of bs and bs1 "+bs);
bs.or(bs1);
System.out.println("Logical or of bs and bs1 "+bs);
System.out.println("Is it true for '0' index "+bs.get(1));
bs.clear(4, 6); // clears everything from 4 to 6, but 6 is not included
System.out.println("bs after using clear() method"+bs);
    
 }

}
