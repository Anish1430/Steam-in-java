// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome Anish!");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
//           //Creating a Object of ThreadInterface //
//            ThreadInterFace t1=new ThreadInterFace();
//
//         //it will Pass the t1 object in Thread Class //
//             Thread th=new Thread(t1);  //Mandatory //
//              th.start();

          //Create a MultiThreading (Thread 1 which is Test1)
        Test1 t1=new Test1();
          t1.start();
        //Create a MultiThreading (Thread 2 which is Test2)
          Test2 t2=new Test2();
          t2.start();

    }
}