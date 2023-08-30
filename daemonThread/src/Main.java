
public class Main {
    public static void main(String[] args)   {
//
//        System.out.println("Hello and welcome!");
//          System.out.println();
//        daemonTh d1=new daemonTh();
//          d1.setDaemon(true);
//          d1.start();

//          anonymous m1=new anonymous() {
//             // @Override
//              public void show() {
//                  System.out.println("AnonyMous inner class has no name");
//              }
//          };
////            m1.show();
//          UsingAbstract u1=new UsingAbstract() {
//              @Override
//              void show() {
//                     for(int i=1;i<=5;i++) {
//                         System.out.print(i+" ");
//                     }
//                      System.out.println();
//                  System.out.println("Using Abstract class ");
//              }
//          };
//             u1.show();
//
//        lambdaExpre obj= (a) -> {
//            System.out.println("lambda Expression is created in java"+" "+a);
//        };
//          obj.show(10);
//          anonymous obj=new anonymous() {
//              @Override
//              public void show() {
//                  //Inner class(which type Anonymous)
//                   System.out.println("Anonymous inner class is created  which has no name");
//              }
//          };
//              obj.show();
//
//        lambdaExpre obj= (a,b) -> (a * b);
//        System.out.println(obj.show(10,20)+" "+"This is for Lambda expression");
//

        //Create a Runnable
        Runnable thread1=() -> {
            for(int i=1;i<=10;i++) {
                System.out.println("Value of i is "+" "+i);
              try {
                  Thread.sleep(1000);
              }catch (Exception e) {
                    System.out.println("This is a Exception in java"+" "+e);
              }
            }
        };
              Thread t1=new Thread(thread1);
               Thread.currentThread().setName("Anish");  //for set the Main Thread name
                    System.out.println(Thread.currentThread().getName()); //get The Thread name.
                   t1.start();

        }
}