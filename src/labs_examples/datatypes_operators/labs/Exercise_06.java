package labs_examples.datatypes_operators.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        double r = 3.14;
        int h = 5;
        int t = 2;
        double w = t;
        double f = h;
        double p = 3.14;
        double v = p * (r * r) * f;
        double s = (w * (p * (r * r))) + ((w * p) * r * f);
        System.out.println(v);
        System.out.println(s);



    }
}