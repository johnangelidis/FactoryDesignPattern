/**
 * Class for a Bike
 */
public class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;
    /**
    * Method that creates a bike by creating a frame, adding wheels, adding pedals, and putting a price on it
    * Does not return any value
    */
    public void createBike(){
        createFrame();
        addWheels();
        addPedals();
        getPrice();
    }

    /**
     * Private method that assembles a frame for a specific type of bike
     * Does not return any value
     */
    private void createFrame(){
        System.out.println("Assembling " + name + " frame.");
    }

    /**
     * private method that adds the number of wheels necessary for the specific type of bike. If it has training wheels, those are added as well.
     * Does not return any value
     */
    private void addWheels(){
        if(numWheels==0){
            //do nothing
        }
        else{
            if(hasTrainingWheels){
                System.out.println("Adding training wheels.");
            }
            System.out.println("Adding " + numWheels + " wheel(s).");
        }
    }

    /**
     * Private method that adds pedals if the given type of bike has pedals
     * Does not return any value
     */
    private void addPedals(){
        if(hasPedals){
            System.out.println("Adding pedals.");
        }
    }

    /**
     * Public method that prints the price of a given bike
     */
    public void getPrice(){
        System.out.println("Price: $" + price); 
    }
}
