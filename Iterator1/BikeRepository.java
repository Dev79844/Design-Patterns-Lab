package Iterator1;

public class BikeRepository implements Container {
    public String names[] = {"Royal Enfield Classic 350" , "BMW 310R" ,"TTriumph Tiger" , "Honda CB 350"};
 
    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }
 
    private class NameIterator implements Iterator {
 
       int index;
 
       @Override
       public boolean hasNext() {
       
          if(index < names.length){
             return true;
          }
          return false;
       }
 
       @Override
       public Object next() {
       
          if(this.hasNext()){
             return names[index++];
          }
          return null;
       }		
    }
 }
