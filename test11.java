import java.util.TreeMap;
import java.util.Map;
class student{                        //this class is used by TreeMap, it acts as a custom class to extend 'tm' variable 
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


class sortbyroll implements Comparator<student>{    // this class is used to provide custom comparator
    
      public  int compare(student a, student b){
            return a.roll-b.roll;
        }
    
    }  // closing sortbyroll class

public class test11{
 public static void main (String args[]){
TreeMap<Integer,String> tm = new TreeMap<Integer,String>() ;   //initialized
tm.put(1,"yui");   // add data in 
tm.put(2,"yukino");
tm.put(3,"hiki");
tm.put(4,"komachi");
System.out.println("TreeMap 'tm': "+tm);
TreeMap<student,Integer> tm1 = new TreeMap<student,Integer>(new sortbyroll()) ;  // now initialize with student and sortbyroll class
tm1.put(new student(234,"yukino","japan"),1);
tm1.put(new student(134,"yui","japan"),2);
tm1.put(new student(334,"hiki","japan"),3);
System.out.println("TreeMap 'tm1': "+tm1); // output is sorted by roll number because of sortbyroll class

System.out.println("Does tm contain Integer '1'? "+tm.containsKey(1));
System.out.println("Does tm contain value 'hiki? "+tm.containsValue("hiki"));
System.out.println("Keyset in 't': "+tm.navigableKeySet());
System.out.println("Traversing in TreeMap 'tm'");
for(Map.Entry<Integer,String> m : tm.entrySet() ){
        System.out.println(m.getKey()+" "+m.getValue());
    }

System.out.println("Traversing in TreeMap 'tm1'");
for(Map.Entry<student,Integer> m1 : tm1.entrySet() ){
        System.out.println(m1.getKey()+" "+m1.getValue());
    }

 }

}
