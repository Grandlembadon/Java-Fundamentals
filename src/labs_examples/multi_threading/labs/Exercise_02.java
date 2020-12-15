package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class ThreadController {
    public static void main(String[] args) {

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
    }
}