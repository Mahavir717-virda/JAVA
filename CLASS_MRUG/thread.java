
class ThreadCreation extends Thread
{
    public static void main(String[] args) {
        ThreadCreation myThread = new ThreadCreation();
        System.out.println(myThread);

        myThread.start();
        System.out.println(myThread.currentThread().getName() + "Currently in " + myThread.getState());
        
    }

}
