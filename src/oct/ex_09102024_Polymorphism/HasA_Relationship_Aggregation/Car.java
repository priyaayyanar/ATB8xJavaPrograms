package oct.ex_09102024_Polymorphism.HasA_Relationship_Aggregation;

public class Car {
        public void startCar(){
            new Engine().start();
            new Tyre().rolling();
        }
}
