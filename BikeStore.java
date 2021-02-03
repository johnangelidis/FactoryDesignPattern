/**
 * Class that represents a bike store
 */
public class BikeStore{
  
    /**
     * Private method that creates a bike given the type of bike
     * @param type: String that represents the type of bike 
     * @return an object of type Bike that is either a tricycle, strider, or kids bike
     */
    private Bike createBike(String type){
        Bike bike;
        if(type.equals("tricycle")){
            bike = new Tricycle();
        }
        else if(type.equals("strider")){
            bike = new Strider();
        }
        else{
            bike = new KidsBike();
        }
        return bike;
    }

    /**
     * Public method that orders the manufacture of a new Bike by creating a frame, adding wheels, pedals, and putting a price for the specific type of bike
     * @param type: String that represents the type of bike
     * @return an object of type Bike that was just created
     */
    public Bike orderBike(String type) {
       Bike bike = createBike(type);
       bike.createBike();
       return bike;
        
    }
}