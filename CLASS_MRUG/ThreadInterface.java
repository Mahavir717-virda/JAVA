
public interface ThreadInterface  extends Runnable{

     public default void run()
    {
        try{
            System.out.println( " " + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getState());
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
            System.out.println("In run method; thread name is : " + Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        Thread mythread = new Thread();
        System.out.println(mythread);

        mythread.start();
        System.out.println("Name of the Current thread is  -> " + Thread.currentThread().getName() + " In Current state -> " + mythread.getState());
    }
}