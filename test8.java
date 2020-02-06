import java.util.Stack;
public class test8{
 public static void main (String args[]){
Stack s = new Stack();  //initialized
s.add(1);  // add data in stack
s.add(2);
s.add(3);
s.add(245);
s.add(-345);
s.add(0);
s.add(1);
System.out.println("Data in Stack s: "+s);
s.remove(0);
System.out.println("s after removing value at index 0: "+s);
System.out.println("Using search(76) method: "+s.search(76));
s.push(234);
System.out.println("s after using push(234) method: "+s);
System.out.println("using pop() method: "+s.pop());


 }

}
