import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
public class test3{
 public static void main (String args[]){
    
    Dictionary d = new Hashtable();  // initialized
d.put("123","ABC");   // put roll number and name 
d.put("124","DEF");
d.put("125","GHI");

Dictionary d1 = new Hashtable();
d1.put("126","hikki");
d1.put("127","yui");
d1.put("128","yukinon");

System.out.println("Contents of Dictionary(d)"+d);
System.out.println("Contents of Dictionary(d)"+d1);
System.out.println("Size of dictionary(d) "+d.size());
System.out.println("Name at roll number 123: "+d.get("123"));
d.remove("123");
System.out.println("Dictionary(d) after removing roll number '123' "+d);
System.out.println("Printing contents of dictionary(d1)");
for(Enumeration i=d1.keys(),e=d1.elements();i.hasMoreElements();){
    System.out.println(i.nextElement()+" "+e.nextElement());
}   
 }

}
