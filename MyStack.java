package mystack;

/**
 * @author Shadman Abedin
 *
 */

// Stack using generics

// Complete the provided code
public class MyStack<T> {

    private class MyNode<T1> {
        T1 val;
        MyNode<T1> next;

        MyNode(T1 v, MyNode<T1> n) {
            val = v;
            next = n;
        }
    }

    private MyNode<T> theStack = null;

    /**
     * 
     */
    public MyStack() {
    }

    public T pop() {
        // TODO To complete
        if (theStack == null) {
            return null; // Or throw an exception
        }
        T value = theStack.val; // Get the value
        theStack = theStack.next; // Move the head to the next node
        return value; // Return the popped value
    }

    public void push(T v) {
        // TODO To complete
        MyNode<T> newNode = new MyNode<>(v, theStack); // Create a new node
        theStack = newNode; // Point to the new node
    }

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO To complete
        // Create a stack of Integer
        MyStack<Integer> intStack = new MyStack<>();
        // Push 1 and 2
        intStack.push(1);
        intStack.push(2);
        // Pop
        System.out.println("Popped Integer: " + intStack.pop()); // Should print 2
        // Push 5
        intStack.push(5);
        
        // TODO To complete
        // Create a stack of Person
        MyStack<Person> personStack = new MyStack<>();
        // Push a person p1 with your name
        Person p1 = new Person("YourFirstName", "YourLastName"); // Replace with your name
        personStack.push(p1);
        // Push a person p2 with my name
        Person p2 = new Person("OtherFirstName", "OtherLastName"); // Replace with the desired name
        personStack.push(p2);
    }
}
