package labs_examples.multi_threading.labs;

class Synch2 {
    public static void main(String[] args) {
        System.out.println();
        MySender2 snd = new MySender2();
        ThreadedSend2 s1 = new ThreadedSend2("Hello!" , snd);
        ThreadedSend2 s2 = new ThreadedSend2("Goodbye!" , snd);

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

class MySender2 {
    public synchronized void send2(String msg){
        System.out.println("Sending\t" + msg );
        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");


    }
}

class ThreadedSend2 extends Thread {
    private String msg;
    private Thread t;
    MySender2 sender2;

    ThreadedSend2(String m, MySender2 obj) {
        msg = m;
        sender2 = obj;
    }

    public void run(){

    }

}