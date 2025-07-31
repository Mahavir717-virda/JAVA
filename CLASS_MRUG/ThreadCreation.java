class ThreadCreation extends Thread
{
    ThreadCreation(String threadname)
    {
        super(threadname);
    }
    public void run()
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
        ThreadCreation myThread = new ThreadCreation("Thread-java");
        System.out.println(myThread);

        myThread.setName("Thread-java");

        myThread.start();
        System.out.println(Thread.currentThread().getName() + "Currently in " + myThread.getState());
        
    }

}
