import java.util.LinkedList;
public class test7{
 public static void main (String args[]){
LinkedList<Integer> ll = new LinkedList<Integer>();  // initialized
ll.add(1);  // add data
ll.add(2);
ll.add(3);
ll.add(-23);
ll.add(0);
ll.add(1);
System.out.println("LinkedList ll : "+ll);
ll.addFirst(0);
System.out.println("ll after using addFirst() method :"+ll);
ll.addLast(9);
System.out.println("ll after using addLast() method :"+ll);
ll.add(3,33);
System.out.println("ll after using add(index,data) method :"+ll);
ll.removeFirst();
ll.removeLast();
ll.removeFirstOccurrence(1);
System.out.println("ll after using removeFirst(),removeLast(),removeFirstOccurence() method :"+ll);
System.out.println("Value at index 1 "+ll.get(1));
System.out.println("Index of value -23: "+ll.indexOf(-23));
ll.poll();
System.out.println("ll after using poll() method :"+ll);
System.out.println("Using peek() method for ll: "+ll.peek());
ll.pollFirst();
System.out.println("ll after using pollFirst() method :"+ll);
ll.pop();
System.out.println("ll after using pop() method :"+ll);

 }

}
