import java.io.IOException;

public class ThreadClass extends Thread{
     public void run() {
           try{
               int a=10;
               int b=0;
               int sum=a/b;
           }catch (ArithmeticException e){
               System.out.println("ArithmaticException  in java ");
           }
         System.out.println("Create a Thread in java");
     }
}
