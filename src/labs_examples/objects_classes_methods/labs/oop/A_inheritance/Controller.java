package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Controller{
    public static void main(String[] args) {
        PlayStation4 myPS4 = new PlayStation4(true, 8, true, 2);
        Electronics elec = new Electronics();
        VideoGameConsole cons = new VideoGameConsole(price);

        myPS4.start();
        elec.start();
        cons.start();
        //System.out.println("My Playstation has the following specs," "");
    }

}
