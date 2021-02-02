public class BikeStore{
    public BikeStore(){

    }
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

    public Bike orderBike(String type) {
       Bike bike = createBike(type);
       bike.createBike();
       return bike;
        
    }
}