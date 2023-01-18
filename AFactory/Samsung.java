package AFactory;

public class Samsung extends Device {
    private String ram;
    private String processor;

    public Samsung(String ramsize, String processorType){
        this.ram = ramsize;
        this.processor = processorType;
    }

    public String getDetails(){
        return "Samsung:\nramsize:"+this.ram+"\nprocessor:"+this.processor;
    }

    public String toString(){
        return "Samsung(ram:"+ram+", Processor:"+processor+")";
    }
}
