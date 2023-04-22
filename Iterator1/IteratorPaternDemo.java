package Iterator1;

public class IteratorPaternDemo {
    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();
  
        for(Iterator iter = bikeRepository.getIterator(); iter.hasNext();){
           String name = (String)iter.next();
           System.out.println("Bike : " + name);
        } 	
     }
}
