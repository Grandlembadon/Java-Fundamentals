package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class RunnableInterfaceExcercise {
    public static void main(String[] args) {
        System.out.println("Begin Main Thread");
        MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(runnable1, "Initiate1");
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable(), "Initiate2");
        thread2.start();


    }
}

class MyRunnable implements Runnable {

    Thread thread;

    public MyRunnable(String name){
        thread = new Thread(this,name);

        thread.start();
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
        System.out.println(thread.getName() + " terminating.");

    }
}