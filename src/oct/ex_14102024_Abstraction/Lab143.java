package oct.ex_14102024_Abstraction;

public class Lab143 {

}

//Abstract Class
abstract class Loan {
    abstract void loan50k(); //an abstract class can be incomplete.
    //if the method is abstract then its class also should have abstract keyword.
}

abstract class Loan2 {
    void loan1L(){//non-abstract method should not be empty
    //a normal function can have abstract class but always with method body.
    }
}