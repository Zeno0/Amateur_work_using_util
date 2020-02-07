import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class test0{

    public static void main (String args[]){
        AbstractQueue<Integer> aq= new LinkedBlockingQueue<Integer>();  //initialized
aq.add(10);    //add data in queue
aq.add(20);
aq.add(30);
aq.add(40);
aq.add(50);
aq.add(60);
aq.add(70);
System.out.println("data in abstract queue "+aq);
//aq.clear();
System.out.println("peeking at Abstract queue "+aq.peek());
System.out.println("state of abstract queue after after peek() method "+aq);
System.out.println("boolean method of abstract queue : does it contain 110 ? "+aq.contains(110));
System.out.println("poll method of abstract queue "+aq.poll());
System.out.println("state of abstract queue after after poll() method "+aq);
System.out.println("size of abstract queue "+aq.size());
System.out.println("using remove method of abstract queue "+aq.remove());
System.out.println("present state of abstract queue"+aq);

    }


	
	 }
