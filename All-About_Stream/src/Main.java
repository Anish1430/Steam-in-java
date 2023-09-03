import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      /* What is Stream in java....

    //1= Stream in java is a Sequence of Object,which supports Aggregate Operation.
        Aggregate means when an Object A contains a Reference/Address to another Object B.
        Or we can say that object A HAS-A-Relationship with Object B.

        2=If a Stream has been used Once you cannot used it Again.(Means You can't reused).
        3=  A Stream is an Interface in java.
        4= A stream is related to Collection FrameWork.
        5= Stream is used for Short the code Length.

           */
          System.out.println("ALL ABOUT STREAM API IN JAVA");
              System.out.println();

              //1st way of Creating list ..
             List<Integer> list1=new ArrayList<>();
                list1.add(10);
                 list1.add(20);
                 list1.add(30);
                 list1.add(40);
           System.out.println(list1);


    }
}