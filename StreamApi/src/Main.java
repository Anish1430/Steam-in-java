import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer>  evenList=List.of(10,4,5,7,12,9,18);
//        List<Integer> list=new ArrayList<>();
//            for(Integer num : even) {
//                if(num % 2 == 0){   //Number is Even then Print
//                    list.add(num);
//                }
//            }
//          System.out.println(even);
//            System.out.println(list);
//
//
        System.out.println(evenList);
        List<Integer> list=evenList.stream().filter(i -> i%2==0).collect(Collectors.toList());
           System.out.println(list);

           //Number is Greater than 10 //
        List<Integer> l2=evenList.stream().filter(i -> i>=10).collect(Collectors.toList());
          System.out.println(l2);
    }
}