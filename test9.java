import java.util.StringTokenizer;
public class test9{
 public static void main (String args[]){
StringTokenizer st = new StringTokenizer(" Welcome: To: The: Another: World",":"); //initialized with input string and token


while(st.hasMoreTokens()){
    System.out.println(st.nextToken());
    break; // break the loop so that number of count gets reduced by one 
}
int count = st.countTokens();
System.out.println("number of tokens "+count);  
for(int i=0;i<count;i++){                                      
    System.out.println("token at "+i+st.nextToken());  // now the number of token is one less so 'Welcome' wont come again 
}

 }

}
