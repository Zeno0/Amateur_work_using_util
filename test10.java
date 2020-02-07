import java.util.Timer;
import java.util.TimerTask;

class helper extends TimerTask{         // this class is used as a task for TimerTask class
    
static int i=0;
public void run(){
    System.out.println("timer ran "+ i++ +" times");
    if(i==4){
        synchronized(test10.obj){
            test10.obj.notify();
        }
    }
}  // closing run method
   }  // closing helper class 


public class test10{

    static test9 obj;  // create 'obj' which will later help to get control of main thread
 public static void main (final String args[]) throws InterruptedException {
        obj = new test9();
        final Timer t = new Timer(); // initialize
        final TimerTask tt = new helper(); // initialize task
t.schedule(tt,500,1000);  // creating schedule

synchronized(obj){  // synchronize with 'obj' to cancle Timer 't' 
    obj.wait();   //it is main thread and it is waiting
    t.cancel();
System.out.println("Purging the Timer't' "+t.purge());    
}

 }

}
