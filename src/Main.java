public class Main {

    public static void main (String args[]) throws InterruptedException {
        ThreadX t1=new ThreadX();
        ThreadY t2 =new ThreadY();


        t1.start();
        System.out.println("is thread X before Interrupted: "+t1.flag);
        // interrupt the thread
        t1.interrupt();
        t1.join();
        System.out.println("is thread X after Interrupted: "+t1.flag);
        t2.start();

        t2.interrupt();

    }
}
