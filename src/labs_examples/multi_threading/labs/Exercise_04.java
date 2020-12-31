package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise4 {
    public static void main(String[] args) {
        System.out.println();
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend("Hello!" , snd);
        ThreadedSend s2 = new ThreadedSend("Goodbye!" , snd);

        s1.start();
        s2.start();

        try{
            s1.join();
            s2.join();
        } catch(Exception e){
            System.out.println("Interrupted!");
        }
    }



}

class Sender {


    public void send(String msg) {
        System.out.println("Sending\t" + msg );
        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }

}

class ThreadedSend extends Thread {
    private String msg;
    private Thread t;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        synchronized (sender) {
            // synchronizing the snd object
            sender.send(msg);

        }

    }
}



