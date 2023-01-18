package AFactory;

public class Apple extends Device {
    private String ram;
    private String processor;

    public Apple(String ramsize, String processorType){
        this.ram = ramsize;
        this.processor = processorType;
    }

    public String getDetails(){
        return "Apple:\nramsize:"+this.ram+"\nprocessor:"+this.processor;
    }

    public String toString(){
        return "Apple(ram:"+ram+", Processor:"+processor+")";
    }
}
