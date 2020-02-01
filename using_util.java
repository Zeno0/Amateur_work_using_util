import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Base64;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.*;

class student{                        //this class is used by TreeMap, it acts as a custom class to extend 'tm' variable 
                                      //it is used in line 411
    
    int roll;                         
    String name,country;
    
    //constructor
    
    student(int roll,String name ,String country){
        this.roll = roll;
        this.country = country;
        this.name = name;
    } 
    public String toString(){
        return this.roll+" "+this.name+" "+this.country;
    }
           
}  // closing student class


class sortbyroll implements Comparator<student>{    // this class is used to provide custom comparator in line 411
    
      public  int compare(student a, student b){
            return a.roll-b.roll;
        }
    
    }  // closing sortbyroll class

 class helper extends TimerTask{         // this class is used as a task for TimerTask class in line 387
    
static int i=0;
public void run(){
    System.out.println("timer ran "+ i++ +" times");
    if(i==4){
        synchronized(using_util.obj){
            using_util.obj.notify();
        }
    }
}  // closing run method
   }  // closing helper class 

public class using_util {             // class with main thread

    static using_util obj;
    
    public enum CFG{              // this class required by the EnumMap class as the 'keys' in 
                                  // EnumMap must be keys of a single enum type
    code,contribute,quiz,mcq;
}
    
    
    public static void main (String args[])  throws Exception{
System.out.println("Abstract queue start.........................................................................");
AbstractQueue<Integer> aq= new LinkedBlockingQueue<Integer>();  //initialized
aq.add(10);    //add data in queue
aq.add(20);
aq.add(30);
aq.add(40);
aq.add(50);
aq.add(60);
aq.add(70);
System.out.println(aq);
//aq.clear();
System.out.println(aq.peek());
System.out.println(aq);
System.out.println(aq.contains(110));
System.out.println(aq.poll());
System.out.println(aq);
System.out.println(aq.peek());
System.out.println(aq.size());
aq.remove();
System.out.println(aq);


    System.out.println("Abstract queue start.........................................................................");

    

//import java.util.Arrays;    to use it directly call array

    System.out.println("Array List start.........................................................................");
ArrayList<Integer> al = new ArrayList<Integer>(5);
ArrayList<Integer> al1 = new ArrayList<Integer>(5);
al1.add(0);
al1.add(10);
al1.add(14);
for(int i=0;i<5;i++){
    al.add(i);
}
System.out.println(al);
al.set(3, 10);
System.out.println(al);
System.out.println(al.contains(9));
System.out.println(al.indexOf(0));
System.out.println(al.clone());
al.forEach((x) -> System.out.println(x));
al1.forEach((x) -> System.out.println(x));
al.retainAll(al1);
al1.retainAll(al);
System.out.println(al);
System.out.println(al1);

System.out.println("Array List end.........................................................................");
System.out.println("BitSet start.........................................................................");
BitSet bs = new BitSet();
bs.set(1);
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
System.out.println(bs);
System.out.println(bs.get(6));
System.out.println(bs.length());
System.out.println(bs.cardinality());
bs.and(bs1);
System.out.println(bs);
bs.or(bs1);
System.out.println(bs);
//bs.andNot(bs1);
System.out.println(bs);
//bs.get(0);
System.out.println(bs.get(1));
bs.clear(4, 6);
System.out.println(bs);

BitSet bs3 = new BitSet();
bs3.set(1);
bs3.set(2);
bs3.set(3);

BitSet bs4 = new BitSet();
bs4.set(0);
bs4.set(2);
bs4.set(4);
bs3.or(bs4);
System.out.println(bs3);
System.out.println(bs4);


System.out.println("BitSet end.........................................................................");


//import java.util.Base64;  use like "arrays"


System.out.println("Dictionary start.........................................................................");
Dictionary d = new Hashtable();
d.put("123","anime");
d.put("124","misaka");
d.put("125","kamijou");

Dictionary d1 = new Hashtable();
d1.put("126","hikki");
d1.put("127","yui");
d1.put("128","yukinon");
/*
d1.put("123","anime");
d1.put("124","misaka");
d1.put("125","kamijou");
*/
System.out.println(d1);
System.out.println(d.elements());



System.out.println(d.size());
System.out.println(d.get("123"));
System.out.println(d.remove("123"));
System.out.println(d.hashCode());

for(Enumeration i=d1.elements();i.hasMoreElements();){
    System.out.println(i.nextElement());
}

for(Enumeration i=d1.keys();i.hasMoreElements();){
    System.out.println(i.nextElement());
}

System.out.println(new e());
System.out.println("Dictionary start.........................................................................");
System.out.println("EnumMap start.........................................................................");





EnumMap<CFG , String> em  = new EnumMap<CFG,String>(CFG.class);
em.put(CFG.code,"begin");
em.put(CFG.contribute,"contro");
em.put(CFG.mcq,"practice");
em.put(CFG.quiz,"test");
System.out.println(em);
System.out.println(em.get(CFG.code));
System.out.println(em.containsKey(CFG.code));
System.out.println(em.containsValue("test"));
System.out.println(em.keySet());

System.out.println("EnumMap end.........................................................................");
System.out.println("EnumSet start.........................................................................");


EnumSet<CFG> set1,set2,set3,set4;
set1 = EnumSet.of(CFG.code,CFG.contribute);
set2 = EnumSet.complementOf(set1);
set3 = EnumSet.allOf(CFG.class);
set4 = EnumSet.range(CFG.code, CFG.quiz);
System.out.println(set1);
System.out.println(set2);
System.out.println(set3);
System.out.println(set4);
System.out.println("EnumSet end..............................................................................");

HashSet hs = new HashSet();


HashMap hm = new HashMap();


System.out.println("Hashtable start..............................................................................");

Hashtable<Integer,String> h = new Hashtable<Integer,String>();

h.put(1,"hiki");
h.put(7,"yukino");
h.put(2,"yui");
System.out.println(h.toString());
h.computeIfAbsent(3,v ->"komachi");
System.out.println(h.containsKey(1));
System.out.println(h);
System.out.println(h.contains("komachi"));
System.out.println(h.keySet());
System.out.println(h.entrySet());
System.out.println(h.values());
        Set<Integer> arr= h.keySet();
      System.out.println(arr);

Enumeration e = h.elements();
Enumeration e1 = h.keys();

while(e.hasMoreElements()){
    System.out.println(e1.nextElement() +" "+ e.nextElement());
}

System.out.println("Hashtable end..............................................................................");
System.out.println("LinkedList start..............................................................................");

LinkedList<Integer> ll = new LinkedList<Integer>();
ll.add(1);
ll.add(2);
ll.add(3);
ll.add(-23);
ll.add(0);
System.out.println(ll);
ll.addFirst(0);
ll.addLast(9);
ll.addFirst(4);
ll.addFirst(8);
ll.add(12);
ll.addLast(10);
ll.add(3,33);
System.out.println(ll);
System.out.println(ll.remove());
ll.removeFirst();
ll.removeLast();
ll.removeFirstOccurrence(1);
System.out.println(ll);
System.out.println(ll.get(1));
System.out.println(ll.indexOf(9));
System.out.println(ll.offer(24));
System.out.println(ll);
System.out.println(ll.poll());
System.out.println(ll.peek());
System.out.println(ll.peekFirst());
System.out.println(ll.pollFirst());
System.out.println(ll.pollFirst());
System.out.println(ll.peekLast());
System.out.println(ll.pollLast());
System.out.println(ll.pop());
System.out.println(ll.pop());
System.out.println(ll.parallelStream());
ll.push(666);
System.out.println(ll);
System.out.println(ll.pop());
System.out.println(ll);


System.out.println("LinkedList end......................................................................");
System.out.println("PriorityQueue start......................................................................");



PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
pq.add(1);
pq.add(2);
pq.add(3);
pq.add(4);
pq.add(5);
pq.add(234);
pq.add(32);
pq.add(56);
//pq.add(32);
//pq.add(0);
//pq.add(-13);
//pq.add(-13);
//pq.add(2);
//pq.add(1);
System.out.println(pq);
System.out.println(pq.peek());
System.out.println(pq);
System.out.println(pq.poll());
System.out.println(pq);
System.out.println(pq.remove());
System.out.println(pq);
System.out.println("PriorityQueue end.........................................................");
System.out.println("stack start............................................................");

Stack s = new Stack();
s.add(1);
s.add(2);
s.add(3);
s.add(245);
s.add(-345);
s.add(0);
s.add(1);
System.out.println(s);
s.remove(0);
System.out.println(s);
System.out.println(s.search(76));
System.out.println(s.push(234));
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.pop());
System.out.println("stack end............................................................");
System.out.println("stringTokenizer start............................................................");

StringTokenizer st = new StringTokenizer("Welcome To Anime World","e");
/*while(st.hasMoreTokens()){
    System.out.println(st.nextToken());
}*/
int count = st.countTokens();
System.out.println("number of tokens "+count);
for(int i=0;i<count;i++){
    System.out.println("token at "+i+st.nextToken());
}
System.out.println("stringtokenizer end............................................................");
System.out.println("timer start............................................................");
obj = new using_util();
Timer t = new Timer();
TimerTask tt = new helper();
//t.schedule(tt,2000,5000);
t.schedule(tt,500,1000);

synchronized(obj){
    obj.wait();   //it is main thread and it is waiting
    t.cancel();
System.out.println(t.purge());    
}

System.out.println("timer end............................................................");
System.out.println("TreeMap start............................................................");

TreeMap<Integer,String> tm = new TreeMap<Integer,String>() ;
TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>() ;
tm.put(1,"yui");
tm.put(2,"yukino");
tm.put(3,"hiki");
tm.put(4,"komachi");
tm2 =   (TreeMap<Integer, String>) tm.clone();
System.out.println(tm2);
     
System.out.println(tm);

TreeMap<student,Integer> tm1 = new TreeMap<student,Integer>(new sortbyroll()) ;
tm1.put(new student(234,"yukino","japan"),1);
tm1.put(new student(134,"yui","japan"),2);
tm1.put(new student(334,"hiki","japan"),3);
System.out.println(tm1);

System.out.println(tm.containsKey(1));
System.out.println(tm.containsValue("hiki"));
System.out.println("traverse");
for(Map.Entry<Integer,String> m : tm.entrySet() ){
        System.out.println(m.getKey()+" "+m.getValue());
        if(tm.equals(tm2)){
            System.out.println("equal");
        }
        else{
            System.out.println("Not");
        }
        if(m.getKey().equals(tm.containsKey(1))){
            System.out.println("yeppppppppp");
        }
        else{
            System.out.println(m.getKey());
            
            System.out.println(tm.containsKey(1));
            System.out.println("noTTTTTTTTTT");
        }
    }
System.out.println(tm.navigableKeySet());


Vector v = new Vector();
Vector v1 = new Vector();

v1.add(1);
v1.add(2);

v.add(1);
v.add("boku");
v.add("☻");
System.out.println(v);
v.add(0,2);
v.add(1,"I");
v.add(0,0);
v.add(1);
System.out.println(v);
System.out.println(v1);
System.out.println(v.get(5));
System.out.println(v.indexOf(1));
System.out.println(v.lastIndexOf(1));
System.out.println(v.capacity());
v.trimToSize();
System.out.println(v.capacity());
v.setElementAt(1, 0);

System.out.println(v);
v.retainAll(v1);
System.out.println(v);
Iterator i = v.iterator();
while(i.hasNext()){
    System.out.println(i.next());
}

Integer arrh[] = new Integer[v1.size()];
v1.copyInto(arrh);

for(Integer n : arrh){
    System.out.println(n);
}
System.out.println("Vector end...........................................");



        
    }
    
}
