// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)   {
//
//        System.out.println("Hello and welcome!");
//          System.out.println();
//        daemonTh d1=new daemonTh();
//          d1.setDaemon(true);
//          d1.start();

          anonymous m1=new anonymous() {
             // @Override
              public void show() {
                  System.out.println("AnonyMous inner class has no name");
              }
          };
            m1.show();
    }
}