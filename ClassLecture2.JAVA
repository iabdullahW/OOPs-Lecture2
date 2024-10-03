// Parent class
class ExtendLecture {
    int i; // Class variable to be used in the loop

    // Method that takes an integer 'j' and prints j squared 10 times
    void value(int j) {
        for (i = 1; i <= 10; i++) {
            System.out.println(j * j); // Prints j squared
        }
    }
}

// Child class extending the parent class 'ExtendLecture'
class ExtendLecture2 extends ExtendLecture {
    float i2; // Class variable specific to the child class

    // Overloaded method in the child class that takes a float 'j2'
    // and prints the square of 'j2'
    void value(float j2) {
        System.out.println(j2 * j2); // Prints j2 squared
    }
}

// Main class for execution
public class ClassLecture2 {
    public static void main(String[] args) {
        // Creating an object of the child class 'ExtendLecture2'
        ExtendLecture2 obj = new ExtendLecture2();
        
        // Calls the 'value' method from the parent class 
        // with an integer argument
        obj.value(3); // Prints 3 squared 10 times

        // Creating an object of the parent class 'ExtendLecture'
        ExtendLecture obj2 = new ExtendLecture();
        
        // Calls the 'value' method from the parent class 
        // with an integer argument
        obj2.value(5); // Prints 5 squared 10 times
        
        // Uncommenting the below line would cause an error because
        // the 'value' method in the parent class does not accept a float argument
        // obj2.value(5.5f); // Error: Parent class method only accepts an integer
    }
}
