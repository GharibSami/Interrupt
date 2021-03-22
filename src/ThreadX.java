public class ThreadX extends Thread{
    boolean flag = false;
    @Override
    public void run() {
        try
        {

            Thread.sleep(500);
            System.out.println("Thread start");
        }catch(InterruptedException e){
            flag = true;
        }
        System.out.println("thread is finish");
    }
}
