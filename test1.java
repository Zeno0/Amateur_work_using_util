public class test1{

 public static void main (String args[]){
     
     ArrayList<Integer> al = new ArrayList<Integer>(5); //initilazied Arraylist
ArrayList<Integer> al1 = new ArrayList<Integer>(5);
al1.add(0);  // add data
al1.add(10);
al1.add(14);
for(int i=0;i<5;i++){
    al.add(i);
}
System.out.println("data in array list(al1) "+al1);
System.out.println("data in array list(al) "+al);
al.set(3, 10);  
System.out.println("(al)Array list after using set(index,data) method "+al);
System.out.println("boolean function : does it(al) contain 9? "+al.contains(9));
System.out.println("what is the index of '0' data in array list(al) "+al.indexOf(0));
System.out.println("displaying all the contents of (al)array list one by one");
al.forEach((x) -> System.out.println(x));   // using forEach loop
al.retainAll(al1);  
System.out.println("(al)array list after using retain method(basicly union of two) "+al);

     
 

}

}
