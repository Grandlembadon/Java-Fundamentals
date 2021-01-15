package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
class MyRunnableInterface {
    public static void main(String[] args) {
        System.out.println("Begin Main Thread");
        MyRunnable runnable1 = new MyRunnable("High Priority");
        MyRunnable runnable2 = new MyRunnable("Low Priority");

        runnable1.thread.setPriority(Thread.NORM_PRIORITY+5);
        runnable2.thread.setPriority(Thread.NORM_PRIORITY-4);

        runnable1.thread.start();
        runnable2.thread.start();

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable, "Thread 1");
        thread.start();

    }
}

class MyRunnable implements Runnable {

    Thread thread;

    public MyRunnable(String name){
        thread = new Thread(this,name);


    }

    public MyRunnable() {

    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try{
            for(int count = 0; count <15; count++) {
                Thread.sleep(200);
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getName() + "  now terminating.");

        System.out.println(Thread.currentThread().getName() + " terminating.");


    }
}