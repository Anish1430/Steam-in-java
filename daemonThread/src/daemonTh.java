public class daemonTh extends Thread{
      public void run() {
            if(Thread.currentThread().isDaemon()) {
                System.out.println("Daemon Thread  is created");
            }else {
                System.out.println("child is Created");
            }
      }
}
