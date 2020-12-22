package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class ThreadController {
    public static void main(String[] args) {
        System.out.println("~~ Main Thread Begin! ~~");
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");
        System.out.println("~~ Main Thread Complete! ~~");

    }
}

class MyThread extends Thread {

    MyThread(String name) {

        super(name);

        start();
    }
    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count = 0; count < 10; count ++){
                Thread.sleep(500);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}