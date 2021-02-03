/**
 * Child class Strider that derives from the parent Bike class
 */
public class Strider extends Bike {
    /**
     * Public method that initializes a Strider by giving it the specific characteristics
     */
    public Strider(){
        name = "Strider";
        price = 65.99;
        numWheels = 2;
        hasPedals = false;
        hasTrainingWheels = false;
    }
}
