import java.util.Vector;
import java.util.Iterator;
public class test12{
 public static void main (String args[]){
Vector v = new Vector();  //initialized
Vector v1 = new Vector();
v.add(1);    //add elements
v.add("boku");
v.add("☻");
v.add(0,2);  // adding element in specific index
v.add(1,"I");
v.add(0,0);
v.add(1);
System.out.println("Elements in Vector 'v': "+v);
v1.add(1);  //add elements
v1.add(2);
System.out.println("Elements in Vector 'v1': "+v1);
System.out.println("Element at index '5' in 'v' "+v.get(5));
System.out.println("Index of element '1' in 'v' "+v.indexOf(1));
System.out.println("LAst index of element '1' in 'v' "+v.lastIndexOf(1));
System.out.println("Capacity in 'v' (Default is 10)"+v.capacity());
v.trimToSize();  // trim the size of 'v' to its elements
System.out.println("Capacity in 'v'"+ v.capacity()); 
v.setElementAt(1, 0); // change element at '0' to '1'
System.out.println("'v' after changing its elements "+v);
v.retainAll(v1); // 'v' will contain all the elements of v1
System.out.println("Vector 'v' after retaining it with 'v1': "+v);
Iterator i = v.iterator();
System.out.println("Traversing in vector 'v' ");
while(i.hasNext()){
    System.out.println(i.next());
}

 }

}
