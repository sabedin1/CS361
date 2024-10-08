/**
 * 
 */
package reflection;

/**
 * @author ADD YOUR NAME 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

    /**
     * Print the class corresponding to the object
     * @param o the object
     */
    public void correspondingClass(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        System.out.println("Inspecting class: " + o.getClass().getName());
    }

    /**
     * Print the chain of super classes of the object 
     * Format of the output:
     * Inheritance chain:
     * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
     * @param o the object
     */
    public void inheritanceChain(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        Class<?> clazz = o.getClass();
        StringBuilder chain = new StringBuilder("Inheritance chain:\n");
        
        while (clazz != null) {
            chain.append(clazz.getName());
            clazz = clazz.getSuperclass();
            if (clazz != null) {
                chain.append(" inherits from ");
            }
        }
        
        System.out.println(chain.toString());
    }

    /**
     * Print the list of methods of the object
     * @param o an object
     */
    public void listMethods(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        Method[] methods = o.getClass().getMethods();

        // List of methods
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("\n");
    }

    /**
     * Constructor
     */
    public Reflection() {
    }

    /**
     * Demonstration
     * @param args
     */
    public static void main(String[] args) {
        Reflection r = new Reflection();
        
        // Demonstration of the methods on an object of type String
        String testString = "Hello, World!";
        r.correspondingClass(testString);
        r.inheritanceChain(testString);
        r.listMethods(testString);
        
        // Demonstration of the methods on an object of type ColoredCircle
        ColoredCircle cc = new ColoredCircle(); // Assuming ColoredCircle is defined elsewhere
        r.correspondingClass(cc);
        r.inheritanceChain(cc);
        r.listMethods(cc);
    }
}
