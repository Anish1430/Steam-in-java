
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

        lambdaExpre obj= (a,b) -> {
            int sum = a * b;
            System.out.println("The output of the Lambda Expression is" + " " + sum);
        };
             obj.show(10,20);
        }
}