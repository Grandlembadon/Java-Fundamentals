package labs_examples.multi_threading.labs;

import sun.rmi.runtime.Log;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */
class Controller {
    public static void main(String[] args) {

        Data data = new Data();
        Thread sender = new Thread(new Sender2(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }

}

class Data {
        private String packet;
        private boolean transfer = true;

        public synchronized void send(String packet) {
            while (!transfer) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();

                }
            }
            transfer = false;

            this.packet = packet;
            notifyAll();
        }

        public synchronized String receive() {
            while (transfer) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            transfer = true;

            notifyAll();
            return packet;
        }
    }

    class Sender2 implements Runnable {
        private Data data;

        public Sender2(Data data) {
        }


        public void run() {
            String packets[] = {
                    "First packet",
                    "Second packet",
                    "Third packet",
                    "Fourth packet",
                    "End"
            };

            for (String packet : packets) {
                data.send(packet);

                
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    
    class Receiver implements Runnable {

        private Data load;

        public Receiver(Data data) {
        }


        public void run() {
            for (String receivedMessage = load.receive();
                 !"End".equals(receivedMessage);
                 receivedMessage = load.receive()) {

                System.out.println(receivedMessage);

                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();

                }
            }
        }
    }

