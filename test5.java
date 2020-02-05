
import java.util.EnumSet;
enum CFG{              // this class is required by the EnumMap class as the 'keys' in 
                                  // EnumMap must be keys of a single enum type
   
    CODE,CONTRIBUTE,QUIZ,MCQ;
}
public class test5{
 public static void main (String args[]){
EnumSet<CFG> set1,set2,set3,set4;   //Create multiple enum sets
set1 = EnumSet.of(CFG.CODE,CFG.CONTRIBUTE);  // using different methods of add elements
set2 = EnumSet.complementOf(set1);           // in set1,set2,set3,set4  
set3 = EnumSet.allOf(CFG.class);
set4 = EnumSet.range(CFG.CODE, CFG.QUIZ);
System.out.println("Elements in set1 "+set1);
System.out.println("Elements in set2 "+set2);
System.out.println("Elements in set3 "+set3);
System.out.println("Elements in set4 "+set4); 
 }

}
