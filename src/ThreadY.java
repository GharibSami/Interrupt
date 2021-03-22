public class ThreadY extends Thread{
    @Override
    public void run() {
        try
        {
            Thread.sleep(1000);
            System.out.println("thread Start");
        }catch(InterruptedException e){
            throw new RuntimeException("Thread interrupted..."+e);

        }
    }
}
