import java.util.Hashtable;
import java.util.Enumeration;
public class test6{
 public static void main (String args[]){
Hashtable<Integer,String> h = new Hashtable<Integer,String>();  //initialized

h.put(1,"hiki");   //put key and value in Hashtable h
h.put(7,"yukino");
h.put(2,"yui");
System.out.println("Hastable : "+h.toString());
System.out.println("Does Hashtable contain key '1'? "+h.containsKey(1));
h.computeIfAbsent(3,v ->"komachi");
System.out.println("Hashtable after using computeIfAbsent() : "+h);
System.out.println("Does Hashtable contain 'komachi' value? "+h.contains("komachi"));
System.out.println("Key set of Hashtable: "+h.keySet());
System.out.println("Value set of Hashtable: "+h.values());
System.out.println("All elements of Hashtable");    
Enumeration e = h.elements();
Enumeration e1 = h.keys();

while(e.hasMoreElements()){
    System.out.println(e1.nextElement() +" "+ e.nextElement());
}

 }

}
