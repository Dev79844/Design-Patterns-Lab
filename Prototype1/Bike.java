package Prototype1;

public abstract class Bike implements Cloneable {
   
    private String id;
    protected String type;
    
    abstract void ride();
    
    public String getType(){
       return type;
    }
    
    public String getId() {
       return id;
    }
    
    public void setId(String id) {
       this.id = id;
    }
    
    public Object clone() {
       Object clone = null;
       try {
          clone = super.clone();
          
       } catch (CloneNotSupportedException e) {
          e.printStackTrace();
       }
       return clone;
    }
 }
