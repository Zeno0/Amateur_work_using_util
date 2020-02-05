import java.util.EnumMap;
public enum CFG{              // this class is required by the EnumMap class as the 'keys' in 
                                  // EnumMap must be keys of a single enum type
   
    CODE,CONTRIBUTE,QUIZ,MCQ;
}
public class test4{
 public static void main (String args[]){
EnumMap<CFG , String> em  = new EnumMap<CFG,String>(CFG.class); // initialize it with CFG class
em.put(CFG.CODE,"begin");   // put keys and values respectively
em.put(CFG.CONTRIBUTE,"contro");
em.put(CFG.MCQ,"practice");
em.put(CFG.QUIZ,"test");
System.out.println("Contents in em: "+em);
System.out.println("Value at key - CODE : "+em.get(CFG.CODE));
System.out.println("Does em contain 'CODE' key? "+em.containsKey(CFG.CODE));
System.out.println("Does em contain 'test' values? "+em.containsValue("test"));
System.out.println("Key set of em: "+em.keySet());
System.out.println("Values set of em: "+em.values());  
 }

}
