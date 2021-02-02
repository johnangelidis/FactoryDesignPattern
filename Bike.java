public class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public void createBike(){
        createFrame();
        addWheels();
        addPedals();
        getPrice();
    }

    void createFrame(){
        System.out.println("Assembling " + name + " frame.");
    }

    void addWheels(){
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

    void addPedals(){
        if(hasPedals){
            System.out.println("Adding pedals.");
        }
    }

    public void getPrice(){
        System.out.println("Price: $" + price); 
    }
}
