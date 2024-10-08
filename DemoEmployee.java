package employee;

/**
 * @author Shadman Abedin
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Smith", "123456790");

        PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//      Employee emp2 = new Employee("Don", "Holmes", "123456799");

//      PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

        // Upcasting
        Employee emp3 = pEmp1;
        System.out.println("emp3");
        emp3.whoAmI();
        // TODO To complete
        // emp3.whoAmI() // prints "I am a part-time employee" because emp3 is referencing a PartTimeEmployee object
        // emp3.getHourlyRate(); // returns a syntax error because getHourlyRate() is not defined in the Employee class

        // TODO To complete
        // Add the condition that tests that emp3 is an instance of part-time employee at
        // this time
        if (emp3 instanceof PartTimeEmployee) {
            System.out.println("emp3 instance of part time employee"); // printed
        } else {
            System.out.println("emp3 not instance of part time employee");
        }

        // Downcasting 1
        // TODO Uncomment and run the code
        if (emp1 instanceof PartTimeEmployee) {
            PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
        } else {
            System.out.println("emp1 is not a PartTimeEmployee.");
        }
        // TODO To complete
        // This instruction compiles but returns a ClassCastException at runtime
        // because emp1 is not actually an instance of PartTimeEmployee.

        // Downcasting 2
        // Requires the use of instanceof to avoid a runtime cast exception
        // TODO Look at the solution below
        if (emp3 instanceof PartTimeEmployee) {
            System.out.println("emp3 instance of part time employee"); // printed
            PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
            System.out.println(pEmp4.getHourlyRate());
        } else {
            System.out.println("emp3 not instance of part time employee");
        }
    }
}
