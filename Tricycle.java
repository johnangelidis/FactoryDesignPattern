/**
 * Child class Tricycle that derives from the parent Bike class
 */
public class Tricycle extends Bike {
    /**
     * Public method that initializes a Tricycle by giving it the specific characteristics
     */
    public Tricycle(){
        name = "Tricycle";
        price = 54.95;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }
}
