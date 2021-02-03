/**
 * Child class Kids Bike that derives from the parent Bike class
 */
public class KidsBike extends Bike {

    /**
     * Public method that initializes a Kids Bike by giving it the specific characteristics
     */
    public KidsBike(){
        name = "Kids Bike";
        price = 80.99;
        numWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }

}
